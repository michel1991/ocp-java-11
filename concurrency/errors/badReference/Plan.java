package concurrency.errors;
import java.util.concurrent.*;

/**
   Which statements about the following application are true? (Choose two.)
    A. Line g1 does not compile.
    B. Line g2 does not compile.
    C. Line g3 does not compile.
    D. All of the lines of code compile.
    E. The code hangs indefinitely at runtime.
    F. The code throws an exception at runtime.
    
    Lines g1 and g2 do not compile because these methods are available
    only in the ScheduledExecutorService interface.
    Since s is of type ExecutorService,
    the lines referenced in options A and B do not compile.
    Even if the correct reference type for s was used,
    line g1 would still fail to compile because scheduleWithFixedDelay()
    requires two long values, one for the initial delay and one for the period.
    Line g3 compiles without issue because this method is available in the ExecutorService interface.

 */
public class Plan {
    ExecutorService s = Executors.newScheduledThreadPool(10);
    public void planEvents() {
        Runnable r1 = () -> System.out.print("Check food");
        Runnable r2 = () -> System.out.print("Check drinks");
        Runnable r3 = () -> System.out.print("Take out trash");
        s.scheduleWithFixedDelay(r1,1,TimeUnit.HOURS);      // g1
        s.scheduleAtFixedRate(r2,1,1000,TimeUnit.SECONDS);  // g2
        s.execute(r3);                                      // g3
        s.shutdownNow();    
    } }