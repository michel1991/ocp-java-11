package concurrency.barrier.indefinitely;
import java.util.concurrent.*;
import java.util.stream.*;

/**
 * How many times does the following application print W at runtime?
    A. 0
    B. 10
    C. 12
    D. The code does not compile.
    E. The output cannot be determined ahead of time.
    F. None of the above.
    
    When a CyclicBarrier goes over its limit,
    the barrier count is reset to zero.
    The application defines a CyclicBarrier with a barrier limit of 5 threads.
    The application then submits 12 tasks to a cached executor service.
    In this scenario, a cached thread executor will use between 5 and 12 threads,
    reusing existing threads as they become available.
    In this manner, there is no worry about running out of available threads.
    The barrier will then trigger twice, printing five values for each of the sets of threads,
    for a total of ten W characters. For this reason, option B is the correct answer.

 */
class Boat {
    private void waitTillFinished(CyclicBarrier c) {
        try {
            c.await();
            System.out.print("W");
        } catch (Exception e) {}
    }
    public void row(ExecutorService s) {
        var cb = new CyclicBarrier(5);
        IntStream.iterate(1, i -> i+1)
         .limit(12)
         .forEach(i -> s.submit(() -> waitTillFinished(cb)));
    }
    public static void main(String[] oars) {
        ExecutorService service = null;
        try {
            service = Executors.newCachedThreadPool();
            new Boat().row(service);
        } finally {
            service.isShutdown();
        } } }

public class BoatWithCachedThreadPool {
  
}