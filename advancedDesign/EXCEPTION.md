# Which of the following statements are true? (Choose all that apply.)
A. You can declare a method with Exception as the return type.
B. You can declare a method with RuntimeException as the return type.
C. You can declare any subclass of Error in the throws part of a method declaration.
D. You can declare any subclass of Exception in the throws part of a method declaration.
E. You can declare any subclass of Object in the throws part of a method declaration.
F. You can declare any subclass of RuntimeException in the throws part of a method declaration.
Any Java type, including Exception and RuntimeException, can be declared as the return type.
However, this will simply return the object rather than throw an exception.
For this reason, options A and B are correct.
Classes listed in the throws part of a method declaration must extend java.lang.Throwable.
This includes Error, Exception, and RuntimeException, making options C, D, and F correct.
Arbitrary classes such as String can’t be declared in a throws clause, making option E incorrect.

# Which of the following are correct statements about exception handling in Java? (Choose all that apply.)
A. Unchecked exceptions are allowed, but not required, to be handled or declared.
B. Error exceptions are required to be handled or declared.
C. It is appropriate to catch Throwable in your program.
D. The handle or declare rule means that a catch block should be put around all places a checked exception can be thrown.
E. RuntimeException is the only unchecked exception in Java.
F. RuntimeException inherits Exception and Throwable.
Option A is correct, as unchecked exceptions can be handled or declared, but are not required to be.
Options B and E are incorrect because Error is an unchecked exception, which is not required to be handled or declared.
Option C is incorrect, as catching Throwable includes catching instances of Error, which should not be caught in most cases.
Option D is incorrect, as exceptions can also be declared and thrown to the caller.
Finally, option F is correct, as it describes the inheritance of RuntimeException.

# Which of the following are true statements about exception handling in Java? (Choose all that apply.)
A. A traditional try statement without a catch block requires a finally block.
B. A traditional try statement without a finally block requires a catch block.
C. A traditional try statement with only one statement can omit the {}.
D. A try-with-resources statement without a catch block requires a finally block.
E. A try-with-resources statement without a finally block requires a catch block.
F. A try-with-resources statement with only one statement can omit the {}.
A try-with-resources statement does not require a catch or finally block.
A traditional try statement requires at least one of the two. Neither statement can be written without a body encased in braces, {}.

# Which of the following statements are true? (Choose all that apply.)
A. Exceptions of type RuntimeException are unchecked.
B. Exceptions of type RuntimeException are checked.
C. You can declare unchecked exceptions.
D. You can declare checked exceptions.
E. You can handle only Exception subclasses.
F. All exceptions are subclasses of Throwable.
Runtime exceptions are unchecked, making option A correct and option B incorrect.
Both runtime and checked exceptions can be declared, although only checked exceptions must be handled or declared, making options C and D correct.
Legally, you can handle java.lang.Error subclasses, which are not subclasses of Exception, but it’s not a good idea, so option E is incorrect.
Finally, it is true that all exceptions are subclasses of Throwable, making option F correct.
