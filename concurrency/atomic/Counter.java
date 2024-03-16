package concurrency.atomic;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
 * Given:
   
   his class is supposed to keep an accurate count for the number of times the increment method is called.
   Several classes share this class and call its increment method. What should be inserted at //1 ?
   
  
    A. ai.increment();
       AtomicInteger does not have a method named increment.
    B. ai.incrementAndGet();
    
    C.  ai.set(ai.get()+1);
        This is wrong because between the time when ai.get() returns a value and ai.set() is called,
        another thread may call increment and may get to execute ai.set with the same value. This will make you lose one increment.
        
    D. ai.addAndGet(1);
    
    E. ai.add(1);
    F. ai++;
    (Correct B, D)
    
    AtomicInteger allows you to manipulate an integer value atomically. It provides several methods for this purpose.
    Please go through the JavaDoc API description for this class as it is important for the exam.
    
 */
public class Counter{
    static AtomicInteger ai = new AtomicInteger(0);
    public static void increment(){
        //1
         ai.incrementAndGet();
         ai.addAndGet(1);
    }
    //other valid code
}
