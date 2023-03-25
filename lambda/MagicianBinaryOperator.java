package lambda;
import java.util.function.*;

/**
 * Which lambda expression can be passed to the magic() method?
    A. (a) -> a
    B. (b,w) -> (long)w.intValue()
    C. (c,m) -> {long c=4; return c+m;}
    D. (Integer d, Integer r) -> (Long)r+d
    E. None of the above

    BinaryOperator˂Long˃ takes two Long arguments and returns a Long value.
    For this reason, option A, which takes one argument, and option D,
    which takes two Integer values that do not inherit from Long, are both incorrect.
    Option C is incorrect because the local variable c is re-declared inside the lambda expression,
    causing the expression to fail to compile.
    The correct answer is option B because intValue() can be called on a Long object.
    The result is then be cast to long, which is autoboxed to Long.
 */
class Magician {
    public void magic(BinaryOperator<Long> lambda) {
        lambda.apply(3L, 7L);
    }
}

public class MagicianBinaryOperator {
   public static void main(String... args){

   }
}