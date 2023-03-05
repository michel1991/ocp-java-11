package autoCloseable;

/**
 * What is the output of the following application?
    A. 24
    B. 21834
    C. 23418
    D. 23481
    E. 28134
    F. The code does not compile.

    The try block is entered and 2 is printed, followed by an exception.
    Upon completion of the try block, the resources are closed in the reverse order in which they are declared, printing 8 followed by 1.
    Next, the catch block executes, printing 3, followed by the finally block printing 4.
    For these reasons, option E is correct.

 */
class FunEvent implements AutoCloseable {
    private final int value;
    FunEvent(int value) { this.value = value; }
    public void close() {
        System.out.print(value);
    }
}
class Happening {
    public static void main(String... lots) {
        FunEvent e = new FunEvent(1);
        try (e; var f = new FunEvent(8)) {
            System.out.print("2");
            throw new ArithmeticException();
        } catch (Exception x) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        }
    } }

public class HappeningChoiceDisplayValue{
    public static void main(String... lots) {
        Happening.main(lots);
    }
}