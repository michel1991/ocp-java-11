### Which NIO.2 method is most similar to the legacy java.io.File method listFiles?
* A. Path.listFiles()
* B. Files.dir()
* C. Files.ls()
* D. Files.files()
* E. Files.list()
* F. Files.walk()

The java.io.File method listFiles() retrieves the members of
the current directory without traversing any subdirectories.
Option E is correct, as Files.list() returns a Stream<Path> of a single directory.
Files.walk() is close, but it iterates over the entire directory tree, not just a single directory.
The rest of the methods do not exist.

### Which statements about the Files methods lines() and readAllLines() are correct? (Choose two.)
* A. They have different return types.
* B. The readAllLines() method is always faster.
* C. The lines() may require more memory.
* D. They have the same return type.
* E. The lines() method is always faster.
* F. The readAllLines() method may require more memory.

The lines() method returns Stream˂String˃, while the readAllLines() method returns List˂String˃,
making option A correct and option D incorrect.
Neither method is guaranteed to be faster or slower than the other,
making options B and E incorrect.
The lines() method lazily reads the file as the stream is processed,
while the readAllLines() method reads the entire file into memory at once.
For this reason, the readAllLines() method may require more memory to hold a large file,
making option F correct and option C incorrect.


