### Which of the following are valid comments in Java? (Choose three.)
* A. /****** TODO */
* B. # Fix this bug later
* C. ' Error closing pod bay doors
* D. / Invalid record /
* E. /* Page not found */
* F. // IGNORE ME

Java supports three types of comments: single-line (//),
multiline (/* */), and Javadoc (/** **/),
making options A, E, and F correct. The other options may be comments in other languages, but not in Java.

### Which of the following are valid class declarations? (Choose three.)
*  A. class _ {}
*  B. class river {}
*  C. class Str3@m {}
*  D. class Pond2$ {}
*  E. class _var_ {}
*  F. class 5Ocean {}

Class names follow the same requirements as other identifiers.
Underscores (_) and dollar signs ($) are allowed,
but no other symbols are allowed, making option C incorrect.
Since Java 9, a single underscore is not permitted as an identifier,
making option A incorrect. Numbers are allowed, but not as the first character.
Therefore, option F is incorrect.
The rest of the options are valid class names, making the answer options B, D, and E correct.
Note that class names begin with an uppercase letter by convention,
but this is not a requirement.

#### How many of the following lines contain a compiler error?

```java
    double num1 = 2.718;
    double num2 = 2._718;
    double num3 = 2.7_1_8;
    double num4 = _2.718;
```


* A. 0
* B. 1
* C. 2
* D. 3
* E. 4

Underscores are allowed between any two digits in a numeric literal,
causing num4 to fail to compile. Additionally, underscores are not allowed adjacent to a decimal point,
causing a compiler error in num2. Since two lines have errors, option C is the correct answer.