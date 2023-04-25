### Where can a final instance variable be assigned a value? (Choose three.)
*  A. Instance initializer
*  B. static initializer
*  C. Instance method
*  D. On the line it is declared
*  E. Class constructor
*  F. static method

A final instance must be assigned a value (exactly once) on the line it is declared,
in an instance initializer, or in a constructor. This makes options A, D, and E correct.

#### Which statements about static initializers are correct? (Choose three.)
* A. They cannot be used to create instances of the class they are contained in.
* B. They can assign a value to a static final variable.
* C. They are executed at most once per program.
* D. They are executed each time an instance of the class is created from a local cache of objects.
* E. They are executed each time an instance of the class is created using the new keyword.
* F. They may never be executed.

A static initializer can create instances of any class it has access to,
so option A is incorrect. It can assign values to static final variables,
specifically ones that have not been assigned a value already,
so option B is correct. A static initializer is executed
when the class is first loaded, not when an object is created or loaded,
making option C correct, and options D and E incorrect.
If the class is never loaded, then they will not be executed,
making option F correct.
