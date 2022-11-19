package concurrency;
import java.util.concurrent.*;

class CyclicBarrierSample{
  
    /**
    * Question: What is the result of executing the following application?
    * A. It outputs Salad bar empty exactly once.
    * B. It outputs Salad bar empty multiple times
    * C. The code will not compile because of line r1.
    * D. The code will not compile because of line r2.
    * E. It compiles but throws an exception at runtime.
    * F. It compiles but waits forever at runtime.
    *
    * The code compiles, so options C and D are incorrect.
    * The call to cb.await() on line r2 does throw a checked exception, although the lambda expression is interpreted as a Callable since it returns a value.
    * Since Callable declares Exception, the code compiles without issue.
    * If execute() were used instead, then the code would not compile, since it would have been interpreted as a Runnable expression.
    * The limit of the cyclic barrier is 4, and since we are sending 12 tasks to it, it is activated a total of three times.
    * Therefore, option B is the correct answer Note that the thread pool is also 4, which means that we have just enough threads to break the barrier.
    *  For example, if our thread pool were 3, then the barrier would never be reached.
     */
    static void printSaladBarEmpty(){
       var cb = new CyclicBarrier(4,  () -> System.out.println("Salad bar empty")); // r1
       ExecutorService s = null;
      try {
          s = Executors.newFixedThreadPool(4);
          for (int i = 0; i < 12; i++) {
              s.submit(() -> cb.await()); // r2
           }
      } finally {
              if (s != null) s.shutdown();
          }
    }


    public static void main(String... args){
       printSaladBarEmpty();
    }
  
}
