package stream.parallel;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class ChangingToPrint100 {
  /**
     Which changes, when made independently, guarantee
     the following code snippet prints 100 at runtime? (Choose all that apply.)

        A. Change the data implementation class to a CopyOnWriteArrayList.
        B. Remove parallel() in the stream operation.
        C. Change forEach() to forEachOrdered() in the stream operation.
        D. Change parallel() to serial() in the stream operation.
        E. Wrap the data implementation class with a call to Collections.synchronizedList().
        F. The code snippet will always print 100 as is.

        The code may print 100 without any changes,
        but since the data class is not thread-safe,
        the code may print other values. For this reason,
        option F is incorrect.
        Options A and E both change the data class to a thread-safe class
        and guarantee 100 will be printed at runtime.
        Options B and C are also correct,as they both cause the stream to apply the add() operation in a serial manner.
        Option D is incorrect, as serial() is not a stream method.
        For more information, see Chapter 7.
   */
  static void source(){
      List<Integer> data = new ArrayList<>();
      IntStream.range(0,100).parallel().forEach(s -> data.add(s));
      System.out.println(data.size());
  }

    static void removeParallelFromInitial(){
      System.out.println("beging: change,  remove parallel from initial");
      List<Integer> data = new ArrayList<>();
      IntStream.range(0,100).forEach(s -> data.add(s));
      System.out.println(data.size());
      System.out.println("end change,  remove parallel from initial");
   }

    static void remplaceForEachByForEachOrderedFromInitial(){
      System.out.println("beging: change,  use forEachOrdered ");
      List<Integer> data = new ArrayList<>();
      IntStream.range(0,100).parallel().forEachOrdered(s -> data.add(s));
      System.out.println(data.size());
      System.out.println("end: change,  use forEachOrdered ");
   }

    static void useCopyOnWriteArrayListFromInitial(){
      System.out.println("beging: change,  use CopyOnWriteArrayList ");
      List<Integer> data = new CopyOnWriteArrayList<>();
      IntStream.range(0,100).parallel().forEachOrdered(s -> data.add(s));
      System.out.println(data.size());
      System.out.println("end: change,  use CopyOnWriteArrayList ");
  }

    public static void main(String... args){
      removeParallelFromInitial();
      remplaceForEachByForEachOrderedFromInitial();
      useCopyOnWriteArrayListFromInitial();
  }

}