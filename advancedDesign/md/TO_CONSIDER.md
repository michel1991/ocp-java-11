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
causing num4 to fail to compile. Additionally,
underscores are not allowed adjacent to a decimal point,
causing a compiler error in num2.
Since two lines have errors, option C is the correct answer.

#### Which of the following is a valid method name in Java? (Choose two.)
* A. Go_$Outside$2()
* B. have-Fun()
* C. new()
* D. 9enjoyTheWeather()
* E. $sprint()
* F. walk#()

Options A and E are correct since method names may include
the underscore (_) character as well as the dollar ($) symbol.
Note that there is no rule that requires
a method start with a lowercase character;
it is just a practice adopted by the community.
Options B and F are incorrect because the hyphen (-) and pound (#) characters
may not be part of a method name. Option C is incorrect
since new is a reserved word in Java.
Finally, option D is incorrect.
A method name must start with a letter, the dollar ($) symbol, or an underscore (_) character.