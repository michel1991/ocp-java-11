package usingOptionalWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;

class OptionalWithPrimitiveStream{
  static void avarage(){
      var stream = IntStream.rangeClosed(1, 10);
      OptionalDouble optional = stream.average();
      optional.ifPresent(System.out::println);
      System.out.println(optional.getAsDouble());
      System.out.println( optional.orElseGet( () -> Double.NaN) );
  }

 static void sumWithLong(){
     LongStream longs = LongStream.of(5, 10);
     long sum = longs.sum();
     System.out.println( "sum with long " + sum );
  }

 public static void main(String[] args){
    System.out.println("average in one line with primitive ");
     avarage();
    System.out.println();
    sumWithLong();
 }
}
