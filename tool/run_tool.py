import json
import sys
import argparse
import openai
import datetime
import time
import re
from prompt.tests import Tests
from helpers.utils import get_metadata, extract_class_from_class_qlf_name

# GET YOUR OPEN AI API KEY FROM : https://platform.openai.com/account/api-keys
# Save the key in config.json as { "OPENAI_API_KEY": "<KEY>" }


with open("config.json", "r") as file:
    config = json.loads(file.read())

openai.api_key = config["OPENAI_API_KEY"]


def chat(i, task, out, meta_data_arr):
    init = task.get_init_prompt()
    print(f">>> INIT: {init}")
    out.append("## Prompt")
    out.append("**" + init + "**")
    idx = 1

    task_prompt = [
        {
            "role": "system",
            "content": init
        }
    ]

    while True:
        # Skip the prompts which don't provide meta-data.
        if idx <= 4 and meta_data_arr[idx-1] == "":
            idx += 1
            continue

        # Beacuse of the Rate limit applied by OpenAI 3 requests per minute
        if idx % 3 == 0:
            time.sleep(60)

        # Get prompt from the multi-prompt list
        prompt = task.generate_prompt(idx)

        # To print the method body inside a code block in the output
        if idx == 1:
            out.append("**" + prompt + "**")
            out.append('CODE:')
            out.append('```')
            out.append(task.get_code())
            out.append('```')
        else:
            out.append("## Prompt")
            out.append("**" + prompt + "**")

        # Add the supplementary information depending upon the current prompt
        if idx == 1:
            prompt += '\nCODE: \n' + task.get_code()
        elif idx == 2:
            prompt += '\nPARENT_CLASS: \n' + meta_data_arr[idx-1]
            out.append('\nPARENT_CLASS: \n' + meta_data_arr[idx-1])
        elif idx == 3:
            prompt += '\nPARAMETERS: \n' + meta_data_arr[idx-1]
            out.append('\nPARAMETERS: \n' + meta_data_arr[idx-1])
        elif idx == 4:
            prompt += '\nLOCAL_VARIABLES: \n' + meta_data_arr[idx-1]
            out.append('\nLOCAL_VARIABLES: \n' + meta_data_arr[idx-1])

        if idx <= 4:
            prompt += f"\nIf you understand this, say only 'Yes'."
        task_prompt.append({
            "role": "user",
            "content": prompt
        })

        print(f">>> Prompt: {prompt}")

        chat = openai.ChatCompletion.create(
            model="gpt-3.5-turbo",
            messages=task_prompt
        )

        reply = chat.choices[0].message.content

        print(f"Reply: {reply}")

        # Log this response in markdown
        out.append("## Response")
        out.append("```")
        out.append(reply)
        out.append("```")

        if idx == 5:
            task.write_unit_test(i, reply)

        task_prompt.append({"role": "assistant", "content": reply})

        idx += 1
        if not task.parse_response(idx, reply):
            task.store(i, out)
            break


def tests(i, data_json, out, meta_data_arr):
    out.append("# Task: Generate Tests")
    out.append("---")
    test = Tests(i, data_json)
    chat(i, test, out, meta_data_arr)


def read_data(data_path):
    # Load Dataset
    with open(data_path, encoding='utf8') as file:
        data = json.load(file)

    return data


# Script begins here
# if __name__ == 'main':
data_path = "../data/methods.json"
data_json = read_data(data_path)

for i in range(len(data_json)):
    out = []
    # Unit test generation
    print(f'Starting UNIT TEST GENERATION task for the object #{i + 1}...')
    # Get the meta-data for the current method
    service_name = data_json[i]['serviceName']
    method_qlf_name = data_json[i]['functionQualifiedName']
    status, class_qual_name, class_vars, class_methods, method_params, method_vars = get_metadata(
        service_name, method_qlf_name)
    method_class_name = extract_class_from_class_qlf_name(class_qual_name)

    meta_data_arr = [method_class_name]
    first_ = {
        "qualifiedName": class_qual_name,
        "variables": class_vars,
        "methods": class_methods
    }

    meta_data_arr.append(f'{method_class_name}: {json.dumps(first_)}')
    meta_data_arr.append(json.dumps(method_params)
                         if method_params != "" else "")
    meta_data_arr.append(json.dumps(method_vars) if method_vars != "" else "")

    tests(i+1, data_json[i], out, meta_data_arr)

print(f'Task Completed')
