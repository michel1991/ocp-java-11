package workingWithLambdaVariables.parameterList;
import java.util.function.*;

public class SampleParameterList{
  public static void main(String[] args){
    Predicate<String> p = x -> true;
    Predicate<String> p2 = (var x) -> true;
    Predicate<String> p3 = (String x ) -> true;
  }
}
