package mappingStreams;
import java.util.stream.*;
import java.util.*;

class FlatMapWithPrimitiveStream{
   public static void main(String[] args){
      var integerList = new ArrayList<Integer>();
      IntStream ints = integerList.stream()
                                  .flatMapToInt( x -> IntStream.of(x) )
      ;

       DoubleStream doubles = integerList.stream() 
                                      .flatMapToDouble( x -> DoubleStream.of(x) )
      ;

       LongStream longs = integerList.stream()
                                      .flatMapToLong( x -> LongStream.of(x) )
      ;
       
   }

}
