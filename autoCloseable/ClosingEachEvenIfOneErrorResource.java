package autoCloseable;
import java.io.*;
/**
*  What is the output of the following code?
    A. TWF
    B. TWDF
    C. TWDEF
    D. TWF followed by an exception.
    E. TWDF followed by an exception.
    F. TWEF followed by an exception.
    G. The code does not compile.

    After both resources are declared and created in the try-with-resources statement,T is printed as part of the body.
    Then the try-with-resources completes and closes the resources in reverse order from which they were declared.
    After W is printed, an exception is thrown.
    However, the remaining resource still needs to be closed, so D is printed. Once all the resources are closed,
    the exception is thrown and swallowed in the catch block, causing E to be printed.
    Last, the finally block is run, printing F. Therefore, the answer is TWDEF.
*/
public class ClosingEachEvenIfOneErrorResource {
    static class Door implements AutoCloseable {
        public void close()  {
            System.out.print("D");
        }
    }
    static class Window implements Closeable {
        public void close() {
            System.out.print("W");
            throw new RuntimeException();
        } }
    public static void main(String[] args) {
        var d = new Door();
        try (d ; var w = new Window()) {
            System.out.print("T");
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}