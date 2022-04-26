package usingMethodReferences.callingInstanceMethodsOnAParticularObject;
import java.util.function.Supplier;
import java.util.Random;

public class CallingInstanceMethodWithSupplier{
  public static void main(String[] args){
    var random = new Random();
    Supplier<Integer> methodRef = random::nextInt;
    Supplier<Integer> lambda = () -> random.nextInt();
  }
}
