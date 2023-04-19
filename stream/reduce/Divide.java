package stream.reduce;
import java.util.stream.*;
import java.util.*;


/**
  Given the following code snippet, which values of x will allow the call divide(x)
   to compile and provide predictable results at runtime? (Choose two.)
   
    A. Set.of(1f,2f,3f,4f).stream()
    B. List.of(1f,2f,3f,4f).stream()
    C. List.of(1f,2f,3f,4f).parallel()
    D. List.of(1f).parallelStream()
    E. List.of(1f,2f,3f,4f).parallelStream()
    F. List.of(1f).parallel()
    
    Option A is incorrect because sets are unordered.
    Options C and F are incorrect because the correct method call is parallelStream().
    Option E is incorrect because the accumulator and combiner in the divide()
    method are not well-behaved. In particular, they are not associative and in a parallel stream,
    could produce various results at runtime. On a serial ordered stream,
    though, the results will be processed sequentially and in a predictable order,
    making option B correct. Option D is correct because the stream has only one element,
    so the identity is the only thing that will be applied.
 */
public class Divide {
    static float divide(Stream<Float> s) {
        return s.reduce(1.0f, (a,b) -> a/b, (a,b) -> a/b);
    }
    
    public static void main(String... args){
        
    }
}