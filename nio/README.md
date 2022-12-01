# Which of the following NIO.2 Files methods declare a checked exception? (Choose all that apply.
A. exists(Path)
B. isDirectory(Path)
C. isRegularFile(Path)
D. isSameFile(Path,Path)
E. isSymbolicLink(Path)
F. size(Path)
G. readAttributes(Path,Class)

The isSameFile() method will throw an IOException if one of the Path values does not exist and the Path values are not equivalent in terms of equals().
The size() and readAttrributes() methods will also throw an IOException if they reference paths that do not exist.
The rest of the methods return false without throwing an exception if the path does not exist.

# Which NIO.2 method is most similar to the legacy java.io.File method listFiles?
A. Path.listFiles()
B. Files.dir()
C. Files.ls()
D. Files.files()
E. Files.list()
F. Files.walk()

The java.io.File method listFiles() retrieves the members of the current directory without traversing any subdirectories.
Option E is correct, as Files.list() returns a Stream<Path> of a single directory.
Files.walk() is close, but it iterates over the entire directory tree, not just a single directory. The rest of the methods do not exist.