package stream.findMethods.parallel;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class FindFirstWithParallelStream {
    static void customPrintln(Object value){
        System.out.println("\t "+ value + "\t");
    }

    /**
      The findFirst() method guarantees the first element in the stream will be returned,
      whether it is serial or parallel, making options A and D correct.
      While option B may consistently print 1 at runtime,
      the behavior of findAny() on a serial stream is not guaranteed, so option B is incorrect.
       Option C is likewise incorrect, with the output being random at runtime.
      Option E is incorrect because any of the previous options will allow the code to compile.
     */
    public static void findFirstWithParallelStream(){
        System.out.println("begin find First with parallel stream and flat map ");
        // Consumer<? super Integer> printResult =  (x) -> System.out.println("\t "+ x + "\t"); ;
        Consumer<? super Number> printResult =  FindFirstWithParallelStream::customPrintln ;
        var data = List.of(List.of(1,2),
                           List.of(3,4),
                           List.of(5,6));
        data.parallelStream() // p1
                    .flatMap(s -> s.stream())
                     .findFirst() // p2
                .ifPresent(printResult); // System.out::print)
        System.out.println("end find First with parallel stream and flat map");
    }
    
    public static void main(String... args){
        findFirstWithParallelStream();
    }
}