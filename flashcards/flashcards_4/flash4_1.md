### Name a terminal operation that can always terminates on an infinite stream.
* findAny() or findFirst()

### When closing a ResultSet, what other resources get closed?
None

### What is the name for an undesirable result when two tasks that should be completed sequentially are completed at the same time?
Race condition

### Which I/O stream class is best suited for writing binary data to a file?
FileOutputStream

### What does executeQuery() return?
ResultSet

### What method do you need to implement in a Comparator, and how many parameters does it take?
compare(), and it takes two parameters

### Rewrite this code using a method reference: w -> l.contains(w)
l::contains

### True or false? All methods in Java can be cloned successfully.
False

### When working with the MessageFormat class, what is the syntax for parameterized values in text strings?
A number, surrounded by braces {}, indicating the numeric order the parameter is provided

### What is the name of the technique for applying multiple preventative techniques to the same problem?
Defense in depth

### Given a Path instance p, how do you find out the directory that contains p?
p.getParent()

### Which functional interface takes two parameters and returns a boolean?
BiPredicate<T,U>

### What is the result of calling Paths.get("/sing/../song.txt/./piano").normalize()?
/song.txt/piano

### Which intermediate operation is used for debugging a finite stream?
peek()

### Given an outer class Rooster and its inner class Wattle, how would you create an instance of Wattle within an instance method of Rooster?
new Wattle()

### Which of these can exist multiple times in a stream pipeline: source, intermediate operation, terminal operation?
Intermediate operation

### Which two methods used in serialization and deserialization return an object instead of void?
readResolve() and writeReplace()

### What is the purpose of using a try-with-resources statement?
It ensures resources like files and database connections are properly closed at the conclusion of the try section.

### Which annotation causes a class to generate Javadoc with its annotation type information?
@Documented

### What is printed if you fail to catch an unchecked exception?
A stack trace

### Which of these are evaluated immediately after the method rather than participating in deferred execution: source, intermediate operation, terminal operation?
Terminal operation

### True or false? It is a good idea to catch Throwable in your code.
False. Since Error is a subtype of Throwable and Error should never be caught, it is not a good idea to catch Throwable.

### What are the similarities and differences between the ExecutorService methods shutdown() and shutdownNow()?
Both shutdown() and shutdownNow() will cause an ExecutorService to stop accepting new tasks.
Unlike the shutdown() method, the shutdownNow() will attempt to stop all previously submitted tasks.

### Fill in the blank to make this code compile:
``` java
 List<______ Number> listOfNumbers = new ArrayList<Integer>();
```
? extends (this is an upper bound)

### What property do you specify in the manifest of an automatic module to provide the name that will be used after conversion to a named module?
Automatic-Module-Name

### What type of module is on the classpath?
Unnamed module

### Given an interface Cat with a default method meow(), what is the syntax for accessing this default method within a class that implements Cat, assuming that class may override the method?
Cat.super.meow()

### Which ElementType passed with @Target allows an annotation to be applied to a cast operation and object creation with new?
ElementType.TYPE_USE

### In a bottom-up migration of three modules, how many modules are on the module path after migrating the first module?
One

### When deserializing an instance member that was marked transient, what will it be set to?
The default Java type will be used, such as 0 for int, 0.0 for double, or null for String or Object. 