import csv
import pandas as pd
import json
from typing import Dict
from utils import get_key_for_entity, get_primitive_datatype
import time


def read_imp_cls_csv() -> object:
    '''
    '''
    IMP_CLS_FILENAME = "../../codeql-query-results/class-meta-data/get-imports-of-class.csv"
    df = pd.read_csv(IMP_CLS_FILENAME)
    return df


def generate_class_methods(class_json) -> None:
    '''
    This function parses `codeql-query-results/get-methods-of-class.csv` CSV and creates a Dict, mapping Classes to a list of methods.

    Returns:
        class_json (Dict)
    '''

    # Converting the Class methods csv to json
    CLASS_METHODS_FILENAME = "../../codeql-query-results/class-meta-data/get-methods-of-class.csv"
    df = pd.read_csv(CLASS_METHODS_FILENAME)

    for idx, row in df.iterrows():
        obj = {
            "name": row[1],
            "return": row[2]
        }

        class_name = get_key_for_entity(row[3], row[0])

        if class_json.get(class_name):
            class_json[class_name]["methods"].append(obj)
        else:
            class_json[class_name] = {
                "methods": [
                    obj
                ],
                "variables": [
                ]
            }

    return class_json


def generate_class_variables(class_json: Dict, df_imp_cls: object) -> Dict:
    '''
    This function parses `get-variables-of-class` CSV and creates a Dict, mapping Classes to a list of variables.

    Returns:
        class_methods_dict (Dict)
    '''
    CLASS_VARS_FILENAME = "../../codeql-query-results/class-meta-data/get-variables-of-class.csv"
    df = pd.read_csv(CLASS_VARS_FILENAME)

    for idx, row in df.iterrows():
        obj = {
            "name": row[1],
            "type": row[2]
        }

        class_name = get_key_for_entity(row[3], row[0])

        if class_json.get(class_name):
            class_json[class_name]["variables"].append(obj)
        else:
            class_json[class_name] = {
                "variables": [
                    obj
                ],
                "methods": []
            }

    return class_json


def write_to_file(file_name: str, map: Dict) -> None:
    '''
    This function writies the dict to json file
    '''

    out = open(file_name, "w")
    json.dump(map, out, indent=4)


def generate_methods_parameters(methods_json, df_imp_cls) -> Dict:
    '''
    '''

    METHOD_PARAMS_FILENAME = "../../codeql-query-results/methods-meta-data/get-all-parameters-for-all-methods.csv"
    df = pd.read_csv(METHOD_PARAMS_FILENAME)

    for idx, row in df.iterrows():
        method_name = get_key_for_entity(row[3], row[1])
        paramters = row[2] if row[2] != "()" else None

        if paramters is None:
            continue

        types = get_primitive_datatype(paramters)
        types = types[:10]

        if len(types) == 0:
            continue

        results = df_imp_cls.loc[df_imp_cls["Class Qualified Name"] == row[0]]

        if len(results) == 0:
            continue

        op = results.loc[results["Imported Class"].isin(types)]

        if len(op) == 0:
            continue

        for j, r in op.iterrows():
            obj = {
                "type": get_key_for_entity(r["Imported Class Relative Path"], r["Imported Class Qualified Name"])
            }

            if methods_json.get(method_name):
                if obj not in methods_json[method_name]["parameters"]:
                    methods_json[method_name]["parameters"].append(obj)
            else:
                methods_json[method_name] = {
                    "parameters": [obj],
                    "local_variables": []
                }
    return methods_json


def generate_methods_variables(methods_json, df_imp_cls) -> Dict:
    '''
    '''
    METHOD_VARS_FILENAME = "../../codeql-query-results/methods-meta-data/get-local-variables-for-all-methods.csv"
    df = pd.read_csv(METHOD_VARS_FILENAME)

    for idx, row in df.iterrows():
        method_name = get_key_for_entity(row[4], row[1])
        var_name = row[2]
        var_type = row[3]

        types = get_primitive_datatype(var_type)
        types = types[:10]
        if len(types) == 0:
            continue

        results = df_imp_cls.loc[df_imp_cls["Class Qualified Name"] == row[0]]
        if len(results) == 0:
            continue

        op = results.loc[results["Imported Class"].isin(types)]

        if len(op) == 0:
            continue

        for j, r in op.iterrows():
            obj = {
                "name": var_name,
                "type": get_key_for_entity(r["Imported Class Relative Path"], r["Imported Class Qualified Name"])
            }

            if methods_json.get(method_name):
                if methods_json[method_name].get("local_variables"):
                    if obj not in methods_json[method_name]["local_variables"]:
                        methods_json[method_name]["local_variables"].append(
                            obj)
                else:
                    methods_json[method_name] = {
                        "local_variables": [obj],
                        "parameters": methods_json[method_name]['parameters'] if methods_json[method_name].get("parameters") else []
                    }
            else:
                methods_json[method_name] = {
                    "local_variables": [obj],
                    "parameters": []
                }
    return methods_json


# Start
print(f'Starting the script')

df_imported_classes = read_imp_cls_csv()

# Parse Class methods and variables CSV to generate JSON
class_json = {
}
class_json = generate_class_methods(class_json)
class_json = generate_class_variables(class_json, df_imported_classes)

# Write the Class methods and variables JSON to file
write_to_file("../output/json/class-metadata.json", class_json)

# Parse Method parameters and variables CSV to generate JSON
methods_json = {
}
methods_json = generate_methods_parameters(methods_json, df_imported_classes)
methods_json = generate_methods_variables(methods_json, df_imported_classes)

# Write the Method parameters and variables JSON to file
write_to_file("../output/json/method-metadata.json", methods_json)

print(f"Completed task")
