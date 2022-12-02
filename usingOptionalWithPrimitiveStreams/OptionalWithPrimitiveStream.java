package usingOptionalWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class OptionalWithPrimitiveStream{
  static void avarage(){
      System.out.println("Beging average with lambda on supplier");
      var stream = IntStream.rangeClosed(1, 10);
      OptionalDouble optional = stream.average();
      optional.ifPresent(System.out::println);
      System.out.println(optional.getAsDouble());
      System.out.println( optional.orElseGet( () -> Double.NaN) );
      System.out.println("End average with lambda on supplier");
  }

    static void avarageWithTypeOnSupplier(){
      System.out.println("Beging average using Type on supplier");
      var stream = IntStream.rangeClosed(1, 10);
      OptionalDouble optional = stream.average();
      optional.ifPresent(System.out::println);
      System.out.println(optional.getAsDouble());
      DoubleSupplier supplier = () -> Double.NaN;
      System.out.println( optional.orElseGet( supplier  ) );
      System.out.println("End average using Type on supplier");
  }

 static void sumWithLong(){
     LongStream longs = LongStream.of(5, 10);
     long sum = longs.sum();
     System.out.println( "sum with long " + sum );
  }

    static void sumWithEmptyInt(){
      IntStream ints = IntStream.empty();
      int sum = ints.sum();
      System.out.println( "sum with int empty " + sum );
  }

 public static void main(String[] args){
     avarage();
    System.out.println();
    avarageWithTypeOnSupplier();
    System.out.println();
    sumWithLong();
    System.out.println();
    sumWithEmptyInt();
 }
}
