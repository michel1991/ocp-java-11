# What is this code an example of?

```java
public void validate(String amount) {
    for (var ch : amount.toCharArray())
    if (ch < '0' || ch > '9')
    throw new IllegalArgumentException("invalid");
    }
```
* A. blacklist
* B. Graylist
* C. Orangelist
* D. Whitelist

The validation code checks that each character is between 0 and 9.
Since it is comparing to allowed values, this is an example of a whitelist, and option D is correct.
If it were the opposite, it would be a blacklist. There is no such thing as a gray or orange lis

# Which of these attacks is blocked by a program that validates a filename?
* A. Denial of service
* B. Inclusion
* C.Injection
* D.None of the above
The main purpose of validating a filename is to ensure it has only valid characters and is not a command injection attack. Therefore, option C is correct.

# Which statements are correct? (Choose all that apply.)
A. A blacklist lists what is allowed.
B. A whitelist lists what is allowed.
C. Obfuscation does not prevent decompilation.
D. Obfuscation prevents decompilation.
E. None of the above.

A whitelist states what is allowed rather than what is banned.
An obsfucator makes it harder to read the decompiled code but does not prevent it.
Therefore, options B and C are correct.

# Which of the following are true about encapsulation? (Choose all that apply.)
A. It allows getters.
B. It allows setters.
C. It requires specific naming conventions.
D. It uses package-private instance variables.
E. It uses private instance variables.

Encapsulation allows using methods to get and set instance variables so other classes are not directly using them, making options A and B correct.
Instance variables must be private for this to work, making option E correct and option D incorrect.
While there are common naming conventions, they are not required, making option C incorrect.

# Fill in the blanks: The Console readPassword() method returns a ______________ because it improves ________________.
A. byte[], performance
B. byte[], security
C. char[], performance
D. char[], security
E. String, performance
F. String, security

The first step is to recognize that readPassword() is a method on Console. It returns a char[].
This improves security because a String is more easily available in a memory dump than a char[].