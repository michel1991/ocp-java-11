package lambda.functions;
import java.util.function.*;
import java.util.*;

/**
 *  Which functional interface, when filled into the blank, allows the class to compile?
    A. BiConsumer<Integer,Double>
    B. BiConsumer<Integer,Double,Double>
    C. BiFunction<Integer,Double,Double>
    D. BiFunction<Integer,Integer,Double>
    E. Function<Integer,Double>
    F. None of the above
    
    The lambda (s,p) -> s+p takes two arguments and returns a value.
    For this reason, options A and B are incorrect because BiConsumer does not return any values.
    Option E is also incorrect, since Function takes only one argument and returns a value.
    This leaves us with options C and D, which both use BiFunction,
    which takes two generic arguments and returns a generic value.
    Option D is incorrect because the datatype of the unboxed sum s+q is int,
    and int cannot be both autoboxed and implicitly cast to Double.
    Option C is correct. The sum s+p is of type double, and double can be autoboxed to Double.
 */
 class Asteroid {
    public void mine( BiFunction<Integer,Double,Double> lambda) { // ___________
        // IMPLEMENTATION OMITTED
    }
    public static void main(String[] debris) {
        new Asteroid().mine((s,p) -> s+p);
    }
}
public class AsteroidBiFunction {
  
}