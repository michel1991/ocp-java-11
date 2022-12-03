package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class AveragingCollectors {
    /**
     * Return a Double Object
     */
    static void averageOfStringLength(){
        System.out.println("Beging average of string length without type ");
        var ohMy = Stream.of("lions", "tiggers", "bears");

        Double result = ohMy
             .collect(
                     Collectors.averagingInt(String::length)
        );
        System.out.println("\t average of string length " + result);
        System.out.println("End average of string length without type ");

    }

    /**
    * Return a Double Object
    */
    static void averageOfStringLengthWithType(){
        System.out.println("Beging average of string length without type ");
        var ohMy = Stream.of("lions", "tiggers", "bears");
        ToIntFunction<String> map =  String::length;

        // Attention return double object
        Double result = ohMy
                            .collect(
                                    Collectors.averagingInt(map)
                            );
        System.out.println("\t average of string length " + result);
        System.out.println("End average of string length without type ");

    }

    public static void main(String... args){
        averageOfStringLength();
        System.out.println();
        averageOfStringLengthWithType();
    }
}