# Which of the following are true statements about a class Camel with a single instance variable List<String> species? (Choose all that apply.)
    A. If Camel is well encapsulated, then it must have restricted extensibility.
    B. If Camel is well encapsulated, then it must be immutable.
    C. If Camel has restricted extensibility, then it must have good encapsulation.
    D. If Camel has restricted extensibility, then it must be immutable.
    E. If Camel is immutable, then it must have good encapsulation.
    F. If Camel is immutable, then it must restrict extensibility.

    Option A is incorrect because good encapsulation requires private state rather than declaring the class final.
    Option B is incorrect because the well-encapsulated Camel class can have a getter that exposes the species variable to be modified.
    Options C and D are incorrect because a class can be final while having public variables and be mutable.
    Option E is correct because methods that expose species could change it, which would prevent immutability.
    Option F is correct because you cannot enforce immutability in a subclass.

 # Which of the following statements are correct? (Choose all that apply.)
    A. The return value of an assignment operation expression can be void.
    B. The inequality operator (!=) can be used to compare objects.
    C. The equality operator (==) can be used to compare a boolean value with a numeric value.
    D. During runtime, the && and | operators may cause only the left side of the expression to be evaluated.
    E. The return value of an assignment operation expression is the value of the newly assigned variable.
    F. In Java, 0 and false may be used interchangeably.
    G. The logical complement operator (!) cannot be used to flip numeric values.

The return value of an assignment operation in the expression is the same as the value of the newly assigned variable.
For this reason, option A is incorrect, and option E is correct.
Option B is correct, and the equality (==) and inequality (!=) operators can both be used with objects.
Option C is incorrect, as boolean and numeric types are not comparable with each other.
For example, you can’t say true == 3 without a compilation error.
Option D is incorrect, as only the short-circuit operator (&&) may cause only the left side of the expression to be evaluated.
The (|) operator will cause both sides to be evaluated.
Option F is incorrect, as Java does not accept numbers for boolean values.
Finally, option G is correct, as you need to use the negation operator (-) to flip or negate numeric values, not the logical complement operator (!).

# Which of the following statements is true?
A. Package-private access is more lenient than protected access.
B. A public class that has private fields and package-private methods is not visible to classes outside the package.
C. You can use access modifiers so only some of the classes in a package see a particular package-private class.
D. You can use access modifiers to allow access to all methods and not any instance variables.
E. You can use access modifiers to restrict access to all classes that begin with the word Test.

Option D is correct. This is the common implementation for encapsulation by setting all fields to be private and all methods to be public.
Option A is incorrect because protected access allows everything that package-private access allows and additionally allows subclasses access.
Option B is incorrect because the class is public.
This means that other classes can see the class.
However, they cannot call any of the methods or read any of the fields.
It is essentially a useless class. Option C is incorrect because package-private access applies to the whole package.
Option E is incorrect because Java has no such wildcard access capability.

# Which of the following statements about unary operators are true? (Choose all that apply.)
A. Unary operators are always executed before any surrounding binary or ternary operators.
B. The - operator can be used to flip a boolean value.
C. The pre-increment operator (++) returns the value of the variable before the increment is applied.
D. The post-decrement operator (--) returns the value of the variable before the decrement is applied.
E. The ! operator cannot be used on numeric values.
F. None of the above

Unary operators have the highest order of precedence, making option A correct.
The negation operator (-) is used only for numeric values, while the logical complement operator (!) is used exclusively for boolean values.
For these reasons, option B is incorrect, and option E is correct.
Finally, the pre-increment/pre-decrement operators return the new value of the variable, while the post-increment/post-decrement operators return the original variable.
For these reasons, option C is incorrect, and option D is correct.

# Which of the following are true statements? (Choose all that apply.)
A. The JDK contains a compiler.
B. The JVM contains a compiler.
C. The javac command creates a file containing bytecode.
D. The java command creates a file containing bytecode.
E. The JDK is contained in the JVM.
F. The JVM is contained in the JDK.

The Java Development Kit (JDK) is used when creating Java programs.
It contains a compiler since it is a development tool making option A correct and option B incorrect.
The JDK contains a Java Virtual Machine (JVM) making option F correct and option E incorrect.
The compiler creates bytecode making option C correct and option D incorrect. For more information, see Chapter 1.

