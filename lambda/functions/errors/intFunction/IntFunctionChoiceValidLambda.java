package lambda.functions.errors.intFunction;
import java.util.function.*;

public class IntFunctionChoiceValidLambda {
    /**
     * How many of the following lines compile?
        A. None
        B. One
        C. Two
        D. Three
        E. Four
        F. Five
      To start with, IntFunction<Integer> takes an int value and returns an Integer.
      Line 8 takes an Integer instead of int as the input argument, and is therefore not compatible.

      Line 9 is compatible, since the return type null can be used as an Integer return type.
      Line 10 is also valid. An int can be autoboxed to Integer.
      
       Lines 11 and 12 do not compile because they do not take a parameter.
       Since only two statements compile, option C is the correct answer.
     */
  static void choice(){
      IntFunction<Integer> f1 =(Integer f) -> f; //  8:
      IntFunction<Integer> f2 = (v) -> null; // 9:
      IntFunction<Integer> f3 = s -> s; // 10:
      IntFunction<Integer> f4 = () -> 5; //  11:
      IntFunction<Integer> f5 = () -> Integer.valueOf(9); //  12:
  }
}