package io.runtime;
import java.io.*;

/**
    What is the expected result of interacting with the following program?

    A. The program asks your name, prints the name back, and then exits without error when the Enter key is pressed.
    B. The program asks your name, prints a message, and then exits without error when the Enter key is pressed.
    C. The program does not compile because of line 8.
    D. The program does not compile because of line 11.
    E. The program compiles but throws an exception at runtime.
    F. None of the above, as the program does not compile for a different reason.

     The program compiles, so options C and D are incorrect.
    The r variable refers to System.in, which is closed by the try-with-resources statement that ends on line 15.
    Therefore, the program produces an IOException on line 16, making option E correct.
 */
class UserForm { //2
    public static void main() throws Exception { //3
        var r = new BufferedReader( //4
                new InputStreamReader(System.in)); //5
        var w = new BufferedWriter( //6
                new OutputStreamWriter(System.out)); //7
        try (r) { //8
            w.write("What is your name? "); //9
            w.flush(); //10
            r.readLine(); //11
            w.write("Thank you!"); //12
            w.write("Press enter to exit"); //13
            w.flush(); //14
        } //15
        System.in.read(); //16
    }
}

public class ClosingDefaultInputStreamWithWrapping {
      public static void main(String... args) throws Exception {
   }
}