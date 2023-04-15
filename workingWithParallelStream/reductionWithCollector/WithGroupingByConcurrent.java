package workingWithParallelStream.reductionWithCollector;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

public class WithGroupingByConcurrent {
    public static void main(String[] args){
        var ohMy =
          Stream.of("lions", "tigers", "bears")
                .parallel()
        ;

        ConcurrentMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingByConcurrent(
                        String::length
                )
        );

        System.out.println(map);
        System.out.println(map.getClass());
    }
}