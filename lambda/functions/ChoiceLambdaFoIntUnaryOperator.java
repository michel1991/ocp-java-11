package lambda.functions;
import java.util.function.*;
import java.util.*;

/**
 Which of the following lambda expressions
 can be passed to a method that takes IntUnaryOperator as an argument? (Choose three.)
    A. v -> {System.out.print("Hello!"); return 2%1;}
    B. (Integer w) -> w.intValue()
    C. (int j) -> (int) 30L
    D. (int q) -> q / 3.1
    E. (long x) -> (int) x
    F. z -> z

  The IntUnaryOperator takes an int value and returns an int value.
  Options B and E are incorrect because the parameter types,
  Integer and long, respectively, are not int.
  Option B is incorrect because unboxing can be used for expressions,
  but it cannot be used for parameter matching.
  Option D is incorrect because dividing an
  int by a double value 3.1 results in q/3.1 being a double value,
  which cannot be converted to int without an explicit cast.
  Option E is incorrect because the parameter type must match,
  and long is not the same as int.
  The rest of the lambda expressions are valid,
  since they correctly take an int value and return an int value.
 */
public class ChoiceLambdaFoIntUnaryOperator {
    public static void main(String... args){
        IntUnaryOperator res1 = v -> {System.out.print("Hello!"); return 2%1;};
        IntUnaryOperator res2 = (int j) -> (int) 30L;
        IntUnaryOperator res3 =  z -> z;
    }
}