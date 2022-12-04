package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/**
 * By default default collections that hold value is List
 */
class PartitioningExample{
  static void partitioningByStringLength(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, List<String>> map = ohMy
                .collect(
                       Collectors.partitioningBy(
                             s -> s.length() <= 5
                      )
     );
       System.out.println("Beging partitioning by string length less than or equals to five (5) with lambda on FI");
       System.out.println("\t " + map);
       System.out.println("Beging partitioning by string length less than or equals to five (5) with lambda on FI");

  }

    static void partitioningByStringLengthWithType(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Predicate<String> predicate =  s -> s.length() <= 5;
      Map<Boolean, List<String>> map = ohMy
                  .collect(
                            Collectors
                                     .partitioningBy(predicate )
                  );

      System.out.println("Beging partitioning by string length less than or equals to five (5) using type on FI");
      System.out.println("\t " + map);
      System.out.println("End partitioning by string length less than or equals to five (5) using type on FI ");

  }


  static void partitioningByStringLengthSevenCharactersAllow(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, List<String>> map = ohMy.collect(
                       Collectors.partitioningBy(
                             s -> s.length() <= 7
                      )
     );

      System.out.println("Begin partitioning by string length less than or equals to five (7) with lambda " );
          System.out.println("\t " + map);
     System.out.println("End partitioning by string length less than or equals to five (7) with lambda  ");

  }


  static void partitioningByStringLengthSevenCharactersAllowAlsoChangingTypeThatHoldDataToSet(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, Set<String>> map = ohMy.collect(
                       Collectors.partitioningBy(
                             s -> s.length() <= 7,
                             Collectors.toSet()
                      )
     );

      System.out.println("Begin partitioning by string length less than or equals to five (7) and changing type that hold value to Set  with lambda on FI: " );
         System.out.println("\t " + map);
         System.out.println("\t type of map " +map.getClass());

      System.out.println("End partitioning by string length less than or equals to five (7) and changing type that hold value to Set  with lambda on FI: " );

  }

    static void partitioningByStringLengthSevenCharactersAllowAlsoChangingTypeThatHoldDataToSetWithTypeOnFI(){
      var ohMy = Stream.of("lions", "tigers", "bears");
      Predicate<String> condition =  s -> s.length() <= 7;
      Map<Boolean, Set<String>> map = ohMy.collect(
              Collectors.partitioningBy(
                      condition,
                      Collectors.toSet()
              )
      );

      System.out.println("Begin partitioning by string length less than or equals to five (7) and changing type that hold value to Set  with type on FI: " );
      System.out.println("\t " + map);
      System.out.println("\t type of map " +map.getClass());

      System.out.println("End partitioning by string length less than or equals to five (7) and changing type that hold value to Set  with type on FI: " );

  }

   public static void main(String[] args){

     partitioningByStringLength();
     System.out.println();
     partitioningByStringLengthWithType();
     System.out.println();
     partitioningByStringLengthSevenCharactersAllow();
     System.out.println();
     partitioningByStringLengthSevenCharactersAllowAlsoChangingTypeThatHoldDataToSet();
     System.out.println();
     partitioningByStringLengthSevenCharactersAllowAlsoChangingTypeThatHoldDataToSetWithTypeOnFI();
   }

}
