# Which of the following are not java.io classes? (Choose all that apply.)
* A. BufferedReader
* B. BufferedWriter
* C. FileReader
* D. FileWriter
* E. PrintReader
* F. PrintWriter

PrintStream and PrintWriter are the only I/O classes that you need to know that don’t have a complementary InputStream or Reader class, so option E is correct.

### What modifiers must be used with the serialPersistentFields field in a class? (Choose all that apply.)
* A. final
* B. private
* C. protected
* D. public
* E. transient
* F. static

The serialPersistentFields field is used to specify which fields should be used in serialization.
It must be declared private static final, or it will be ignored. Therefore, options A, B, and F are correct.

### Fill in the blank: A class that implements _________________ may be in a try-with-resources statement. (Choose all that apply.)
* A. AutoCloseable
* B. Resource
* C. Exception
* D. AutomaticResource
* E. Closeable
* F. RuntimeException
* G. Serializable

Resources must inherit AutoCloseable to be used in a try-with-resources block. Since Closeable, which is used for I/O classes, extends AutoCloseable, both may be used.

### Suppose that you need to write data that consists of int, double, boolean, and String values to a file that maintains the data types of the original data. You also want the data to be performant on large files. Which three java.io stream classes can be chained together to best achieve this result? (Choose three.)
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
The data should be written to the file directly using the FileOutputStream class, buffered with the BufferedOutputStream class,
and automatically serialized with the ObjectOutputStream class, so options B, C, and D are correct.
PrintStream is an OutputStream, so it could be used to format the data.
Unfortunately, since everything is converted to a String, the underlying data type information would be lost.
For this reason, option G is incorrect.

### Which of the following are true statements about working with instances of the OutputStream class? (Choose all that apply.)
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

### What are some reasons to use a character stream, such as Reader/Writer, over a byte stream, such as InputStream/OutputStream? (Choose all that apply.)
* A. More convenient code syntax when working with String data
* B. Improved performance
* C. Automatic character encoding
* D. Built-in serialization and deserialization
* E. Character streams are high-level streams
* F. Multithreading support

Character stream classes often include built-in convenience methods for working with String data, so option A is correct.
They also handle character encoding automatically, so option C is also correct.
The rest of the statements are irrelevant or incorrect and are not properties of all character streams.

### Which of the following are true statements about serialization in Java? (Choose all that apply.)
* A. Deserialization involves converting data into Java objects.
* B. Serialization involves converting data into Java objects.
* C. All nonthread classes should be marked Serializable.
* D. The Serializable interface requires implementing serialize() and deserialize() methods.
* E. Serializable is a functional interface.
* F. The readObject() method of ObjectInputStream may throw a ClassNotFoundException even if the return object is not cast to a specific type.

In Java, serialization is the process of turning an object to a stream, while deserialization is the process of turning that stream back into an object.
For this reason, option A is correct, and option B is incorrect.
Option C is incorrect, because many nonthread classes are not marked Serializable for various reasons.
The Serializable interface is a marker interface that does not contain any abstract methods, making options D and E incorrect.
Finally, option F is correct, because readObject() declares the ClassNotFoundException even if the class is not cast to a specific type.

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
making option B correct and option C incorrect. It can refer to either a file or a directory within the file system,
as directories can have extensions. For this reason, options D and E are correct.
Finally, if the path does not exist, an exception is not thrown, so option A is incorrect.
Note that calling m.exists() will tell you whether or not the paths exist in the file system.