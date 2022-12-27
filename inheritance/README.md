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

### Which of the following statements about methods are true? (Choose all that apply.)
* A. Overloaded methods must have the same signature.
* B. Overridden methods must have the same signature.
* C. Hidden methods must have the same signature.
* D. Overloaded methods must have the same return type.
* E. Overridden methods must have the same return type.
* F. Hidden methods must have the same return type.

Overloaded methods have the method name but a different signature (the method parameters differ), making option A incorrect.
Overridden instance methods and hidden static methods must have the same signature (the name and method parameters must match),
making options B and C correct.
Overloaded methods can have different return types, while overridden and hidden methods can have covariant return types.
None of these methods are required to use the same return type, making options D, E, and F incorrect.

### Which statements about top-level types and member inner classes are correct? (Choose all that apply.)
* A. A member inner class can be marked final.
* B. A top-level type can be marked protected.
* C. A member inner class cannot be marked public since that would make it a top-level class.
* D. A top-level type must be stored in a .java file with a name that matches the class name.
* E. If a member inner class is marked private, then it can be referenced only in the outer class for which it is defined.

An inner class can be marked abstract or final, just like a regular class, making option A correct.
A top-level type, such as a class, interface, or enum, can only be marked public or default (package-private), making option B incorrect.
Option C is incorrect, as a member inner class can be marked public, and this would not make it a top-level class.
A .java file may contain multiple top-level classes, making option D incorrect. The precise rule is that there is at most one public top-level type, and that type is used in the file name.
Finally, option E is correct. When a member inner class is marked private, it behaves like any other private members and can be referenced only in the class in which it is defined.

### Which statements about polymorphism and method inheritance are correct? (Choose all that apply.)
* A. A subclass may implement a static method with the same method signature as an inherited instance method.
* B. If a method in the parent class, sing(), calls a method it defines dance(), the behavior of dance() could change at runtime.
* C. Marking a variable final prevents it from being overridden.
* D. The reference type of a variable determines which overridden method will be called at runtime.
* E. Marking an instance method abstract prevents it from being overridden or hidden.
* F. Marking a method private prevents it from being overridden in a subclass.

If a class inherits an instance method, then it can only declare a method with the same signature if that method is also an instance method, making option A incorrect.
Option B is correct, as it defines the effect of overriding a method in a subclass via polymorphism.
Option C is incorrect as variables cannot be overridden. Option D is also incorrect.
Polymorphism dictates that the calls to an overridden method will be replaced everywhere, regardless of the reference type used.
Option E is incorrect, as abstract methods are often overridden, commonly in the first concrete subclass. Finally, option F is correct.
Methods marked private cannot be overridden.
They can still be declared in a subclass, but since they are not inherited in a subclass, this is not considered an overridden method.

### Which of the following statements about overridden methods are true? (Choose all that apply.)
* A. An overridden method must use an access modifier that is the same or less restrictive than the method it overrides.
* B. An overridden method can declare new unchecked exceptions that are not defined in the method it overrides.
* C. An overridden method may refrain from declaring any or all of the exceptions as the method it overrides.
* D. A method overriding another method cannot be marked final.
* E. An overridden method must return the exact same type as the method it overrides.
* F. A method that has a single vararg parameter may be overridden by a method that takes no arguments, as varargs can have zero-or-more parameters.

An overridden method must use an access modifier that is the same or less (not more) restrictive than the method it inherits, making option A correct.
An overridden method can swallow (refrain from declaring) or declare new unchecked exceptions as the method it inherits, making options B and C correct.
It may not declare new checked exceptions, though. Option D is correct as there is no rule that an overridden method cannot be marked final.
Option E is incorrect, as the return type has to be covariant.
In other words, the return type of the overridden method can be the same or a subtype as the return type of the method it overrides.
Finally, option F is incorrect.
If an overridden method changes the signature (the name and list of parameters) in any way, then the method is overloaded, not overridden.

### Which of the following statements about polymorphism are true? (Choose all that apply.)
* A. An object may be cast to a subtype without an explicit cast.
* B. If the type of a method argument is an interface, then a reference variable that implements the interface may be passed to the method.
* C. A method that takes a parameter with type java.lang.Object can be passed any variable.
* D. All cast exceptions can be detected at compile-time.
* E. By defining a final instance method in the superclass, you guarantee that the specific method will be called in the parent class at runtime.
* F. Polymorphism applies only to classes, not interfaces.

An object may be cast to a supertype without an explicit cast but requires an explicit cast to be cast to a subtype, making option A incorrect.
Option B is correct, as an interface method argument may take any reference type that implements the interface.
Option C is also correct, as a method that accepts java.lang.Object can accept any variable since all objects inherit java.lang.Object.
This also includes primitives, which can be autoboxed to their wrapper classes.
Some cast exceptions can be detected as errors at compile time, but others can only be detected at runtime, so option D is incorrect.
Due to the nature of polymorphism, a final instance method cannot be overridden in a subclass, so calls in the parent class will not be replaced, making option E correct.
Finally, polymorphism applies to classes and interfaces alike, making option F incorrect.

### Which statements about polymorphism and method inheritance are correct? (Choose all that apply.)
* A. It cannot be determined until runtime which overridden method will be executed in a parent class.
* B. It cannot be determined until runtime which hidden method will be executed in a parent class.
* C. Marking a method static prevents it from being overridden or hidden.
* D. Marking a method final prevents it from being overridden or hidden.
* E. The reference type of the variable determines which overridden method will be called at runtime.
* F. The reference type of the variable determines which hidden method will be called at runtime.

Polymorphism is the property of an object to take on many forms.
Part of polymorphism is that methods are replaced through overriding wherever they are called,
regardless of whether they’re in a parent or child class.
For this reason, option A is correct, and option E incorrect.
With hidden static methods, Java relies on the location and reference type to determine which method is called,
making option B incorrect and F correct. Finally, making a method final, not static,
prevents it from being overridden, making option D correct and option C incorrect.