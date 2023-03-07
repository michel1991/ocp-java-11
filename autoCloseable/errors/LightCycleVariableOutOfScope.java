
package autoCloseable.errors;

/**
 *  How many lines of text does the following program print?
    A. One.
    B. Two.
    C. Three.
    D. The code does not compile because of the DiskPlayer class.
    E. The code does not compile for a different reason.
    F. None of the above.

    The code does not compile because john is declared in the try-with-resources statement and not accessible in the finally block.
 */
class DiskPlayer implements AutoCloseable {
    public void close() {}
}
class LightCycle {
    public static void main(String... bits) {
        try (DiskPlayer john = new DiskPlayer()) {
            System.out.println("ping");
            john.close();
        } finally {
            System.out.println("pong");
            john.close();
        }
        System.out.println("return");
    }
}


public class LightCycleVariableOutOfScope {

}