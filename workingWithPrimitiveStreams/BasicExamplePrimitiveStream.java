package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class BasicExamplePrimitiveStream{
    static void sumWithMapToInt(){
       Stream<Integer> stream = Stream.of(1, 2, 3);
       var result = stream.mapToInt( x -> x)
                          .sum()
       ;

       System.out.println(" sum with mapToInt " + result);
    }

    /**
     * Convert stream object into IntStream primitive
     */
    static void sumWithMapToIntWithType(){
        System.out.println("Begin sum with mapToInt  begin ");
        Stream<Integer> stream = Stream.of(1, 2, 3);
        ToIntFunction<Integer> convertToInt = Integer::intValue;
        var result = stream
                           .mapToInt(convertToInt)
                            .sum()
        ;

        System.out.println(" sum with mapToInt " + result);
        System.out.println("End sum with mapToInt  begin ");
    }


   static void average(){
     IntStream intStream = IntStream.of(1, 2, 3);
     OptionalDouble avg = intStream.average();
     System.out.println(" average with IntStream " + avg.getAsDouble());
   }

   public static void main(String[] args){
       System.out.println("InStream apply sum with reduce from mapToInt stream");
       sumWithMapToInt();
       System.out.println();
       sumWithMapToIntWithType();
       System.out.println();
        average(); 
   }
}
