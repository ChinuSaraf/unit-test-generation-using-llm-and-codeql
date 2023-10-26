# Map<String, Class1>
# List<Class1>
# Map<Class1, Map<String, Class2>>
# Map<Map<Class1, Class2>, Map<Class3, Class4>> => ["Map", "Map", "Class1, Class2>, Map", "Class3, Class4>>"]

remove_keywords = ['String', 'int', 'Integer', 'char', 'float', 'long', 'double', 'Double', 'byte', 'boolean', 'Map', 'HashMap',
                   'TreeMap', 'ArrayList', 'List', 'Set', 'HashSet', 'Stack', 'Queue', 'ChainBlockingQueue', 'Object', 'Class',
                   'T', '?', '[]', '', 'extends']


def get_primitive_datatype(data_type):
    all_classes = []
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
    print(all_primitive_datatypes)


get_primitive_datatype("Map<Map<Class1, Class2>, Map<Class3, Class4>>")
