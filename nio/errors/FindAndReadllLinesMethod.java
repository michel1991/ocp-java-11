package nio.errors;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;


public class FindAndReadllLinesMethod {

    /**
       Assume the file /gorilla/signs.txt exists within the file system.
       Which statements about the following code snippet are correct? (Choose all that apply.)

        A. Nothing is printed.
        B. All of the .txt files and directories in the directory tree are printed.
        C. All of the words in signs.txt are printed.
        D. Line k1 contains a compiler error.
        E. Line k2 contains a compiler error.
        F. Line k3 contains a compiler error.
        G. Line k4 contains a compiler error.

        The code contains multiple compiler errors. First,
        the second parameter of Files.find() takes an int depth limit,
        not double, so line k1 does not compile.
        Next, the lambda expression on line k2 does not compile.
        The parameter must be of type BiPredicate<Path,BasicFileAttributes>.
        Finally, readAllLines() on line k3 returns a List<String>,
        not a Stream<String>, resulting in line k4 not compiling.
        For this code to compile, the Files.lines() method should be used.
        If the code was corrected, then the first stream operation would print all
        of the files and directories that end with .txt in the directory tree up to a depth limit of 10.
        The second stream operation would print each word in the sign.txt as lowercase on a separate line.
        For more information, see Chapter 9.
     */
  static void findErrors(){
      var x = Path.of("/gorilla/signs.txt");
      Files.find(x.getParent(), 10.0, // k1
                 (Path p) -> p.toString().endsWith(".txt")) // k2
       .collect(Collectors.toList())
       .forEach(System.out::println);

          Files.readAllLines(x) // k3
       .flatMap(p -> Stream.of(p.split(" "))) // k4
       .map(s -> s.toLowerCase())
       .forEach(System.out::println);
  }
}