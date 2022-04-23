package workingWithLambdaVariables.localVariablesInsideTheLambdaBody;
import java.util.function.*;

public class ErrorLocalVariable{

   public void variables(int a){
       int b = 1;
      Predicate<Integer> p1 = a -> {
         int b = 0;
         int c = 0;
        return b == c;
     }
   }
}
