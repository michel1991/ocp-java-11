import java.io.*;

/**
* What is the output of the following code?
    A. TF
    B. TEF
    C. TDWF
    D. TWDF
    E. A compilation error occurs.

    A resource must be marked final or be effectively final to be used in a try-with-resources statement.
    Since the variables d and w are reassigned after the try-with-resources statement, they are not effectively final.
    Therefore, the code does not compile, making option E correct.
    If those two lines were removed, then the program would compile and print TDWF at runtime.
    Remember that resources in a try-with-resources statement are closed in the reverse order in which they are declared.
    For more information, see Chapter 5.
 */
class RaceCar {
    static class Door implements AutoCloseable {
        public void close() { System.out.print("D"); }
    }
    static class Window implements Closeable {
        public void close() { System.out.print("W"); }
    }
    public static void main() {
        Window w = new Window() {};
        Door d = new Door();
        try (w; d) {
            System.out.print("T");
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
        d = null;
        w = null;
    }
}

public class RaceCarTryResourceRequireEffectiveFinal {
    public static void main(String[] args) {

    }
}