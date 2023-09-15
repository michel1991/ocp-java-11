#### What does the following print? Fill in the blanks: ______________ allow Java to support
#### multiple inheritance, and anonymous classes can ______________ of them.

* A. Abstract classes, extend at most one
* B. Abstract classes, extend any number
* C. Interfaces, implement at most one
* D. Interfaces, implement any number
* E. Concrete classes, extend at most one
* F. None of the above

Interfaces allow Java to support multiple inheritance because a class may implement
any number of interfaces. On the other hand, an anonymous class may implement
or extend at most one interface or class, respectively,
since it does not have a class definition. For these reasons, option C is the correct answer.

### Which statements are true for both abstract classes and interfaces? (Choose all that apply.)
* A. Both can be extended using the extends keyword.
* B. All methods within them are assumed to be abstract.
* C. Both can contain public static final variables.
* D. The compiler will insert the implicit abstract modifier automatically on methods declared without a body, if they are not marked as such.
* E. Both interfaces and abstract classes can be declared with the abstract modifier.
* F. Both inherit java.lang.Object.

A class may extend another class, and an interface may extend another interface, making option A correct.
Option B is incorrect. An abstract class can contain concrete instance or static methods.
Interfaces can also contain nonabstract methods, although knowing this is not required for the 1Z0-815 exam.
Option C is correct, as both can contain static constants. Option D is incorrect.
The compiler only inserts implicit modifiers for interfaces.
For abstract classes, the abstract keyword must be used on any method that does not define a body.
An abstract class must be declared with the abstract keyword,
while the abstract keyword is optional for interfaces.
Since both can be declared with the abstract keyword,
option E is correct. Finally, interfaces do not extend java.lang.Object.
If they did, then Java would support true multiple inheritance,
with multiple possible parent constructors being called as part of initialization.
Therefore, option F is incorrect.

#### Which of the following is not an attribute common to both abstract classes and interfaces?
* A. They both can contain abstract methods.
* B. They both can contain public methods.
* C. They both can contain protected methods.
* D. They both can contain static variables.

Interfaces cannot contain protected methods, making option C the answer.