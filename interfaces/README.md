### Given a public static interface method, what is the best reason to modify it to be private?
* A. Reduces code duplication
* B. Backward compatibility
* C. Improves encapsulation
* D. Polymorphism
* E. Supports overloaded operators

The primary reason to make any public method private is to improve encapsulation, making option B the correct answer.
Option A is a close second choice, as it is one of the reasons to use private interface methods, but that applies only when adding a new method.
If the method already exists, making it private does not reduce code duplication. The rest of the options do not apply to private interface methods.

### Which statements about the final modifier are correct? (Choose all that apply.)
* A. Instance and static variables can be marked final.
* B. A variable is effectively final if it is marked final.
* C. The final modifier can be applied to classes and interfaces.
* D. A final class cannot be extended.
* E. An object that is marked final cannot be modified.
* F. Local variables cannot be declared with type var and the final modifier.

Instance and static variables can be marked final, making option A correct.
Effectively final means a local variable is not marked final but whose value does not change after it is set, making option B incorrect.
The final modifier can be applied to classes, but not interfaces, making option C incorrect.
Remember, interfaces are implicitly abstract, which is incompatible with final.
Option D is correct, as the definition of a final class is that it cannot be extended.
Option E is incorrect, as final refers only to the reference to an object, not its contents.
Finally, option F is incorrect, as var and final can be used together.


### What are some advantages of using default interface methods? (Choose all that apply.)
*  A. Automatic resource management
*  B. Improve performance at runtime
*  C. Better exception handling
*  D. Backward compatibility
*  E. Highly concurrent execution
*  F. Convenience in classes implementing the interface

Java added default methods primarily for backward compatibility.
Using a default method allows you to add a new method to an interface without having to recompile a class that used an older version of the interface.
For this reason, option D is correct.
Option F is also correct, as default methods in some APIs offer a number of convenient methods to classes that implement the interface.
The rest of the options are not related to default methods.


### What are some advantages of using private interface methods? (Choose all that apply.)
* A. Improve polymorphism
* B. Improve performance at runtime
* C. Reduce code duplication
* D. Backward compatibility
* E. Encapsulate interface implementation
* F. Portability

You can reduce code duplication by moving shared code from default or static methods into a private or private static method.
For this reason, option C is correct. Option E is also correct, as making interface methods private means users of the interface do not have access to them.
The rest of the options are not related to private methods, although backward compatibility does apply to default methods.

### Which of the following are the best reasons for creating a default interface method? (Choose two.)
*  A. Allow interface methods to be overloaded.
*  B. Add backward compatibility to existing interfaces.
*  C. Give an interface the ability to create final methods.
*  D. Allow an interface to define a method at the class level.
*  E. Improve code reuse among classes that implement the interface.
*  F. Improve encapsulation of the interface.

One of the motivations for adding default interface methods to Java was for backward compatibility.
These methods allow developers to update older classes with a newer version of an interface without breaking functionality in the existing classes,
making option B correct. Option E is also correct, as classes implementing the interface can share common methods.
Option A is incorrect, as interface methods can already be overloaded.
Option C is incorrect because methods in interfaces cannot be marked final.
Option D sounds plausible, but could be accomplished with static interface methods alone.
Option F is incorrect as that statement only applies to private interface methods.

### Which of the following can include a static method in its definition? (Choose three.)
*  A. Interface
*  B. Anonymous class
*  C. Abstract class
*  D. Member inner class
*  E. Local class
*  F. static nested class

Both abstract classes and interfaces can include static methods, so options A and C are correct.
Of all the nested class types, only static nested classes can include static methods, making option F correct,
and options B, D, and E incorrect.

#### Which of the following statements are correct? (Choose two.)
*  A. Java allows multiple inheritance using two abstract classes.
*  B. Java allows multiple inheritance using two interfaces.
*  C. Java does not allow multiple inheritance.
*  D. An interface can extend another interface.
*  E. An interface can implement another interface.

While Java does not allow a class to extend more than one class,
it does allow a class to implement any number of interfaces.
Multiple inheritance is, therefore, only allowed via interfaces,
making option B correct. Interfaces can extend other interfaces,
making option D the other answer.

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

