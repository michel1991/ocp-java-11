##### Which are requirements for a class to be immutable? (Choose three.)
* A. A private constructor is provided.
* B. Any instance variables are private.
* C. Any instance variables are initialized in a constructor.
* D. Methods cannot be overridden.
* E. There are no setter methods.
* F. Any instance variables are marked final.

An immutable class can have publicconstructors, so option A is incorrect.
Options B, D, and E make up the requirements for an immutable class.
Option D can be fulfilled by making the class final or marking the methods final.
Option C is incorrect because instance variables can still be declared with a value or set by an instance initializer.
Option F is also incorrect.
While it is common to mark instance variables final, as long as there is no way
for them to be changed after the constructor is executed, the class can still be considered immutable.