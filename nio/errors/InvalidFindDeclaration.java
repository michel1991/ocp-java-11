package nio.errors;
import java.nio.file.*;
import java.io.*;



public interface InvalidFindDeclaration {

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

        This code does not compile for a number of reasons.
        First, the Files.find() method takes three arguments.
        Without a search depth parameter, line n2 does not compile.
        Next, toRealPath() declares IOException,
        which is not handled by the lambda expression,
        so line n3 does not compile.
        Finally, the result of the operation on line n3 creates a Stream<String>,
        not Stream<Path>, so the lambda expression on line n4 does not compile.
 */
    public static void find(){
        var path = Paths.get("/storage","toys").resolve("bird"); // n1
        Files.find(path, (p,a) -> a.isDirectory())  // n2
            .map(p -> p.toRealPath().toString()) // n3
            .map(p -> p.normalize()) // n4
            .forEach(System.out::print);
    }

    /**
       Which statement about the following method is correct?
       Assume the directory /tea/earlGrey/hot exists and is able to be read.

        A. It does not compile.
        B. It compiles but does not print anything at runtime.
        C. It compiles and prints true exactly once at runtime.
        D. It compiles and prints true at least once.
        E. The answer cannot be determined without knowing the contents of the directory.
        F. None of the above.

        The Files.find() method requires a maxDepth value as the second parameter.
        Since this parameter is missing, the method does not compile,
        and option A is correct.
        If a maxDepth parameter was added,
        then the method would compile
        but not print anything at runtime since the stream
        does not include a terminal operation.
     */
    static void order() throws Exception {
        var s = Path.of("/tea","earlGrey","hot");
        Files.find(s, (p,a) -> a.isDirectory());
    }

   public static void main(String... args){

   }
}