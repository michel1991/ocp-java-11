### Which of the following are true statements about a class Camel with a single instance variable List<String> species? (Choose all that apply.)
* A. If Camel is well encapsulated, then it must have restricted extensibility.
*    B. If Camel is well encapsulated, then it must be immutable.
*    C. If Camel has restricted extensibility, then it must have good encapsulation.
*    D. If Camel has restricted extensibility, then it must be immutable.
*    E. If Camel is immutable, then it must have good encapsulation.
*    F. If Camel is immutable, then it must restrict extensibility.

    Option A is incorrect because good encapsulation requires private state rather than declaring the class final.
    Option B is incorrect because the well-encapsulated Camel class can have a getter that exposes the species variable to be modified.
    Options C and D are incorrect because a class can be final while having public variables and be mutable.
    Option E is correct because methods that expose species could change it, which would prevent immutability.
    Option F is correct because you cannot enforce immutability in a subclass.

 ### Which of the following statements are correct? (Choose all that apply.)
 *    A. The return value of an assignment operation expression can be void.
 *    B. The inequality operator (!=) can be used to compare objects.
 *    C. The equality operator (==) can be used to compare a boolean value with a numeric value.
 *    D. During runtime, the && and | operators may cause only the left side of the expression to be evaluated.
 *    E. The return value of an assignment operation expression is the value of the newly assigned variable.
 *    F. In Java, 0 and false may be used interchangeably.
 *    G. The logical complement operator (!) cannot be used to flip numeric values.

The return value of an assignment operation in the expression is the same as the value of the newly assigned variable.
For this reason, option A is incorrect, and option E is correct.
Option B is correct, and the equality (==) and inequality (!=) operators can both be used with objects.
Option C is incorrect, as boolean and numeric types are not comparable with each other.
For example, you can’t say true == 3 without a compilation error.
Option D is incorrect, as only the short-circuit operator (&&) may cause only the left side of the expression to be evaluated.
The (|) operator will cause both sides to be evaluated.
Option F is incorrect, as Java does not accept numbers for boolean values.
Finally, option G is correct, as you need to use the negation operator (-) to flip or negate numeric values, not the logical complement operator (!).

Option D is correct. This is the common implementation for encapsulation by setting all fields to be private and all methods to be public.
Option A is incorrect because protected access allows everything that package-private access allows and additionally allows subclasses access.
Option B is incorrect because the class is public.
This means that other classes can see the class.
However, they cannot call any of the methods or read any of the fields.
It is essentially a useless class. Option C is incorrect because package-private access applies to the whole package.
Option E is incorrect because Java has no such wildcard access capability.

### Which of the following statements about unary operators are true? (Choose all that apply.)
* A. Unary operators are always executed before any surrounding binary or ternary operators.
* B. The - operator can be used to flip a boolean value.
* C. The pre-increment operator (++) returns the value of the variable before the increment is applied.
* D. The post-decrement operator (--) returns the value of the variable before the decrement is applied.
* E. The ! operator cannot be used on numeric values.
* F. None of the above

Unary operators have the highest order of precedence, making option A correct.
The negation operator (-) is used only for numeric values, while the logical complement operator (!) is used exclusively for boolean values.
For these reasons, option B is incorrect, and option E is correct.
Finally, the pre-increment/pre-decrement operators return the new value of the variable, while the post-increment/post-decrement operators return the original variable.
For these reasons, option C is incorrect, and option D is correct.

### Which of the following are true statements? (Choose all that apply.)
* A. The JDK contains a compiler.
* B. The JVM contains a compiler.
* C. The javac command creates a file containing bytecode.
* D. The java command creates a file containing bytecode.
* E. The JDK is contained in the JVM.
* F. The JVM is contained in the JDK.

