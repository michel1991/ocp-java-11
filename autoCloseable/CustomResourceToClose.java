package autoCloseable;
import java.io.*;

/**
* Question: What is the output of the following program?
     A. Cellar door stuck 0
     B. Cellar door stuck 1
     C. Cellar door stuck 2
     D. House flew away 0
     E. House flew away 1
     F. House flew away 2
     G. The code does not compile.
     H. The code compiles but produces a stack trace at runtime due to line m1.

     The code compiles and runs without printing a stack trace.
     Even though you shouldn’t access resources that have been closed, the compiler does not prevent it, and the House class (as written) allows open() to be called multiple times.
     There are three exceptions thrown and caught by the catch block: one in the try body, and one by each of the close() methods.
     Since the exception in the try body is encountered first, that becomes the primary exception, with each of the exceptions in the close() methods becoming suppressed exceptions.
     For this reason, option F is the correct answer.
 */
class Tornado {
    static class House implements AutoCloseable {
        public void close() {
            throw new RuntimeException("Cellar door stuck");
        }
    public void open() {}
    }

}

public class CustomResourceToClose {
    public static void main(String[] args) {
        var house1 = new Tornado.House();
        house1.open();
        try (house1; Tornado.House house2 = new Tornado.House() ) {
        throw new RuntimeException("House flew away");
        } catch (Exception e) {
        System.out.println(e.getMessage() + " " + e.getSuppressed().length);
        }
                house1.open();  // m1
        }
}