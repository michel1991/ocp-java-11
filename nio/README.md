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

# What are some advantages of using NIO.2’s Files.readAttributes() method rather than reading attributes individually from a file? (Choose all that apply.)
A. It can be used on both files and directories.
B. For reading a single attribute, it is often more performant.
C. It allows you to read symbolic links.
D. It makes fewer round-trips to the file system.
E. It can be used to access file system–dependent attributes.
F. For reading multiple attributes, it is often more performant.

Whether a path is a symbolic link, file, or directory is not relevant, so options A and C are incorrect.
Using a view to read multiple attributes leads to fewer round-trips between the process and the file system and better performance, so options D and F are correct.
For reading single attributes, there is little or no expected gain, so option B is incorrect.
Finally, views can be used to access file system–specific attributes that are not available in Files methods; therefore, option E is correct.

# What are some advantages of NIO.2 over the legacy java.io.File class for working with files? (Choose three.)
A. NIO.2 supports file system–dependent attributes.
B. NIO.2 includes a method to list the contents of a directory.
C. NIO.2 includes a method to traverse a directory tree.
D. NIO.2 includes a method to delete an entire directory tree.
E. NIO.2 includes methods that are aware of symbolic links.
F. NIO.2 supports sending emails.
Options A, C, and E are all properties of NIO.2 and are good reasons to use it over the java.io.File class.
Option B is incorrect, as both java.io.File and NIO.2 include a method to list the contents of a directory.
Option D is also incorrect as both APIs can delete only empty directories, not a directory tree.
Finally, option F is incorrect, as sending email messages is not a feature of either API.
