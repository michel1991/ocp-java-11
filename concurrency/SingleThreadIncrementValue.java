package concurrency;
import java.util.stream.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.*;

/**
* The code compiles and runs without issue, so options D, E, F, and G are incorrect.
* The key aspect to notice in the code is that a single-thread executor is used, meaning that no task will be executed concurrently.
* Therefore, the results are valid and predictable with 100 100 being the output, and option B is the correct answer.
*  If a pooled thread executor was used with at least two threads, then the sheepCount2++ operations could overwrite each other,
* making the second value indeterminate at the end of the program. In this case, option C would be the correct answer.
 */
public class SingleThreadIncrementValue {
    private AtomicInteger s1 = new AtomicInteger(0); // w1
    private int s2 = 0;

    private void countSheep() throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // w2
            for (int i = 0; i < 100; i++)
                service.execute(() -> {
                    s1.getAndIncrement(); s2++; }); // w3
            Thread.sleep(100);
            System.out.println(s1 + " " + s2);
        } finally {
            if(service != null) service.shutdown();
        }
    }

    public static void main(String... args)  throws InterruptedException {
        var thread = new SingleThreadIncrementValue();
        thread.countSheep();
    }
}