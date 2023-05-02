package stream.optionals;
import java.util.*;

/**
   What is true of the following? (Choose three.)
    A. If filling in the blank with method x, the code outputs Caught it.
    B. If filling in the blank with method x, the code prints a stack trace.
    C. If filling in the blank with method y, the code outputs Caught it.
    D. If filling in the blank with method y, the code prints a stack trace.
    E. If filling in the blank with method z, the code outputs Caught it.
    F. If filling in the blank with method z, the code prints a stack trace.

   The orElseThrow() method throws a NoSuchElementException when the Optional is empty.
   Since this exception is not caught, a stack trace is printed. This matches option B.
   The overloaded method that takes a parameter throws the specified exception.
   Since we do catch an IllegalArgumentException, the code prints the message,
   which is option C. Finally, the orElse() method returns the specified string, and option E is correct.

 */
public class Catch {
    public static void main(String[] args) {
        Optional opt = Optional.empty();
        var message = "";
        try {
            message = z(opt); // _____
        } catch (IllegalArgumentException e) {
            System.out.print("Caught it");
        }
        System.out.print(message);
    }
    private static String x(Optional<String> opt) {
        return opt.orElseThrow();
    }
    private static String y(Optional<String> opt) {
        return opt.orElseThrow(IllegalArgumentException::new);
    }
    private static String z(Optional<String> opt) {
        return opt.orElse("Caught it");
    }
}