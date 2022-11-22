package lambda;
import java.util.function.*;
public class ChoiceFI {


    /**
    * Which functional interfaces complete the following code? For line 7, assume m and n are instances of functional interfaces that exist and have the same type as y. (Choose three.)
    * A. BinaryConsumer<String, String>
    * B. BiConsumer<String, String>
    * C. BinaryFunction<String, String>
    * D. BiFunction<String, String>
    * E. Predicate<String>
    * F. Supplier<String>
    * G. UnaryOperator<String>
    * H. UnaryOperator<String, String>
    *
    * We can eliminate four choices right away. Options A and C are there to mislead you; these interfaces don’t actually exist.
    * Option D is incorrect because a BiFunction<T,U,R> takes three generic arguments, not two. Option E is incorrect because none of the examples returns a boolean.
    * Moving on to the remaining choices, the declaration on line 6 doesn’t take any parameters, and it returns a String, so a Supplier<String> can fill in the blank, making option F correct.
    * Another clue is that it uses a constructor reference, which should scream Supplier! This makes option F correct.
    * The declaration on line 7 requires you to recognize that Consumer and Function, along with their binary equivalents, have an andThen() method.
    * This makes option B correct.
    *  Finally, line 8 takes a single parameter, and it returns the same type, which is a UnaryOperator.
    * Since the types are the same, only one generic parameter is needed, making option G correct.
     */
    static void firstSample(Supplier<String> x,BiConsumer<String, String> y, UnaryOperator<String> z){
      BiConsumer<String, String> m = (a, b) -> System.out.println( " m " + a.concat(" ").concat(b));
      BiConsumer<String, String>  n = (a, b) -> System.out.println(" n " + b.concat(" ").concat(a));
      x = String::new; //  6: ____________
      y = m.andThen(n); //  7: ____________ y
      z = a -> a + a; //  8: ____________
      y.accept("michel", "stephane");
  }

    public static void main(String... args){
        firstSample(() -> "Denise", (a, b) ->System.out.println(" n " + a.concat(b)) ,(a) -> a);
    }
}