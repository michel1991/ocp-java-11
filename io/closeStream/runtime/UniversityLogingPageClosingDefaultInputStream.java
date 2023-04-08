package io.closeStream.runtime;
import java.io.*;

/**
* How many lines of the following program contain compiler errors?
    A. One
    B. Two
    C. Three
    D. Four
    E. Zero, but produces an exception at runtime after the user enters their email
    F. Zero, and completes without producing an exception after the user enters their email

   The code compiles without issue. Since Java 9,
   it is possible to use resources that are created before the try-with-resources declaration.
   The try-with-resources statement closes the Reader created on line 4,
   along with the underling stream, in this case System.in.
   Once System.in has been closed, it cannot be read again.
   Therefore, the program throws an IOException: Stream closed on line 12, making option E the correct answer.
 */

class UniversityLoginPage { // 2:
    public static void main() throws Exception { // 3:
        var reader = new BufferedReader( //  4:
                new InputStreamReader(System.in)); //   5:
        try(reader) { //  6:
            System.out.print("Email: "); //   7:
            final String email = reader.readLine(); //    8:
            System.out.println("You entered: "+email); //    9:
        } //   10:
        System.out.println("Press any key to continue"); //  11:
        System.in.read(); //  12:
        System.out.println("Thank you!"); //  13:
    } //  14:
} //   15:
public class UniversityLogingPageClosingDefaultInputStream {
    public static void main(String... args) throws Exception {
        UniversityLoginPage.main();
    }
}