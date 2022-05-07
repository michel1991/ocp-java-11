package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class PartitioningExample{
  static void partitioningByStringLength(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, List<String>> map = ohMy.collect(
                       Collectors.partitioningBy(
                             s -> s.length() <= 5
                      )
     );
    
    System.out.println("partitioning by string length less than or equals to five (5) : " + map);

  }


  static void partitioningByStringLengthSevenCharactersAllow(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, List<String>> map = ohMy.collect(
                       Collectors.partitioningBy(
                             s -> s.length() <= 7
                      )
     );

    System.out.println("partitioning by string length less than or equals to five (7) : " + map);

  }

   public static void main(String[] args){

     partitioningByStringLength();
     partitioningByStringLengthSevenCharactersAllow();
   }

}
