package nio.errors;
import java.nio.file.*;
import java.io.*;
public class RememberMethodReturnType {
    /**
    * The return type of Files.delete() is void, which means this method will not compile regardless of what is placed in the blanks,
    * making option G correct. The Files.deleteIfExists() method does return a boolean value, but that is not the method used on line 7.
    * Independently, line 6 will compile if Stream<String> is used, while line 8 will compile if List<String> is used.
     */
    static void swim() throws IOException {
        Path p = Path.of("shark.txt").toAbsolutePath();
           var t1 = Files.lines(p); // --------------
           var t2 = Files.delete(p); // -------------
          var  t3 = Files.readAllLines(p); // ____________
     }

    public static void main(String... args){

   }
}