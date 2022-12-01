package stream.parallel;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import java.util.concurrent.locks.*;

/**
* Given that the sum of the numbers from 1 (inclusive) to 10 (exclusive) is 45, what are the possible results of executing the following program? (Choose all that apply.)
*   A. 45 is printed.
    B. A number less than 45 is printed.
    C. A number greater than 45 is printed.
    D. An exception is thrown.
    E. None of the above, as the code does not compile

   The tryLock() method returns immediately with a value of false if the lock cannot be acquired.
   Unlike lock(), it does not wait for a lock to become available.
   This code fails to check the return value, resulting in the protected code being entered regardless of whether the lock is obtained.
   In some executions (when tryLock() returns true on every call), the code will complete successfully and print 45 at runtime, making option A correct.
  On other executions (when tryLock() returns false at least once), the unlock() method will throw an IllegalMonitorStateException at runtime, making option D correct.
  Option B would be possible if there was no lock at all, although in this case, failure to acquire a lock results in an exception at runtime.
 */
public class BankWithReentrantLock {
    private Lock vault = new ReentrantLock();
    private int total = 0;
    public void deposit(int value) {
        try {
            vault.tryLock();
            total += value;
        } finally {
            vault.unlock();
        }
    }
    public static void main(String[] unused) {
        var bank = new BankWithReentrantLock();
       IntStream.range(1, 10)
                 .parallel()
                 .forEach(s -> bank.deposit(s))
        ;
       System.out.println(bank.total);

    }
}