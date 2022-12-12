package concurrency.indefinitely;
import java.util.concurrent.*;
import java.util.stream.*;

/**
* What is the result of executing the following application? (Choose all that apply.)
    A. It compiles and outputs the two numbers, followed by Printed.
    B. The code will not compile because of line b1.
    C. The code will not compile because of line b2.
    D. The code will not compile because of line b3.
    E. The code will not compile because of line b4.
    F. It compiles, but the output cannot be determined ahead of time.
    G. It compiles but throws an exception at runtime.
    H. It compiles but waits forever at runtime.

   The application compiles and does not throw an exception, so options B, C, D, E, and G are incorrect.
   Even though the stream is processed in sequential order, the tasks are submitted to a thread executor, which may complete the tasks in any order.
   Therefore, the output cannot be determined ahead of time, and option F is correct.
   Finally, the thread executor is never shut down;
   therefore, the code will run but it will never terminate, making option H also correct.

 */
public class PrintConstants {
    public static void main(String[] args) {
        var s = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159,2.71828)   // b1
        .forEach(c -> s.submit(   // b2
                () -> System.out.println(10*c)));   // b3
    s.execute(() -> System.out.println("Printed"));   // b4
    }
}