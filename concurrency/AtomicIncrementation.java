
package concurrency;
import java.util.*;
import java.util.concurrent.atomic.*;

public class AtomicIncrementation {
    
    /**
     * Which two method names, when filled into the print2() method,
     * produce the same output as the print1() method?
     * Assume the input arguments for each represent the same non-null numeric value.
     *
        A. decrementAndGet() and getAndIncrement()
        B. decrementAndGet() and incrementAndGet()
        C. getAndDecrement() and getAndIncrement()
        D. getAndDecrement() and incrementAndGet()
        E. None of the above
     */
    public static synchronized void print1(int counter) {
        System.out.println(counter--);
        System.out.println(++counter);
    }

    public static synchronized void print2(AtomicInteger counter) {
        // System.out.println(counter._________________);
        System.out.println(counter.getAndDecrement());
        System.out.println(counter.incrementAndGet());
        // System.out.println(counter._________________);
    }
    
    public static void main(String... args){
        
    }
}