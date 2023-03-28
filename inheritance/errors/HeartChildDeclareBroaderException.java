package inheritance.errors;
import java.io.IOException;

/**
  What is the output of the following application?

    A. beat
    B. beat!
    C. Not supported
    D. The code does not compile.
    E. The code compiles, but a stack trace is printed at runtime.
    F. None of the above.

    The code does not compile due to an invalid override of the operate() method.
    An overridden method must not throw any new or broader checked exceptions
    than the method it inherits.
    While both IOException and Exception are checked exceptions, Exception is broader than IOException.
    For this reason, the declaration of operate() in Heart does not compile, and option D is correct.
 */
class Organ {
    public void operate() throws IOException {
        throw new RuntimeException("Not supported");
    }
}
class Heart extends Organ {
    public void operate() throws Exception {
        System.out.print("beat");
    }
    public static void main(String... c) throws Exception {
        try {
            new Heart().operate();
        } finally {
            System.out.print("!");
        }
    }
}

public class HeartChildDeclareBroaderException {

}