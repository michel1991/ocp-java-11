#### Which of the following statements are true regarding the try-with-resources statement?
* A. AutoCloseable's close method throws IOException while Closeable's close method throws Exception.
    Just the reverse is true.

* B. Resources are closed in the reverse order of their declaration in the try clause (or creation, if they are created in the try clause).
For example:
```
Resource someR = //create resource somehow
try (
        ZipFile resource1 = new ZipFile(zipFileName);  
        BufferedWriter resource2 = Files.newBufferedWriter(path, charset);
        someR
    ) {
        ...
    }
Here, someR will be closed first because it appears last in the try clause. Further, resource2 will be closed before resource1.
```

* C. AutoCloseable extends Closeable.
Just the reverse is true. Closeable extends AutoCloseable

* D. AutoCloseable's close() does not declare any throws clause.
It does. It throws java.lang.Exception.

* E. Closeable's close() does not declare any throws clause while AutoCloseable's close() throws Exception.

Correct(B)

You need to know the following points regarding try-with-resources statement for the exam:
1. The resource class must implement java.lang.AutoCloseable interface. Many standard JDK classes such as implement
java.io.Closeable interface, which extends java.lang.AutoCloseable. 
2. AutoCloseable has only one method - public void close() throws Exception.
3. Resources are closed at the end of the try block and before any catch or finally block.
4. Resources are not even accessible in the catch or finally block. For example:
```
 try(Device d = new Device())
    {
        d.read();
    }finally{
        d.close(); //This will not compile because d is not accessible here.
    }
``` 


Note that the try-with-resource was enhanced in Java 9 and it now allows you to use a variable declared before the try statement
in the try-with-resource block. In this case, of course, the variable is accessible after the try block but the object referred to by it has been closed.
For example, the following is valid since Java 9:

```
Device d = new Device();
try(d){ //valid since Java 9
...
}finally{
    d.close(); //this will compile but may not work correctly because the object referred to by d has already been closed.
}
```

5. Resources are closed in the reverse order of their declaration (or creation) in the try clause.
6. Resources are closed even if the code in the try block throws an exception.
7. java.lang.AutoCloseable's close() throws Exception but java.io.Closeable's close() throws IOException.
8. If code in try block throws exception and an exception also thrown while closing is resource,
the exception thrown while closing the resource is suppressed. The caller gets the exception thrown in the try block.