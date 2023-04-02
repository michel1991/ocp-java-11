package lambda.functions;
import java.util.function.*;
import java.util.*;

public class DoubleToLongFunctionChoiceAnswer{
    /**
     * Which lambda expression cannot be assigned to a DoubleToLongFunction functional interface?
        A. a -> null==null ? 1 : 2L
        B. e -> (int)(10.0*e)
        C. (double m) -> {long p = (long)m; return p;}
        D. (Double s) -> s.longValue()
        E. All of these can be assigned.
        
        The DoubleToLongFunction interface takes a double argument and returns a long value.
        Option A is compatible since the int value 1 can be implicitly cast to long,
        and 2L is already a long. Option B is also compatible,
        since the double value 10.0*e is explicitly cast to int then implicitly cast to long.
        Next, option C is compatible because an explicit cast of the double to a long value is used.
        Option D cannot be assigned and is the correct answer.
        Although the Double class does have a longValue() method,
        the left-hand side of the lambda expression must use the primitive double, not the wrapper Double.
        This lambda expression violates the signature of the functional interface,
        since it allows Double values to be sent to the interface, including those that could be null.
     */
    static void choice(){
        DoubleToLongFunction first = a -> null==null ? 1 : 2L;
        DoubleToLongFunction second = e -> (int)(10.0*e);
         DoubleToLongFunction last = (double m) -> {long p = (long)m; return p;};
        
    }
    
    public static void main(String... args){
        
    }
} 