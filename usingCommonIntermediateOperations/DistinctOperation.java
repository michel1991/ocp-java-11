package usingCommonIntermediateOperations;
import java.util.stream.*;

class DistinctOperation{
  
   static void basicDistinct(){
      Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
      s.distinct().forEach(System.out::print); // duckgoose 
   }

  public static void main(String[] args){
       basicDistinct();
  }

}
