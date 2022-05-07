package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class MoreCollectingIntoMap{
   static void createAnimalNameSepareByComma(){
      var ohMy = Stream.of("lions", "tiggers", "bears");
      Map<Integer, String> map = ohMy.collect( 
                 Collectors.toMap(
                         String::length, 
                        k -> k,
                        (s1, s2) -> s1 + "," + s2
                    ) 
      );
      System.out.println("create string  without specify which map " + map);
      System.out.println(map.getClass()); 
   }


   static void createAnimalNameSepareByCommaWithSpecifyMap(){
      var ohMy = Stream.of("lions", "tiggers", "bears");
      Map<Integer, String> map = ohMy.collect(
                 Collectors.toMap(
                         String::length,
                        k -> k,
                        (s1, s2) -> s1 + "," + s2,
                        TreeMap::new
                    )
      );
      System.out.println("create string  without specify which map " + map);
      System.out.println(map.getClass());
   }


   public static void main(String[] args){
      createAnimalNameSepareByComma();
      createAnimalNameSepareByCommaWithSpecifyMap();
   }

}
