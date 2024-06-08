package interfaces.function.unaryOperator;
import java.util.function.*;
import java.util.*;

public class Print213243 {
    /**
     What can be inserted in the following code so that it will print [21, 32, 43] ?
        List<Integer> ls = Arrays.asList(11, 22, 33);
        //INSERT CODE HERE
        ls.replaceAll(func);
        System.out.println(ls);
        
        A.
          Function<Integer> func = x->x+10;
            -----
            This option will not compile because the objective of a Function is to take argument
            of one type and return a value of another type and so it requires a specification of two generic types (instead of just one).
            For example: Function<Integer, String> func = x->""+x; It takes an Integer and returns a String.
            It is possible for a Function to return the value of the same type as the argument.
            For example, Function<Integer, Integer> func = x->x+10; will compile fine.
            However, it will still not work here because List's replaceAll method requires a UnaryOperator.
           
        B. UnaryOperator<Integer> func = x->x+10;
            List's replaceAll method takes a UnaryOperator as argument.
            This option implements a UnaryOperator correctly.
            The difference between a UnaryOperator and a Function is that the type of the return value of
            a Function can be different from the type of its argument while return type of a UnaryOperator is always the same
            
        C. UnaryOperator<Integer, Integer> func = x->x+10;
        D. Consumer<Integer> func = x->x+10;
        E. Operator<Integer> func = x->x+10;
           Operator is not a valid functional interface. There is a UnaryOperator and a BinaryOperator.
           
      Correct(B)

     */
    public static void main(String... args){
        List<Integer> ls = Arrays.asList(11, 22, 33);
        //INSERT CODE HERE
        UnaryOperator<Integer> func = x->x+10;
        ls.replaceAll(func);
        System.out.println(ls);
    }
}