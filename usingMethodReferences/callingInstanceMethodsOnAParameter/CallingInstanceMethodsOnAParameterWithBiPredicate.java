package usingMethodReferences.callingInstanceMethodsOnAParameter;
import java.util.function.BiPredicate;

public class CallingInstanceMethodsOnAParameterWithBiPredicate{
  public static void main(String[] args){
      BiPredicate<String, String> methodRef = String::startsWith;
      BiPredicate<String, String>  lambda = (s, p) -> s.startsWith(p);
  }
}
