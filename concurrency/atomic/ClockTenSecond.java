package concurrency.atomic;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
  Assuming 10 seconds is enough time for all of the tasks to finish,
   what statements about the following program are correct? (Choose two.)
   
    A. The code does not compile.
    B. The incrementBy10() method is thread-safe.
    C. The incrementBy10() method is not thread-safe.
    D. The output is 1000 on every execution.
    E. The output cannot be determined ahead of time.
    F. The code hangs indefinitely at runtime.
    
    The code compiles and runs without issue. While an AtomicLong is used,
    there are two calls on this variable,
    the first to retrieve the value and the second to set the new value.
    These two calls are not executed together in an atomic or synchronized manner.
    For this reason, the incrementBy10() method is not thread-safe,
    and option C is correct. That said,
    the code performs in single-threaded manner
    at runtime because the call to get() in the main()
    method waits for each thread to finish.
    For this reason,the output is consistently 1000, making option D correct.
 */
class Clock {
    private AtomicLong bigHand = new AtomicLong(0);
    void incrementBy10() {
        bigHand.getAndSet(bigHand.get() + 10);
    }
    public static void main(String[] c) throws Exception {
        var smartWatch = new Clock();
        ExecutorService s = Executors.newCachedThreadPool();
        for(int i=0; i< 100; i++) {
            s.submit(() -> smartWatch.incrementBy10()).get();
        }
        s.shutdown();
        s.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(smartWatch.bigHand.get());
    } }

public class ClockTenSecond {
    public static void main(String[] c) throws Exception {
        
    }
}