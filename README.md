# Tool to generate unit test using LLM and CodeQL

The tool mainly consist of following two modules: 
## 1. CodeQL
- Static code analysis using codeQL to get meta data of the project.
- Expected to get variables and functions for each java class.

## 2. LLM (ChatGPT)
- Input to ChatGPT:
    - Target function
    - Meta data for all classes which are being used in target function
    - Prompt
- Semantically compare generated unit test with expected unit test

## Current Status

### Completed
1. Importing hadoop project in CodeQL.
2. CodeQL query to get meta data of all methods for each Java class.
3. Python script to call ChatGPT API.

### In Progress
- CodeQL query to get list of all variables for each Java class.
- Update in Python script to pass prompt, function, and meta data as input to ChatGPT API.

## Setting up

### CodeQL 

### Python script
Note that you need `python` and `pip3` installed before proceeding.

#### Setting up the OpenAI API Key 
This would require an OpenAI API key which can be obtained from [OpenAI API Key](https://platform.openai.com/account/api-keys). Save the key in a file named `config.json` in `/tool` folder in the format given below.
```
{ 
  "OPENAI_API_KEY": "<KEY>" 
}
```
#### Install all the requirements using `requirements.txt` file
```
pip3 install -r tool/requirements.txt
```
#### Navigate to `tool/` directory
```
cd tool
```
#### Run the script `run_tool.py`
```
python run_tool.py
```
