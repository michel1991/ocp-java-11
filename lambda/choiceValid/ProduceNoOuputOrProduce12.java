package lambda.choiceValid;
import java.util.*;
import java.util.function.*;
/**
  Given:

        var nums = List.of(1, 2, 3, 4, 5, 6, 7).stream();
    
        Predicate<Integer> p = //a predicate goes here
    
        Optional<Integer> value = nums.filter(p).reduce((a, b)->a+b);
        value.ifPresent(System.out::println);
        
      A. setting p to a->a<0; will produce no output.
        This predicate will result in eliminating all elements from the stream and so, value will refer to an empty Optional.
        Thus, the Consumer in ifPresent will not be executed at all.
        
      B. setting p to a->a<0; will generate a NullPointerException.
      C. setting p to a->a<0; will generate a NoSuchElementException.
      D. setting p to a->a%2==0; will produce 12.
        This predicate will keep only those elements that satify the condition a%2==0 in the stream i.e.
        only even elements will be left. Their sum is 12.
       
     E. setting p to a->a%2==0; will produce 16.




 */
public class ProduceNoOuputOrProduce12 {
    public static void main(String... args){
        var nums = List.of(1, 2, 3, 4, 5, 6, 7).stream();

        //Predicate<Integer> p = //a predicate goes here
        Predicate<Integer> p =  a->a<0; //a predicate goes here
    
        Optional<Integer> value = nums.filter(p).reduce((a, b)->a+b);
        value.ifPresent(System.out::println);
    }
}