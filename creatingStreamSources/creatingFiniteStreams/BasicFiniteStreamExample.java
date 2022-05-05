package creatingStreamSources.creatingFiniteStreams;
import java.util.stream.*;

public class BasicFiniteStreamExample{

   static void  firstExample(){
       Stream<String> empty = Stream.empty();  // count 0
       Stream<Integer> singleElement = Stream.of(1); // count = 1
       Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3 
   }

  public static void main(String[] args){
      firstExample();    
  }
}
