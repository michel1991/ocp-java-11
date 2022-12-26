package concurrency.indefinitely;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class BeachManager {
    /**
    * Question: What is the result of executing the following program?
    * Reponse:
    *   A. It prints Swim! at least once.
    *   C. It prints Tasks Complete.
    *   D. It hangs indefinitely at runtime
    *
    * The application compiles without issue, so options E and F are incorrect.
    * The most important thing to notice is that the goSwimming() method performs two lock requests, via lock() and tryLock(), but it has only one call to unlock().
    * The thread that acquires the lock from calling lock() will trivially be granted the lock with tryLock() since it already has it.
    * For a ReentrantLock, a thread must call unlock() the same number of times it locks the object, or else the lock will not be released.
    * Therefore, only one thread is able to acquire the lock and print Swim! at runtime.
    * For these reasons, option A is correct, and option B is incorrect.
    * Option C is also correct, since the lock requests are performed on separate threads from the main() thread.
    * Since the lock is never released by the first thread, the second thread will hang indefinitely, making option D a correct answer.
     */
    private Lock lock = new ReentrantLock();
    public void goSwimming() {
        lock.lock();           // y1
        if (lock.tryLock()) {  // y2
            System.out.println("Swim!");
        }
        lock.unlock();
    }

}

public class ErrorLockNoReleaseCorectly {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            BeachManager b = new BeachManager();
            service = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 2; i++)
                service.submit(() -> b.goSwimming());
        } finally {
            if (service != null) service.shutdown();
        }
        System.out.print("Tasks Complete");
    }
}