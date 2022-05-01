package implementingPredicateAndBiPredicate;
import java.util.function.*;

class PredicateAndBiPredicateExample{
   
   static void predicate(){
    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();

     System.out.println("method reference predicate " + p1.test(""));
     System.out.println("lambda expression predicate " + p2.test(""));

   }

     static void  biPredicate(){ 
      BiPredicate<String, String> b1 = String::startsWith;
      BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
    
     System.out.println("method reference bipredicate " + b1.test("chicken", "chick"));
     System.out.println("lambda expression bipredicate " + b2.test("chicken", "chick"));
    
   }

  public static void main(String[] args){
    predicate();
     System.out.println();
    biPredicate();
  }
}
