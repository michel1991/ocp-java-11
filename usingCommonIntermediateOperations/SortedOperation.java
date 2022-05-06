package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class SortedOperation{
  
   static void basicExample(){
      Stream<String> s = Stream.of("brown-", "bear-");

    
      s.sorted()
            .forEach(System.out::print);  
   }

   static void exampleWithComparator(){
      Stream<String> s = Stream.of("brown bear-", "grizzly-");  
      
      
      s.sorted(Comparator.reverseOrder())                
            .forEach(System.out::print);  
   }


  public static void main(String[] args){
      basicExample();
      System.out.println();
      System.out.println("Below with commparator");
     exampleWithComparator();
  }

}
