package concurrency.runnableCallable;
import java.util.concurrent.*;
import java.util.concurrent.*;

public class MyEs {
    /**
       Identify correct statements above the following code:
        A. //1 will not compile.
        B. //2 will not compile.
        C. The lambda expression used at //1 implements java.util.concurrent.Callable.
        D. The lambda expression used at //1 implements java.lang.Runnable.
            Since this lambda expression doesn't return any value, it implements Runnable.
            
        E. The lambda expression used at //2 implements java.util.concurrent.Callable.
            Since this lambda expression returns a value, it implements Callable.
            
        F. The lambda expression used at //2 implements java.lang.Runnable.
        G. The code will compile but will throw an exception at runtime.
            There is no problem with the code. It will compile and run fine.

        -------------
         
          Executors.newSingleThreadExecutor() returns an instance of ExecutorService.
          ExecutorService's has the following three overloaded submit methods:

            Future<?> submit(Runnable task)    
            Submits a Runnable task for execution and returns a Future representing that task.
            
            <T> Future<T> submit(Runnable task, T result)
            Submits a Runnable task for execution and returns a Future representing that task.
            
            <T> Future<T> submit(Callable<T> task)
            Submits a value-returning task for execution and returns a Future representing the pending results of the task.
            
             correct(D, E)
     */
    public static void main(String... args){
        var myES = Executors.newSingleThreadExecutor();
        myES.submit(() -> {}); //1
        myES.submit(() -> 100);//2
    }
}