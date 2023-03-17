### Which statements are true about a functional interface? (Choose three.)
* A. It may contain any number of abstract methods.
* B. It must contain a single abstract method.
* C. It may contain any number of private methods.
* D. It must contain a single private method.
* E. It may contain any number of static methods.
* F. It must contain a single static method.

A functional interface must have exactly one abstract method, which is option B.
There are no restrictions on the number of private or static methods, which make options C and E also correct.

### Which can implement a functional interface?
* A. An anonymous class
* B. A top-level class
* C. A lambda expression
* D. An anonymous class or a top-level class
* E. A top-level class or a lambda expression
* F. An anonymous class, a top-level class, or a lambda expression

An anonymous class can implement a single interface, and a top-level class can implement any number of interfaces.
Since a functional interface is an interface with additional rules,
both anonymous class and top-level class are correct.
Additionally, a lambda expression can also implement a functional interface.
Since all three are correct, the answer is option F.

### Which statement about functional interfaces is incorrect?
* A. A functional interface can have any number of static methods.
* B. A functional interface can have any number of default methods.
* C. A functional interface can have any number of private static methods.
* D. A functional interface can have any number of abstract methods.
* E. A functional interface can have any number of private methods.
* F. All of the above are correct.

A functional interface may have any number of static, default, private static, or private methods.
It can have only one qualified abstract method, though, making option D correct.

### Which of the following functional interfaces contain an abstract method that returns a primitive value? (Choose all that apply.)
*  A. BooleanSupplier
*  B. CharSupplier
*  C. DoubleSupplier
*  D. FloatSupplier
*  E. IntSupplier
*  F. StringSupplier

Java includes support for three primitive streams, along with numerous functional interfaces to go with them: int, double, and long.
For this reason, options C and E are correct.
There is one exception to this rule. While there is no BooleanStream class, there is a BooleanSupplier functional interface, making option A correct.
Java does not include primitive streams or related functional interfaces for other numeric data types, making options B and D incorrect.
Option F is incorrect because String is not a primitive, but an object. Only primitives have custom suppliers.

### Which statements about functional interfaces are true? (Choose all that apply.)
* A. A functional interface can contain default and private methods.
* B. A functional interface can be defined by a class or interface.
* C. Abstract methods with signatures that are contained in public methods of java.lang.Object do not count toward the abstract method count for a functional interface.
* D. A functional interface cannot contain static or private static methods.
* E. A functional interface contains at least one abstract method.
* F. A functional interface must be marked with the @FunctionalInterface annotation.

A functional interface can contain any number of nonabstract methods including default, private, static, and private static.
For this reason, option A is correct, and option D is incorrect. Option B is incorrect, as classes are never considered functional interfaces.
A functional interface contains exactly one abstract method, although methods that have matching signatures as public methods in java.lang.Object do not count toward the single method test.
For these reasons, option C is correct, and option E is incorrect. Finally, option F is incorrect.
While a functional interface can be marked with the @FunctionalInterface annotation, it is not required.

### Fill in the blanks: A functional interface must contain or inherit ______________ and may optionally include ______________.
* A. at least one abstract method, the @Override annotation
* B. exactly one method, static methods
* C. exactly one abstract method, the @FunctionalInterface annotation
* D. at least one static method, at most one default method
* E. None of the above

A functional interface must include exactly one abstract method, either by inheritance or declared directly.
It may also have any number, including zero, of default or static methods.
For this reason, both parts of option D are incorrect.
The first part of option A is incorrect because more than one abstract method disqualifies it as a functional interface.
The first part of option B is incorrect because the method must be abstract; that is to say, any method will not suffice.
Finally, option C is the correct answer. The first part of the sentence defines what it means to be a functional interface.
The second part refers to the optional @FunctionalInterface annotation.
It is considered a good practice to add this annotation to any functional interfaces you define because
the compiler will report a problem if you define an invalid interface that does not have exactly one abstract method.
