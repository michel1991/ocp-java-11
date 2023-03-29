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