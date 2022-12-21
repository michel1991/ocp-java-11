package io;
import java.io.*;
import java.nio.file.*;

public class CallReadLineTwice {


    /**
        Question: Assuming zoo.csv is a multiline text file, what is true of the following code snippet?

        A. It prints only the first line.
        B. It prints the entire contents of the file.
        C. It may print null on certain files.
        D. This code compiles but contains a resource leak.
        E. The code compiles but throws a NullPointerException at runtime.
        F. F. None of the above.

        The code compiles and correctly closes resources with a try-with-resources statement, so option D is incorrect.
        At first glance, the code appears to print every line of the file, but it contains a bug.
        The readLine() method is called twice on every iteration of the loop, so the code actually skips the first line and outputs every other line after that,
        so options A and B are incorrect. On files with an odd number of lines, this will cause the last statement printed to be null, making option C correct.
        Option E is incorrect, as System.out.print() is capable of printing null values.
     */
   static void readLine() throws IOException{
       String rootPath = System.getProperty("user.dir");
       Path path = Path.of(rootPath, "io", "callReadLineTwice.txt");
       PrintStream defaultOutPut = System.out;
       try( var fileReader = new FileReader(path.toFile());
            var bufferedReader = new BufferedReader(fileReader) ){
           while(bufferedReader.readLine() != null){
               defaultOutPut.append(bufferedReader.readLine());
              // System.out.print(bufferedReader.readLine());
           }
           System.out.flush();
       }
   }

    public static void main(String... args)  throws IOException{
       readLine() ;
   }
}