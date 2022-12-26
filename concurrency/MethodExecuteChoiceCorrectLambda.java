package concurrency;
import java.util.concurrent.*;

public class MethodExecuteChoiceCorrectLambda {
    /**
     * Which lambda expressions can be inserted into the blank that would allow the code to compile?
     *  A. () -> System.out::println
        B. () -> 10
        C. () -> {throw new IOException();}
        D. 1 + Math::random
        E. () -> return 2
        F. None of the above

        The question may seem to be about ExecutorService, but since the execute() method takes only Runnable expressions,
        it is really about which options are valid Runnable expressions.
        Options A, D, and E are invalid lambda expressions, regardless of the type.
        Option B is a valid Callable expression since it returns a value, but not a valid Runnable expression.
        Likewise, option C is a valid Callable expression because it throws a checked exception,
        but not a valid Runnable expression. Since none of these is a valid Runnable expressions, option F is correct.
     */
   static void choiceCorrectMethod(){
       ExecutorService service = null;
       try {
           service = Executors.newSingleThreadExecutor();
           service.execute(() -> System.out.println("sample response")); // service.execute(__________________);
       } finally {
           if(service != null) service.shutdown();
       }
   }
}