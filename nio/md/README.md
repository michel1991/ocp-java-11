### Which of the following NIO.2 Files methods declare a checked exception? (Choose all that apply.
* A. exists(Path)
* B. isDirectory(Path)
* C. isRegularFile(Path)
* D. isSameFile(Path,Path)
* E. isSymbolicLink(Path)
* F. size(Path)
* G. readAttributes(Path,Class)

The isSameFile() method will throw an IOException if one of the Path values does not exist and the Path values are not equivalent in terms of equals().
The size() and readAttrributes() methods will also throw an IOException if they reference paths that do not exist.
The rest of the methods return false without throwing an exception if the path does not exist.



### What are some advantages of using NIO.2’s Files.readAttributes() method rather than reading attributes individually from a file? (Choose all that apply.)
* A. It can be used on both files and directories.
* B. For reading a single attribute, it is often more performant.
* C. It allows you to read symbolic links.
* D. It makes fewer round-trips to the file system.
* E. It can be used to access file system–dependent attributes.
* F. For reading multiple attributes, it is often more performant.

Whether a path is a symbolic link, file, or directory is not relevant, so options A and C are incorrect.
Using a view to read multiple attributes leads to fewer round-trips between the process and the file system and better performance, so options D and F are correct.
For reading single attributes, there is little or no expected gain, so option B is incorrect.
Finally, views can be used to access file system–specific attributes that are not available in Files methods; therefore, option E is correct.

### What are some advantages of NIO.2 over the legacy java.io.File class for working with files? (Choose three.)
* A. NIO.2 supports file system–dependent attributes.
* B. NIO.2 includes a method to list the contents of a directory.
* C. NIO.2 includes a method to traverse a directory tree.
* D. NIO.2 includes a method to delete an entire directory tree.
* E. NIO.2 includes methods that are aware of symbolic links.
* F. NIO.2 supports sending emails.

Options A, C, and E are all properties of NIO.2 and are good reasons to use it over the java.io.File class.
Option B is incorrect, as both java.io.File and NIO.2 include a method to list the contents of a directory.
Option D is also incorrect as both APIs can delete only empty directories, not a directory tree.
Finally, option F is incorrect, as sending email messages is not a feature of either API.

### Which of the following correctly create Path instances? (Choose all that apply.)

* A. new Path("jaguar.txt")
* B. FileSystems.getDefault() .getPath("puma.txt")
* C. Path.get("cats","lynx.txt")
* D. new java.io.File("tiger.txt").toPath()
* E. new FileSystem().getPath("lion")
* F. Paths.getPath("ocelot.txt")
* G. Path.of(Path.of(".").toUri())

Options A and E are incorrect because Path and FileSystem, respectively, are abstract types that should be instantiated using a factory method.
Option C is incorrect because the static method in the Path interface is of(), not get().
Option F is incorrect because the static method in the Paths class is get(), not getPath().
Options B and D are correct ways to obtain a Path instance. Option G is also correct, as there is an overloaded static method in Path that takes a URI instead of a String.

### Which of the following throw an exception when an Optional is empty? (Choose all that apply.)
* A. opt.orElse("");
* B. opt.orElseGet(() -> "");
* C. opt.orElseThrow();
* D. opt.orElseThrow(() -> throw new Exception());
* E. opt.orElseThrow(RuntimeException::new);
* F. opt.get();
* G. opt.get("");

Options A and B compile and return an empty string without throwing an exception, using a String and Supplier parameter, respectively.
Option G does not compile as the get() method does not take a parameter. Options C and F throw a NoSuchElementException.
Option E throws a RuntimeException. Option D looks correct but will compile only if the throw is removed.
Remember, the orElseThrow() should get a lambda expression or method reference that returns an exception, not one that throws an exception.

### Which of the following correctly create NIO.2 Path instances? (Choose all that apply.)
* A. Paths.get("rainforest").resolve(Paths.get("trees"))
* B. new Path("aquarium")
* C. Paths.get("rainforest").resolve("trees")
* D. new java.io.File("/zoo").toURI().toPath()
* E. Path.get("birdhouse")
* F. FileSystems.getDefault().getPath("ocean")

Options A and C are both correct, as there are two resolve() methods: one that takes a Path and one that takes a String.
Option B is incorrect, as Path is an abstract type and cannot be instantiated directly.
Option D is also incorrect. While java.io.File() does have a toUri() method, toPath() is not defined in the URI class.
Instead, Path.of(URI) should be used. Option E is incorrect, as the correct static method in the Path interface is of(), not get().
Finally, option F is correct and is the “long way” of creating a Path using the default file system.

### Assuming / is the root directory within the file system, which of the following are true statements? (Choose all that apply.)
* A. /home/parrot is an absolute path.
* B. /home/parrot is a directory.
*  C. /home/parrot is a relative path.
*  D. new File("/home") will throw an exception if /home does not exist.
*  E. new File("/home").delete() throws an exception if /home does not exist.

Paths that begin with the root directory are absolute paths, so option A is correct, and option C is incorrect.
Option B is incorrect because the path could be a file or directory within the file system.
There is no rule that files have to end with a file extension.
Option D is incorrect, as it is possible to create a File reference to files and directories that do not exist.
Option E is also incorrect. The delete() method returns false if the file or directory cannot be deleted.

### Which statements about the Files.walk() method are correct? (Choose all that apply.)
*  A. It traverses a directory tree.
*  B. It traverses exactly one directory.
*  C. It searches in a breadth-first manner.
*  D. It searches in a depth-first manner.
*  E. It follows symbolic links by default.
*  F. It does not have a depth limit.
*  G. It will throw an exception if a cycle is encountered.

The Files.list() method traverses a single directory, while Files.walk() traverses a directory tree.
For this reason, option A is correct, and option B is incorrect.
All NIO.2 search methods are depth-first, making option C incorrect and option D correct.
Option E is incorrect as Files.walk()follows symbolic links only if the FOLLOW_LINKS option is provided.
Option F is incorrect. If a depth limit is not provided, then a default one is used.
Finally, option G is correct. If FOLLOW_LINKS is provided and a cycle is encountered,
then an exception will be thrown, as Files.walk() maintains a list of all of the paths it has visited.

### Which of the following NIO.2 Files methods declare a checked exception? (Choose all that apply.)
*  A. exists(Path)
*  B. isDirectory(Path)
*  C. isRegularFile(Path)
*  D. isSameFile(Path,Path)
*  E. isSymbolicLink(Path)
*  F. size(Path)
*  G. readAttributes(Path,Class)

The isSameFile() method will throw an IOException if one of the Path values does not exist and the Path values are not equivalent in terms of equals().
The size() and readAttrributes() methods will also throw an IOException if they reference paths that do not exist.
The rest of the methods return false without throwing an exception if the path does not exist

### When reading file information, what is an advantage of using an NIO.2 attribute interface rather than reading the values individually using Files methods? (Choose two.)
* A. Costs fewer round-trips to the file system
* B. Guarantees performance improvement
* C. Has support for symbolic links
* D. Reduces memory leaks
* E. Supports file-system dependent attributes
* F. Reduces resource leaks

An attribute view has the advantage of reading all of the file information on a single trip,
rather than multiple trips to the file system making option A correct.
Option B is incorrect because nothing guarantees it will perform faster,
especially if the Files method is only being used to read a single attribute.
Option C is also incorrect because both sets of methods have built-in support for symbolic links.
Options D and F are incorrect because memory and resource leaks are not related to reading file attribute views.
Finally, option E is correct, as NIO.2 supports file-system dependent attribute view classes.




