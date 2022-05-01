package convenienceMethodsOnFunctionalInterfaces;
import java.util.function.*;

public class ConvenienceWithPredicate{
 
  static void predicate(){
     Predicate<String> egg = s -> s.contains("egg");
     Predicate<String> brown = s -> s.contains("brown"); 
    
     Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");

     Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

     Predicate<String> convenienceBrownEggs = egg.and(brown);
     Predicate<String> convenienceOtherEggs = egg.and(brown.negate());   
  }

 public static void main(String[] args){
   predicate();
     
 }

}
