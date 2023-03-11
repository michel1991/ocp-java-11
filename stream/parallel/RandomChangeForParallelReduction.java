package stream.parallel;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class RandomChangeForParallelReduction {

    /**
     *  How many changes need to be made to the following stream operation to execute a parallel reduction?
        A. None, it is already a parallel reduction.
        B. One.
        C. Two.
        D. Three.
        E. The code does not compile.
        F. None of the above.

       To execute a parallel reduction with the collect() method,
       the stream or Collector must be unordered, the Collector must be concurrent,
       and the stream must be parallel. Since an unordered Set is used as the data source,
       the first property is fulfilled. To be a parallel reduction, though,
       Collectors.groupByConcurrent() should be used instead of Collectors.groupingBy().
       In addition, parallelStream() should be called on the Set, instead of stream().
       For these two reasons, option C is correct.
     */
    static void changeForParallelReduction(){
        var r = new Random();
        var data = Stream.generate(() -> String.valueOf(r.nextInt()))
                   .limit(50_000_000)
                   .collect(Collectors.toSet());
                        var map = data.stream()
                   .collect(Collectors.groupingBy(String::length));

    }
}