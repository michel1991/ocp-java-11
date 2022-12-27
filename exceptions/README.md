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
