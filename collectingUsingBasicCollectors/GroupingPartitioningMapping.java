package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class GroupingPartitioningMapping{
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

     usingAnyCollectors();
  }
  
}
