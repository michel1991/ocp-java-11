package  workingWithParallelStream;
import java.util.*;
import java.util.stream.*;

public class  ProcessingParallelReductionCombineResults{
    static void reduceListOfChar(){
      System.out.println(
          List.of('w', 'o', 'l', 'f')
              .parallelStream()
              .reduce(
                  "",
                  (s1, c) -> s1 + c,
                  (s2, s3) -> s2 + s3
              )
     );
   }

   static void substractWithReduceWithOmitCombinerParameter(){
      System.out.println(
          List.of(1, 2, 3, 4, 5, 6)
              .parallelStream()
              .reduce(
                  0,
                  (a, b) -> (a - b)
              )
     );
   }

   public static void main(String[] args){
       System.out.println("Reduce list of char bellow");
       reduceListOfChar();
       System.out.println();
        System.out.println("Substract with Reduce omit combiner parameter using value [1, 2, 3, 4, 5, 6]");
       substractWithReduceWithOmitCombinerParameter();
   }
}
