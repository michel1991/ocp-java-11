package exceptions.finallys;
/**
   What is the output of the following application?
    A. ABC
    B. ABD
    C. ABC followed by a stack trace
    D. ABD followed by a stack trace
    E. AD followed by a stack trace
    F. None of the above

    The application first enters the try block and prints A.
    It then throws an ArrayIndexOutOfBoundsException,
    which is caught by the first catch block
    since ArrayIndexOutOfBoundsException is a subclass of RuntimeException, printing B.
    The exception is then rethrown, but since there isn’t a separate try/catch block around it,
    it does not get caught by the second catch block. Before printing the stack trace,
    the finally block is called, and D is printed. For these reasons, option D is correct.


 */
public class Football {
    public static void main(String officials[]) {
        try {
            System.out.print('A');
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException r) {
            System.out.print('B');
            throw r;
        } catch (Exception e) {
            System.out.print('C');
        } finally {
            System.out.print('D');
        }
    }
}