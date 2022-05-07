package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class MappingCollectors{
  
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


  public static void main(String[] args){
     firstLetterOfFirstAnimalGroupByLength(); 
     
   }
 
}
