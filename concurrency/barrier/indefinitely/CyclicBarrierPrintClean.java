package concurrency.barrier.indefinitely;
import java.util.concurrent.*;
import java.util.stream.*;

public class CyclicBarrierPrintClean {
    /**
     * What is the result of executing the following application?
        A. It outputs Clean! at least once.
        B. It outputs Clean! exactly four times.
        C. The code will not compile because of line u1.
        D. The code will not compile because of line u2.
        E. It compiles but throws an exception at runtime.
        F. It compiles but waits forever at runtime.

        The code compiles without issue, so options C and D are incorrect.
        The key to understanding this code is to notice that our thread
        executor contains only one thread, but our CyclicBarrier limit is 3.
        Even though 12 tasks are all successfully submitted to the service,
        the first task will block forever on the call to await().
        Since the barrier is never reached, nothing is printed, and the program hangs,
        making option F correct. For more information, see Chapter 7.
     */
  static void execute(){
      final var cb = new CyclicBarrier(3,
                                       () -> System.out.println("Clean!"));  // u1
      ExecutorService service = Executors.newSingleThreadExecutor();
      try {
          IntStream.generate(() -> 1)
      .limit(12)
      .parallel()
      .forEach(i -> service.submit(
              () -> cb.await()));  // u2
      } finally {
          if (service != null) service.shutdown();
      }
  }
}