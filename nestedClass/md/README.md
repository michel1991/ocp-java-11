#### Fill in the blanks with the only option that makes
#### this statement false: A(n) ______________ can access ______________
#### of the enclosing class in which it is defined.
* A. static nested class, static members
* B. static nested class, instance members
* C. member inner class, static members
* D. member inner class, instance members
* E. local class, instance members from within an instance method
* F. anonymous class, instance members from within an instance method

A static nested class cannot access instance members
of the enclosing class, making option B correct.
The rest of the options form true statements.

#### Which of the following statements about nested classes are correct? (Choose three.)
* A. An anonymous class can declare that it implements multiple interfaces.
* B. All nested classes can contain constant variables.
* C. A local class can declare that it implements multiple interfaces.
* D. A member inner class can contain static methods.
* E. A static nested class can contain static methods.
* F. A local class can access all local variables prior to its declaration within a method.

Options B, C, and E are valid statements about nested classes.
An anonymous class can declare only one supertype, either a class or an interface,
making option A incorrect. A member inner class cannot contain static methods,
making option B incorrect.
A local class can access only final and effectively final local variables,
making option F incorrect. (Correct B, C, E)
