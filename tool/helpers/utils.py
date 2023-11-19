import json
import os

# Example inputs for get_primitive_datatype:
# Map<String, Class1>
# List<Class1>
# Map<Class1, Map<String, Class2>>
# Map<Map<Class1, Class2>, Map<Class3, Class4>> => ["Map", "Map", "Class1, Class2>, Map", "Class3, Class4>>"]
def get_primitive_datatype(data_type):
    remove_keywords = ['String', 'int', 'Integer', 'char', 'float', 'long', 'double', 'Double', 'byte', 'boolean',
                       'Map', 'HashMap',
                       'TreeMap', 'ArrayList', 'List', 'Set', 'HashSet', 'Stack', 'Queue', 'ChainBlockingQueue',
                       'Object', 'Class',
                       'T', '?', '[]', '', 'extends']
    all_classes = []

    # Handling `(HttpServletResponse, String, String, String, long, boolean, boolean)` case
    if data_type[0] == '(':
        data_type = data_type[1:]
    if data_type[-1] == ')':
        data_type = data_type[:len(data_type)-1]

    if data_type.find("<") != -1:
        target_classes = data_type.split("<")
        target_classes_level2 = []
        for cls in target_classes:
            if cls.find(",") != -1:
                target_classes_level2.extend(cls.split(","))
            else:
                target_classes_level2.append(cls)
        for cls in target_classes_level2:
            if cls.find(">") != -1:
                all_classes.extend(cls.split(">"))
            else:
                all_classes.append(cls)
    else:
        if ',' in data_type:
            all_classes = data_type.split(',')
        else:
            all_classes = [data_type]
    filtered_all_classes = []
    for cls in all_classes:
        filtered_cls = cls.strip()
        filtered_cls = filtered_cls.replace('[]', '')
        filtered_cls = filtered_cls.replace('?', '')
        filtered_cls = filtered_cls.replace('extends', '')
        filtered_all_classes.append(filtered_cls)
    all_primitive_datatypes = list(
        filter(lambda i: i not in remove_keywords, filtered_all_classes))
    return all_primitive_datatypes


# print(f'{get_primitive_datatype("Map<String,List<Class2>>")}')
# print(f'{get_primitive_datatype("(HttpServletResponse, String, String, String, long, boolean, boolean, Map<String,List<Class2>>)")}')
# Example input for get_service_from_relative_path (Assuming the system's OS is Windows):
# hadoop-common-project/hadoop-auth-examples/src/main/java/org/apache/hadoop/security/authentication/examples/WhoClient.java
# hadoop-auth-examples/src/main/java/org/apache/hadoop/security/authentication/examples/WhoClient.java
def get_service_from_relative_path(relative_path):
    services = relative_path.split("/src/main")
    if len(services) > 1:
        return services[0].replace("/", ".")
    return ""


# Example input for get_key_for_entity
# relative_path: hadoop-common-project/hadoop-auth-examples/src/main/java/org/apache/hadoop/security/authentication/examples/WhoClient.java
# qualified_name: org.apache.hadoop.security.authentication.examples.WhoClient
def get_key_for_entity(relative_path, qualified_name):
    service = get_service_from_relative_path(relative_path)
    return f"{service}.{qualified_name}"


# print(get_primitive_datatype("Map<Map<Class1, Class2>, Map<Class3, Class4>>"))
# print(get_service_from_relative_path("hadoop-common-project/hadoop-auth-examples/src/main/java/org/apache/hadoop/security/authentication/examples/WhoClient.java"))
# print(get_key_for_entity("hadoop-common-project/hadoop-auth-examples/src/main/java/org/apache/hadoop/security/authentication/examples/WhoClient.java",
#       "org.apache.hadoop.security.authentication.examples.WhoClient"))
# print(get_key_for_entity(
#     "hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/viewfs/ViewFs.java", "org.apache.hadoop.fs.viewfs.ViewFs$InternalDirOfViewFs.getFileLinkStatus"))
def read_json(filename: str) -> object:
    f = open(filename)
    data = json.load(f)

    return data


def extract_class_from_method_qlf_name(s):
    if '$' in s:
        s = s.split("$")[0]
    else:
        s = s.rsplit(".", 1)[0]
    return s, s.split(".")[-1]


def extract_method_from_method_qlf_name(s):
    if '$' in s:
        s = s.split("$")[1]
    s = s.split(".")[-1]
    return s


def extract_class_from_class_qlf_name(s):
    if '$' in s:
        s = s.split("$")[0]
    return s.split(".")[-1]


def remove_method_qlf_names(class_methods):
    op = []
    for i in class_methods:
        obj = {
            "name": extract_method_from_method_qlf_name(i['name']),
            "return": i['return']
        }
        op.append(obj)
    return op


def remove_vars_qlf_names(vars):
    op = []
    for i in vars:
        obj = {
            "name": i['name'],
            "type": extract_class_from_class_qlf_name(i['type'])
        }
        op.append(obj)
    return op


