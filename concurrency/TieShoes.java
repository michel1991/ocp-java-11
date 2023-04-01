package concurrency;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/**
 *  Which method can fill in the blank that would cause the program to consistently print Tie! ten times?
    A. lock()
    B. tryLock()
    C. tryLock(10)
    D. The code does not compile regardless of what is placed in the blank.
    E. None of the above.
    
    Option A is incorrect because the lock() method does not return a boolean value.
    Option B allows the class to compile (making option D incorrect),
    but is not guaranteed to print Tie! ten times. Depending on the thread ordering,
    it may print the value 1 to 10 times. Option C is incorrect because tryLock()
    with a time value also requires a TimeUnit parameter. For these reasons, option E is the correct answer.
 */
public class TieShoes {
    private Lock shoes = new ReentrantLock();
    public void tie() {
        try {
            if (shoes.tryLock()) { // shoes.__________________ default responses for compilation
                System.out.println("Tie!");
                shoes.unlock();
            }
        } catch (Exception e) {}
    }
    public static void main(String... unused) {
        var gate = new TieShoes();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> gate.tie()).start();
        }
    } }