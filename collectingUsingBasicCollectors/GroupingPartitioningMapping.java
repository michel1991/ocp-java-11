package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class GroupingPartitioningMapping{
  static void groupByLength(){
     var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map = ohMy.collect(
           Collectors.groupingBy(String::length)
    );
   System.out.println("group by length " + map);
  }

  public static void main(String[] args){
     groupByLength();
  }
  
}
