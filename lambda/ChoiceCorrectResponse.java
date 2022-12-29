package lambda;
import java.util.function.*;
import java.util.*;

public class ChoiceCorrectResponse {

    /**
        Which of these statements is true about the following code?

        A. The code does not compile because of one of the variables named x.
        B. The code does not compile because of one of the variables named y.
        C. The code does not compile for another reason.
        D. The code compiles, and the var in each lambda refers to the same type.
        E. The code compiles, and the var in each lambda refers to a different type.

        While there appears to have been a variable name shortage when this code was written, it does compile.
        Lambda variables and method names are allowed to be the same.
        The x lambda parameter is scoped to within each lambda, so it is allowed to be reused.
        The type is inferred by the method it calls. The first lambda maps x to a String and the second to a Boolean.
        Therefore, option E is correct.
     */
    public void method() {
        x((var x) -> {}, (var x, var y) -> 0);
    }
    public void x(Consumer<String> x, Comparator<Boolean> y) {
    }

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

        The question starts with a UnaryOperator<Integer>, which takes one parameter and returns a value of the same type.
        Therefore, option E is correct, as UnaryOperator actually extends Function.
        Notice that other options don’t even compile because they have the wrong number of generic types
        for the functional interface provided. You should know that a BiFunction<T,U,R> takes three generic arguments,
        a BinaryOperator<T> takes one generic argument, and a Function<T,R> takes two generic arguments.

     */
    static void unaryEquivalent(){
        UnaryOperator<Integer> u = x -> x * x;
    }



}