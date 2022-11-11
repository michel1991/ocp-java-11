package stream;
import java.util.stream.*;
import java.util.*;
public class SortedWithStream {
    /**
    * There is no Stream<T> method called compare() or compareTo(), so options A through D can be eliminated.
    * The sorted() method is correct to use in a stream pipeline to return a sorted Stream.
    * The collect() method can be used to turn the stream into a List.
    * The collect() method requires a collector be selected, making option E incorrect and option F correct.
     */
   public static List<String> sortByDesc(List<String> list){
       return list.stream()
       .sorted((a, b) -> b.compareTo(a))
       .collect(Collectors.toList());
   }

    public static void main(String... args){
      var surnames = List.of("pierre", "hawking", "michel", "jobs", "yava");
      System.out.println(sortByDesc(surnames));
    }
}