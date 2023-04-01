package nio.isSame;
import java.nio.file.*;
import java.io.*;

public class IsSameFileCallNormalize {
  /**
  * Assuming the directories and files referenced exist and are not symbolic links, what is the result of executing the following code?
      A. true true true
      B. false false false
      C. false true false
      D. true false true
      E. true false false
      F. The code does not compile.

    The code compiles and runs without issue, so option F is incorrect.
    If you simplify the redundant path symbols, then p1 and p2 represent the same path, /lizard/walking.txt.
    Therefore, isSameFile() returns true. The second output is false, because equals()checks only if the path values are the same, without reducing the path symbols.
    Finally, the normalized paths are the same, since all extra symbols have been removed, so the last line outputs true. For these reasons, option D is correct.

   */
  static void compare() throws IOException{
      var p1 = Path.of("/lizard",".")
      .resolve(Path.of("walking.txt"));
      var p2 = new File("/lizard/././actions/../walking.txt").toPath();
      System.out.print(Files.isSameFile(p1,p2));
      System.out.print(" ");
      System.out.print(p1.equals(p2));
      System.out.print(" ");
      System.out.print(p1.normalize().equals(p2.normalize()));
  }

    public static void main(String... args) throws IOException{
      compare();
     }
}