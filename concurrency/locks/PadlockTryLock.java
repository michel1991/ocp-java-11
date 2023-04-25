package concurrency.locks;
import java.util.concurrent.locks.*;

/**
 * Given the following program, how many times is Locked!
 * expected to be printed? Assume 100 milliseconds
 * is enough time for each task created by the program to complete.
    A. One time.
    B. Five times.
    C. The code does not compile.
    D. The code hangs indefinitely at runtime.
    E. The code throws an exception at runtime.
    F. The output cannot be determined ahead of time.
    
    If the tryLock() method returns true, then a lock is acquired that must be released.
    That means the lockUp() method actually contains
    two calls to lock the object and only one call to unlock it.
    For this reason, the first thread to reach tryLock() obtains a lock that is never released.
    For this reason, Locked! is printed only once, and option A is correct.
     If the call to lock() inside the if statement was removed,
     then the expected output would be to print the statement five times.

 */
class Padlock {
    private Lock lock = new ReentrantLock();
    public void lockUp() {
        if (lock.tryLock()) {
            lock.lock();
            System.out.println("Locked!");
            lock.unlock();
        }
    }
    public static void main(String... unused) throws Exception {
        var gate = new Padlock();
        for(int i=0; i<5; i++) {
            new Thread(() -> gate.lockUp()).start();
            Thread.sleep(100);
        }
    } }

public class PadlockTryLock {
    public static void main(String... args) throws Exception{
      Padlock.main(args);
  }
}