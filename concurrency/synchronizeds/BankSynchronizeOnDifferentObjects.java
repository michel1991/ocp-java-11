package concurrency.synchronizeds;
import java.util.concurrent.*;

/**
   Assuming 10 seconds is enough time for all of the tasks to finish,
   what is the output of the following application?
   
    A. 0
    B. 125
    C. -125
    D. The code does not compile.
    E. The result is unknown until runtime.
    F. An exception is thrown.
    
    The program compiles and does not throw an exception at runtime.
    The class attempts to add and remove values from a single cookie variable in a thread-safe manner
    but fails to do so because the methods deposit() and withdrawal() synchronize on different objects.
    The instance method deposit() synchronizes on the bank object, while the static method withdrawal()
    synchronizes on the static Bank.class object. Since the compound assignment operators (+=) and (-=)
    are not thread-safe, it is possible for one call to modify the value of cookies while the other is already operating on it,
    resulting in a loss of information.
    For this reason, the output cannot be predicted, and option E is the correct answer.
    If the two methods were synchronized on the same object, then the cookies variable would
    be protected from concurrent modifications, printing 0 at runtime.
 */
class Bank {
    static int cookies = 0;
    public synchronized void deposit(int amount) {
        cookies += amount;
    }
    public static synchronized void withdrawal(int amount) {
        cookies -= amount;
    }
    public static void main(String[] amount) throws Exception {
        var teller = Executors.newScheduledThreadPool(50);
        Bank bank = new Bank();
        for(int i=0; i < 25; i++) {
            teller.submit(() -> bank.deposit(5));
            teller.submit(() -> bank.withdrawal(5));
        }
        teller.shutdown();
        teller.awaitTermination(10, TimeUnit.SECONDS);
        System.out.print(bank.cookies);
    } }

public class BankSynchronizeOnDifferentObjects {
    public static void main(String[] amount) throws Exception {
        Bank.main(amount);
    }
}