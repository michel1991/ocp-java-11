package concurrency;
import java.util.*;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.*;
/**
 You want to execute your tasks after a given delay. Which ExecutorService would you use?

A. FixedDelayExecutorService
There is no such interface.
B. TimedExecutorService
There is no such interface.
C. DelayedExecutorService
There is no such interface.
D. ScheduledExecutorService
    ScheduledExecutorService is a subinterface of ExecutorService and has
    additional methods that allow you to schedule commands to run after a given delay, or to execute periodically.
    The following are the details of the interface ScheduledExecutorService as given in the JavaDoc APIdescription:
    
    All Superinterfaces:
      Executor, ExecutorService
    All Known Implementing Classes:
      ScheduledThreadPoolExecutor
    
    An ExecutorService that can schedule commands to run after a given delay, or to execute periodically.
    The schedule methods create tasks with various delays and return a task object that
    can be used to cancel or check execution. The scheduleAtFixedRate
    and scheduleWithFixedDelay methods create and execute tasks that run periodically until cancelled.
    
    Commands submitted using the Executor.execute(java.lang.Runnable)
    and ExecutorService.submit methods are scheduled with a requested delay of zero.
    Zero and negative delays (but not periods) are also allowed in schedule methods, and are treated as requests for immediate execution.
    
    All schedule methods accept relative delays and periods as arguments,
    not absolute times or dates. It is a simple matter to transform
    an absolute time represented as a Date to the required form. For example,
    to schedule at a certain future date, you can use: schedule(task, date.getTime() -
    System.currentTimeMillis(), TimeUnit.MILLISECONDS).
    Beware however that expiration of a relative delay need not coincide
    with the current Date at which the task is enabled due to network time synchronization protocols, clock drift,
    or other factors. The Executors class provides convenient
    factory methods for the ScheduledExecutorService implementations provided in this package.
    
    (correct is D)
 */

class BeeperControl {
    private final ScheduledExecutorService scheduler =
        Executors.newScheduledThreadPool(1);

    public void beepForAnHour() {
        final ScheduledFuture<?> beeperHandle =
             scheduler.scheduleAtFixedRate(  () -> 
                 System.out.println("beep"), 10, 10, SECONDS);
        scheduler.schedule(() -> beeperHandle.cancel(true), 60 * 60, SECONDS);
    }

    public static void main(String args[]) {
        new BeeperControl().beepForAnHour();
    }
}
public class TaskAfterDelay {
    public static void main(String... args){
        
    }
}