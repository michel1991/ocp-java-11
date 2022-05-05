package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.*;

class FlatMapOperation{
  
   static void basicExample(){
      List <String> zero = List.of();
      var one = List.of("Bonobo");
      var two = List.of("Mama Gorilla", "Baby Gorilla");
      Stream<List<String>> animals = Stream.of(zero, one, two);

    
      animals.flatMap(m -> m.stream())
            .forEach(System.out::println);  
   }

  public static void main(String[] args){
      basicExample();
  }

}
