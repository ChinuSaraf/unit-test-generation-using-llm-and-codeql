# Randoop Commands to generate tests - Hadoop Project
```
java -classpath "{CLASS_PATH};{RANDOOP_JAR}" randoop.main.Main gentests --testclass={TEST_CLASS} --output-limit=500
```

## Examples

### **WhoClient**
**Classpath** - `hadoop\hadoop-common-project\hadoop-auth-examples\target\classes`

**Test Class** - `org.apache.hadoop.security.authentication.examples.WhoClient`

**Randoop Jar Path** - `F:\Projects\UIUC\CS-527\Project\randoop-4.3.2\randoop-4.3.2\randoop-all-4.3.2.jar`

**Command** - 
`java -classpath "F:\Projects\UIUC\CS-527\MP2\hadoop\hadoop-common-project\hadoop-auth-examples\target\classes;F:\Projects\UIUC\CS-527\Project\randoop-4.3.2\randoop-4.3.2\randoop-all-4.3.2.jar" randoop.main.Main gentests --testclass=org.apache.hadoop.security.authentication.examples.WhoClient --output-limit=500`

### **PlatformName**
**Classpath** - `hadoop\hadoop-common-project\hadoop-auth\target\classes`

**Test Class** - `org.apache.hadoop.util.PlatformName`

**Randoop Jar Path** - `F:\Projects\UIUC\CS-527\Project\randoop-4.3.2\randoop-4.3.2\randoop-all-4.3.2.jar`

**Command** - 
`java -classpath "F:\Projects\UIUC\CS-527\MP2\hadoop\hadoop-common-project\hadoop-auth\target\classes;F:\Projects\UIUC\CS-527\Project\randoop-4.3.2\randoop-4.3.2\randoop-all-4.3.2.jar" randoop.main.Main gentests --testclass=org.apache.hadoop.util.PlatformName --output-limit=500`


### **HttpConstants**
**Classpath** - `F:\Projects\UIUC\CS-527\MP2\hadoop\hadoop-common-project\hadoop-auth\target\classes`

**Test Class** - `org.apache.hadoop.security.authentication.server.HttpConstants`

**Randoop Jar Path** - `F:\Projects\UIUC\CS-527\Project\randoop-4.3.2\randoop-4.3.2\randoop-all-4.3.2.jar`

**Command** - 
`java -classpath "java -classpath "F:\Projects\UIUC\CS-527\MP2\hadoop\hadoop-common-project\hadoop-auth\target\classes;F:\Projects\UIUC\CS-527\Project\randoop-4.3.2\randoop-4.3.2\randoop-all-4.3.2.jar" randoop.main.Main gentests --testclass=org.apache.hadoop.security.authentication.server.HttpConstants --output-limit=500`
