package stream;
import java.util.*;
import java.util.stream.*;

/**
* Assuming this class is accessed by only a single thread at a time, what is the result of calling the countIceCreamFlavors() method?
*   A. The method consistently prints 499.
    B. The method consistently prints 500.
    C. The method compiles and prints a value, but that value cannot be determined ahead of time.
    D. The method does not compile.
    E. The method compiles but throws an exception at runtime.
    F. None of the above

   The method looks like it executes a task concurrently, but it actually runs synchronously.
   In each iteration of the forEach() loop, the process waits for the run() method to complete before moving on.
   For this reason, the code is actually thread-safe.
   It executes a total of 499 times, since the second value of range() excludes the 500.
   Since the program consistently prints 499 at runtime, option A is correct.
   Note that if start() had been used instead of run() (or the stream was parallel), then the output would be indeterminate, and option C would have been correct.

 */
 class Flavors {
    private static int counter;
    public static void countIceCreamFlavors()  {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(1, 500)
        .forEach(m -> new Thread(task).run());
        System.out.println(counter);
    }
}

public class ThreadWithStreamFlavors {
   public static void main(String... args){
       Flavors.countIceCreamFlavors();
   }
}