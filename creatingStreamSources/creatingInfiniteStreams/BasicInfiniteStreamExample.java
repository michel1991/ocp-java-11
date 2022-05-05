package creatingStreamSources.creatingInfiniteStreams;
import java.util.stream.*;

public class BasicInfiniteStreamExample{
 
   static void firstExample(){
     Stream<Double> randoms = Stream.generate(Math::random);
     Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);  
   }

  public static void main(String[] args){
     firstExample();
  }

}
