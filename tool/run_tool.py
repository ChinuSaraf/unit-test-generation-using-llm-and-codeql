import json
import sys
import argparse
import openai
import datetime
import time
import re
from prompt.tests import Tests

# GET YOUR OPEN AI API KEY FROM : https://platform.openai.com/account/api-keys
# Save the key in config.json as { "OPENAI_API_KEY": "<KEY>" }


with open("config.json", "r") as file:
    config = json.loads(file.read())

openai.api_key = config["OPENAI_API_KEY"]


def chat(i, task, out):
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
        prompt = task.generate_prompt(idx)

        # To print the method body inside a code block in the output
        if idx == 1:
            out.append("**" + prompt + "**")
            out.append('```')
            out.append(task.get_code())
            out.append('```')

        prompt += task.get_code() if idx == 1 else ""

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

        if idx != 1:
            out.append("## Prompt")
            out.append("**" + prompt + "**")
        out.append("## Response")
        out.append(reply)

        task_prompt.append({"role": "assistant", "content": reply})
        idx += 1

        if not task.parse_response(idx, reply):
            task.store(i, out)
            break


def tests(i, data_json, out):
    out.append("# Task: Generate Tests")
    out.append("---")
    test = Tests(i, data_json)
    chat(i, test, out)


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
    tests(i+1, data_json[i], out)

print(f'Task Completed')
