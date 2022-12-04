package collectingUsingBasicCollectors.groupingBy;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;
/**
* By default default collections that hold value is List
*/
public class WithCountingCollectors {

    /**
    * Le collecteur groupingBy() (The groupingBy() collector) indique à collect() qu'il doit regrouper tous les éléments du flux dans une Map.
    * La fonction détermine les clés de la Map. Chaque valeur de la Map est une liste de toutes les entrées qui correspondent à cette clé.
    * By default default collections that hold value is List
    */
    static void usingAnyCollectorsValueIsSizeOfListThatHoldValue(){
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()

                )
        );
        System.out.println("Begin from stream to Map by specify any downstream collectors that hold value" );
        System.out.println("\t group by length  using any collector: " + map);
        System.out.println("\t class is " + map.getClass());
        System.out.println("End from stream to Map by specify any downstream collectors that hold value" );
    }

    public static void main(String... args){
        usingAnyCollectorsValueIsSizeOfListThatHoldValue();
    }

}