import csv
import json

print(f"Started processing Class Methods")

# JSON object for stored class data
class_json = {
}

# Converting the Class methods csv to json
CLASS_METHODS_FILENAME = "../codeql-query-results/get-methods-of-class.csv"
with open(CLASS_METHODS_FILENAME, newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=',', quotechar='|')
    i = 1
    for row in spamreader:
        i += 1
        obj = {
            "name": row[1].replace('"', ""),
            "return": row[2].replace('"', "")
        }

        class_name = row[0].replace('"', "")

        if class_json.get(class_name):
            class_json[class_name]["methods"].append(obj)
        else:
            class_json[class_name] = {
                "methods": [
                    obj
                ],
                "variables": [
                ]}


print(f"Started processing Class Variables")

# Converting the Class variables csv to json
CLASS_VARS_FILENAME = "../codeql-query-results/get-variables-of-class.csv"
with open(CLASS_VARS_FILENAME, newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=',', quotechar='|')
    i = 1
    for row in spamreader:
        i += 1
        obj = {
            "name": row[1].replace('"', ""),
            "type": row[2].replace('"', "")
        }

        class_name = row[0].replace('"', "")

        if class_json.get(class_name):
            class_json[class_name]["variables"].append(obj)
        else:
            class_json[class_name] = {
                "methods": [
                ],
                "variables": [
                    obj
                ]}

# Writing the dict to json file
OUTPUT_JSON = "./output/json/class-metadata.json"
out = open(OUTPUT_JSON, "w")
json.dump(class_json, out, indent=4)

print(f"Completed task")
