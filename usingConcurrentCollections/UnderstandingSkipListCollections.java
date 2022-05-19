package usingConcurrentCollections;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;


public class UnderstandingSkipListCollections{
  public static void withSet(){
      Set<String> gardenAnimals = new ConcurrentSkipListSet<>();
      gardenAnimals.add("rabbit");
     gardenAnimals.add("gopher");
     var result = gardenAnimals.stream()
                               .collect(Collectors.joining(","))
     ;
     System.out.println(result);
  }

  static void withMap(){
    Map<String, String> rainForestAnimalDiet = new ConcurrentSkipListMap<>();
    rainForestAnimalDiet.put("koala", "bamboo");
    rainForestAnimalDiet.entrySet()
                        .stream()
                        .forEach( 
                                (e) -> System.out.println( e.getKey() + "-" + e.getValue() ) 
                    
                        )
            ;

  }

   public static void main(String[] args){
       withSet();
       withMap();
   }


}
