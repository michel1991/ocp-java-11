import java.util.function.*;
public class ErrorLocalVariableInsideLambdaBody{
   public void variables(int a){
      int b = 1;
     Predicate<Integer> p1 = a ->{
           int b = 0;
           int c = 0;
          return b == c;
      };
   }


   public static void main(String[] args){
     var sample = new  ErrorLocalVariableInsideLambdaBody();
    sample.variables(2); 
   }
}
