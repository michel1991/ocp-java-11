package concurrency.creationExecutorService;
import java.util.concurrent.*;

/**
 * Which of the following code fragments will you use to create an ExecutorService?
    A. ExecutorService
    B. Executor
    C. Executors
    D. .newSingleThreadExecutor();
    E.  .createSingleThreadExecutor();
    F. .getSingleThreadExecutor();
    
    Correct(C, D)
    
    You need to remember the following points about a few important classes in java.util.concurrent package:

    1. ExecutorService interface extends Executor interface. While Executor allows you to execute a Runnable,
    ExecutorService allows you to execute a Callable.
    
    2. Executors is a utility class that provides several static methods to create instances of ExecutorService.
    All such methods start with new e.g. newSingleThreadExecutor().
    You should at least remember the following methods:
    newFixedThreadPool(int noOfThreads), newSingleThreadExecutor(),
    newCachedThreadPool(), newSingleThreadScheduledExecutor(),
    newScheduledThreadPool(int corePoolSize).
    
    
    You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/u913pF9NRgY

 */
public class CreateExecutorsServices {
    public static void main(String...args){
        Executors.newSingleThreadExecutor();

    }
}