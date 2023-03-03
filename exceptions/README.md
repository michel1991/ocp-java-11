### Which statements are true for a traditional try statement (not a try-with-resources statement)? (Choose all that apply.)
* A. If a try statement has a catch clause, it is required to have a finally clause.
* B. If a try statement does not have a catch clause, it is required to have a finally clause.
* C. If a try statement has a finally clause, it is required to have exactly one catch clause.
* D. If a try statement has a finally clause, it is required to have at least one catch clause.
* E. A try statement can exist without a catch and a finally clause.
* F. A try statement can have both a catch and a finally clause.

A traditional try statement must have a finally clause and/or one or more catch clauses.

### Which of the following statements about error handling in Java are correct? (Choose all that apply.)
* A. Checked exceptions are intended to be thrown by the JVM (and not the programmer).
* B. Checked exceptions are required to be handled or declared.
* C. Errors are intended to be thrown by the JVM (and not the programmer).
* D. Errors are required to be caught or declared.
* E. Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
* F. Runtime exceptions are required to be handled or declared.

Only checked exceptions are required to be handled or declared, making option B correct and option F incorrect.
An Error is intended to be thrown by the JVM and never caught by the programmer, making option C correct and options A, D, and E incorrect.
While a programmer could throw or catch an Error, this would be a horrible practice. For more information, see Chapter 10.

### Which of the following is true when creating your own exception class?
*  A. One or more constructors must be coded.
*  B. Only custom checked exception classes may be created.
*  C. Only custom unchecked exception classes may be created.
*  D. Custom Error classes may be created.
*  E. The toString() method must be coded.
*  F. None of the above

You can create custom checked, unchecked exceptions, and even errors.
The default constructor is used if one is not supplied. There is no requirement to implement any specific methods.

# Which of the following exceptions need to be handled or declared in the method in which they are thrown? (Choose all that apply.)
* A. FileNotFoundException
* B. MissingResourceException
* C. NumberFormatException
* D. ParseException
* E. AssertionError
* F. SQLException
* G. None of the above

Checked exceptions include any class that inherits Exception, but not RuntimeException, while unchecked exceptions include any class
that inherits RuntimeException or (less commonly) Error.
Both ParseException and SQLException extend Exception, while FileNotFoundException extends IOException, which in turn extends Exception.

### Which scenario is the best use of an exception?
*  A. An element is not found when searching a list.
*  B. An unexpected parameter is passed into a method.
*  C. The computer caught fire.
*  D. You want to loop through a list.
*  E. You don’t know how to code a method.

An IllegalArgumentException is used when an unexpected parameter is passed into a method.
Option A is incorrect because returning null or -1 is a common return value for searching for data.
Option D is incorrect because a for loop is typically used for this scenario.
Option E is incorrect because you should find out how to code the method and not leave
it for the unsuspecting programmer who calls your method. Option C is incorrect because you should run!

### Which of the following statements are true? (Choose all that apply.)
* A. You can declare a method with Exception as the return type.
* B. You can declare a method with RuntimeException as the return type.
* C. You can declare any subclass of Error in the throws part of a method declaration.
* D. You can declare any subclass of Exception in the throws part of a method declaration.
* E. You can declare any subclass of Object in the throws part of a method declaration.
* F. You can declare any subclass of RuntimeException in the throws part of a method declaration.

Any Java type, including Exception and RuntimeException, can be declared as the return type.
However, this will simply return the object rather than throw an exception.
For this reason, options A and B are correct.
Classes listed in the throws part of a method declaration must extend java.lang.Throwable.
This includes Error, Exception, and RuntimeException, making options C, D, and F correct.
Arbitrary classes such as String can’t be declared in a throws clause, making option E incorrect.

### Which of the following are correct statements about exception handling in Java? (Choose all that apply.)
* A. Unchecked exceptions are allowed, but not required, to be handled or declared.
* B. Error exceptions are required to be handled or declared.
* C. It is appropriate to catch Throwable in your program.
* D. The handle or declare rule means that a catch block should be put around all places a checked exception can be thrown.
* E. RuntimeException is the only unchecked exception in Java.
* F. RuntimeException inherits Exception and Throwable.

