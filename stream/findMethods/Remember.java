package stream.findMethods;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Remember {
    /**
    * Which are true statements? (Choose all that apply.)
    *  R: findAny() and findFirst() are guaranteed to return the same result if the stream is empty
    *  R: findAny() and findFirst() are guaranteed to return the same result if the stream has exactly one element.
    *
    * When the stream is empty, both methods return an empty Optional.
    * When the stream has one element, both methods return an Optional containing that element.
    * When there are multiple elements, findAny() makes no guarantees about which element is returned.
     */
    public static void findAnyAndFirst(Stream<?> streamFindAny, Stream<?> streamFindFirst){
       var resultEmptyStreamFindAny = streamFindAny.findAny();
       var resultEmptyStreamFindFirst = streamFindFirst.findFirst();
       System.out.println(resultEmptyStreamFindAny);
       System.out.println(resultEmptyStreamFindFirst);
   }

    static void customPrintln(Object value){
        System.out.println("\t "+ value + "\t");
    }

    /**
    * The findFirst() method guarantees the first element in the stream will be returned, whether it is serial or parallel, making options A and D correct.
    * While option B may consistently print 1 at runtime, the behavior of findAny() on a serial stream is not guaranteed, so option B is incorrect.
    * Option C is likewise incorrect, with the output being random at runtime. Option E is incorrect because any of the previous options will allow the code to compile.
     */
    public static void findFirstWithParallelStream(){
        System.out.println("begin find First with parallel stream and flat map ");
        // Consumer<? super Integer> printResult =  (x) -> System.out.println("\t "+ x + "\t"); ;
        Consumer<? super Number> printResult =  Remember::customPrintln ;
        var data = List.of(List.of(1,2),
                           List.of(3,4),
                           List.of(5,6));
                data.parallelStream() // p1
                    .flatMap(s -> s.stream())
                     .findFirst() // p2
                .ifPresent(printResult); // System.out::print)
                System.out.println("end find First with parallel stream and flat map");
    }

    public static void findFirstWithBasicStreamAndFlatMap(){
        System.out.println("begin find First with basic stream and flat map ");
        Consumer<? super Number> printResult =  Remember::customPrintln ;
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
        findAnyAndFirst(Stream.empty(), Stream.empty());
        findAnyAndFirst(Stream.of(1), Stream.of(1));
        System.out.println();
        findFirstWithParallelStream();
        findFirstWithBasicStreamAndFlatMap();
   }
}