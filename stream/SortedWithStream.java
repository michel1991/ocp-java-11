package stream;
import java.util.stream.*;
import java.util.*;
public class SortedWithStream {
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