package stream.parallel;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/**
   Given the following code snippet, which lambda expressions
   are the best choices for an accumulator? (Choose two.)

    A. (a,b) -> (a-b)
    B. (a,b) -> 5
    C. (a,b) -> i++
    D. (a,b) -> {words.add("awesome"); return 0;}
    E. (a,b) -> {return 0;}
    F. (a,b) -> words.add("awesome")

    An accumulator in a serial or parallel reduction should be associative and stateless.
    In a parallel reduction, problematic accumulators tend to produce more visible errors.
    
    Option A is not associative, since (a-b)-c is not the same as a-(b-c) for all values a, b, and c.
    Options C and D are incorrect because they represent stateful lambda expressions,
    which should be avoided especially on parallel streams.
   
    Option F doesn’t even compile,
    since the return type is a boolean, not an Integer.
    
    That leaves us with the correct answers, options B and E.
    While these accumulators may not seem useful,
    they are both stateless and associative,
    which meets the qualifications for performing a reduction.
 */
 class GoodAccumulator {
    int i = 0;
    List<String> words = new ArrayList<>();
    public void test() {
        BiFunction<Integer,Integer,Integer> x = (a,b) -> 5; // _____________
        System.out.print(List.of(1,2,3,4,5)
         .parallelStream()
         .reduce(0,x,(s1, s2) -> s1 + s2));
    } }

public class GoodAccumulatorReduction {

}