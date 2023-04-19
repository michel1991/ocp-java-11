package concurrency.errors;
import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;

/**
 * What is the output of the following application?
     A. null
    B. 1null
    C. 1
    D. Line 6 does not compile.
    E. Line 8 does not compile.
    F. An exception is thrown at runtime.
    
    The class does not compile because the Future.get()
    on line 8 throws a checked InterruptedException and a checked ExecutionException,
    neither of which is handled nor declared by the submitReports() method.
    If the submitReports() and accompanying main() methods were both updated to declare these exceptions,
    then the application would print 1null at runtime. For the exam,
    remember that Future can be used with Runnable lambda expressions
    that do not have a return value but that the return value is always null when completed.
    
 */
class TpsReport { // 3: 
    public void submitReports() { //   4: 
        var s = Executors.newCachedThreadPool(); //   5:   
        Future bosses = s.submit(() -> System.out.print("1")); //  6:  
        s.shutdown(); //  7:  
        System.out.print(bosses.get()); //  8: 
    } //    9: 
    public static void main(String[] memo) { //   10: 
        new TpsReport().submitReports(); //     11:
    } //   12: 
} //   13:

public class TpsReportMethodGetOfFutureThrowsCheckedException {
  
}