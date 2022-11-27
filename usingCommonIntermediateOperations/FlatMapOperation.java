package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class FlatMapOperation{
  
   static void basicExample(){
      List <String> zero = List.of();
      var one = List.of("Bonobo");
      var two = List.of("Mama Gorilla", "Baby Gorilla");
      Stream<List<String>> animals = Stream.of(zero, one, two);


      animals.flatMap(m -> m.stream())
            .forEach(System.out::println);
   }

    static void basicExampleWithType(Function<List<String>, Stream<String>> forFlatMap){
       List <String> zero = List.of();
       var one = List.of("Bonobo");
       var two = List.of("Mama Gorilla", "Baby Gorilla");
       Stream<List<String>> animals = Stream.of(zero, one, two);

       Function<List<String>, Stream<String>> reduceToOneElementPairStream =  forFlatMap;
       animals
       .flatMap(reduceToOneElementPairStream)
       .forEach(System.out::println);
   }

  public static void main(String[] args){
      basicExample();
      System.out.println();
      basicExampleWithType(m -> m.stream());
      System.out.println();
      basicExampleWithType(List::stream);
  }

}
