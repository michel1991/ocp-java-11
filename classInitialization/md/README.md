#### Which of the following statements about calling this() in a constructor are true? (Choose three.)
* A. If arguments are provided to this(), then there must be a constructor in the class able to take those arguments.
* B. If arguments are provided to this(), then there must be a constructor in the superclass able to take those arguments.
* C. If the no-argument this() is called, then the class must explicitly implement the no-argument constructor.
* D. If super() and this() are both used in the same constructor, super() must appear on the line immediately after this().
* E. If super() and this() are both used in the same constructor, this() must appear on the line immediately after super().
* F. If this() is used, it must be the first line of the constructor.

Option A is correct and option B is incorrect because this()
calls another constructor in the same class.
Option C is correct because this() without parameters is the default constructor
and is not inserted automatically by the compiler if another constructor is present.
Options D and E are both incorrect because only one of super()
or this() can be used from the same constructor. Finally, option F is correct as super() or this() must come first.

##### Which of the following is not a valid order for elements within a class?
* A. Constructor, instance variables, method declarations
* B. Instance variables, static initializer constructor, method declarations
* C. Method declarations, instance variables, constructor
* D. Instance initializer, constructor, instance variables, constructor
* E. None of the above

The instance variables, constructor, instance and static initializers,
and method declarations can appear in any order within a class declaration.

##### Which statement about a no-argument constructor is true?
* A. The Java compiler will always insert a default no-argument constructor if you do not define a no-argument constructor in your class.
* B. For a class to call super() in one of its constructors, its parent class must explicitly implement a no-argument constructor.
* C. If a class extends another class that has only one constructor that takes a value, then the child class must explicitly declare at least one constructor.
* D. A class may contain more than one no-argument constructor.

Option A is incorrect because Java inserts a no-argument constructor
only if there are no other constructors in the class.
Option B is incorrect because the parent can have a default no-argument constructor,
which is inserted by the compiler and accessible in the child class. Option D is incorrect.
A class that contains two no-argument constructors will not compile because they would have the same signature.
Finally, option C is correct. If a class extends a parent class that does not include a no-argument constructor,
the default no-argument constructor cannot be automatically inserted into the child class by the compiler.
Instead, the developer must explicitly declare at least
one constructor and explicitly define how the call to the parent constructor is made.