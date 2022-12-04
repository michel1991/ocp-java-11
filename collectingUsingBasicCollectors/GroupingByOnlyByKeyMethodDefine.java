package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;

public class GroupingByOnlyByKeyMethodDefine {
    /**
    * Le collecteur groupingBy() (The groupingBy() collector) indique à collect() qu'il doit regrouper tous les éléments du flux dans une Map.
    * La fonction détermine les clés de la Map. Chaque valeur de la Map est une liste de toutes les entrées qui correspondent à cette clé.
    * By default It is List that hold value
     */
   static void specifyOnlyHowToGetKey(){
       var ohMy = Stream.of("lions", "tigers", "bears");
       Function<String, Integer> howToDefineKey = String::length;
      Map<Integer, List<String>> map =  ohMy.collect(
               groupingBy(howToDefineKey)
       );
      System.out.println("Begin from stream to Map resolve duplicate key  without type" );
      System.out.println("\t create string  without specify which map " + map);
      System.out.println("\t " + map.getClass());
      System.out.println("End from stream to Map resolve duplicate key  without type" );
   }

    public static void main(String... args){
       specifyOnlyHowToGetKey();
   }
}