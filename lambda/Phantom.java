import java.util.function.*;

/**
   Which of the following lambda expressions
   can be inserted into both blanks while
   still allowing the application to compile? (Choose three.)
   
    A. System.out::print
    B. a -> {System.out.println(a.intValue());}
    C. g -> {System.out.println();}
    D. u -> System.out.println((long)u)
    E. v -> System.out.print(v)
    F. w -> System.out::println
    
    To start with, bustNow() takes a Double value, while bustLater()
    takes a double value. To be compatible, the lambda expression has
    to be able to handle both data types. Option A is correct,
    since the method reference System.out::print matches overloaded
    methods that can take double or a Double.
    Option E is also correct, as it’s the equivalent
    rewrite of option A with a lambda expression. Option B is incorrect,
    since intValue() works for the Consumer<Double>, which takes Double,
    but not DoubleConsumer, which takes double.
    For a similar reason, option D is also incorrect
    because only the primitive double is compatible with this expression.
   Option C is correct and results in just a blank line being printed.
   Finally, option F is incorrect because of incompatible data types.
   The method reference code is inside of a lambda expression,
   which would only be allowed if the functional interface
   returned another functional interface reference.


 */
abstract class Phantom {
    public void bustLater(DoubleConsumer buster, double value) {
        buster.accept(value);
    }
}
public class Ghost extends Phantom {
    public void bustNow(Consumer<Double> buster, double value) {
        buster.accept(value);
    }
    void call() {
        var value = 10.0;
        
        bustNow(System.out::print, value);
        bustLater(System.out::print, value);
        
        //bustNow(_________________, value);
        //bustLater(_________________, value);
    }
}