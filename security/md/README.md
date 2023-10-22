### Which statements are correct? (Choose all that apply.)
* A. A blacklist lists what is allowed.
* B. A whitelist lists what is allowed.
* C. Obfuscation does not prevent decompilation.
* D. Obfuscation prevents decompilation.
* E. None of the above.

A whitelist states what is allowed rather than what is banned.
An obsfucator makes it harder to read the decompiled code but does not prevent it.
Therefore, options B and C are correct.

### Which of the following are true about encapsulation? (Choose all that apply.)
* A. It allows getters.
* B. It allows setters.
* C. It requires specific naming conventions.
* D. It uses package-private instance variables.
* E. It uses private instance variables.

Encapsulation allows using methods to get and set instance variables
so other classes are not directly using them, making options A and B correct.
Instance variables must be private for this to work, making option
E correct and option D incorrect.
While there are common naming conventions, they are not required, making option C incorrect.

###### Fill in the blanks: The Console readPassword()
###### method returns a ______________ because it improves ________________.
* A. byte[], performance
* B. byte[], security
* C. char[], performance
* D. char[], security
* E. String, performance
* F. String, security

The first step is to recognize that readPassword() is a method on Console. It returns a char[].
This improves security because a String is more easily available in a memory dump than a char[].

###### Which locations require you to be careful when working
##### with sensitive data to ensure it doesn’t leak? (Choose all that apply.)
* A. Comments
* B. Exception stack traces
* C. Log files
* D. System.out
* E. Variable names
* F. None of the above

Any information the user can see requires care. Options B, C,
and D are correct for this reason.
Comments and variable names are part of the program,
not the data it handles, making options A and E incorrect.


### What should your code do when input validation fails? (Choose all that apply.)
* A. Call System.exit() immediately.
* B. Continue execution.
* C. Log a message.
* D. Throw an exception.
* E. None of the above

The application should log a message or throw an exception,
making options C and D correct.
It should not immediately terminate the program with System.exit()
as that does not execute gracefully, making option A incorrect.
It also should not ignore the issue, making option B incorrect.

### Which of the following expressions compile without error? (Choose all that apply.)
* A. int monday = 3 + 2.0;
* B. double tuesday = 5_6L;
* C. boolean wednesday = 1 > 2 ? !true;
* D. short thursday = (short)Integer.MAX_VALUE;
* E. long friday = 8.0L;
* F. var saturday = 2_.0;
* G. None of the above

Option A does not compile, as the expression 3 + 2.0
is evaluated as a double, and a double requires an explicit cast to be assigned to an int.
Option B compiles without issue, as a long value can be implicitly cast to a double.
Option C does not compile because the ternary operator (? :)
is missing a colon (:), followed by a second expression.
Option D is correct.
Even though the int value is larger than a short,
it is implicitly cast to a short, which means the value will wrap around to fit in a short.
Option E is incorrect, as you cannot use a decimal (.) with the long (L) postfix.
Finally, option F is incorrect, as an underscore
cannot be used next to a decimal point. For more information, see Chapter 3.


### Which are true about securing confidential information? (Choose all that apply.)
* A. It is OK to access it in your program.
* B. It is OK to have it in an exception message.
* C. It is OK to put it in a char[].
* D. It is OK to share it with other users.
* E. None of the above

Many programs use confidential information securely, making option A correct.
After all, you wouldn’t be able to bank online if programs couldn’t work with confidential information.
It is also OK to put it in certain data structures.
A built-in Java API puts a password in a char[], making option C correct.
Exposing the information unintentionally is not OK, making option B incorrect.
Sharing confidential information with others is definitely not OK, making option D incorrect.


### Which statements about securing confidential information are correct? (Choose three.)
* A. When writing to System.out, you should not include sensitive information.
* B. When reading sensitive data from a Console, you should use readLine().
* C. When throwing an exception, it is acceptable to include sensitive information in the message.
* D. A String is not a good object type for sensitive data.
* E. A Java policy should only grant the permission lock to prevent a user from modifying the file.
* F. A Java policy should only grant the permission read to prevent a user from modifying the file.

Sensitive information should not be written to System.out, System.err, or a stack trace.
For this reason, option A is correct, and option C is incorrect.
It is preferable to use char[] instead of String for sensitive data so that
it does not enter the String pool and become available as part of a memory dump.
For this reason, option D is correct, and option B is incorrect.
Note that Console does have a readPassword() method that returns char[].
Finally, the correct Java policy permission to prevent write access is to only grant read access,
making option F correct and option E incorrect.


