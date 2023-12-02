##### An automatic module name is generated if one is not supplied.
##### Which of the following JAR filename and generated
##### automatic module name pairs are correct? (Choose all that apply.)
* A. emily-1.0.0.jar and emily
* B. emily-1.0.0-SNAPSHOT.jar and emily
* C. emily_the_cat-1.0.0.jar and emily_the_cat
* D. emily_the_cat-1.0.0.jar and emily-the-cat
* E. emily.$.jar and emily
* F. emily.$.jar and emily.
* G. emily.$.jar and emily..

Any version information at the end of the JAR filename is removed, making options A and B correct.
Underscores (_) are turned into dots (.), making options C and D incorrect.
Other special characters like a dollar sign ($) are also turned into dots.
However, adjacent dots are merged, and leading/trailing dots are removed. Therefore, option E is correct.

### Which of the following would be a legal module name? (Choose all that apply.)
* A. com.book
* B. com-book
* C. com.book$
* D. com-book$
* E. 4com.book
* F. 4com-book

Module names look a lot like package names. Each segment is separated by a period (.)
and uses characters valid in Java identifiers.
Since identifiers are not allowed to begin with numbers, options E and F are incorrect.
Dashes (-) are not allowed either, ruling out options B and D.
That leaves options A and C as the correct answers.

#### How many of these module declarations are valid?
``` java
    module com.apple { exports com.apple; }
    module com.4apple { requires com.apple;}
    module com.apple4 { declares com.apple; }
    module com.apple-four { }
    module com.apple$ {}
```
* A. None.
* B. One.
* C. Two.
* D. Three.
* E. Four.
* F. Five.

This question is tricky because it mixes testing valid identifier names with module concepts.
The com.apple module is valid and demonstrates a simple module.
Additionally, the com.apple$ module is valid since $ characters are permitted in identifier names.
The com.4apple and com.apple-four modules are invalid because identifier or identifier
segments may not start with a digit nor contain a dash.
The com.apple4 module is invalid because declares is not a valid module directive.
Since only two are valid, option C is the answer.



#### Suppose we have an automatic module on the module path named dog-arthur2.jar
#### and no Automatic-Module-Name specified?
#### What module name should named modules use to reference it?
* A. dog-arthur
* B. dog-arthur2
* C. dog.arthur
* D. dog.arthur2
* E. None of the above

The rules for determining the name include removing the extension,
removing numbers, and changing special characters to periods (.).
This leaves us with dog.arthur, which is option C.

###### Suppose we have an automatic module on the module path named lizard-^-cricket-^-1.0.0-SNAPSHOT.jar
###### and no Automatic-Module-Name specified. What module name should named modules use to reference it?
* A. lizard-cricket
* B. lizard.cricket
* C. lizard-cricket-SNAPSHOT
* D. lizard-cricket.SNAPSHOT
* E. None of the above

The rules for determining the name include removing the extension,
removing numbers and changing special characters to periods (.).
Additionally, we remove the version information
from the end, which is 1.0.0-SNAPSHOT.
Finally, we normalize the duplicate dots,
which gives us option B: lizard.cricket.


#### Suppose we have a JAR file named cat-1.2.3-RC1.jar and
#### that Automatic-Module-Name in the MANIFEST.MF is set to dog.
#### What should a named module referencing this automatic module include in the module-info.java?
*  A. requires cat;
*  B. requires cat.RC;
*  C. requires cat-RC;
*  D. requires dog;
*  E. None of the above

Option D is correct because the Automatic-Module-Name is used when supplied.
If it were not supplied, option A would be the answer because version information
is excluded when determining the module name.

#### Identify legal module names.
* A. com.amazing.movie-rentals
* B. com.amazing.movierentals
* C. amazing-movierentals
    - is invalid but _ is valid. So, amazing_movierentals, com._amazing, and _amazing are valid module names.
* D. com.amazing.$movierentals
* E. no1movierentals
* F. com.amazing.1movierentals

A module name consists of one or more Java identifiers separated by " . " tokens.
Since, you cannot use dash (-) in a java identifier,
any module name that uses a dash is invalid (btw, underscore _ is valid).
Further, an identifier cannot start with a number, therefore,
any module name that has a token starting with a number is invalid.
(Correct B, D, E)
