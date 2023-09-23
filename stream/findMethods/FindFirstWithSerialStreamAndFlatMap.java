package stream.findMethods;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class FindFirstWithSerialStreamAndFlatMap {
    static void customPrintln(Object value){
        System.out.println("\t "+ value + "\t");
    }

    public static void findFirstWithBasicStreamAndFlatMap(){
        System.out.println("begin find First with basic stream and flat map ");
        Consumer<? super Number> printResult =  FindFirstWithSerialStreamAndFlatMap::customPrintln ;
        var data = List.of(List.of(1,2),
                           List.of(3,4),
                           List.of(5,6));
        data.stream() // p1
        .flatMap(s -> s.stream())
        .findFirst() // p2
        .ifPresent(printResult); // System.out::println
        System.out.println("end find First with basic stream and flat map");
    }



    public static void main(String... args){
        findFirstWithBasicStreamAndFlatMap();
   }
}