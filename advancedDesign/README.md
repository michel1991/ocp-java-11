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

### Which of the following statements about var are true? (Choose all that apply.)
*  A. A var can be used as a constructor parameter.
*  B. The type of var is known at compile time.
*  C. A var cannot be used as an instance variable.
*  D. A var can be used in a multiple variable assignment statement.
*  E. The value of var cannot change at runtime.
*  F. The type of var cannot change at runtime.
*  G. The word var is a reserved word in Java.

A var cannot be used for a constructor or method parameter or for an instance or class variable, making option A incorrect and option C correct.
The type of var is known at compile time and the type cannot be changed at runtime, although its value can change at runtime.
For these reasons, options B and F are correct, and option E is incorrect.
Option D is incorrect, as var is not permitted in multiple-variable declarations. Finally, option G is incorrect, as var is not a reserved word in Java.

## Which of the following statements about the Callable call() and Runnable run() methods are correct? (Choose all that apply.)
*  A. Both can throw unchecked exceptions.
*  B. Callable takes a generic method argument.
*  C. Callable can throw a checked exception.
*  D. Both can be implemented with lambda expressions.
*  E. Runnable returns a generic type.
*  F. Callable returns a generic type.
*  G. Both methods return void.

All methods are capable of throwing unchecked exceptions, so option A is correct.
Runnable and Callable statements both do not take any arguments, so option B is incorrect.
Only Callable is capable of throwing checked exceptions, so option C is also correct.
Both Runnable and Callable are functional interfaces that can be implemented with a lambda expression, so option D is also correct.
Finally, Runnable returns void and Callable returns a generic type, making option F correct and making options E and G incorrect.

### Which of the following are legal commands to run a modular program? (Choose all that apply.)
*  A. java -p x -m x/x
*  B. java -p x-x -m x/x
*  C. java -p x -m x-x/x
*  D. java -p x -m x/x-x
*  E. java -p x -m x.x
*  F. java -p x.x -m x.x
*  G. None of the above

The -p specifies the module path. This is just a directory, so all of the options have a legal module path.
The -m specifies the module, which has two parts separated by a slash. Options E and F are incorrect since there is no slash.
The first part is the module name. It is separated by periods (.) rather than dashes (-), making option C incorrect.
The second part is the package and class name, again separated by periods. The package and class names must be legal Java identifiers.
Dashes (-) are not allowed, ruling out option D. This leaves options A and B as the correct answers.

### Which of the following is true about a concrete class? (Choose all that apply.)
* A. A concrete class can be declared as abstract.
* B. A concrete class must implement all inherited abstract methods.
* C. A concrete class can be marked as final.
* D. If a concrete class inherits an interface from one of its superclasses, then it must declare an implementation for all methods defined in that interface.
* E. A concrete method that implements an abstract method must match the method declaration of the abstract method exactly.

Concrete classes are, by definition, not abstract, so option A is incorrect.
A concrete class must implement all inherited abstract methods, so option B is correct.
Concrete classes can be optionally marked final, so option C is correct.
Option D is incorrect; a superclass may have already implemented an inherited interface method.
The concrete class only needs to implement the inherited abstract methods.
Finally, a method in concrete class that implements an inherited abstract method overrides the method.
While the method signature must match, the method declaration does not need to match, such as using a covariant return type or changing the throws declaration.
For these reasons, option E is incorrect.

### Which of the following data types are permitted on the right side of a for-each expression? (Choose all that apply.)
* A. Double[][]
* B. Object
* C. Map
* D. List
* E. String
* F. char[]
* G. Exception
* H. Set

A for-each loop supports arrays, making options A and F correct. For Double[][], each element of the for-each loop would be a Double[].
A for-each also supports classes that implement java.lang.Iterable.
Although this includes many of the Collection Framework classes, not all of them implement java.lang.Iterable.
For this reason, option C is incorrect, and options D and H are correct.
Options B, E, and G are incorrect, as they do not implement java.lang.Iterable.
Although a String is a list of ordered characters, the class does not implement the required interface for a for-each loop.

### java ______ library.jar MainClass.class
*  A. -cp
*  B. -classpath
*  C. -class-path
*  D. --classpath
*  E. --class-path
*  F. None of the above

When running the java command, you pass the name of the class rather than the name of the class file.
If you are using the single-file source-code feature, you use the name of the Java file.
Since none of the options accepts the class filename, option F is correct.

### Which of the following are true? (Choose all that apply.)
*  A. A class variable of type boolean defaults to 0.
*  B. A class variable of type boolean defaults to false.
*  C. A class variable of type boolean defaults to null.
*  D. A class variable of type long defaults to null.
*  E. A class variable of type long defaults to 0L.
*  F. A class variable of type long defaults to 0.
*  G. None of the above

Option B is correct because boolean primitives default to false. Option E is correct because long values default to 0L.

### Which access modifiers can be applied to member inner classes? (Choose all that apply.)
* A. static
* B. public
* C. default (package-private)
* D. final
* E. protected
* F. private

Member inner classes, including both classes and interfaces, can be marked with any
of the four access modifiers: public, protected, default (package-private), or private.
For this reason, options B, C, E, and F are correct.
Options A and D are incorrect as static and final are not access modifiers.



