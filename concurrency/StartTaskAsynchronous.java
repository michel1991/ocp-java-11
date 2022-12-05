package concurrency;
import java.util.*;
import java.util.concurrent.*;

public class StartTaskAsynchronous {

    /**
    *  Given an instance of Thread t1, an instance of Runnable r2, and an ExecutorService s3, which lines execute a task as an asynchronous process? (Choose all that apply.)
    *   A. r2.run()
        B. t1.run()
        C. new Thread(r2).run()
        D. s3.execute(r2)
        E. t1.start()
        F. s3.submitThread(t1)

      Options A, B, and C are incorrect.
      While you can call the run() method on either a Runnable or Thread object, it is executed synchronously and not as a separate thread.
      Option D is correct and uses an ExecutorService to complete the task asynchronously.
      Option E is also correct and is the proper way to start a Thread task directly.
      Option F is incorrect, as there is no submitThread() method in ExecutorService.
      If the line were changed to submit(), then it would be correct since Thread implements Runnable.
     */
    static void startAsAsynProcess(Thread t1, Runnable r2,  ExecutorService s3){
       t1.start();
       s3.execute(r2);
   }

    public static void main(String... args){

    }
}