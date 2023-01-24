### In an encapsulated class, instance variables are of ___________ scope and getters/setters are of ____________ scope.
* private, public

### True or false? String is a primitive type.
* False. String is an object type, although Java has built-in support for String literals.

### True or false? If a module doesn’t contain a module-info file, one is automatically generated.
* False



### What is in the StringBuilder created by
```java
System.out.println(new StringBuilder("surprise").insert(3, "!!").replace(1, 3, "-"));?
```
* s-!!prise

### Why is not recommended to modify a loop variable in the body of the loop?
* It could produce side effects or unexpected results if the loop counter or condition is modified directly.

### True or false? Nested loops can only be used with for loops.
False. Other types of loops, such as while and do while, can be used as nested loops.

### True or false? An instance method is allowed to reference a static variable.
* True

### What characters may a variable name end with?
* A letter, number, dollar sign ($), or underscore (_)

### In which situations does the compiler refrain from or report an error trying to insert a default no-argument constructor?
If the class has at least one constructor declared, the compiler will not insert one.
It will also throw an error trying to insert one if the parent class does not define a no-argument constructor for the implicit super() call.

### True or false? In Java, = and == can both be used to test equality.
False. Only == is a test for equality; as = is the assignment operator.

### What is the command line to run the program contained in Wolf.class?
```ssh
java Wolf
```

### List the order of class and instance initialization within a single class.
static variables declarations, static initializers, instance variable declarations, instance initializers, constructors

### Which are immutable: String, StringBuilder, StringBuffer, arrays, or ArrayList?
String is the only immutable class in the list.

### What is the command line used to compile the Java class Wolf.java, and what file does it generate?
```ssh
Run: javac Wolf.java (and it generates Wolf.class)
```

### True or false? Every compiled class has a constructor
True. The compiler will insert a default no-argument constructor if none is explicitly written by the developer.

### True or false? The break or continue statement requires a semicolon when used without optional labels.
True

### True or false? A Java program can use a mix of modular JARs and non-modular JARs.
True

### var can be used as the type for which of the following: instance variable, static variable, local variable, constructor parameter, method parameter?
var can be used only as a local variable. It can also be used as an identifier in variable and package names.

### What functional interface does Java provide that declares a single method that returns a boolean?
Predicate

### What symbols can be used to change the order of operation in Java?
Parentheses, ()