package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class CreateWithMapping {
   static void fromStringStreamObjectToIntStream(){
       System.out.println("Beging from string stream object to int stream ");
      Stream<String> objetStream = Stream.of("penguin", "fish", "dog");
      ToIntFunction<String> mapping = String::length;
      IntStream  intStream = objetStream.mapToInt(mapping);
      IntConsumer display = System.out::println;
      intStream.forEach(display);
      System.out.println("End from string stream object to int stream ");
   }

    static void fromIntStreamToStringStreamObject(){
       System.out.println("Beging from int stream to  string stream object");
       IntStream intStream = IntStream.rangeClosed(1, 3);
       IntFunction<Integer> mapping = Integer::valueOf;
       Consumer<Integer> display = System.out::println;
       Stream<Integer> objectStream =  intStream.mapToObj(mapping);
       objectStream.forEach( display );
       System.out.println("End from int stream to  string stream object");
   }

    public static void main(String... args){
       fromStringStreamObjectToIntStream();
       System.out.println();
       fromIntStreamToStringStreamObject();

   }
}