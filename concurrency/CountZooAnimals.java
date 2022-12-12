package concurrency;
import java.util.*;
import java.util.concurrent.*;

/**
    Assuming an implementation of the performCount() method is provided prior to runtime,
    which of the following are possible results of executing the following application? (Choose all that apply.)

    A. It outputs a number 10 times.
    B. It outputs a Boolean value 10 times.
    C. It outputs a null value 10 times.
    D. It outputs Exception! 10 times.
    E. It hangs indefinitely at runtime.
    F. The code will not compile because of line o1.
    G. The code will not compile because of line o2

    The code compiles and runs without issue, so options F and G are incorrect.
    The return type of performCount() is void, so submit() is interpreted as being applied to a Runnable expression.
    While submit(Runnable) does return a Future<?>, calling get() on it always returns null.
    For this reason, options A and B are incorrect, and option C is correct.
    The performCount() method can also throw a runtime exception, which will then be thrown by the get() call as an ExecutionException;
    therefore, option D is also a correct answer.
    Finally, it is also possible for our performCount() to hang indefinitely, such as with a deadlock or infinite loop.
    Luckily, the call to get() includes a timeout value.
    While each call to Future.get() can wait up to a day for a result, it will eventually finish, so option E is incorrect.
 */
public class CountZooAnimals {
    public static void performCount(int animal) {
        // IMPLEMENTATION OMITTED
    }
    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.DAYS)); // o1
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
    public static void main(String[] args) throws Exception {
        ExecutorService s = null;
        final var r = new ArrayList<Future<?>>();
        try {
            s = Executors.newSingleThreadExecutor();
            for(int i = 0; i < 10; i++) {
                final int animal = i;
                r.add(s.submit(() -> performCount(animal))); // o2
            }
            r.forEach(f -> printResults(f));
        } finally {
            if(s != null) s.shutdown();
        } }
}