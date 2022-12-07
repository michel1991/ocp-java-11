package concurrency;
import java.util.*;
import java.util.concurrent.*;

public class DeadLocks {
    /**
    *  What statements about the following code snippet are true? (Choose all that apply.)
    *   A. The code will always output Tortoise followed by Hare.
        B. The code will always output Hare followed by Tortoise.
        C. If the code does output anything, the order cannot be determined.
        D. The code does not compile.
        E. The code compiles but may produce a deadlock at runtime.
        F. The code compiles but may produce a livelock at runtime.
        G. It compiles but throws an exception at runtime.

      The code compiles without issue, so option D is incorrect.
      Since both tasks are submitted to the same thread executor pool, the order cannot be determined, so options A and B are incorrect, and option C is correct.
      The key here is that the order in which the resources o1 and o2 are synchronized could result in a deadlock.
      For example, if the first thread gets a lock on o1 and the second thread gets a lock on o2 before either thread can get their second lock,
      then the code will hang at runtime, making option E correct.
      The code cannot produce a livelock, since both threads are waiting, so option F is incorrect.
      Finally, if a deadlock does occur, an exception will not be thrown, so option G is incorrect.
     */
    static void deadLock() throws InterruptedException,  ExecutionException{
      Object o1 = new Object();
      Object o2 = new Object();
      var service = Executors.newFixedThreadPool(2);
      var f1 = service.submit(() -> {
          synchronized (o1) {
              synchronized (o2) { System.out.print("Tortoise"); }
          }
      });
      var f2 = service.submit(() -> {
          synchronized (o2) {
              synchronized (o1) { System.out.print("Hare"); }
          }
      });
      f1.get();
      f2.get();
  }

    public static void main(String... args){

  }
}