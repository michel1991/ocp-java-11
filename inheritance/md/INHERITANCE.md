### Which statements about inheritance are correct? (Choose all that apply.)
* A. A class can extend multiple interfaces.
* B. Java supports multiple inheritance of parent classes.
* C. A class inherits at most one class.
* D. An interface may extend multiple interfaces.
* E. A class can extend multiple classes.
* F. A class can implement multiple interfaces.

Classes do not extend interfaces, but they can implement multiple interfaces, making option A incorrect and option F correct.
Java supports single inheritance of objects, making option B incorrect and option E incorrect.
While Java supports single inheritance, a class can inherit multiple classes.
For example, RuntimeException inherits Exception, which inherits Error, and finally Object.
For this reason, option C is incorrect.
An interface can extend multiple interfaces, making option D correct.

### Which of the following statements about inheritance are correct? (Choose all that apply.)
* A. A class can directly extend any number of classes.
* B. A class can implement any number of interfaces.
* C. All variables inherit java.lang.Object.
* D. If class A is extended by B, then B is a superclass of A.
* E. If class C implements interface D, then C is subtype of D.
* F. Multiple inheritance is the property of a class to have multiple direct superclasses.

A class can only directly extend a single class, making option A incorrect.
A class can implement any number of interfaces, though, making option B correct.
Option C is incorrect because primitive types do not inherit java.lang.Object.
If a class extends another class, then it is a subclass, not a superclass, making option D incorrect.
A class that implements an interface is a subtype of that interface, making option E correct.
Finally, option F is correct as it is an accurate description of multiple inheritance, which is not permitted in Java.

### Fill in the blanks: A class may be assigned to a(n) ___________________
### reference variable automatically but requires
### an explicit cast when assigned to a(n) ___________________ reference variable.

* A. subclass, outer class
* B. superclass, subclass
* C. concrete class, subclass
* D. subclass, superclass
* E. abstract class, concrete class

A class can trivially be assigned to a superclass reference variable
but requires an explicit cast to be assignedto a subclass reference variable.
For these reasons, option B is correct.