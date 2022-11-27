package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class SortedOperation{
  
   static void basicExample(){
      System.out.println("Sorted without comparator using natural order,  values are: brown-, bear-"); 	   
      Stream<String> s = Stream.of("brown-", "bear-");

    
      s.sorted()
            .forEach(System.out::print);  
   }

   static void exampleWithReverseComparatorUsingLamnbda(){
      System.out.println("Below with commparator define function to reverse, lambda, data are: brown bear-,  grizzly-");	   
      Stream<String> s = Stream.of("brown bear-", "grizzly-");  
      
      Comparator<String>  comparator = (a, b) -> b.compareTo(a);       
      s.sorted(comparator)              // Comparator.reverseOrder()   
            .forEach(System.out::print);  
   }

   static void exampleWithComparatorMethodReference(){                            
      System.out.println("Below with commparator using reference method, data are: brown bear-,  grizzly-");
      Stream<String> s = Stream.of("brown bear-", "grizzly-");  
      
      s.sorted(Comparator.reverseOrder())                 
            .forEach(System.out::print);  
   }
  

   static void exampleWithCustomComparator(){
     System.out.println("Below with commparator using lambda that print each value use by method to compare, data are: michjobs-,  mvouma-, stephane-, mvouma-"); 
     Stream<String> s = Stream.of("michjobs-", "mvouma-", "stephane-", "mvouma-");  
      
      Comparator<String>  comparator = (a, b) -> {
	     System.out.println("a: " + a + " b: "+ b);
         return  b.compareTo(a);
      };       

      s.sorted(comparator)            
            .forEach(System.out::print);  
   }

  public static void main(String[] args){	  
      basicExample();
      System.out.println();

      System.out.println();
      exampleWithReverseComparatorUsingLamnbda();
      System.out.println();

      System.out.println();
      exampleWithComparatorMethodReference();
      System.out.println(); 

     System.out.println();
     exampleWithCustomComparator();
  }

}
