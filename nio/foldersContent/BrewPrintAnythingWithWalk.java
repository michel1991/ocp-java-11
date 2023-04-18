package nio.foldersContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class BrewPrintAnythingWithWalk {
  
  /**
     Which statement about the following method is correct?
      Assume the directory coffee exists and is able to be read.
      
      A. It does not compile.
      B. It compiles but does not print anything at runtime.
      C. It compiles and prints true exactly once at runtime.
      D. It compiles and prints true at least once.
      E. The answer cannot be determined without knowing the contents of the directory.
      F. None of the above.
     
     The method compiles, so option A is incorrect. The method reads all of the elements of a directory tree,
      keeping only directories. The forEach() method does not print anything, though, making option B correct.
      If the lambda in the forEach() method was modified to print something,
      such as s -˃ System.out.println(Files.isDirectory(s)),
      then it would print true at least once for the coffee directory.
      It would then print true for each directory within the directory tree.
   */
  static void brew() throws Exception {
    final var m = Path.of("coffee");
    Files.walk(m)
      .filter(Files::isDirectory)
      .forEach(Files::isDirectory);
  }
  
  public static void main(String... args) throws Exception{
    brew();
  }
}