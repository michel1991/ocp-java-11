
package concurrency.barrier.indefinitely;
import java.util.concurrent.*;

/**
 * What is the output of the following application?
    A. Jump! is printed once, and the program exits.
    B. Jump! is printed twice, and the program exits.
    C. The code does not compile.
    D. The output cannot be determined ahead of time.
    E. A deadlock is produced at runtime.
    F. None of the above.
    
    The code compiles without issue. The main() method creates a thread pool of four threads.
    It then submits ten tasks to it. At any given time,
    the ExecutorService has up to four threads active,
    which is the same number of threads required to reach the CyclicBarrier limit.
    Therefore, the barrier limit is reached twice, printing Jump! twice.
    While eight of the tasks have been completed, two are left running.
    Since no more tasks will call the await() method, the CyclicBarrier limit is never reached,
    and a deadlock is encountered at runtime, with the program hanging indefinitely.
     For this reason, option E is correct.
 */
 class Jump {
    private static void await(CyclicBarrier b) {
        try { b.await(); } catch (Exception e) {}
    }
    public static void main(String[] chalk) {
        ExecutorService s = Executors.newFixedThreadPool(4);
        final var b = new CyclicBarrier(4,
                                        () -> System.out.print("Jump!"));
        for(int i=0; i <10; i++)
            s.execute(() -> await(b));
        s.shutdown();
    } }


public class JumpInvalidLimitOfIncrementInLoop {
    
}