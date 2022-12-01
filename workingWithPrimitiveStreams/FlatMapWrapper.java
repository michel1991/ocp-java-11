package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class FlatMapWrapper {
    static void fromObjectIntegerToInt(){
        System.out.println("begin  fromObjectIntegerToInt ");
        var integerList = new ArrayList<Integer>();
        ToIntFunction<Integer> mapping = Integer::intValue;
        Function<Integer, IntStream> flatMap = IntStream::of;
        IntStream ints = integerList
                   .stream()
                   .flatMapToInt(flatMap)
        ;
        ints.forEach(System.out::println);
        System.out.println("End  fromObjectIntegerToInt ");
    }

    static void fromObjectIntegerToDouble(){
        System.out.println("begin  fromObjectIntegerToDouble ");
        var integerList = new ArrayList<Integer>();
        Function<Integer, DoubleStream> flatMap = DoubleStream::of;
        DoubleStream doubleStream = integerList
               .stream()
               .flatMapToDouble(flatMap)
        ;
        doubleStream.forEach(System.out::println);
        System.out.println("End  fromObjectIntegerToDouble");
    }

    static void fromObjectIntegerToLong(){
        System.out.println("begin  fromObjectIntegerToLong ");
        var integerList = new ArrayList<Integer>();
        Function<Integer, LongStream> flatMap = LongStream::of;
        LongStream longStream = integerList
                 .stream()
                 .flatMapToLong(flatMap)
        ;
        longStream.forEach(System.out::println);
        System.out.println("End  fromObjectIntegerToLong ");
    }


    public static void main(String... args){
        fromObjectIntegerToInt();
        System.out.println();
        fromObjectIntegerToDouble();
        System.out.println();
        fromObjectIntegerToLong();
    }
}