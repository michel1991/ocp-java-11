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