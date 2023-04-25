package concurrency.locks.errors;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/**
   Given the following program, how many times is TV Time expected to be printed?
   Assume 10 seconds is enough time for each task created by the program to complete.
   
    A. One time.
    B. Three times.
    C. The code does not compile.
    D. The code hangs indefinitely at runtime.
    E. The code throws an exception at runtime.
    F. The output cannot be determined ahead of time.
    
    The Lock interface does not include an overloaded version of lock()
    that takes a timeout value and returns a boolean. For this reason,
    the code does not compile, and option C is correct. If tryLock(long,TimeUnit)
    had been used instead of lock(),
    then the program would have been expected to print TV Time three times at runtime.

 */
class Television {
    private static Lock myTurn = new ReentrantLock();
    public void watch() {
        try {
            if (myTurn.lock(5, TimeUnit.SECONDS)) {
                System.out.println("TV Time");
                myTurn.unlock();
            }
        } catch (InterruptedException e) {}
    }
    public static void main(String[] t) throws Exception {
        var newTv = new Television();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> newTv.watch()).start();
            Thread.sleep(10*1000);
        }
    } }

public class TelevisionLockMethodDoesNotHaveDelay {
  
}