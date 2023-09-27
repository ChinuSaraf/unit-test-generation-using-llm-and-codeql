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