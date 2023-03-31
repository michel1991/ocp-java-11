package exceptions;

/**
   Given the following application, which specific
   type of exception will be printed in the stack trace at runtime?
   
    A. ClassCastException
    B. IllegalArgumentException
    C. NullPointerException
    D. RuntimeException
    E. The code does not compile.
    F. None of the above.
    
    * For this question, notice that all the exceptions thrown or caught are unchecked exceptions.
    First, the ClassCastException is thrown in the try block
    and caught by the second catch block,
    since it inherits from RuntimeException, not IllegalArgumentException.
    Next, a NullPointerException is thrown,
    but before it can be returned the finally block is executed and a RuntimeException replaces it.
    The application exits, and the caller sees the RuntimeException in the stack trace,
    making option D the correct answer.
    If the finally block did not throw any exceptions,
    then NullPointerException would be printed at runtime.
    
 */
class WhackAnException {
    public static void main(String... hammer) {
        try {
            throw new ClassCastException();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            throw new NullPointerException();
        } finally {
            throw new RuntimeException();
        }
    }
}

public class WhackAnExceptionMultipleExceptionWithFinal {
    public static void main(String... hammer) {
        WhackAnException.main(hammer);
    }
}