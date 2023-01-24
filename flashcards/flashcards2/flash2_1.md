### How are numeric and String values evaluated when used together in a set of concatenation operations?
Excluding overriding order of operation with parentheses, the values are evaluated from left to right.
If the two values are both numbers, then they are added together.
If one of the two values is a String, then the numeric value is converted to a String,
and string concatenation is performed on the two values.

### Which variables are in scope for the entire program: class, local, or instance?
* Class

### Suppose you have a child class that overrides a method and has a return type of ArrayList<String>. What possible return type (or types) does the method it is overriding have?
Any supertype of ArrayList is valid, such as List<String> or Collection<String>.
It could also be the same type, ArrayList<String>. The generic type String must be the same, though.

### How many exceptions can a method declare?
Zero to many exceptions can be declared; there is no set limit.

### What parameter types are allowed in a main() method?
* String[] or String...

### What is the maximum number of nested loops an expression can have?
There is no set limit.

### What class contains the min() and max() methods, for which the package containing the class is automatically imported into every Java program?
* java.lang.Math

### What must appear immediately before a method name?
The return type

### Which of the following are reserved words in Java? not, super, try, again, news, triple, synchronize
super, try

### What method removes a character within a StringBuilder object?
deleteCharAt()

### What aspects of the following statement are invalid?
    ``` java
       Consumer p = (p) -> {int var = 3; var++; return;};
    ```

The p variable is reused inside the lambda expression. The rest of the statement is valid.

### What common interface can this lambda expression by assigned to?
``` java
    pi -> System.out.println()
```
Consumer, as it takes a generic value and returns void

## True or false? A switch statement can use a var, provided the var is marked final.
False. A switch statement can use a var, provided the var resolves to one of the acceptable switch expression types.


### What specific exception class is thrown when a number is divided by zero?
ArithmeticException

### Which of the following are valid literals?
``` java
 double d1 =1_234; double d2 = 5_.6; double d3 = 7_8.9_0; double d4 =1.0_;
```
Only 1_234 and 7_8.9_0 are valid literals. The other two have an underscore (_) next to a decimal or at the end of the value.

### Describe the parts of a traditional for loop.
A traditional for loop contains three parts:
an initialization block called at the start of the loop,
a conditional statement used to determine whether the loop should continue,
and an update statement called after each iteration of the loop body.

### What method is used to remove all elements of a List or ArrayList?
clear()

### How do you create an instance of an interface?
You must first define a class that implements the interface and then instantiate the class.

### What does System.out.println(1 + 2 + "3" + 4 + 5); print?

3345. It is evaluated as 1 + 2 becomes 3, then 3 + "3" becomes "33",
then "33" + 4 becomes "334", and finally "334" + 5 becomes "3345".
The quotes aren’t printed.

### True or false? For inherited methods of the parent class, both super and this can be used interchangeably within a child class to access a method, assuming the child class does not override it.
True

### What is the short and long form of the jar command option used to make a new JAR file?
* -c and --create

### What is the name of the option available to set an output directory in a javac command?
* -d

### What parameter type does Collection forEach() take?
* Consumer<T>

### True or false? The type of var is known at compile time.
* True

### What is the type of myData in the following statements?
``` java
  List data = new ArrayList<String>(); for(var myData : data) {}
```
The type is Object, as List does not include a generic argument

### What is a redundant package import?
A package import that is unnecessary. Removing the import does not prevent the code from compiling.

### Describe the parts of a for-each loop.
A for-each loop contains two parts: a variable declaration (type and name)
and an object to iterate over, which can be an array or class that implements java.lang.Iterable.

### What is the syntax for declaring an abstract method?
The method declaration contains the abstract keyword, and the method body
{} is replaced with a semicolon (;) indicating the implementation is omitted.

### How many default statements can a switch statement contain?
A switch statement can have zero or one default statements.