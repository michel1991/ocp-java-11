package summarizeStatistics;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class SummarizeStatistics{
   private static int maxWithoutSummary(IntStream ints){
      OptionalInt optional = ints.max();
     return optional.orElseThrow( RuntimeException::new);
   }

    static void callMaxWithoutSummaryWithEmpty(){
       try{
           maxWithoutSummary(IntStream.empty());
       }catch(Exception ex){
          ex.printStackTrace();
       }
   }

    /**
     * call two terminal operations amazing  on only one stream
     */
   private static int range(IntStream ints){
      IntSummaryStatistics stats = ints.summaryStatistics();
      if(stats.getCount() == 0) 
         throw new RuntimeException();
      return stats.getMax() - stats.getMin();
  }

    static void callRangeWithValue(){
       int result = range(IntStream.of(2,0, 1, 5));
       System.out.println(" call range on stream with value " + result );
   }

    static void callRangeWithEmpty(){
       try{
           range(IntStream.empty());
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }


    private static void averageWithSumary(){
       IntStream ints = IntStream.of(2,0, 1, 5);
       IntSummaryStatistics stats = ints.summaryStatistics();
       DoubleConsumer consumer = System.out::println;
       double average =  stats.getAverage();
       System.out.println(" average with IntSummaryStatistics " + average );
   }

    public  final static void main(String... args){
       averageWithSumary();
       System.out.println();
       callRangeWithValue();
       System.out.println();
       callMaxWithoutSummaryWithEmpty();
       System.out.println();
       callRangeWithEmpty();

   }

}
