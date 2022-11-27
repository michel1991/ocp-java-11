package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.function.*;

class MapOperation{
  
   static void basicExample(){
      Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
      s.map(String::length)
            .forEach(System.out::print); // 67 
   }

    static void basicExampleWithType(){
       Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
       Function<String, Integer> transformByLength = String::length;
       s.map(transformByLength)
       .forEach(System.out::print); // 67
   }

  public static void main(String[] args){
      basicExample();
      System.out.println();
      basicExampleWithType();
  }

}
