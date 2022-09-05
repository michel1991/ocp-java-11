package workingWithAdvancedStreamPipelineConcepts;
import java.util.*;
import java.util.stream.*;

class ChainingOptionals{
 
  private static void withoutChainingThreeDigit(Optional<Integer> optional){
     if(optional.isPresent()){
            var num = optional.get();
            var string = "" + num;
            if(string.length() == 3) 
                System.out.println(string);
     }
  }
  
 private static void withChainingThreeDigit(Optional<Integer> optional){
      optional.map(n -> "" + n)
              .filter( s -> s.length() == 3)
              .ifPresent(System.out::println)
     ;
 }

 static void withChainingUsingRefMethod(){
	 String value = "jobs";
	 Optional<String> stringOptional = Optional.of(value);
    Optional<Integer> intOptional = stringOptional.map(String::length);
    System.out.println();
     System.out.print("Chaining using reference method, number of length of  " + value + " word is ");
    intOptional.ifPresent(System.out::print);
    System.out.println();
 }
  
  public static void main(String[] args){
     
     Optional<Integer> withValueGreatThanThreeDigit = Optional.of(12345);
      System.out.println("With common traditional code value great than three digit ");
      withoutChainingThreeDigit(withValueGreatThanThreeDigit);
      System.out.println();

      System.out.println("With common traditional code empty value ");
      withoutChainingThreeDigit(Optional.empty());
      System.out.println();

     Optional<Integer> withValueThreeDigit = Optional.of(123);
     System.out.println("With value three digit functional programming ");
     withChainingThreeDigit(withValueThreeDigit);
     System.out.println();

     System.out.println("With value three digit functional programming with empty value");
      withChainingThreeDigit(Optional.empty());
      withChainingUsingRefMethod();
   }

}
