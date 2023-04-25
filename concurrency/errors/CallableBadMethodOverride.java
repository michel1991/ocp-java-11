package concurrency.errors;
import java.util.concurrent.*;

/**
 * What is the output of the following code snippet?
    A. XXXXXXXXXXDone!
    B. Done!XXXXXXXXXX
    C. The code does not compile.
    D. The code hangs indefinitely at runtime.
    E. The code throws an exception at runtime.
    F. The output cannot be determined ahead of time.
    
    The code does not compile because Callable must define a call() method, not a run() method,
    so option C is the correct answer.
    If the code was fixed to use the correct method name,
    then it would complete without issue, printing XXXXXXXXXXDone! at runtime.
    The f.get() call will block and wait for the results before
    moving on to the next iteration of the for loop.

 */
public class CallableBadMethodOverride {
   public static void main(String... args) throws Exception{
       Callable c = new Callable() {
           public Object run() {
               System.out.print("X");
               return 10;
           }
       };
       var s = Executors.newScheduledThreadPool(2);
       for(int i=0; i < 10; i++) {
            Future f = s.submit(c);
            f.get();
       }
       s.shutdown();
       System.out.print("Done!");
   }
}