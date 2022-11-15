package stream;
import java.util.stream.*;
import java.util.*;


public class FlatMapOperations {

    /**
    * The Stream starts out containing three lists. Since we limit the size to 2, the third list is ignored.
    * This means peek 2 is run twice—for x1 and x2—making option B correct.
    * Then flatMap() runs, getting rid of the empty list and flattening out the three elements of x2.
    * Now peek 2 sees these three elements, making option F correct.
    * Finally, each of the three elements has 1 added to it, and those numbers (2, 3, and 4) are printed by the forEach().
     */
  static void printlnWithLimitFirstOperation(){
      List<Integer> x1 = Arrays.asList();
      List<Integer> x2 = Arrays.asList(1, 2, 3);
      List<Integer> x3 = Arrays.asList(4, 5, 6);
      Stream.of(x1, x2, x3)
            .limit(2)
            .peek(System.out::println) // peek 1
            .flatMap(x -> x.stream())
            .peek(System.out::println) // peek 2
            .map(x -> x + 1)
            .forEach(System.out::println);
   }

    public static void main(String... args){
      printlnWithLimitFirstOperation();
   }

}