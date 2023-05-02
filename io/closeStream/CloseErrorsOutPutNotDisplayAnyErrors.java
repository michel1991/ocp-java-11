package io.closeStream;
import java.io.*;

public class CloseErrorsOutPutNotDisplayAnyErrors {
    /**
     * Given the following application, in which a user enters bone twice, what is the expected result?
        A. The program completes after printing a message once.
        B. The program completes after printing a message twice.
        C. An IOException is thrown.
        D. The program prints an exception because the format of the String on line v1 is invalid.
        E. A NullPointerException is thrown since System.in may be unavailable.
        F. None of the above as the code does not compile.
        
        First, the code compiles. The format of the String on line v1 is valid, making option D incorrect.
        While System.console() throws a NullPointerException if it is not available,
        System.in does not, making option E incorrect.
        The first part of the code runs without issue, printing a message such as bone fetched in 1.8 seconds.
        The I/O stream System.in is closed at the end of the try-with-resources block.
        That means calling readLine() again results in an operation on a closed stream,
        which would print an exception at runtime and make option C correct,
        except System.err is already closed due to the try-with-resources block!
        Therefore, only one message is printed, and option A is correct.
     */
    public static void main(String... args) throws Exception {
        long start = System.currentTimeMillis();
        var retriever = new BufferedReader(new 
         InputStreamReader(System.in));
        try(retriever; var husky = System.err) {
            var fetch = retriever.readLine();
            System.out.printf("%s fetched in %5.1f seconds",fetch, // v1
                              (System.currentTimeMillis()-start)/1000.0);
        }
        var fetchAgain = retriever.readLine();
        System.out.println(fetchAgain + " fetched again!"); 
    }
}