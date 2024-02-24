package concurrency.runnableCallable;
import java.util.concurrent.*;
import java.util.concurrent.*;

/**
 * Consider the following code:
    What can be inserted in the above code so that both - Runnable r and Callable c - will be executed?
    
    A. es.submit(c);
        es.submit(r);
    
    B. es.execute(c);
         es.execute(r);
         
    C. es.add(c);
        es.add(r);
        
    D. Future<Integer> fi1 = es.submit(c);
        Future<Integer> fi2 =  es.submit(r);
    
    E. Future<Integer> fi1 = es.submit(c);
        Future<Object> fi2 =  es.submit(r);
      Runnable is not a generified class and so the compiler cannot determine the type of object that the Future object will contain.
      Therefore, Future<Object> fi2 =  es.submit(r); and Future<Integer> fi2 =  es.submit(r); will not compile.
        But you can do: Future<?> rf = es.submit(r);
        
       
      All you need to do to execute Runnables and Callables is to submit them to the cached thread pool.
      A cached thread pool creates new threads as needed, but will reuse previously constructed
      threads when they are available. This pool will typically improve the performance of programs
      that execute many short-lived asynchronous tasks. Calls to execute will reuse previously constructed threads if available.
      If no existing thread is available, a new thread will be created and added to the pool.
      Threads that have not been used for sixty seconds are terminated and removed from the cache.
      Thus, a pool that remains idle for long enough will not consume any resources.
       Note that pools with similar properties but different details (for example, timeout parameters)
       may be created using ThreadPoolExecutor constructors.
       Correct(A)
 */
public class ThreadPoolTest {
    

    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("In Runnable");
        Callable<Integer> c = ()-> { System.out.println("In Callable"); return 0; };
        var es = Executors.newCachedThreadPool();

        //INSERT CODE HERE
        es.submit(c);
        es.submit(r);

        es.shutdown();

    }

}