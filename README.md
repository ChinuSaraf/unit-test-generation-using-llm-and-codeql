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
### In Progress
- Import Hadoop projetc in CodeQL
- Write automation script to call ChatGPT API