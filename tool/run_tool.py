import json
import sys
import argparse
import openai
import datetime
import time
import re

# GET YOUR OPEN AI API KEY FROM : https://platform.openai.com/account/api-keys
# Save the key in config.json as { "OPENAI_API_KEY": "<KEY>" }


with open("config.json", "r") as file:
    config = json.loads(file.read())

openai.api_key = config["OPENAI_API_KEY"]


def chat(method_dict):
    init = "For the JAVA function with comments given in the variable 'code' below, write unit test for testing the function. Follow the instructions carefully. Instructions: Import all the required packages, Mock all the functions and classes required by the method."

    task_prompt = [
        {
            "role": "system",
            "content": init
        }
    ]

    while True:
        prompt = "Generate unit tests for this method:\n `" + \
            method_dict["code"] + "`"

        task_prompt.append({
            "role": "user",
            "content": prompt
        })

        print(f"Prompt: {prompt}")

        chat = openai.ChatCompletion.create(
            model="gpt-3.5-turbo",
            messages=task_prompt
        )

        reply = chat.choices[0].message.content

        print(f"Reply: {reply}")

        task_prompt.append({"role": "assistant", "content": reply})

        break


def tests(i, data_json):
    chat(data_json)


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
