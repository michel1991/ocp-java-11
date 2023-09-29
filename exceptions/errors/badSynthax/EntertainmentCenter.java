package exceptions.errors.badSynthax;
import java.io.*;

/**
    What is the output of the following code?

    A. TWF
    B. TWDF
    C. TWDEF
    D. TWF followed by an exception.
    E. TWDF followed by an exception.
    F. TWEF followed by an exception.
    G. The code does not compile.

    A try-with-resources statement uses parentheses, (), rather than braces, {}, for the try section.
    This is likely subtler than a question that you’ll get on the exam,
    but it is still important to be on alert for details.
    If parentheses were used instead of braces, then the code would compile and print TWDF at runtime.
 */
public class EntertainmentCenter {
    static class TV implements AutoCloseable {
        public void close() {
            System.out.print("D");
        } }
    static class MediaStreamer implements Closeable {
        public void close() {
            System.out.print("W");
        } }
    public static void main(String[] args) {
        var w = new MediaStreamer();
        try {
            TV d = new TV(); w;
        }
        {
            System.out.print("T");
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}
