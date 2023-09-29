package exceptions.errors.scope;

import java.io.IOException;

/**
 * How many lines of text does the following program print?
    A. One.
    B. Two.
    C. The code does not compile because of line y1.
    D. The code does not compile because of line y2.
    E. The code does not compile because of line y3.
    F. None of the above.
    
    The code does not compile because the variable v is used twice in the main() method,
    both in the method declaration and in the catch block, making option C the correct answer.
    If a different variable name were used in one of the locations, the program would print one line, complete,
    making option A the correct answer.
    Note that while an exception is created inside the turnOn() method, it is not thrown.
 */
public class Light {
    public static void main(String[] v) throws Exception {
        try {
            new Light().turnOn();
        } catch (RuntimeException v) {  // y1
            System.out.println(v);
            throw new IOException();     // y2
        } finally {
            System.out.println("complete");
        }
    }
    public void turnOn() throws IOException {
        new IOException("Not ready");   // y3
    }
}