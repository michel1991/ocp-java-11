package workingWithParallelStream;
import java.util.stream.*;
import java.util.*;

public class CreatingParallelStreams{
   static void allingParallelOnAnExistingStream(){
      Stream<Integer> s1 = List.of(1, 2).stream();
       Stream<Integer> s2 = s1.parallel();
   }

   public static void callingParallelStreamOnACollectionObject(){
     Stream<Integer> s1 = List.of(1, 2).parallelStream();
   }
 
}
