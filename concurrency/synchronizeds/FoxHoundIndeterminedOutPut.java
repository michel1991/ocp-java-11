package concurrency.synchronizeds;
import  java.util.concurrent.*;

public class FoxHoundIndeterminedOutPut {
    /**
    *  Which statements about the following code snippet are true?
    *   A. The code will always output Fox followed by Hound.
        B. The code will always output Hound followed by Fox.
        C. If the code does output anything, the order cannot be determined.
        D. The code does not compile because of line g1.
        E. The code does not compile because of line g2.
        F. The code may produce a deadlock at runtime.

       The code compiles without issue, making options D and E incorrect.
       Because a cached thread pool is used, there will be plenty of threads to complete the tasks concurrently.
       Therefore, the output cannot be determined ahead of time, making option C correct.
       A deadlock is not possible, because each thread orders its resources the same way.
       To obtain a lock on o2, a thread must already have a lock on o1, which only one thread can have.
       If the order of requests were reversed in one of the threads to synchronize on o2 and then o1, a deadlock would be possible, and option F would be correct.
     */
    static void indeterminedOutPut() throws InterruptedException, ExecutionException, TimeoutException{
       Object o1 = new Object();
       Object o2 = new Object();
       ExecutorService service = null;
       try {
           service = Executors.newCachedThreadPool();
           var f1 = service.submit(() -> {
               synchronized (o1) {
                   synchronized (o2) { System.out.print("Fox"); }   // g1
               }});
           var f2 = service.submit(() -> {
               synchronized (o1) {
                   synchronized (o2) { System.out.print("Hound"); } // g2
               }});
           f1.get(10,TimeUnit.SECONDS);  // g3
    f2.get(10,TimeUnit.SECONDS);  // g4
       } finally {
           if(service != null) service.shutdown();
       }

   }
}