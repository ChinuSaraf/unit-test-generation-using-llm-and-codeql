# Tool to generate unit tests using LLM and CodeQL

The tool mainly consists of the following two modules:

## 1. CodeQL

- Static code analysis using code to get metadata of the project.
- Expected to get variables and functions for each Java class.

## 2. LLM (ChatGPT)

- Input to ChatGPT:
  - Target function
  - Metadata for all classes which are being used in the target function
  - Prompt
- Semantically compare generated unit test with expected unit test

## Current Status

### Completed

1. Importing Hadoop project in CodeQL.
2. CodeQL query to get metadata of all methods for each Java class.
3. Python script to call ChatGPT API.
4. Developed Query to Fetch all variables and their types for each Java class
5. Developed Query to Fetch all local variables and their types for each Java method
6. Developed Query to Fetch all parameters and their types for each Java method
7. Refactored Python Script. (Added new abstract class-`Prompt` and dedicated `Tests` class)
8. Changes to Data Files. (Updated attributes in `methods.json` and added new `tests.json` file for multiple unit test prompts)
9. Enhanced Script Execution by running the script for multiple prompts.

### In Progress

- Exploring methods to validate the output of generated unit tests.
- Write a script to translate all the CodeQL query outputs, which are in CSV format to their respective JSON formats.
- Documenting ChatGPT interactions in an output markdown file to enhance readability and logging purposes.
- Conclude the validation method for generated unit test results.
- Following our TA's advice, we aim to create a prompt for generating an executable test file.

## Setting up

### CodeQL

We are using the VS Code extension of the CodeQL to work on this tool. So, ensure that you've VS Code installed in your system.

1. Setting up CodeQL CLI: [CodeQL CLI Setup](https://docs.github.com/en/code-security/codeql-cli/getting-started-with-the-codeql-cli/setting-up-the-codeql-cli)
2. Setting up VS Code extension: [VS Code](https://marketplace.visualstudio.com/items?itemName=github.vscode-codeql)

Verify the setup as mentioned in the CLI Setup link.

### Python script

Note that you need `python` and `pip3` installed before proceeding.

#### Setting up the OpenAI API Key

This would require an OpenAI API key which can be obtained from [OpenAI API Key](https://platform.openai.com/account/api-keys). Save the key in a file named `config.json` in the `/tool` folder in the format given below.

```
{
  "OPENAI_API_KEY": "<KEY>"
}
```

#### Install all the requirements using the `requirements.txt` file

```
pip3 install -r tool/requirements.txt
```

#### Navigate to the `tool/` directory

```
cd tool
```

## Running Tool

### CodeQL

1. Import the Hadoop database in CodeQL through VS Code extension [Hadoop GitHub Home](https://github.com/apache/hadoop)
2. Select the **Java** language while importing the project. (This may take a while)
3. In VS Code, open a command Palette (Ctrl+shift+P) and select **CodeQL: Quick Query**. This will open the `quick-query.ql` file.
4. Copy the query from [Get Class Methods](https://github.com/ChinuSaraf/unit-test-generation-using-llm-and-codeql/blob/main/codql-scripts/get-methods-of-class.ql) and paste in the `quick-query.ql`
5. Right-Click on an editor and select `CodeQL: Run Query on Selected Database`
6. This will generate an output similar to [Class to Methods mapping](https://github.com/ChinuSaraf/unit-test-generation-using-llm-and-codeql/blob/main/codeql-query-results/get-methods-of-class.csv)

### Run the script `run_tool.py`

```
python run_tool.py
```

After running this command, currently, the script will make a call to the ChatGPT asking it to generate unit tests for the funtion `_attributeStreamIsAllocated`.

#### Output

Check the output file: [View output.txt](/tool/output/generated-unit-tests.txt)
