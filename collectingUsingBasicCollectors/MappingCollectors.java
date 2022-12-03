package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class MappingCollectors {

    static void collectingIntoMapSpecifyValueOfKey(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Map<String,  Integer> map = ohMy
                       .collect(
                               Collectors.toMap(
                                       s-> s,
                                       String::length
                               )
           )
        ;
        System.out.println("Begin from stream to Map   without type" );
           System.out.println("\t basic example collecting into map " + map);
           System.out.println("End from stream to Map   without type" );
    }

    static void collectingIntoMapSpecifyValueOfKeyWithType(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Function<String, String> theKey  = s-> s;
        Function<String, Integer> theValue  =  String::length;
        Map<String,  Integer> map = ohMy
                    .collect(
                                Collectors.toMap(
                                        theKey,
                                        theValue
                            )
           )
        ;
        System.out.println("Begin from stream to Map   with type" );
        System.out.println("\t basic example collecting into map " + map);
        System.out.println("End from stream to Map   with type" );
    }

    static void collectingIntoMapWithIdentity(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Map<String,  Integer> map = ohMy
                                    .collect(
                                                Collectors.toMap(
                                                        Function.identity(),
                                                        String::length
                                            )
        );
        System.out.println("Begin from stream to Map without type using identity " );
        System.out.println("\t basic example collecting into map using function identity " + map);
        System.out.println("Begin from stream to Map without type using identity " );

    }
    static void collectingIntoMapWithIdentityWithType(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Function<String, String> theKey  =  Function.identity();
        Function<String, Integer> theValue  =  String::length;
        Map<String,  Integer> map = ohMy
                                    .collect(
                                            Collectors.toMap(
                                                    theKey,
                                                    theValue
                                            )
                                    );
        System.out.println("Begin from stream to Map without type using identity with type " );
        System.out.println("\t basic example collecting into map using function identity " + map);
        System.out.println("Begin from stream to Map without type using identity with type " );

    }

    public static void main(String[] args){
        collectingIntoMapSpecifyValueOfKey();
        System.out.println();
        collectingIntoMapSpecifyValueOfKeyWithType();
        System.out.println();
        collectingIntoMapWithIdentity();
        System.out.println();
        collectingIntoMapWithIdentityWithType();
    }
}