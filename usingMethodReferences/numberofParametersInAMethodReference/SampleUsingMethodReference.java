package usingMethodReferences.numberofParametersInAMethodReference;
import java.util.function.*;

public class SampleUsingMethodReference{
  public static void main(String[] args){
      Supplier<Integer> methodRef1 = Penguin::countBabies;
      Supplier<Integer> lambda1 = () -> Penguin.countBabies();

      Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
      Function<Penguin, Integer> lambda2 = (x) -> Penguin.countBabies(x);

      BiFunction<Penguin, Penguin,  Integer> methodRef3 = Penguin::countBabies;
      BiFunction<Penguin, Penguin,  Integer> lambda3 = (x, y ) -> Penguin.countBabies(x, y); 
   }

}
