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

### Which statements about functional interfaces are true? (Choose all that apply.)
* A. A functional interface can contain default and private methods.
* B. A functional interface can be defined by a class or interface.
* C. Abstract methods with signatures that are contained in public methods
of java.lang.Object do not count toward the abstract method count for a functional interface.
* D. A functional interface cannot contain static or private static methods.
* E. A functional interface contains at least one abstract method.
* F. A functional interface must be marked with the @FunctionalInterface annotation.

A functional interface can contain any number of nonabstract
methods including default, private, static, and private static.
For this reason, option A is correct, and option D is incorrect.
Option B is incorrect, as classes are never considered functional interfaces.
A functional interface contains exactly one abstract method,
although methods that have matching signatures as
public methods in java.lang.Object do not count toward the single method test.
For these reasons, option C is correct, and option E is incorrect.
Finally, option F is incorrect.
While a functional interface can be marked with the @FunctionalInterface annotation, it is not required.

##### Fill in the blanks: A functional interface must contain
##### or inherit ______________ and may optionally include ______________.
* A. at least one abstract method, the @Override annotation
* B. exactly one method, static methods
* C. exactly one abstract method, the @FunctionalInterface annotation
* D. at least one static method, at most one default method
* E. None of the above

A functional interface must include exactly one abstract method,
either by inheritance or declared directly.
It may also have any number, including zero, of default or static methods.
For this reason, both parts of option D are incorrect.
The first part of option A is incorrect because
more than one abstract method disqualifies it as a functional interface.
The first part of option B is incorrect because the method must be abstract;
that is to say, any method will not suffice.
Finally, option C is the correct answer. T
he first part of the sentence defines what it means to be a functional interface.
The second part refers to the optional @FunctionalInterface annotation.
It is considered a good practice to add
this annotation to any functional interfaces you define because
the compiler will report a problem if you
define an invalid interface that does not have exactly one abstract method.

#### Which of the following statements about functional interfaces is true?
* A. It is possible to define a functional interface that returns two data types.
* B. It is possible to define a primitive functional interface that uses float, char, or short.
* C. All functional interfaces must take arguments or return a value.
* D. None of the primitive functional interfaces includes generic arguments.
* E. None of these statements is true.

Java supports only a single return data type or void.
Therefore, it is not possible to define a functional interface that
returns two data types, making option A incorrect.
Although Java does not include built-in support for primitive functional interfaces
that include float, char, or short, there is nothing to prevent a developer
from creating them in their own project,
making option B the true statement and the correct answer.
Option C is incorrect because a functional interface that takes no values and returns void is possible.
In fact, Runnable is one such example. Option D is also incorrect,
since IntFunction˂R˃ takes a primitive argument as input and a generic argument for the return type.

##### Suppose Panther and Cub are interfaces and neither contains any default methods.
##### Which statements are true? (Choose two.)
[image](./images/panther_cub.jpg)

* A. If Panther has a single abstract method, Cub is guaranteed to be a functional interface.
* B. If Panther has a single abstract method, Cub may be a functional interface.
* C. If Panther has a single abstract method, Cub cannot be a functional interface.
* D. If Panther has two abstract methods, Cub is guaranteed to be a functional interface.
* E. If Panther has two abstract methods, Cub may be a functional interface.
* F. If Panther has two abstract methods, Cub cannot be a functional interface.

A functional interface has exactly one abstract method. This includes inherited methods.
If Panther has a single abstract method, Cub is a functional interface
if it does not add any more abstract methods. This matches option B. However,
if Panther has two abstract methods, there is no code in Cub that
can make it a functional interface, and option F is the other answer.

