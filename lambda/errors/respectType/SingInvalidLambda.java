package lambda.errors.respectType;
import java.util.function.*;

interface Sing {
    boolean isTooLoud(int volume, int limit);
}

/**
*
   What is the result of executing the following program?
    A. great
    B. not so great
    C. Compiler error on line m1
    D. Compiler error on line m2
    E. Compiler error on a different line
    F. A runtime exception is thrown.

   The functional interface takes two int parameters.
   The code on line m1 attempts to use them as if one is an Object,
   resulting in a compiler error and making option C the correct answer.

   It also tries to return String even though the return data type
   for the functional interface method is boolean.

   It is tricky to use types in a lambda when they are implicitly specified.
   Remember to check the interface for the real type.
 */
public class OperaSingerCallInvalidMethodInLambda {
    public static void main(String[] args) {
        check((h, l) -> h.toString(), 5);  // m1
    }
    private static void check(Sing sing, int volume) {
        if (sing.isTooLoud(volume, 10))   // m2
            System.out.println("not so great");
        else System.out.println("great");
    }
}