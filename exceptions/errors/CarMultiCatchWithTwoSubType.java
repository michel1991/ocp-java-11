package exceptions.errors;

import java.io.*;

/**
 *  Which statement about the following application is correct?
    A. The code does not compile because of line w1.
    B. The code does not compile because of line w2.
    C. The code does not compile because of line w3.
    D. The code does not compile because of line w4.
    E. The code compiles and prints a stack trace at runtime.
    F. None of the above.

     A multi-catch block cannot contain two exceptions in which one is a subtype of the other,
     since it is a redundant expression.
     Since CarCrash is a subclass of RuntimeException and RuntimeException is a subclass of Exception,
     line w3 contains a compilation error, making option C the correct answer.
     The rest of the lines of code do not contain any compilation errors.
 */
class CarCrash extends RuntimeException {
    CarCrash(Exception e) {}                               // w1
}
 class Car {
    public static void main(String[] s) throws Exception { // w2
        try {
            throw new IOException("Auto-pilot error");
        } catch (Exception | CarCrash e) {                  // w3
            throw e;
        } catch (Exception a) {                             // w4
            throw a;
        }
    }
}

public class CarMultiCatchWithTwoSubType {

}