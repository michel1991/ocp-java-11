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

 public static void main(String[] args){
    System.out.println("average in one line with primitive ");
     avarage();
 }
}
