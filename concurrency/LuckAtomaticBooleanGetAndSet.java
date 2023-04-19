package concurrency;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
  The following program simulates flipping a coin an even number of times.
   Assuming five seconds is enough time for all of the tasks to finish,
   what is the output of the following application?
   
    A. false
    B. true
    C. The code does not compile.
    D. The code hangs indefinitely at runtime.
    E. The code throws an exception at runtime.
    F. The output cannot be determined ahead of time.
    
    The code compiles and runs without issue. Even though
    the thread-safe AtomicBoolean is used, it is not used in a thread-safe manner.
    The flip() method first retrieves the value and then sets a new value.
    These two calls are not executed together in an atomic or synchronized manner.
    For this reason, the output could be true or false,
    with one or more of the flips possibly being lost, and making option F correct.
 */
class Luck {
    private AtomicBoolean coin = new AtomicBoolean(false);
    void flip() {
        coin.getAndSet(!coin.get());
    }
    public static void main(String[] gamble) throws Exception {
        var luck = new Luck();
        ExecutorService s = Executors.newCachedThreadPool();
        for(int i=0; i <1000; i++) {
            s.execute(() -> luck.flip());
        }
        s.shutdown();
        Thread.sleep(5000);
        System.out.println(luck.coin.get());
    } }


public class LuckAtomaticBooleanGetAndSet {
  
}