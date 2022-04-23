package implementingFunctionalInterfacesWithLambdas;
import java.util.*;
import java.util.function.Predicate;

public class TraditionalSearch{
   public static void main(String[] args){
     // list of animal

     var animals = new ArrayList<Animal>();
     animals.add(new Animal("fish", false, true));
   
     animals.add(new Animal("kangaroo", true, true));
     animals.add(new Animal("rabbit", true, false));

     animals.add(new Animal("turtle", false, true));

     // Pass lambda that does check
     print(animals, a -> a.canHop());
   }

   private static void print(List<Animal> animals, Predicate<Animal> checker){
      for (Animal animal : animals){
          if(checker.test(animal))
           System.out.print(animal + " ");
      }
   }

}
