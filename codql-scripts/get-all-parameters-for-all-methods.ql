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
    c.getFile().toString(),
    m.getQualifiedName(),
    m.paramsString()