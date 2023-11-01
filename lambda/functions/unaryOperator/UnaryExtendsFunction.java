package lambda.functions.unaryOperator;
import java.util.function.*;
import java.util.*;

public class UnaryExtendsFunction {



    /**
     *  second example
        Which of the following is equivalent to this code? (Choose all that apply.)
        UnaryOperator<Integer> u = x -> x * x;

        A. BiFunction<Integer> f = x -> x*x;
        B. BiFunction<Integer, Integer> f = x -> x*x;
        C. BinaryOperator<Integer, Integer> f = x -> x*x;
        D. Function<Integer> f = x -> x*x;
        E. Function<Integer, Integer> f = x -> x*x;
        F. None of the above

        The question starts with a UnaryOperator<Integer>,
        which takes one parameter and returns a value of the same type.
        Therefore, option E is correct, as UnaryOperator actually extends Function.
        Notice that other options don’t even compile because they have the wrong number of generic types
        for the functional interface provided. You should know that a BiFunction<T,U,R> takes three generic arguments,
        a BinaryOperator<T> takes one generic argument, and a Function<T,R> takes two generic arguments.

     */
    static void unaryEquivalent(){
        UnaryOperator<Integer> u = x -> x * x;
    }



}