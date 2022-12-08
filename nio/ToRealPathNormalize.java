package nio;
import java.nio.file.*;
import java.io.*;
public class ToRealPathNormalize {
    /**
    * Assume the current directory is /bats/day and all of the files and directories referenced exist. What is the result of executing the following code?
    *   A. true true
        B. true false
        C. false true
        D. false false
        E. The code does not compile.
        F. The code compiles but throws an exception at runtime.

      The code compiles and runs without issue, so options E and F are incorrect.
      First, path1 simplifies to /bats/sleep.txt after the path symbols have been removed and the normalize() method applied.
      The path2 variable using the current directory of /bats/day is assigned a path value of /bats/sleep.txt.
      The toRealPath() method will also remove path symbols.
      Since the file Path objects represent the same path within the file system, they will return true for both equals() and isSameFile(), making option A correct.
      For more information, see Chapter 9.

     */
   static void compare() throws IOException{
       var path1 = Path.of("/bats/night","..")
       .resolve(Paths.get( "./sleep.txt")).normalize();
       var path2 = new File("../sleep.txt").toPath().toRealPath();
       System.out.print(Files.isSameFile(path1,path2));
       System.out.print(" " + path1.equals(path2));
   }

    public static void main(String... args) throws IOException{

    }
}