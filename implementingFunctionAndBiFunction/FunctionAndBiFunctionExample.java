package implementingFunctionAndBiFunction;
import java.util.function.*;

class FunctionAndBiFunctionExample{
  
   static void function(){
     Function<String, Integer> f1 = String::length;
     Function<String, Integer> f2 =  x ->  x.length();

    System.out.println("reference function with function: " + f1.apply("cluck"));
    System.out.println("reference function with lambda: " + f2.apply("cluck"));

   }


   static void biFunction(){ 
     BiFunction<String, String, String> b1 = String::concat;
     BiFunction<String, String, String> b2 =  (string, toAdd) ->  string.concat(toAdd);
    
    System.out.println("reference BiFunction with function: " + b1.apply("baby ", "chick"));
    System.out.println("reference BiFunction with lambda: " + b2.apply("baby ", "chick"));
    
   }

  public static void main(String[] args){
   
   function();
   System.out.println();
   biFunction();
 
  }

}
