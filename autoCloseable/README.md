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
