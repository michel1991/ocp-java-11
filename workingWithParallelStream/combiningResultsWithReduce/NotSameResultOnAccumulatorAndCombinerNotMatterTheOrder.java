package  workingWithParallelStream.combiningResultsWithReduce;
import java.util.*;
import java.util.stream.*;

/**
 * Nous pouvons omettre un paramètre de combinateur(combiner parameter) dans ces exemples,
 * car l'accumulateur peut être utilisé lorsque les types de données intermédiaires sont les mêmes.

 */
public class NotSameResultOnAccumulatorAndCombinerNotMatterTheOrder {
    public static void main(String[] args){
        System.out.println(
                List.of(1, 2, 3, 4, 5, 6)
              .parallelStream()
              .reduce(
                      0,
                      (a, b) -> (a - b)
                )
        );
    }
}