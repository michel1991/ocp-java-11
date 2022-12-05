package nio.runtime;
import java.nio.file.*;
import java.io.*;

/**
*  What are possible results of executing the following code snippet?
*
    A. All of the lines of a file are printed.
    B. Every other line of the file is printed.
    C. The program hangs with an infinite loop at runtime.
    D. An exception is thrown at runtime.
    E. None of the above, as the code does not compile.

    The code compiles without issue, so option E is incorrect.
    If the file pointed to by the path does not exist, an exception will be thrown, so option D is correct.
    The loop is not infinite, because readLine() exhausts one line per iteration, so option C is incorrect.
    Options A and B are incorrect because the s variable is not assigned on each loop iteration, so the loop will print null for each line of the file.
 */
public class ReadFileIfNotSpecifyFileExist {
   public static void readFile() throws IOException{
       var path = Path.of("/zoo/gorilla.txt");
       try (BufferedReader reader = Files.newBufferedReader(path)) {
           String s = null;
           while(reader.readLine() != null)
               System.out.println(s);
       }
   }

    public static void main(String... args){

   }
}