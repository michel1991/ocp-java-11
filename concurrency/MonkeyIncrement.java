package concurrency;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class MonkeyIncrement {
    /**
    * Which statements about the following code are correct? (Choose all that apply.)
    * A. The first value printed on line m3 is always 100.
        B. The second value printed on line m3 is always 100.
        C. The first value printed on line m3 cannot be determined ahead of time.
        D. The second value printed on line m3 cannot be determined ahead of time.
        E. The code will not compile because of line m1.
        F. The code will not compile because of line m2.
        G. None of the above.

      The code compiles and runs without issue, so options E and F are incorrect.
      Both monkey1 and monkey2 are thread-safe for atomic operations, so there are no race conditions or invalid data.
      The first operation is incremented as part of a parallel stream, which will synchronously wait until the process is complete before moving on to the next line.
      For this reason, the first value printed on line m3 is always 100, making option A correct.
      The second line will also complete without issue, although that may not happen until after line m3.
      For this reason, it could output any value from 0 to 100, making option D correct.
      If the code was changed to first shut down the service and then call awaitTermination() with a reasonable timeout value,
      then the code would print 100 as the second value and option B would be correct
     */
   static void increment(){
       var monkey1 = new AtomicInteger(0);
       var monkey2 = new AtomicLong(0);
       ExecutorService service = null;
       try {
           service = Executors.newFixedThreadPool(100);
           IntStream.range(0,100)
           .parallel()
           .forEach(s -> monkey1.getAndIncrement());        // m1
    for (int i = 0; i < 100; i++)
        service.submit(() -> monkey2.incrementAndGet()); // m2
    System.out.println(monkey1 + " " + monkey2);        // m3
       } finally {
           if (service != null) service.shutdown();
       }
   }

    public static void main(String... args){
        increment();
    }
}