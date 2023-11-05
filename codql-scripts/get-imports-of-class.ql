import java

from
    Class c, ImportType i
where
    i.getFile() = c.getFile()
    and
    c.getFile().getAbsolutePath().matches("%src/main/java%")
select
    c.getQualifiedName() as clsQualifiedName,
    i.getImportedType().toString() as importedCls,
    i.getImportedType().getQualifiedName() as importedClsQualifiedName,
    i.getImportedType().getFile().getRelativePath() as importedClsRelaivePath,
    c.getFile().getRelativePath() as relativePath