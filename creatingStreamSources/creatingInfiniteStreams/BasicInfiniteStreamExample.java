package creatingStreamSources.creatingInfiniteStreams;
import java.util.stream.*;

public class BasicInfiniteStreamExample{
 
   static void firstExample(){
     Stream<Double> randoms = Stream.generate(Math::random);
     Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);  
   }
   
   static void overloadedIterate(){
      Stream<Integer> oddNumberUnder100 =
       Stream.iterate(
         1, // seed
         n -> n < 100 , // Predicate to specify when done
         n -> n + 2  // UnaryOperator to get next value 
      );

  }


  public static void main(String[] args){
     firstExample();
  }

}
