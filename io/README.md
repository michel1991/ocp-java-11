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