Option A is correct, as unchecked exceptions can be handled or declared, but are not required to be.
Options B and E are incorrect because Error is an unchecked exception, which is not required to be handled or declared.
Option C is incorrect, as catching Throwable includes catching instances of Error, which should not be caught in most cases.
Option D is incorrect, as exceptions can also be declared and thrown to the caller.
Finally, option F is correct, as it describes the inheritance of RuntimeException.

### Which of the following are true statements about exception handling in Java? (Choose all that apply.)
* A. A traditional try statement without a catch block requires a finally block.
* B. A traditional try statement without a finally block requires a catch block.
* C. A traditional try statement with only one statement can omit the {}.
* D. A try-with-resources statement without a catch block requires a finally block.
* E. A try-with-resources statement without a finally block requires a catch block.
* F. A try-with-resources statement with only one statement can omit the {}.

A try-with-resources statement does not require a catch or finally block.
A traditional try statement requires at least one of the two. Neither statement can be written without a body encased in braces, {}.
A, B are correct

### Which of the following statements are true? (Choose all that apply.)
* A. Exceptions of type RuntimeException are unchecked.
* B. Exceptions of type RuntimeException are checked.
* C. You can declare unchecked exceptions.
* D. You can declare checked exceptions.
* E. You can handle only Exception subclasses.
* F. All exceptions are subclasses of Throwable.

Runtime exceptions are unchecked, making option A correct and option B incorrect.
Both runtime and checked exceptions can be declared, although only checked exceptions must be handled or declared, making options C and D correct.
Legally, you can handle java.lang.Error subclasses, which are not subclasses of Exception, but it’s not a good idea, so option E is incorrect.
Finally, it is true that all exceptions are subclasses of Throwable, making option F correct.

###  Which of the following statements about finally blocks are true? (Choose all that apply.)
* A. A finally block is never required with a regular try statement.
* B. A finally block is required when there are no catch blocks in a regular try statement.
* C. A finally block is required when the program code doesn’t terminate on its own.
* D. A finally block is never required with a try-with-resources statement.
* E. A finally block is required when there are no catch blocks in a try-with-resources statement.
* F. A finally block is required in order to make sure all resources are closed in a try-with-resources statement.
* G. A finally block is executed before the resources declared in a try-with-resources statement are closed.
A regular try statement is required to have a catch clause and/or finally clause.

If a regular try statement does not have any catch clauses, then it must have a finally block, making option B correct and option A incorrect.
Alternatively, a try-with-resources block is not required to have a catch or finally block, making option D correct and option E incorrect.
Option C is incorrect, as there is no requirement a program must terminate. Option F is also incorrect. A try-with-resources statement automatically closes all declared resources.
While additional resources can be created or declared in a try-with-resources statement, none are required to be closed by a finally block.
Option G is also incorrect.
The implicit or hidden finally block created by the JVM when a try-with-resources statement is declared is executed first, followed by any programmer-defined finally block.

### Which of the following statements about finally blocks are true? (Choose two.)
* A. Every line of the finally block is guaranteed to be executed.
* B. The finally block is executed only if the related catch block is also executed.
* C. The finally statement requires curly braces, {}.
* D. A finally block cannot throw an exception.
* E. The first line of a finally block is guaranteed to be executed.
* F. A finally block can only throw unchecked exceptions.

A finally block requires curly braces, making option C correct.
A finally block can throw an exception in which case not every line of the finally block will be executed.
For this reason, option E is correct, and options A and D are incorrect.
Option B is incorrect because a finally block is called regardless of whether the related catch block is executed.
A finally block can throw both checked and unchecked exceptions, making option F incorrect.
If the exception is checked, then it must be handled or declared in the method in which the finally block is used.

