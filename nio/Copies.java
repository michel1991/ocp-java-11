package nio;
import java.nio.file.*;
import java.io.*;

public class Copies {
    /**
    * For the copy() method shown here, assume that the source exists as a regular file and that the target does not. What is the result of the following code?
        A. It will output false.
        B. It will output true.
        C. It does not compile because of line k1.
        D. It does not compile because of line k2.
        E. None of the above

       The code compiles and runs without issue, so options C, D, and E are incorrect.
       Even though the file is copied with attributes preserved, the file is considered a separate file, so the output is false, making option A correct and option B incorrect.
       Remember, isSameFile() returns true only if the files pointed to in the file system are the same, without regard to the file contents.
     */
  static void copyWithStandardCopyOption() throws IOException{
        var p1 = Path.of(".","/","goat.txt").normalize(); // k1
        System.out.println(p1);
        var p2 = Path.of("mule.png");
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES); //k2
        System.out.println(Files.isSameFile(p1, p2));
  }

    public static void main(String... args) throws IOException{
        copyWithStandardCopyOption();
    }
}