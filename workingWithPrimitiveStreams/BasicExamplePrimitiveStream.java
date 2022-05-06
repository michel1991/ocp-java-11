package workingWithPrimitiveStreams;
import java.util.stream.*;

class BasicExamplePrimitiveStream{
    static void sumWithMapToInt(){
       Stream<Integer> stream = Stream.of(1, 2, 3);
       var result = stream.mapToInt( x -> x)
                          .sum()
       ;

       System.out.println(" sum with mapToInt " + result);
    }

   public static void main(String[] args){
       System.out.println("InStream apply sum with reduce from mapToInt stream");
      sumWithMapToInt(); 
   }
}
