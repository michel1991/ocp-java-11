package summarizeStatistics;
import java.util.stream.*;
import java.util.*;

class SummarizeStatistics{
   private static int max(IntStream ints){
      OptionalInt optional = ints.max();
     return optional.orElseThrow( RuntimeException::new);
   }

   private static int range(IntStream ints){
      IntSummaryStatistics stats = ints.summaryStatistics();
      if(stats.getCount() == 0) 
         throw new RuntimeException();
      return stats.getMax() - stats.getMin();
  }

}
