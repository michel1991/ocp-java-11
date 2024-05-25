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

### Identify correct option(s):
* A. Multiple inheritance of state includes ability to inherit instance methods from multiple classes.

Methods do not have state. Ability to inherit instance methods from multiple classes is called multiple inheritance of implementation.
Default methods introduce one form of multiple inheritance of implementation.
A class can implement more than one interface, which can contain default methods that have the same name.
However, such a class cannot be compiled.
In this case, the implementing class is required to provide its own implementation of the common method to avoid ambiguity.

* B. Multiple inheritance of state includes ability to inherit instance fields from multiple classes.
* C. Multiple inheritance of type includes ability to inherit instance fields as well as instance methods from multiple classes.
* D. Multiple inheritance of type includes ability to implement multiple interfaces and ability to inherit static or instance fields from interfaces and/or classes.
* E. Multiple inheritance of type includes ability to implement multiple interfaces and/or ability to extend from multiple classes.

Interfaces, classes, and enums are all "types". Java allows a class to implement multiple interfaces.
In this way, Java supports multiple inheritance of types.
"State", on the other hand, is represented by instance fields. Only a class can have instance fields and therefore,
only a class can have a state. (Fields defined in an interface are always implicitly static, even if you don't specify the keyword static explicitly.
Therefore, an interface does not have any state.) Since a class is allowed to extend only from one class at the most, it can inherit only one state.
Thus, Java does not support multiple inheritance of state.

This is an important concept and is explained in more detail here: https://docs.oracle.com/javase/tutorial/java/IandI/multipleinheritance.html
Correct(B, E)

#### Which of these statements are true?

* A. If a RuntimeException is not caught, the method will terminate and normal execution of the thread will resume.
    Any remaining code of the method will not be executed. Further, any uncaught exception will cause the JVM to kill the thread.
* B. An overriding method must declare that it throws the same exception classes as the method it overrides.
    It can throw any subset of the exceptions thrown by overridden class.
* C. The main method of a program can declare that it throws checked exceptions.
    Any method can do that !
* D. A method declaring that it throws a certain exception class may throw instances of any subclass of that exception class.
    Note that it cannot throw the instances of any superclasses of the exception.
* E. finally blocks are executed if and only if an exception gets thrown while inside the corresponding try block.
    Finally is ALWAYS executed. (Except when System.exit method is invoked from try or catch block.)

Corect(C, D)
Normal execution will not resume if an exception is uncaught by a method.
The exception will propagate up the method invocation stack until some method handles it.
If no one handles it then the exception will be handled by the JVM and the JVM will terminate that thread.

An overriding method only needs to declare that it can throw a subset of the exceptions the overridden method can throw.
Having no throws clause in the overriding method is OK.


