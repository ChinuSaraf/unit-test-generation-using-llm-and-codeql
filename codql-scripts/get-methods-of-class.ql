import java

from 
    Class c, Method m
where
    c.getFile().getAbsolutePath().matches("%src/main/java%")
    and
    m.getFile() = c.getFile()
select
    c.getQualifiedName() as clsQualifiedName,
    m.getQualifiedName() as methodQualifiedName,
    m.getReturnType().toString() as methodReturnType