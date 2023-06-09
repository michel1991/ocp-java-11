package stream.primitives.errors;
import java.util.stream.*;

public class NotIntegerSummaryStatisticsExist {
    /**
     * What is the true of the following? (Choose two.)
        A. The output is 60-0-40
        B. The output is 60-2-40
        C. The code does not compile for one reason.
        D. The code does not compile for two reasons.
        E. Correct code could be written without summary statistics using a single stream pipeline.
        F. Correct code could not be written without summary statics using a single stream pipeline.
        
       The code does not compile because the class should be IntSummaryStatistics,
       not IntegerSummaryStatistics. This makes option C correct.
       The purpose of using the summary statistics class is
       to avoid multiple trips through the stream pipeline,
       making option F the other answer.
     */
     public static void main(String... args){
         IntegerSummaryStatistics stats = Stream.of(20, 40)
           .mapToInt(i -> i)
           .summaryStatistics();
         long total = stats.getSum();
         long count = stats.getCount();
         long max = stats.getMax();
         System.out.println(total + "-" + count + "-" + max);
     }
}