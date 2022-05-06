package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;

class BasicExamplePrimitiveStream{
    static void sumWithMapToInt(){
       Stream<Integer> stream = Stream.of(1, 2, 3);
       var result = stream.mapToInt( x -> x)
                          .sum()
       ;

       System.out.println(" sum with mapToInt " + result);
    }
    

   static void average(){
     IntStream intStream = IntStream.of(1, 2, 3);
     OptionalDouble avg = intStream.average();
     System.out.println(" average with IntStream " + avg.getAsDouble());
   }

   public static void main(String[] args){
       System.out.println("InStream apply sum with reduce from mapToInt stream");
       sumWithMapToInt();
        average(); 
   }
}
