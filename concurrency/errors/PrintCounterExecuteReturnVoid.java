package concurrency.errors;
import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;

/**
*  What is the result of executing the following program? (Choose all that apply.)
    A. It prints 0 1 2 3 4.
    B. It prints 1 2 3 4 5.
    C. It prints null null null null null.
    D. It hangs indefinitely at runtime.
    E. The output cannot be determined.
    F. The code will not compile because of line n1.
    G. The code will not compile because of line n2.

  The key to solving this question is to remember that the execute() method returns void, not a Future object.
  Therefore, line n1 does not compile, and option F is the correct answer.
  If the submit() method had been used instead of execute(), then option C would have been the correct answer,
  as the output of the submit(Runnable) task is a Future<?> object that can only return null on its get() method.

 */
class PrintCounter {
    static int count = 0;
    public static void main(String[] args) throws
    InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            var r = new ArrayList<Future<?>>();
            IntStream.iterate(0,i -> i+1).limit(5).forEach(
                    i -> r.add(service.execute(() -> {count++;})) // n1
            );
            for(Future<?> result : r) {
                System.out.print(result.get()+" "); // n2
            }
        } finally {
            if(service != null) service.shutdown();
        } } }

public class PrintCounterExecuteReturnVoid {

}