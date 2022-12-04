package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class ConvertToSetCollectors {

    static void fromStreamToCollectionFilterAllStringStartsByT() {
        System.out.println("Begin from stream to Collection filter all string start by t  without type" );
        var ohMy = Stream.of("lions", "tiggers", "bears");
        TreeSet<String> result = ohMy
                                    .filter( s -> s.startsWith("t") )
                                    .collect(
                                              Collectors
                                                    .toCollection(TreeSet::new)
                                           )
        ;
        System.out.println("\t from stream to Collection filter all string start by t " + result);
        System.out.println("End from stream to Collection filter all string start by t  without type" );
    }

    static void fromStreamToCollectionFilterAllStringStartsByTWithType() {
        System.out.println("Begin from stream to Collection filter all string start by t  with type" );
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Predicate<String> filterPredicate =   s -> s.startsWith("t") ;
        Supplier<TreeSet<String>> supplier = TreeSet::new;
        TreeSet<String> result = ohMy
                                    .filter(filterPredicate )
                                    .collect(
                                               Collectors
                                                        .toCollection(supplier)
                                            )
        ;
        System.out.println("\t from stream to Collection filter all string start by t " + result);
        System.out.println("End from stream to Collection filter all string start by t  with type" );
    }

    public static void main(String[] args){
        fromStreamToCollectionFilterAllStringStartsByT();
          System.out.println();
        fromStreamToCollectionFilterAllStringStartsByTWithType();
    }
}