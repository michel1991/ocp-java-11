package io.closeStream.errors;
import java.io.*;
import io.PathUtility;

/**
 *  Assuming the file path referenced in the following
    class is accessible and writable,
    what is the output of the following program? (Choose two.)
    
    A. 1
    B. 23
    C. 13
    D. The code does not compile.
    E. If the code compiles or the lines that do not compile are fixed, then the last value output is 3.
    F. If the code compiles or the lines that do not compile are fixed, then the last value output is not 3.
    
    BufferedWriter is a wrapper class that requires an instance of Writer
    to operate on. Since FileOutputStream does not inherit Writer,
     the code does not compile, and option D is correct.
     If FileWriter was used instead of FileOutputStream,
     then the code would compile without issue and print 1.
     The try-with-resources statement closes System.out
     before the catch or finally blocks are called.
     When the finally block is executed, the output has nowhere to go,
     which means the last value of 3 is not printed, making option F correct.
 */
public class IceCreamBadClassUsingAndCloseOutPut {
   public static void main(String... ars) throws Exception{
       String fn = "icecream.txt";
       try (var w = new BufferedWriter(new FileOutputStream(fn));
     var s = System.out) {
           w.write("ALERT!");
           w.flush();
           w.write('!');
           System.out.print("1");
       } catch (IOException e) {
           System.out.print("2");
       } finally {
           System.out.print("3");
       }
   }
}