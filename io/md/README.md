# Which of the following are not java.io classes? (Choose all that apply.)
* A. BufferedReader
* B. BufferedWriter
* C. FileReader
* D. FileWriter
* E. PrintReader
* F. PrintWriter

PrintStream and PrintWriter are the only I/O classes that
you need to know that don’t have a complementary InputStream
or Reader class, so option E is correct.

##### Fill in the blank: A class that implements _________________ may be
##### in a try-with-resources statement. (Choose all that apply.)
* A. AutoCloseable
* B. Resource
* C. Exception
* D. AutomaticResource
* E. Closeable
* F. RuntimeException
* G. Serializable

Resources must inherit AutoCloseable to be used in a try-with-resources block.
Since Closeable, which is used for I/O classes, extends AutoCloseable, both may be used.

##### Suppose that you need to write data that consists of int, double, boolean,
##### and String values to a file that maintains the data types of the original data.
##### You also want the data to be performant on large files.
##### Which three java.io stream classes can be chained together to best achieve this result? (Choose three.)
* A. FileWriter
* B. FileOutputStream
* C. BufferedOutputStream
* D. ObjectOutputStream
* E. DirectoryOutputStream
* F. PrintWriter
* G. PrintStream

Since you need to write primitives and String values, the OutputStream classes are appropriate.
Therefore, you can eliminate options A and F since they use Writer classes.
Next, DirectoryOutputStream is not a java.io class, so option E is incorrect.
The data should be written to the file directly using the FileOutputStream class,
buffered with the BufferedOutputStream class,
and automatically serialized with the ObjectOutputStream class, so options B, C, and D are correct.
PrintStream is an OutputStream, so it could be used to format the data.
Unfortunately, since everything is converted to a String, the underlying data type information would be lost.
For this reason, option G is incorrect.

##### Which of the following are true statements about working
##### with instances of the OutputStream class? (Choose all that apply.)
* A. They must be buffered.
* B. They can be used to read input from the user.
* C. They can be used to write character data to a file.
* D. They can be written forward and backward.
* E. They should be closed after use.
* F. They must be periodically flushed.

An OutputStream may be buffered but is not required to be buffered, so option A is incorrect.
The OutputStream class is not used to read data from the user, so option B is incorrect.
While the Writer class is more convenient for writing character data,
the OutputStream class is capable of writing both byte and character data,
so option C is correct. Java writes OutputStream data in a single direction, so option D is incorrect.
All streams, including instances of OutputStream, should be closed after use, making option E correct.
Finally, an OutputStream may be periodically flushed, but it is not required, so option F is incorrect.

###### What are some reasons to use a character stream, such as Reader/Writer,
###### over a byte stream, such as InputStream/OutputStream? (Choose all that apply.)
* A. More convenient code syntax when working with String data
* B. Improved performance
* C. Automatic character encoding
* D. Built-in serialization and deserialization
* E. Character streams are high-level streams
* F. Multithreading support

Character stream classes often include built-in convenience
methods for working with String data, so option A is correct.
They also handle character encoding automatically, so option C is also correct.
The rest of the statements are irrelevant or incorrect and are not properties of all character streams.

### Fill in the blank with the proper method to serialize an object.
```java
    public Object ___________() throws ObjectStreamException {
        // return an object
    }
```
* A. readObject()
* B. readReplace()
* C. readResolve()
* D. writeObject()
* E. writeReplace()
* F. writeResolve()

Options B and F are incorrect because these method names are not defined.
Serializing is the act of persisting an object, ruling out options A and C.
Option D is incorrect because the writeObject() method returns void and serializes the current object.
Option E is the correct answer.

### Which statements about the following code snippet are correct? (Choose all that apply.)

```java
var m = new java.io.File("myfile.txt")
```

*  A. If myfile.txt does not exist within the file system, an exception will be thrown.
*  B. myfile.txt is a relative path.
*  C. myfile.txt is an absolute path.
*  D. myfile.txt may refer to a file.
*  E. myfile.txt may refer to a directory.
*  F. None of the above.

The path myfile.txt is a relative path since it does not contain any path separators,
making option B correct and option C incorrect. It can refer to either
a file or a directory within the file system,
as directories can have extensions. For this reason, options D and E are correct.
Finally, if the path does not exist, an exception is not thrown, so option A is incorrect.
Note that calling m.exists() will tell you whether or not the paths exist in the file system.


