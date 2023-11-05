import java

from 
    Class c, Variable v
where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    and
    v.getFile().toString() = c.getFile().toString()
    and
    v.getAPrimaryQlClass() = "Field"
select 
    c.getQualifiedName() as clsQualifiedName,
    v.getName() as varName,
    v.getType().toString() as varType,
    c.getFile().getRelativePath() as relativePath