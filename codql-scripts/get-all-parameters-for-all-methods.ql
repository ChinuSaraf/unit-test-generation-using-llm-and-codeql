import java

from
    Class c, Method m

where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    // and
    // m.getQualifiedName() = "org.apache.hadoop.fs.viewfs.ViewFs$InternalDirOfViewFs.getFileLinkStatus"
    and
    m.getDeclaringType().getQualifiedName() = c.getQualifiedName()
    and
    m.getFile() = c.getFile()
select
    c.getQualifiedName() as clsQualifiedName,
    m.getQualifiedName() as methodQualifiedName,
    m.paramsString() as params,
    c.getFile().getRelativePath() as relativePath