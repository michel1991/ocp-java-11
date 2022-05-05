package usingCommonIntermediateOperations;
import java.util.stream.*;

class FilterOperation{
  
   static void basicFilter(){
      Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
      s.filter( x -> x.startsWith("m")).forEach(System.out::print); // monkey 
   }

  public static void main(String[] args){
      basicFilter();
  }

}
