package collectingUsingBasicCollectors.groupingBy;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;


public class WithMappingCollectors {
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

        System.out.println("Begin from stream to Map by specify mapping downstream collectors that hold value with lambda" );
            System.out.println("\t " + map);
            System.out.println("\t class is " + map.getClass());
        System.out.println("End from stream to Map by specify mapping downstream collectors that hold value with lambda" );
    }

    static void firstLetterOfFirstAnimalGroupByLengthWithType(){
        var ohMy = Stream.of("lions", "tigers", "bears");
        Function<String, Integer> keyMappingToNumberFirstLevel = String::length;
        Function<String, Character> mappingEachValueOfList = (currentValueOfList) -> currentValueOfList.charAt(0);
        //Comparator<Character> comparator = (a, b) -> a.compareTo​(b);
        Comparator<Character> comparatorListValueByAsc = Character::compare​;

        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(
                        keyMappingToNumberFirstLevel,
                        Collectors.mapping(
                                mappingEachValueOfList,
                                Collectors.minBy( comparatorListValueByAsc  )
                        )

                )

        );

        System.out.println("Begin from stream to Map by specify mapping downstream collectors that hold value with type on FI" );
            System.out.println("\t " + map);
            System.out.println("\t class is " + map.getClass());
        System.out.println("End from stream to Map by specify mapping downstream collectors that hold value with type on FI" );
    }

    public static void main(String[] args){
        firstLetterOfFirstAnimalGroupByLength();
        System.out.println();
        firstLetterOfFirstAnimalGroupByLengthWithType();
    }
}