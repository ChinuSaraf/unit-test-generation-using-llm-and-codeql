import java

from 
    Class c, Field v
where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    and
    v.getDeclaringType().getQualifiedName() = c.getQualifiedName()
    and
    v.getFile() = c.getFile()
    and
    v.getAPrimaryQlClass() = "Field"
select 
    c.getQualifiedName() as clsQualifiedName,
    v.getName() as varName,
    v.getType().toString() as varType,
    c.getFile().getRelativePath() as relativePath