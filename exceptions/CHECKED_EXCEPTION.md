##### Which of the following are common reasons to add a checked exception to a method signature? (Choose three.)
* A. To alert developers that the state of the JVM has been corrupted
* B. To force a caller to handle or declare potential problems
* C. To ensure that exceptions never cause the application to terminate
* D. To notify the caller of potential types of problems
* E. To give the caller a chance to recover from a problem
* F. To annoy other developers

Checked exceptions are commonly used to notify or force a caller to deal with an expected type of problem,
such as the inability to write a file to the file system,
and give them the opportunity to recover without terminating the program.
For these reasons, options B, D, and E are correct.
Option A is incorrect as a corrupted JVM is likely an Error that cannot be recovered from.
Option C is also incorrect, as some problems should result in the application terminating.
Finally, option F is incorrect and is ideally never the motivation
for adding a checked exception to a method signature!