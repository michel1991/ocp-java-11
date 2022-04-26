package usingMethodReferences.callingInstanceMethodsOnAParameter;
import java.util.function.Predicate;

public class CallingInstanceMethodsOnAParameter{
  public static void main(String[] args){
      Predicate<String> methodRef = String::isEmpty;
      Predicate<String>  lambda = s -> s.isEmpty();
  }
}
