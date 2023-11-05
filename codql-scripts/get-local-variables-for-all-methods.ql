import semmle.code.java.Statement
import java

from
    Class c, LocalVariableDeclStmt s, Method m

where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    // and
    // m.getQualifiedName() = "org.apache.hadoop.hdfs.ViewDistributedFileSystem.getECTopologyResultForPolicies"
    and
    m.getFile() = c.getFile()
    and
    s.getFile() = c.getFile()
    and
    s.getEnclosingCallable().getQualifiedName()= m.getQualifiedName()
    
select
    c.getQualifiedName() as clsQualifiedName,
    m.getQualifiedName() as methodQualifiedName,
    s.getVariable(1).getName() as varName,
    s.getVariable(1).getType().toString() as varType,
    c.getFile().getRelativePath() as relativePath