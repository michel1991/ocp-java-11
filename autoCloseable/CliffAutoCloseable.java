package autoCloseable;
import java.io.*;

/**
 * Given the following application, what is the name of the class printed at line e1?
    A. canyon.FallenException
    B. java.lang.RuntimeException
    C. The code does not compile.
    D. The code compiles, but the answer cannot be determined until runtime.
    E. None of the above.

    The code compiles without issue, making option C incorrect.
    In the climb() method, two exceptions are thrown.
    The RuntimeException thrown in the try block is considered the primary exception,
    while the FallenException thrown by the close() method is suppressed.
    For this reason, java.lang.RuntimeException is reported to the caller in the main() method,
    and option B is the correct answer.
 */
final class FallenException extends Exception {}
final class HikingGear implements AutoCloseable {
    @Override public void close() throws Exception {
        throw new FallenException();
    }
}
class Cliff {
    public final void climb() throws Exception {
        try (HikingGear gear = new HikingGear()) {
            throw new RuntimeException();
        }
    }
    public static void main(String... rocks) {
        try {
            new Cliff().climb();
        } catch (Throwable t) {
            System.out.println(t);  // e1
        }
    }
}

public class CliffAutoCloseable {

}