package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class GroupingPartitioningMapping{
  static void groupByLength(){
     var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map = ohMy.collect(
           Collectors.groupingBy(String::length)
    );
   System.out.println("group by length using List to hold data:  " + map);
  }

   static void groupByLengthUsingSetThatHoldValue(){
     var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Set<String>> map = ohMy.collect(
           Collectors.groupingBy(
               String::length,
               Collectors.toSet()

          )
    );
   System.out.println("group by length  using Set to hold data: " + map + " class is " + map.getClass());
  }


   static void groupByLengthUsingTreeMapThatHoldValue(){
     var ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Set<String>> map = ohMy.collect(
           Collectors.groupingBy(
               String::length,
               TreeMap::new,
               Collectors.toSet()

          )
    );
   System.out.println("group by length  using TreeMap to hold data: " + map + " class is " + map.getClass());
  }

  static void groupByLengthPreserveTypeThatHoldValue(){
     var ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, List<String>> map = ohMy.collect(
           Collectors.groupingBy(
               String::length,
               TreeMap::new,
               Collectors.toList()

          )
    );
   System.out.println("group by length preserve type that  hold data: " + map + " class is " + map.getClass());
  }

  static void usingAnyCollectors(){
     var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Long> map = ohMy.collect(
           Collectors.groupingBy(
               String::length,
               Collectors.counting()

          )
    );
   System.out.println("group by length  using any collector: " + map + " class is " + map.getClass());
  }


  public static void main(String[] args){
     groupByLength();
     groupByLengthUsingSetThatHoldValue();
     groupByLengthUsingTreeMapThatHoldValue();
     groupByLengthPreserveTypeThatHoldValue();
     usingAnyCollectors();
  }
  
}
