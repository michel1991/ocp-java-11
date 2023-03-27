package io.errors;
import java.io.*;
import java.util.*;

public class ScannerVariableScope {

    /**
      Assuming Scanner is a valid class that implements AutoCloseable, what is the expected output of the following code?
        A. 1245
        B. 125
        C. 1234 followed by a stack trace
        D. 124 followed by a stack trace
        E. Does not compile
        F. None of the above

        The code does not compile because s is defined within the try-with-resources block.
        It is out of scope by the time it reaches the catch and finally blocks, making option E correct.


     */
   static void scan(){
       try (Scanner s = new Scanner(System.in)) {
           System.out.print(1);
           s.nextLine();
           System.out.print(2);
           s = null;
       } catch (IllegalArgumentException | NullPointerException x) {
           s.nextLine();
           System.out.print(3);
       } finally {
           s.nextLine();
           System.out.print(4);
       }
       System.out.print(5);
   }
}