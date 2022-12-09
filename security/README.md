### Which of these attacks is blocked by a program that validates a filename?
* A. Denial of service
* B. Inclusion
* C.Injection
* D.None of the above
The main purpose of validating a filename is to ensure it has only valid characters and is not a command injection attack. Therefore, option C is correct.

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

Encapsulation allows using methods to get and set instance variables so other classes are not directly using them, making options A and B correct.
Instance variables must be private for this to work, making option E correct and option D incorrect.
While there are common naming conventions, they are not required, making option C incorrect.

### Fill in the blanks: The Console readPassword() method returns a ______________ because it improves ________________.
* A. byte[], performance
* B. byte[], security
* C. char[], performance
* D. char[], security
* E. String, performance
* F. String, security

The first step is to recognize that readPassword() is a method on Console. It returns a char[].
This improves security because a String is more easily available in a memory dump than a char[].

### Which locations require you to be careful when working with sensitive data to ensure it doesn’t leak? (Choose all that apply.)
* A. Comments
* B. Exception stack traces
* C. Log files
* D. System.out
* E. Variable names
* F. None of the above

Any information the user can see requires care. Options B, C, and D are correct for this reason.
Comments and variable names are part of the program, not the data it handles, making options A and E incorrect.

### You go to the library and want to read a book. Which is true?
``` java
    grant {
        permission java.io.FilePermission
        "/usr/local/library/book.txt",
        "read,write";
    };
```
* A. The policy is correct.
* B. The policy is incorrect because file permissions cannot be granted this way.
* C. The policy is incorrect because read should not be included.
* D. The policy is incorrect because the permissions should be separated with semicolons.
* E. The policy is incorrect because write should not be included.

The policy compiles and uses correct syntax. However, it gives permissions that are too broad.
The user needs to be able to read a book, so write permissions should not be granted.

### Which of the following are considered inclusion attacks? (Choose all that apply.)
* A. Billion laughs attack
* B. Command injection
* C. CSRF
* D. SQL injection
* E. XSS
* F. Zip bomb

An inclusion attack needs to include something. Options A and F are correct because they are used with XML and ZIP file respectively.
Options B and D are incorrect because injection is not an inclusion attack. Options C and E are not inclusion attacks either.
In fact, you might not have heard of them. Both are attacks used against web applications.
Don’t worry if you see something on the exam that you haven’t heard of; it isn’t a correct answer.

### The following code prints false. What is true about the clone() method?
``` java
    Wombats original = new Wombats();
    original.names = new ArrayList<>();
    Wombats cloned = (Wombats) original.clone();
    System.out.println(original.getNames() == cloned.getNames());
```
* A. It creates a deep copy.
* B. It creates a narrow copy.
* C. It creates a shallow copy.
* D. It creates a wide copy.

A shallow copy does not create copies of the nested objects, making option C incorrect.
Options B and D are incorrect because narrow and wide copies are not terms.
Option A is the answer because a deep copy does copy the nested objects.
In this case, a new List is created in cloned, containing the same contents and making it a different object than the List in original.
