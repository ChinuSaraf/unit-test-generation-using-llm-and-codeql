import java

from
    Class c, Method m

where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    // and
    // m.getQualifiedName() = "org.apache.hadoop.hdfs.ViewDistributedFileSystem.getECTopologyResultForPolicies"
    and
    m.getFile() = c.getFile()
    
select
    c.getQualifiedName() as clsQualifiedName,
    m.getQualifiedName() as methodQualifiedName,
    m.paramsString() as params,
    c.getFile().getRelativePath() as relativePath