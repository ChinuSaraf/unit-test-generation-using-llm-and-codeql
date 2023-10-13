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


def chat(i, task):
    init = task.get_init_prompt()
    print(f">>> INIT: {init}")
    idx = 1

    task_prompt = [
        {
            "role": "system",
            "content": init
        }
    ]

    while True:
        prompt = task.generate_prompt(idx)

        if prompt is None:
            break

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

        task_prompt.append({"role": "assistant", "content": reply})
        idx += 1


def tests(i, data_json):
    test = Tests(i, data_json)
    chat(i, test)


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
    # chat(data_json[i])

    tests(i+1, data_json[i])

print(f'Task Completed')
