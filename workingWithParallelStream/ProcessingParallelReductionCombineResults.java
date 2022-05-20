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

   public static void main(String[] args){
       System.out.println("Reduce list of char bellow");
       reduceListOfChar();
   }
}
