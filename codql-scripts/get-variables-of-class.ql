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
    c.getFile().toString(), 
    v.getName(),
    v.getType().toString(),
    c.getFile().getAbsolutePath().toString()