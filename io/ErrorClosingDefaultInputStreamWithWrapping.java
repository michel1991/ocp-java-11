package io;
import java.io.*;

/**
* The program compiles, so options C and D are incorrect.
* The r variable refers to System.in, which is closed by the try-with-resources statement that ends on line 15.
* Therefore, the program produces an IOException on line 16, making option E correct.
 */
public class ErrorClosingDefaultInputStreamWithWrapping {
      public static void main(String... args) throws Exception {
       var r = new BufferedReader(new InputStreamReader(System.in));
       var w = new BufferedWriter(new OutputStreamWriter(System.out));
       try (r) {
           w.write("What is your name? ");
           w.flush();
           r.readLine();
           w.write("Thank you!");
           w.write("Press enter to exit");
           w.flush();
       }
       System.in.read();
   }
}