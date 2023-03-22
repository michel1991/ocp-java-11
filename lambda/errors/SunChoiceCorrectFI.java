package lambda.errors;
import java.util.function.*;

/**
 * Which functional interface, when filled into the blank, prevents the class from compiling?
    A. DoubleUnaryOperator
    B. Function˂String,String˃
    C. IntToLongFunction
    D. UnaryOperator
    E. All of the above allow the code to compile

    A lambda expression can match multiple functional interfaces.
    It matches DoubleUnaryOperator, which takes a double value and returns a double value.
    Note that the data type of s+1 is double because one of the operands,
    in this case s, is double.
    It also matches Function<String,String> since the addition (+) operator can be used for String concatenation.
    Finally, it matches IntToLongFunction, since the int value s+1 can be implicitly cast to long.
    On the other hand, the lambda expression is not compatible with UnaryOperator without a generic type.
    When UnaryOperator is used without a generic argument,
    the type is assumed to be Object. Since the addition operator is not defined on Object,
    the code does not compile due to the lambda expression body, making option D the correct answer.
    Note that if the lambda expression did not rely on the addition operator, such as s -> s,
    then UnaryOperator would be allowed by the compiler, even without a generic type.
 */
public class Sun {
    public static void dawn(UnaryOperator sunrise) {} //  public static void dawn(_____________ sunrise) {}
    public void main(String... rays) {
        dawn(s -> s+1);
    }
}

public class SunChoiceCorrectFI {

}