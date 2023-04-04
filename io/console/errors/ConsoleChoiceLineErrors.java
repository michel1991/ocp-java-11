package io.console.errors;
import java.io.*;

public class ConsoleChoiceLineErrors {
    /**
     * Which statements about the following code are true? (Choose all that apply.)
        A. The code will not compile because of line 4.
        B. The code will not compile because of line 6.
        C. The code will not compile because of line 7.
        D. The code will not compile because of line 8.
        E. Even if the lines of code that do not compile were corrected, the code may throw a NullPointerException at runtime.
        F. The code compiles and does not generate any exceptions at runtime.

        On line 7, the readPassword() method returns a char[], not a String.
        This is the only line that does not compile, so option C is correct.
        Even if this code were fixed, the code might throw a NullPointerException at runtime,
        as line 5 fails to check if console is null before using it. For this reason, option E is also correct.
     */
  static void findErrors(){
      Console console = System.console(); //  4:
      var w = console.writer(); //  5:
      try (w) { //  6:
          String secret = console.readPassword("Secret %d: ", 5); //  7:
          w.format("Your secret: " + secret + "%n"); //  8:
      } //   9:
  }
}