package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;

class GroupingByCollectors{

   static void firstLetterOfFirstAnimalGroupByLength(){
       var ohMy = Stream.of("lions", "tigers", "bears");
       Map<Integer, Optional<Character>> map = ohMy.collect(
               Collectors.groupingBy(
                  String::length,
                   Collectors.mapping(
                       s -> s.charAt(0),
                       Collectors.minBy( (a, b) -> a-b  )
                    )

              )

       );

       System.out.println(map);
   }


 static void firstLetterOfFirstAnimalGroupByLengthWithStaticImport(){
       var ohMy = Stream.of("lions", "tigers", "bears");
       Map<Integer, Optional<Character>> map = ohMy.collect(
               groupingBy(
                  String::length,
                     mapping(
                       s -> s.charAt(0),
                       minBy( (a, b) -> a-b  )
                    )

              )

       );

       System.out.println(map);
   }



  public static void main(String[] args){
     firstLetterOfFirstAnimalGroupByLength();
     firstLetterOfFirstAnimalGroupByLengthWithStaticImport();
   }

}
