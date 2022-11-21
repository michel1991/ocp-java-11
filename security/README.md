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