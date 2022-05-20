package  workingWithParallelStream;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

class ProcessingParallelReductionCombineResultsWithCollect{
   static void skipListSet(){
      Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
      SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
      System.out.println(set);
   }
   
 static void usingToConcurrentMap(){
      Stream<String> ohMy = 
          Stream.of("lions", "tigers", "bears")
                .parallel()
        ;

       ConcurrentMap<Integer, String> map = ohMy.collect(
                Collectors.toConcurrentMap(
                    String::length,
                     k -> k,
                     (s1, s2) -> s1 + "," + s2
                   )
            );

        System.out.println(map);
        System.out.println(map.getClass());
         
  }

   public static void main(String[] args){
     skipListSet();
     System.out.println();
     System.out.println("using Collectors.toConcurrentMap");
     usingToConcurrentMap(); 
     System.out.println();
   }

}
