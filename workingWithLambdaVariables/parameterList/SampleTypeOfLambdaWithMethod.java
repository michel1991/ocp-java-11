package workingWithLambdaVariables.parameterList;
import java.util.function.*;

public class SampleTypeOfLambdaWithMethod{
  public static void main(String[] args){
      var sample = new SampleTypeOfLambdaWithMethod();
       sample.whatAmI();
  }
  
  public void whatAmI(){
      test( (var x) -> x >2 , 123);
   }

  public void test(Predicate<Integer>c, int num){
      c.test(num);
   }
}
