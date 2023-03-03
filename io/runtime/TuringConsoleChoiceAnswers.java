package io.runtime;
import java.io.*;

/**
   What may be the result of executing the following program?
    A. The program asks the user a question and prints the results to the error stream.
    B. The program throws a NullPointerException at runtime.
    C. The program does not terminate.
    D. All of the above.
    E. The class does not compile.

    The statements in options A, B, and C are each correct, making option D correct.
    If System.console() is available, then the program will ask the user a question and then print the response to the error stream.
    On the other hand, if System.console() is not available, then the program will exit with a NullPointerException.
    It is strongly recommended to always check whether System.
    console() is null after requesting it.
    Finally, the user may choose not to respond to the program’s request for input, resulting in the program hanging indefinitely.

 */
public class TuringConsoleChoiceAnswers {
    public static void main(String... robots) {
        Console c = System.console();
        final String response = c.readLine("Are you human?");
        System.err.print(response);
    }
}