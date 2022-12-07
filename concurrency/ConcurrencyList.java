package concurrency;
import java.util.*;
import java.util.concurrent.*;

class ConcurrencyList{
    /**
    * What is the result of executing the following code snippet?
    *   A. It outputs 3 6 4.
        B. It outputs 6 6 6.
        C. It outputs 6 3 4.
        D. The code does not compile.
        E. It compiles but throws an exception at runtime on line x1.
        F. It compiles but throws an exception at runtime on line x2.
        G. It compiles but enters an infinite loop at runtime.

       The code compiles without issue, so option D is incorrect.
       The CopyOnWriteArrrayList class is designed to preserve the original list on iteration, so the first loop will be executed exactly three times and,
       in the process, will increase the size of tigers to six elements.
       The ConcurrentSkipListSet class allows modifications, and since it enforces uniqueness of its elements, the value 5 is added only once leading to a total of four elements in bears.
       Finally, despite using the elements of lions to populate the collections, tigers and bears are not backed by the original list, so the size of lions is 3 throughout this program.
       For these reasons, the program prints 3 6 4, and option A is correct.
     */
    public static void addWhileLooping(){
       List<Integer> lions = new ArrayList<>(List.of(1,2,3));
       List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
       Set<Integer> bears = new ConcurrentSkipListSet<>();
       bears.addAll(lions);
       for(Integer item: tigers) tigers.add(4); // x1
       for(Integer item: bears) bears.add(5); // x2
      System.out.println(lions.size() + " " + tigers.size() + " " + bears.size());
    }

    public static void main(String... args){
        System.out.println( " adding to list while looping ");
	addWhileLooping();
    }
   
}
