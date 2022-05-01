package convenienceMethodsOnFunctionalInterfaces;
import java.util.function.*;

public class ConvenienceWithFunction{
 
  static void function(){
     Function<Integer, Integer> before = x ->  x + 1;
     Function<Integer, Integer> after = x ->  x * 2;

     
     Function<Integer, Integer> combined = after.compose(before);
     var result = combined.apply(3);   

     System.out.println(result);
        
  }

 public static void main(String[] args){
   function();
     
 }

}
