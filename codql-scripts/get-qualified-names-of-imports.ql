import java

from
    Class c, ImportType i
where
    i.getFile() = c.getFile()
    and
    c.getFile().getAbsolutePath().matches("%src/main/java%")
select
    c.getQualifiedName(),
    i.getImportedType().toString(),
    i.getImportedType().getQualifiedName(),
    i.getImportedType().getFile().getRelativePath(),
    c.getFile().getRelativePath()