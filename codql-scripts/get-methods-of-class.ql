import java

from 
    Class c, Method m
where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    and
    m.getFile() = c.getFile()
select 
    c.getFile().toString(),
    m.getQualifiedName(),
    m.getReturnType().toString(),
    c.getFile().getAbsolutePath().toString()