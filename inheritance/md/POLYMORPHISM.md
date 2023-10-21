### Which statements about polymorphism and method inheritance are correct? (Choose all that apply.)
* A. A subclass may implement a static method with the same method signature as an inherited instance method.
* B. If a method in the parent class, sing(), calls a method it defines dance(), the behavior of dance() could change at runtime.
* C. Marking a variable final prevents it from being overridden.
* D. The reference type of a variable determines which overridden method will be called at runtime.
* E. Marking an instance method abstract prevents it from being overridden or hidden.
* F. Marking a method private prevents it from being overridden in a subclass.

If a class inherits an instance method, then it can only declare a method with
the same signature if that method is also an instance method, making option A incorrect.
Option B is correct, as it defines the effect of overriding a method in a subclass via polymorphism.
Option C is incorrect as variables cannot be overridden. Option D is also incorrect.
Polymorphism dictates that the calls to an overridden method will be replaced everywhere,
regardless of the reference type used.
Option E is incorrect, as abstract methods are often overridden,
commonly in the first concrete subclass. Finally, option F is correct.
Methods marked private cannot be overridden.
They can still be declared in a subclass,
but since they are not inherited in a subclass, this is not considered an overridden method.

### Which of the following statements about polymorphism are true? (Choose all that apply.)
* A. An object may be cast to a subtype without an explicit cast.
* B. If the type of a method argument is an interface, then a reference variable that implements the interface may be passed to the method.
* C. A method that takes a parameter with type java.lang.Object can be passed any variable.
* D. All cast exceptions can be detected at compile-time.
* E. By defining a final instance method in the superclass, you guarantee that the specific method will be called in the parent class at runtime.
* F. Polymorphism applies only to classes, not interfaces.

An object may be cast to a supertype without an explicit cast but requires
an explicit cast to be cast to a subtype, making option A incorrect.
Option B is correct, as an interface method argument
may take any reference type that implements the interface.
Option C is also correct, as a method that accepts java.lang.Object can accept
any variable since all objects inherit java.lang.Object.
This also includes primitives, which can be autoboxed to their wrapper classes.
Some cast exceptions can be detected as errors at compile time,
but others can only be detected at runtime, so option D is incorrect.
Due to the nature of polymorphism, a final instance
method cannot be overridden in a subclass, so calls in the parent class will not be replaced,
making option E correct.
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