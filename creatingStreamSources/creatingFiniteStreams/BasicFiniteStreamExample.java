package creatingStreamSources.creatingFiniteStreams;
import java.util.stream.*;
import java.util.*;

public class BasicFiniteStreamExample{

   static void  firstExample(){
       Stream<String> empty = Stream.empty();  // count 0
       Stream<Integer> singleElement = Stream.of(1); // count = 1
       Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3 
   }
  
  static void collectionToStream(){
    var list = List.of("a", "b", "c");
    Stream<String> fromList = list.stream();
  }

 static void parallelStream(){
        var list = List.of("a", "b", "c");
       Stream<String> fromListParallel = list.parallelStream();
  }   

  public static void main(String[] args){
      firstExample();    
      System.out.println();
     collectionToStream();
  }
}
