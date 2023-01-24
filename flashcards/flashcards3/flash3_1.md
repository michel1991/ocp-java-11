### How do you call a ServiceLoader to get all services that implement the service provider interface Magic?
* ServiceLoader.load(Magic.class);

### What methods on PreparedStatement can run a DELETE SQL statement?
* executeUpdate() or execute()

### When closing a Statement, what other resources get closed?
ResultSet, if there is one open by the statement

### Which NIO.2 method is used to make a directory, including all paths leading up to the directory?
Files.createDirectories()

### Rewrite this code using a method reference given that a List is passed in: x -> x.isEmpty()
* List::isEmpty

### Which I/O stream class is best suited for reading a text file?
FileReader

### Name a terminal operation that returns an Optional.
* findAny(), findFirst(), min(), or max()

### How do you define an annotation value that can be provided without an element name?
Name the element value() and make sure there are no other elements that have required values.

### What annotation is used to document the reason why a method is deprecated?
The @deprecated Javadoc annotation

### True or false? You must be careful not to print confidential information to System.out, but it is OK to print it to System.err.
False

### True or false? The execute() method is used to submit a Callable task to an ExecutorService
False. The execute() method is for Runnable expressions only.

### True or false? In a JDBC URL, the port is required.
False

### What does executeUpdate() return?
int

### True or false? An instance method that uses the synchronized modifier is equivalent to a method that does not, but instead wraps the body of the method in a synchronized(this) {} block.
True

### Which Collector creates a single String from a Stream?
joining()

### True or false? The absolute path /zoo/data.txt may refer to a file or directory.
True. Directories can have extensions in their names.

### True or false? A class must implement Closeable to be used in a try-with-resources statement.
False. The class must implement AutoCloseable.
While Closeable is supported in try-with-resources statements (since Closeable extends AutoCloseable),
it’s possible to have a class that implements AutoCloseable but not Closeable.

### True or false? If an automatic module name is not specified, Java keeps dashes in the generated name.
False

### Which method should be called before calling mark() on an arbitrary InputStream?
markSupported()

### What three methods taking a lambda as a parameter can you call directly on an ArrayList (without using a stream)?
forEach, removeIf, and replaceAll

### Given an enum Seasons, with values Seasons.FALL, Seasons.WINTER, Seasons.SPRING, and Seasons.SUMMER and a switch statement that uses this enum, what format should the case values be in?
They should be written without the enum name, such as case FALL, not case Seasons.FALL, which does not compile.

### How do you mark an annotation element as optional?
Provide a non-null constant value with the default modifier.

### What are the requirements to apply the @SafeVarargs annotation to a declaration?
It can be applied only to a method containing a varargs parameter and not capable of being overridden (it must be marked private, static, or final).

### What type of module is on the module path but does not have a module-info.java file?
Automatic module

### __________ is an attack to trick a database query into doing something unexpected.
SQL injection

### Which java.io.File method is used to create a single directory?
mkdir()

### What character is used to separate the three main parts of a JDBC URL?
: (colon)

### Which of these have a return type of Stream: source, intermediate operation, terminal operation?
Source and intermediate operation

### Name the four abstract base I/O stream classes.
InputStream, OutputStream, Reader, Writer

### What method in Thread is used to spawn an asynchronous task?
start()