package autoCloseable;
/**
 *
   What is the result of compiling and executing the following class?
    A. It prints one line.
    B. It prints two lines.
    C. It prints three lines.
    D. It prints four lines.
    E. It does not compile due to an error in the declaration of the weatherTracker resource.
    F. It does not compile for a different reason.

    The code compiles without issue. It first prints Tracking from the try block.
     Upon the completion of the try block, the close() method is called, and Thunder is printed.
     No exception is thrown so the catch block is skipped.
     In the finally block, Storm gone is printed, followed by Thunder.
     Since four lines were printed, option D is correct.
     While it is not recommended to close a resource twice, it is allowed.
 */
class Storm {
    public static void main(String... rain) throws Exception {
        var weatherTracker = new AutoCloseable() {
            public void close() throws RuntimeException {
                System.out.println("Thunder");
            }
        };
        try (weatherTracker) {
            System.out.println("Tracking");
        } catch (Exception e) {
            System.out.println("Lightning");
        } finally {
            System.out.println("Storm gone");
            weatherTracker.close();
        }
    } }
public class StormHowManyLinePrint {
    public static void main(String... rain) throws Exception {
        Storm.main(rain);
    }
}