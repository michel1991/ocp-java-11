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

### What constructors are capable of being called on a custom exception class that directly extends theException class?
* A. One that takes a single Exception
* B. One that takes a single String
* C. Both of these
* D. Neither of these

Custom exception classes may simply use the default constructor.
It is also common to override the constructors that take a
singleException or a single String, making option C correct.

##### Which of the following statements about java.lang.Error are most accurate? (Choose two.)
* A. An Error should be thrown if a file system resource becomes temporarily unavailable.
* B. An application should never catch an Error.
* C. Error is a subclass of Exception, making it a checked exception.
* D. It is possible to catch and handle an Error thrown in an application.
* E. An Error should be thrown if a user enters invalid input.
* F. Error is a subclass of RuntimeException, making it an unchecked exception.

An Error indicates an unrecoverable problem.
Options A and E are incorrect because the application could possibly recover.
While it is possible to catch an Error,
it is strongly recommended that an application never do so,
making options B and D correct. Finally, options C and F
are incorrect because Error extends from Throwable,
not Exception or RuntimeException, although it is an unchecked exception.

#### Select a goodstrategy for handling input validation failures?
* A. Use the assert statement.
* B. Throw an Error.
* C. Log an error but allow the user to continue.
* D. Throw an Exception.
* E. Shutdown the computer.
* F. None of the above.

A good solution when input validation fails is to stop processing
a request and throw an Exception to the calling method to deal with the problem,
making option D correct.
Options A and B are incorrect because throwing Error should be avoided
for situations where the application can recover.
Also, assertions are often disabled at runtime.
Option C is incorrectas the user should not be allowed to
continue if they have provided invalid input.
Finally, option E is incorrect for obvious reasons.

##### Which of the following diagrams of java.lang classes shows the inheritance model properly?
[image](images/inheritance_exceptions.jpg)

Option D is the correct model. The class RuntimeException extends Exception,
and both Exception and Error extend Throwable. Finally, like all Java classes,
they all inherit from Object. Notice that Error does not extend Exception,
even though we often refer to these generally as exceptions

##### Which of the following types are not recommended to catch in your application? (Choose two.)
* A. Exception
* B. CheckedException
* C. Throwable
* D. RuntimeException
* E. UncheckedException
* F. Error

While Exception and RuntimeException are commonly caught in Java applications,
it is not recommended that Error and Throwable (which includes Error) be caught.
An Error often indicates a failure of the JVM, which cannot be recovered from.
For these reasons, options C and F are correct, and options A and D are incorrect.
Options B and E are class names that are not part of the standard Java API

#### Given the following class diagram, which two classes
#### are missing in the hierarchy at positions 1 and 2?
[image](images/complete_exceptions.jpg)
* A. IOException at position 1, Exceptionat position 2
* B. Exception at position 1, RuntimeExceptionat position 2
* C. IllegalArgumentException at position 1, RuntimeExceptionat position 2
* D. IllegalStateException at position 1, RuntimeExceptionat position 2
* E. Exception at position 1, FileNotFoundExceptionat position 2
* F. None of the above

The UnsupportedOperationException class is
an unchecked exception that is a direct child of RuntimeException.
For this reason, we can eliminate any answer that does not inherit
from RuntimeException including options A and E. Options C and D are close,
but UnsupportedOperationException is a direct subclass of RuntimeException.
Option B is incorrect because RuntimeException is a subclass, not a superclass,
of Exception. The correct diagram would be to reverse option
B and put RuntimeException at position 1, and Exception at position 2.
Since this is not available, option F is correct.




