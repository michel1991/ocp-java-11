package nio.errors;
import java.nio.file.*;
import java.io.*;


/**
    Assume the Path value sent to the NIO.2 Files.find() method exists as a directory.
    Which statements about the following code snippet are correct? (Choose all that apply.)

    A. A list of files is printed.
    B. A list of directories is printed.
    C. An exception is printed at runtime.
    D. Line n1 contains a compiler error.
    E. Line n2 contains a compiler error.
    F. Line n3 contains a compiler error.
    G. Line n4 contains a compiler error.

    This code does not compile for a number of reasons. First, the Files.find() method takes three arguments.
    Without a search depth parameter, line n2 does not compile.
    Next, toRealPath() declares IOException, which is not handled by the lambda expression, so line n3 does not compile.
    Finally, the result of the operation on line n3 creates a Stream<String>, not Stream<Path>, so the lambda expression on line n4 does not compile.
 */
public interface InvalidFindDeclaration {
    public static find(){
        var path = Paths.get("/storage","toys").resolve("bird"); // n1
        Files.find(path, (p,a) -> a.isDirectory())  // n2
            .map(p -> p.toRealPath().toString()) // n3
            .map(p -> p.normalize()) // n4
            .forEach(System.out::print);
    }
   public static void main(String... args){

   }
}