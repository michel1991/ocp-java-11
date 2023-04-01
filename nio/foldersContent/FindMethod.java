package nio.foldersContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class FindMethod {
    /**
    *  Assume /monkeys exists as a directory containing multiple files, symbolic links, and subdirectories. Which statement about the following code is correct?
        A. It will print all symbolic links in the directory tree ending in .txt.
        B. It will print the target of all symbolic links in the directory ending in .txt.
        C. It will print nothing.
        D. It does not compile because of line y1.
        E. It does not compile because of line y2.
        F. It compiles but throws an exception at runtime.

     The code compiles and runs without issue, so options D, E, and F are incorrect.
     The most important thing to notice is that the depth parameter specified as the second argument to find() is 0,
     meaning the only record that will be searched is the top-level directory.
     Since we know that the top directory is a directory and not a symbolic link, no other paths will be visited, and nothing will be printed.
     For these reasons, option C is the correct answer.
     */
  static void printNothing() throws IOException{
      var f = Path.of("/monkeys");
      try (var m =
        Files.find(f, 0, (p,a) -> a.isSymbolicLink())) { // y1
          m.map(s -> s.toString())
          .collect(Collectors.toList())
          .stream()
          .filter(s -> s.toString().endsWith(".txt")) // y2
          .forEach(System.out::println);
      }

  }
}