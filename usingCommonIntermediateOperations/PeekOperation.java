package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class PeekOperation{
  
   static void basicExample(){
      var stream = Stream.of("black bear", "brown bear", "grizzly");

    
      long count =  stream.filter( s -> s.startsWith("g"))
                          .peek(System.out::println)
                          .count()
      ;

      System.out.println("result basic example " + count);  
   }

   static void exampleWithoutPeek(){
      var numbers = new ArrayList<>();
      var letters = new ArrayList<>();
       numbers.add(1);
       letters.add('a');
       Stream<List<?>> stream = Stream.of(numbers, letters);
        
      stream.map(List::size)                
            .forEach(System.out::print)
     ;   // 11
   }


   static void badPeekThatChangingState(){
      var numbers = new ArrayList<>();
      var letters = new ArrayList<>();
       numbers.add(1);
       letters.add('a');
       Stream<List<?>> bad = Stream.of(numbers, letters);

      bad.peek( x -> x.remove(0))
            .map(List::size)
            .forEach(System.out::print)
     ;   // 00
   }


  public static void main(String[] args){
      basicExample();
      System.out.println();
      System.out.println("Below without peek");
      exampleWithoutPeek();
      System.out.println();
      System.out.println();
      System.out.println("Bellow bad peek that changing state of stream that authorize that funny ");
      badPeekThatChangingState();
  }

}
