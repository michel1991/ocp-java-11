package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.function.*;

class FilterOperation{
  
   static void basicFilter(){
      Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
      s.filter( x -> x.startsWith("m")).forEach(System.out::print); // monkey 
   }

    static void basicFilterWithType(){
       Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
       Predicate<String> startsWith = (x) -> x.startsWith("m");
         s.filter(startsWith)
          .forEach(System.out::print); // monkey
   }

  public static void main(String[] args){
      basicFilter();
      System.out.println();
      basicFilterWithType();
  }

}