The Java Development Kit (JDK) is used when creating Java programs.
It contains a compiler since it is a development tool making option A correct and option B incorrect.
The JDK contains a Java Virtual Machine (JVM) making option F correct and option E incorrect.
The compiler creates bytecode making option C correct and option D incorrect. For more information, see Chapter 1.


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
Option C is correct, as both can contain static constants. Option D is incorrect. The compiler only inserts implicit modifiers for interfaces.
For abstract classes, the abstract keyword must be used on any method that does not define a body.
An abstract class must be declared with the abstract keyword, while the abstract keyword is optional for interfaces.
Since both can be declared with the abstract keyword, option E is correct. Finally, interfaces do not extend java.lang.Object.
If they did, then Java would support true multiple inheritance, with multiple possible parent constructors being called as part of initialization.
Therefore, option F is incorrect.

### Which of the following data types cannot be used in a switch statement? (Choose all that apply.)
* A. float
* B. Character
* C. var
* D. byte
* E. Double
* F. Object
* G. Integer
* H. char[]

A switch statement supports the primitives int, byte, short, and char, along with their associated wrapper classes Integer, Byte, Short, and Character, respectively.
A switch statement also supports var if the type can be resolved to a supported switch data types.
For these reasons, options B, C, D, and G are permitted in switch statements and, therefore, incorrect.
Options A and E are correct as long, float, double, and their associated wrapped classes Long, Float, and Double, respectively, are not supported in switch statements.
Option F is correct, as Object is not a supported data type in a switch statement. Finally, option H is incorrect.
While switch statements support String, a char[] is not the same as a String.

### What statements about executing the following code snippet are correct? System.console().readPassword()
* A. It returns a String value.
* B. A NullPointException will never be thrown at runtime.
* C. It echoes each character to the screen as it is typed.
* D. It is not any safer than using readLine().
* E. It encrypts the bytes as they are entered.
* F. None of the above.

The readPassword() method retrieves a text value from the user without echoing the values to screen and returns a char[] instance, making options A and C incorrect.
A NullPointerException may be thrown if the Console is not available, making option B incorrect.
The readPassword() method is considered safer than using readLine() for protected data, in part because it prevents passwords from entering the string pool, making option D incorrect.
Option E is also incorrect, as the method does not perform any kind of encryption. For these reasons, option F is correct

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

### Which of the following are valid method modifiers that cannot be used together in a method declaration? (Choose all that apply.)
* A. null and final
* B. abstract and private
* C. public and private
* D. nonstatic and abstract
* E. private and final
* F. abstract and static
* G. protected and abstract

First, null and nonstatic are not valid method modifiers, making options A and D incorrect.
Options B and F are correct, as abstract methods cannot be marked private or static, since they then would not be able to be overridden.
Option C is also correct, as you cannot declare two access modifiers on the same method.
Finally, options E and G are two sets of valid modifiers that can be used together in a method declaration.
Using private with final is allowed, albeit redundant.

### Which of the following statements about primitive and reference types are correct? (Choose all that apply.)
* A. char and byte are the same size.
* B. Java allows some objects to be passed to methods that accept primitives.
* C. The new keyword creates a new object in memory.
* D. String is a primitive type.
* E. All primitive types define a callable toString() method.
* F. double is larger than float.
* G. An object can have only one reference, created when the object is created.

A char is larger than a byte, whereas char and short are the same size, making option A incorrect.
Java supports autoboxing and unboxing of primitives to their associated wrapped classes, making option B correct.
Option C is also correct, as the new keyword allocates memory for a new object.
Java includes support for String literals and operators, but a String value is an object, not a primitive, making option D incorrect.
Primitive types do not define any methods, so option E is incorrect, although they can each be appended to a String value.
Option F is correct as double is twice the size of float. Finally, option G is incorrect, since objects can have many references to them.
They can even be created without an explicit reference variable, such as calling new Object(); on a line by itself.

### Which modifier pairs can be used together in a method declaration? (Choose all that apply.)
* A. static and final
* B. private and static
* C. static and abstract
* D. private and abstract
* E. abstract and final
* F. private and final

The final modifier can be used with private and static, making options A and F correct.
Marking a private method final is redundant but allowed.
A private method may also be marked static, making option B correct.
Options C, D, and E are incorrect because methods marked static, private, or final cannot be overridden; therefore, they cannot be marked abstract.