def get_class_data(class_key, class_json):
    # Fetch class if present
    if not class_json.get(class_key):
        return "-1", "", ""

    # Fetch class variables if present
    if class_json[class_key].get("variables"):
        class_vars = class_json[class_key].get("variables")
    else:
        class_vars = ""

    # Fetch class methods if present
    if class_json[class_key].get("methods"):
        class_methods = class_json[class_key].get("methods")
    else:
        class_methods = ""

    # Remove class methods qualified name
    class_methods = remove_method_qlf_names(class_methods)

    return "1", class_vars, class_methods


def get_method_data(method_key, methods_json, class_json):
    # Fetch method if present
    if not methods_json.get(method_key):
        return "-1", "", ""

    # Fetch Parameters if present
    if methods_json[method_key].get("parameters"):
        parameters = methods_json[method_key].get("parameters")
    else:
        parameters = ""

    params = []
    for param in parameters:
        status, class_vars, class_methods = get_class_data(
            param['type'], class_json)

        if status == "-1":
            continue

        class_methods = remove_method_qlf_names(class_methods)

        obj = {
            "qualifiedName": param['type'],
            "variables": class_vars,
            "methods": class_methods
        }
        params.append(obj)

    # Fetch local_variables if present
    if methods_json[method_key].get("local_variables"):
        local_variables = methods_json[method_key].get("local_variables")
    else:
        local_variables = ""

    vars = []
    for var in local_variables:
        status, class_vars, class_methods = get_class_data(
            var['type'], class_json)

        if status == "-1":
            continue

        class_methods = remove_method_qlf_names(class_methods)

        obj = {
            "qualifiedName": var['type'],
            "variables": class_vars,
            "methods": class_methods
        }
        vars.append(obj)

    return "1", params, vars


def get_metadata(service_name, func_qual_name):
    CLASS_JSON_FILE_PATH = "output/json/class-metadata.json"
    METHODS_JSON_FILE_PATH = "output/json/method-metadata.json"

    # service_name : replace `/` with `.`
    service_name = service_name.replace('/', '.')

    # Get class name
    class_qual_name, class_name = extract_class_from_method_qlf_name(
        func_qual_name)

    # Read json files
    class_json = read_json(CLASS_JSON_FILE_PATH)
    methods_json = read_json(METHODS_JSON_FILE_PATH)

    class_key = f'{service_name}.{class_qual_name}'
    method_key = f'{service_name}.{func_qual_name}'

    # Get class data
    status, class_vars, class_methods = get_class_data(class_key, class_json)
    if status == "-1":
        return "-1", "", "", "", "", ""

    # Get method data
    status, method_params, method_vars = get_method_data(
        method_key, methods_json, class_json)

    if status == "-1":
        return "0", class_qual_name, class_vars, class_methods, "", ""

    return "1", class_qual_name, class_vars, class_methods, method_params, method_vars


# Sample Input: file_name="Test.java"
# project_home="F:/Projects/UIUC/CS-527/MP2/hadoop"
# micro_service="hadoop-common-project/hadoop-common"
# qualified_name="org.apache.hadoop.fs.viewfs.ViewFs.getHomeDirectory"
def move_test_file_to_dest(file_name, project_home, micro_service, qualified_name):
    origin = './output/generated/'+file_name
    qu_paths = qualified_name.split('.')
    target_test_loc = micro_service+'/src/test/java/'+qu_paths[0]+'/'+qu_paths[1]+'/'+qu_paths[2]+'/'+file_name
    target = project_home+target_test_loc
    os.rename(origin, target)


# Start
# status, class_qual_name, class_vars, class_methods, method_params, method_vars = get_metadata("hadoop-hdfs-project/hadoop-hdfs-rbf",
#                                                                                               "org.apache.hadoop.hdfs.server.federation.router.RouterRpcServer.setXAttr")

# status, class_qual_name, class_vars, class_methods, method_params, method_vars = get_metadata("hadoop-hdfs-project/hadoop-hdfs",
#                                                                                               "org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.FsDatasetImpl.computeChecksum")

# op = {
#     "qualifiedName": class_qual_name,
#     "variables": class_vars,
    # "methods": class_methods,
    # "parameters": method_params,
    # "variables": method_vars
# }

# print(f'>>> OP: {op}')

# print(f'{extract_method_from_method_qlf_name("org.apache.hadoop.fs.viewfs.ViewFs.<clinit>")}')
# print(f'{extract_method_from_method_qlf_name("org.apache.hadoop.fs.viewfs.ViewFs$InternalDirOfViewFs.checkPathIsSlash")}')
# print(f'{extract_method_from_method_qlf_name("org.apache.hadoop.fs.viewfs.ViewFs.getFileChecksum")}')
# move_test_file_to_dest('Test1.java', 'F:/Projects/UIUC/CS-527/MP2/hadoop/', 'hadoop-common-project/hadoop-common', 'org.apache.hadoop.fs.viewfs.ViewFs.getHomeDirectory')