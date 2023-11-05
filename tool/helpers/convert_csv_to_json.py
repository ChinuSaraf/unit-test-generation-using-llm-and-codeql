import csv
import pandas as pd
import json
from typing import Dict


def generate_class_methods(class_json) -> None:
    '''
    This function parses `codeql-query-results/get-methods-of-class.csv` CSV and creates a Dict, mapping Classes to a list of methods.

    Returns:
        class_json (Dict)
    '''
    # # JSON object for stored class data
    # class_json = {
    # }

    # Converting the Class methods csv to json
    CLASS_METHODS_FILENAME = "../../codeql-query-results/get-methods-of-class.csv"
    df = pd.read_csv(CLASS_METHODS_FILENAME)

    for idx, row in df.iterrows():
        obj = {
            "name": row[1],
            "return": row[2]
        }

        class_name = row[0]

        if class_json.get(class_name):
            class_json[class_name]["methods"].append(obj)
        else:
            class_json[class_name] = {
                "methods": [
                    obj
                ],
                "variables": [
                ]}

    return class_json


def generate_class_variables(class_json: Dict) -> Dict:
    '''
    This function parses `get-variables-of-class` CSV and creates a Dict, mapping Classes to a list of variables.

    Returns:
        class_methods_dict (Dict)
    '''
    CLASS_VARS_FILENAME = "../../codeql-query-results/get-variables-of-class.csv"
    df = pd.read_csv(CLASS_VARS_FILENAME)

    for idx, row in df.iterrows():
        obj = {
            "name": row[1],
            "type": row[2]
        }

        class_name = row[0]

        if class_json.get(class_name):
            class_json[class_name]["variables"].append(obj)
        else:
            class_json[class_name] = {
                "methods": [
                ],
                "variables": [
                    obj
                ]}

    return class_json


def write_to_file(file_name: str, map: Dict) -> None:
    '''
    This function writies the dict to json file
    '''

    out = open(file_name, "w")
    json.dump(map, out, indent=4)


def generate_methods_parameters(methods_json) -> Dict:
    '''
    '''

    METHOD_PARAMS_FILENAME = "../../codeql-query-results/get-all-parameters-for-all-methods.csv"
    df = pd.read_csv(METHOD_PARAMS_FILENAME)

    for idx, row in df.iterrows():
        method_name = row[1]
        paramters = row[2] if row[2] != "()" else ""

        if methods_json.get(method_name):
            methods_json[method_name]["parameters"].append(paramters)
        else:
            methods_json[method_name] = {
                "parameters": [paramters]
            }

    return methods_json


def generate_methods_variables(methods_json) -> Dict:
    METHOD_VARS_FILENAME = "../../codeql-query-results/get-local-variables-for-all-methods.csv"
    df = pd.read_csv(METHOD_VARS_FILENAME)

    for idx, row in df.iterrows():
        method_name = row[1]
        var_name = row[2]
        var_type = row[3]

        obj = {
            "name": var_name,
            "type": var_type
        }

        if methods_json.get(method_name):
            if methods_json[method_name].get("local_variables"):
                methods_json[method_name]["local_variables"].append(obj)
            else:
                methods_json[method_name] = {
                    "local_variables": [obj]
                }
        else:
            methods_json[method_name] = {
                "local_variables": [obj]
            }

    return methods_json


# Start
print(f'Starting the script')

# Parse Class methods and variables CSV to generate JSON
class_json = {
}
class_json = generate_class_methods(class_json)
class_json = generate_class_variables(class_json)

# Write the Class methods and variables JSON to file
write_to_file("../output/json/class-metadata.json", class_json)

# Parse Method parameters and variables CSV to generate JSON
methods_json = {
}
methods_json = generate_methods_parameters(methods_json)
methods_json = generate_methods_variables(methods_json)

# Write the Method parameters and variables JSON to file
write_to_file("../output/json/method-metadata.json", methods_json)

print(f"Completed task")
