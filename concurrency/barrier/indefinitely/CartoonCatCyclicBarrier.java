package concurrency.barrier.indefinitely;
import java.util.concurrent.*;

/**
 * How many times does the following application print Ready at runtime?
    A. Zero.
    B. One.
    C. Three.
    D. The code does not compile.
    E. An exception is thrown at runtime.
    
    The code compiles without issue but hangs indefinitely at runtime.
    The application defines a thread executor with a single thread and 12 submitted tasks.
    Because only one thread is available to work at a time,
    the first thread will wait endlessly on the call to await().
    Since the CyclicBarrier requires four threads to release it,
    the application waits endlessly in a frozen condition.
    Since the barrier is never reached and the code hangs,
    the application will never output Ready, making option A the correct answer.
    If newCachedThreadPool() had been used instead of newSingleThreadExecutor(),
    then the barrier would be reached three times, and option C would be the correct answer.

 */
 class CartoonCat {
    private void await(CyclicBarrier c) {
        try {
            c.await();
        } catch (Exception e) {}
    }
    public void march(CyclicBarrier c) {
        var s = Executors.newSingleThreadExecutor();
        for(int i=0; i <12; i++)
            s.execute(() -> await(c));
        s.shutdown();
    }
    public static void main(String... strings) {
        new CartoonCat().march(new CyclicBarrier(4, () -> System.out.println("Ready")));
    }
}

public class CartoonCatCyclicBarrier {
  
}