package stream.flatMap;
import java.util.stream.*;
import java.util.*;
/**
* What’s the terminal operation? There isn’t one. That means that the intermediate operations,
* including both peek() statements,
* never run. Options A and D are correct because no output is produced.
 */
public class StreamWithoutTerminateOperation {
  public  static void listOfList(){
      List<Integer> x1 = Arrays.asList();
      List<Integer> x2 = Arrays.asList(1, 2, 3);
      List<Integer> x3 = Arrays.asList(4, 5, 6);

        Stream.of(x1, x2, x3)
             .limit(2)
             .peek(System.out::println) // peek 1
             .flatMap(x -> x.stream())
             .peek(System.out::println) // peek 2
             .map(x -> x + 1)
            // .collect(Collectors.toList())
            // .forEach(System.out::println)
      ;

  }

    public static void main(String... args){
      listOfList();
   }
}