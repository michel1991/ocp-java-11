### Which of the following data types cannot be used in a switch statement? (Choose all that apply.)
* A. float
* B. Character
* C. var
* D. byte
* E. Double
* F. Object
* G. Integer
* H. char[]

A switch statement supports the primitives int, byte, short, and char, along with their
associated wrapper classes Integer, Byte, Short, and Character, respectively.
A switch statement also supports var if the type can be resolved to a supported switch data types.
For these reasons, options B, C, D, and G are permitted in switch statements and, therefore, incorrect.
Options A and E are correct as long, float, double, and their associated wrapped
classes Long, Float, and Double, respectively, are not supported in switch statements.
Option F is correct, as Object is not a supported data type in a switch statement.
Finally, option H is incorrect.
While switch statements support String, a char[] is not the same as a String.

#### Which of the following variable types can be used in a switch statement under some circumstances? (Choose three.)
* A. An enumerated type
* B. StringBuilder
* C. Byte
* D. Double
* E. var
* F. Exception

A switch statement supports the primitive types byte, short,
char, and int and their associated wrapper classes Character,
Byte, Short, and Integer.
It also supports the String class and enumerated types.
Finally, it permits var under some circumstances,
such as if the type can resolve to one of the previous types.
For these reasons, options A, C, and E are correct. The other classes are not supporte