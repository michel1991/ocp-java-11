package exceptions.errors.notHandle;
import java.util.Scanner;

/**
  Assuming Scanner is a valid class that implements AutoCloseable,
  what is the expected output of the following application?

    A. Opening!Walls
    B. The code does not compile because of line p1.
    C. The code does not compile because of line p2.
    D. The code does not compile because of line p3.
    E. The code compiles, but a stack trace is printed at runtime.
    F. None of the above.

    The openDrawbridge() method declares a checked exception
    that is not handled or declared in the main() method where it is called.
    For this reason, line p3 does not compile, and option D is correct.
    The rest of the lines do not contain any compiler errors.
    If the main() method were changed to declare Exception,
    then the class would compile and print Opening!Walls at runtime.
 */
public class Fortress {
    public void openDrawbridge() throws Exception {  // p1
        try {
            throw new Exception("Circle");             // p2
        } catch (Exception | Error e) {
            System.out.print("Opening!");
        } finally {
            System.out.print("Walls");
        }
    }
    public static void main(String[] moat) {
        try (var e = new Scanner(System.in)) {
            new Fortress().openDrawbridge();           // p3
        }
    }
}
