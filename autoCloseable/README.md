##### Which of the following are not true of using a try-with-resources statement? (Choose two.)
* A. It shortens the amount of code a developer must write.
* B. It is possible to close a resource before the end of the try block.
* C. Associated catch blocks are run before the declared resources have been closed.
* D. It is compatible with all classes that implement the Closeable interface.
* E. It is compatible with all classes that implement the AutoCloseable interface.
* F. It cannot be used with a finally block.

Option A is a true statement and one of the primary motivations for using a try-with-resources statement.
Option B is also true, although it is recommended you let the
try-with-resources statement automatically close the resource.
The catch blocks are run after the declared resources have been closed,
making option C the first answer. Options D and E are both true,
since Closeable extends AutoCloseable and the requirement
for try-with-resources is that they must be of type AutoCloseable.
A try-with-resources statement can be used with a finally block, making option F the other answer.

#### Which statements about try-with-resources are false? (Choose two.)
* A. If more than one resource is used, the resources are closed in the order they were created.
* B. Parentheses are used for the resource declaration section, even if more than one resource is used.
* C. If the try block and close() method both throw an exception, then the one thrown by the close() method is suppressed.
* D. A resource may be declared before it is used in a try-with-resources statement.
* E. Resources declarations are separated by commas.
* F. A catch block is not required.

When more than one resource is used in a try-with-resources statement,
they are closed in the reverse order in which they are declared,
making option A the first false statement.
In addition, resources are separated by semicolons, not commas,
making option E the other false statement. The rest of the statements are true.
Note that ability to declare resources before they are used
in a try-with-resources statement is new since Java 9.

###### Which statements about Closeable and AutoCloseable are true? (Choose two.)
* A. AutoCloseable extends Closeable.
* B. Closeable extends AutoCloseable.
* C. The close() method in a class that implements AutoCloseable cannot throw an IOException.
* D. The close() method in a class that implements Closeable cannot throw an Exception.
* E. There is no difference; one was added for backward compatibility.
* F. Both have a generic return type.

Closeable extends AutoCloseable, making option B correct and option A incorrect.
The close() method in AutoCloseable throws Exception, while the close()
method in Closeable throws IOException, making option E incorrect.
Since IOException is a subclass of Exception, both close() methods can throw an IOException,
making option C incorrect. On the other hand, Exception is not a subclass of IOException.
For this reason, the close() method in a class that implements
Closeable cannot throw an instance of the Exception class,
because it is an invalid override using a broader exception type,
making option D the correct answer. Finally, the return type for both is void, making option F incorrect.
