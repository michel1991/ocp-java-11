package nio.isSame;
import java.io.*;
import java.nio.file.*;

/**
   What is the result of compiling and executing the following program?
   Assume the current directory is /stock and the path /stock/sneakers
   does not exist prior to execution.
   
    A. The directory /stock/sneakers is created.
    B. Line j1 does not compile or produces an exception at runtime.
    C. Line j2 does not compile or produces an exception at runtime.
    D. Line j3 does not compile or produces an exception at runtime.
    E. None of the above.
    
    First, the class compiles without issue.
    It is not without problems, though. The Files.isSameFile() method call
    on line j1 first checks if the Path values are equivalent in terms of equals().
    One is absolute, and the other is relative, so this test will fail.
    The isSameFile() method then moves on to verify that the
    two Path values reference the same file system object. Since we know the directory does not exist,
    the call to isSameFile() on line j1 will produce a NoSuchFileException at runtime,
    making option B the correct answer.
    
 */
class Sneaker {
    public void setupInventory(Path d) throws Exception {
        Path suggestedPath = Paths.get("sneakers");
        if(Files.isSameFile(suggestedPath, d)           // j1
           && !Files.exists(suggestedPath))
            Files.createDirectories(d);                  // j2
    }
    public static void main(String[] socks) throws Exception {
        Path w = new File("/stock/sneakers").toPath();  // j3
        new Sneaker().setupInventory(w);
    }
}


public class SneakerIsSameMethod {
  
}