### Which statements about closing I/O streams are correct? (Choose all that apply.)
*  A. InputStream and Reader instances are the only I/O streams that should be closed after use.
*  B. OutputStream and Writer instances are the only I/O streams that should be closed after use.
*  C. InputStream/OutputStream and Reader/Writer all should be closed after use.
*  D. A traditional try statement can be used to close an I/O stream.
*  E. A try-with-resources can be used to close an I/O stream.
*  F. None of the above.

All I/O streams should be closed after use or a resource leak might ensue, making option C correct.
While a try-with-resources statement is the preferred way to close an I/O stream, it can be closed with
a traditional try statement that uses a finally block. For this reason, both options D and E are correct.

### What are some advantages of using Files.lines() over Files.readAllLines()? (Choose all that apply.)
* A. It is often faster.
* B. It can be run with little memory available.
* C. It can be chained with functional programming methods like filter() and map() directly.
* D. It does not modify the contents of the file.
* E. It ensures the file is not read-locked by the file system.
* F. There are no differences, because one method is a pointer to the other.

The methods are not the same, because Files.lines() returns a Stream<String> and Files.readAllLines()
returns a List<String>, so option F is incorrect.
Option A is incorrect, because performance is not often
the reason to prefer one to the other. Files.lines()
processes each line via lazy evaluation, while Files.readAllLines()
reads the entire file into memory all at once.
For this reason, Files.lines() works better on
large files with limited memory available, and option B is correct.
Although a List can be converted to a stream, this requires an extra step; therefore,
option C is correct since the resulting object can be chained directly to a stream.
Finally, options D and E are incorrect because they are true for both methods.



### Which of the following are true? (Choose all that apply.)
*  A. System.console() will throw an IOException if a Console is not available.
*  B. System.console() will return null if a Console is not available.
*  C. A new Console object is created every time System.console() is called.
*  D. Console can be used only for writing output, not reading input.
*  E. Console includes a format() method to write data to the console’s output stream.
*  F. Console includes a println() method to write data to the console’s output stream.

The JVM creates one instance of the Console object as a singleton, making option C incorrect.
If the console is unavailable, System.console() will return null, making option B correct.
The method cannot throw an IOException because it is not declared as a checked exception.
Therefore, option A is incorrect. Option D is incorrect,
as a Console can be used for both reading and writing data.
The Console class includes a format() method to write data to the output stream,
making option E correct. Since there is no println() method,
as writer() must be called first, option F is incorrect.

##### Which of the following are methods available
##### on instances of the java.io.File class? (Choose all that apply.)
*  A. mv()
*  B. createDirectory()
*  C. mkdirs()
*  D. move()
*  E. renameTo()
*  F. copy()
*  G. mkdir()

The command to move a file or directory using a File is renameTo(), not mv() or move(),
making options A and D incorrect, and option E correct. The commands to create a
directory using a File are mkdir() and mkdirs(),not createDirectory(),
making option B incorrect, and options C and G correct.
The mkdirs() differs from mkdir() by creating any missing directories along the path.
Finally, option F is incorrect as there is no command to copy a file in the File class.
You would need to use an I/O stream to copy the file along with its contents.


#### Given the following class inheritance diagram, which two classes can be placed in the blank boxes?
* A. BufferedOutputStream and PrintStream
* B. BufferedOutputStream and PrintOutputStream
* C. ByteArrayOutputStream and Stream
* D. FileOutputStream and OutputStream
* E. ObjectOutputStream and PrintOutputStream
* F. None of the above

[image](./images/doubleConsumerIntFunctionLongSupplierObjDoubleConsumer.png)
While you might not be familiar with FilterOutputStream,
the diagram shows that the two classes must inherit from OutputStream.
Options B, C, and E can be eliminated as choices since PrintOutputStream
and Stream are not the name of any java.io classes.
Option D can also be eliminated because OutputStream is already in the diagram,
and you cannot have a circular class dependency.
That leaves us with the correct answer, option A, with BufferedOutputStream
and PrintStream both extend FilterOutputStream.
Note that ByteArrayOutputStream and FileOutputStream referenced in Options C and D,
respectively, do not extend FilterOutputStream,
although knowing this fact was not required to solve the problem.