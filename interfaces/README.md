# Given a public static interface method, what is the best reason to modify it to be private?
A. Reduces code duplication
B. Backward compatibility
C. Improves encapsulation
D. Polymorphism
E. Supports overloaded operators

The primary reason to make any public method private is to improve encapsulation, making option B the correct answer.
Option A is a close second choice, as it is one of the reasons to use private interface methods, but that applies only when adding a new method.
If the method already exists, making it private does not reduce code duplication. The rest of the options do not apply to private interface methods.

# Which statements about the final modifier are correct? (Choose all that apply.)
A. Instance and static variables can be marked final.
B. A variable is effectively final if it is marked final.
C. The final modifier can be applied to classes and interfaces.
D. A final class cannot be extended.
E. An object that is marked final cannot be modified.
F. Local variables cannot be declared with type var and the final modifier.

Instance and static variables can be marked final, making option A correct.
Effectively final means a local variable is not marked final but whose value does not change after it is set, making option B incorrect.
The final modifier can be applied to classes, but not interfaces, making option C incorrect.
Remember, interfaces are implicitly abstract, which is incompatible with final.
Option D is correct, as the definition of a final class is that it cannot be extended.
Option E is incorrect, as final refers only to the reference to an object, not its contents.
Finally, option F is incorrect, as var and final can be used together.

# Which statements about functional interfaces are true? (Choose all that apply.)
A. A functional interface can contain default and private methods.
B. A functional interface can be defined by a class or interface.
C. Abstract methods with signatures that are contained in public methods of java.lang.Object do not count toward the abstract method count for a functional interface.
D. A functional interface cannot contain static or private static methods.
E. A functional interface contains at least one abstract method.
F. A functional interface must be marked with the @FunctionalInterface annotation.

A functional interface can contain any number of nonabstract methods including default, private, static, and private static.
For this reason, option A is correct, and option D is incorrect. Option B is incorrect, as classes are never considered functional interfaces.
A functional interface contains exactly one abstract method, although methods that have matching signatures as public methods in java.lang.Object do not count toward the single method test.
For these reasons, option C is correct, and option E is incorrect. Finally, option F is incorrect.
While a functional interface can be marked with the @FunctionalInterface annotation, it is not required.

# What modifiers are implicitly applied to all interface methods that do not declare a body? (Choose all that apply.)
A. protected
B. public
C. static
D. void
E. abstract
F. default

A method that does not declare a body is by definition abstract, making option E correct.
All abstract interface methods are assumed to be public, making option B correct.
Interface methods cannot be marked protected, so option A is incorrect.
Interface methods can be marked static or default, although if they are, they must provide a body, making options C and F incorrect.
Finally, void is a return type, not a modifier, so option D is incorrect.