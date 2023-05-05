package concurrency.synchronizeds;
import java.util.concurrent.atomic.*;

/**
   Assuming the following class is concurrently accessed by numerous threads,
    which statement about the CountSheep class is correct?
  
    A. The class is thread-safe only if increment1() is removed.
    B. The class is thread-safe only if increment2() is removed.
    C. The class is thread-safe only if increment3() is removed.
    D. The class is already thread-safe.
    E. The class does not compile.
    F. The class compiles but may throw an exception at runtime.
    
    The code compiles, making option E incorrect.
    The key here is that the AtomicInteger variable is thread-safe regardless
    of the synchronization methods used to access it.
    Therefore, synchronizing on an instance object, as in increment1() or increment3(),
    or on the class object, as in increment2(),
    is unnecessary because the AtomicInteger class is already thread-safe.
    For this reason, option D is the correct answer.
 */
public class CountSheep {
    private static AtomicInteger counter = new AtomicInteger();
    private Object lock = new Object();
    public synchronized int increment1() {
        return counter.incrementAndGet();
    }
    public static synchronized int increment2() {
        return counter.getAndIncrement();
    }
    public int increment3() {
        synchronized(lock) {
            return counter.getAndIncrement();
        } } }