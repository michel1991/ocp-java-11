package usingCommonIntermediateOperations;
import java.util.stream.*;

class MapOperation{
  
   static void basicExample(){
      Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
      s.map(String::length)
            .forEach(System.out::print); // 67 
   }

  public static void main(String[] args){
      basicExample();
  }

}
