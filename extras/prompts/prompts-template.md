# Prompt Template

## Prompt-1
Consider following target function from the variable 'CODE'.

CODE:
```
<TARGET_FUNCTION>
```

The function belong to the class: `<Class_of_Target_Function>`
<br>If you understand this, say only "Yes".

## Prompt-2
Consider following metadata of target function's parent class stored in the variable 'PARENT_CLASS'.

PARENT_CLASS:
```
className: {
    "qualifiedName": "org.package.className",
    "variables": [{"name": "variable_name", "type": "variable_type"}, ...],
    "functions": [{"name": "function_name", "returnType": "function_return_type"}, ...],
}
```
If you understand this, say only "Yes".

## Prompt-3
Consider following metadata of target function's parameters stored in the variable 'PARAMETERS'.

PARAMETERS:
```
parameterClassName: {
    "qualifiedName": "org.package.parameterClassName",
    "variables": [{"name": "variable_name", "type": "variable_type"}, ...],
    "functions": [{"name": "function_name", "returnType": "function_return_type"}, ...],
}
...
```
If you understand this, say only "Yes".

## Prompt-4
Consider following metadata of target function's local variables stored in the variable 'LOCAL_VARIABLES'.

LOCAL_VARIABLES:
```
localVariableClassName: {
    "qualifiedName": "org.package.localVariableClassName",
    "variables": [{"name": "variable_name", "type": "variable_type"}, ...],
    "functions": [{"name": "function_name", "returnType": "function_return_type"}, ...],
}
...
```
If you understand this, say only "Yes".

## Prompt-5
For the Java function from variable 'CODE' below write a junit test. 
Use the metadata of classes from variables - PARENT_CLASS, PARAMETERS, and LOCAL_VARIABLES. Generate the junit test with a runnable java test file. 
Enclose the generated java file in `<JunitTest></JunitTest>` tag.
Follow the instructions carefully.

Instructions:
1. Import all the required packages and mock all the functions and classes the method requires.
2. Add assert statements at the end.
3. Import classes using qualifiedName provided in PARENT_CLASS, PARAMETERS, and LOCAL_VARIABLES.
