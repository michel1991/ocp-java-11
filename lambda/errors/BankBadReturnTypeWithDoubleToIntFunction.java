package lambda.errors;
import java.util.*;
import java.util.function.*;

/**
   What is the output of the following application?
    A. 100
    B. 200
    C. 250
    D. The code does not compile because of line j1.
    E. None of the above.

    The code does not compile because the lambda expression p -> p*100 is not compatible
    with the DoubleToIntFunction functional interface.
    The input to the functional interface is double, meaning p*100 is also double.
    The functional interface requires a return value of int,
    and since double cannot be implicitly cast to int,
     the code does not compile, making option E the correct answer.
     If the correct cast was applied to make (p*100) an int,
     then the rest of the class would compile
     and 250 would be printed at runtime, making option C correct.
 */
class Bank {
    private int savingsInCents;
    private static class ConvertToCents {
        static DoubleToIntFunction f = p -> p*100;
    }
    public static void main(String... currency) {
        Bank creditUnion = new Bank();
        creditUnion.savingsInCents = 100;
        double deposit = 1.5;

        creditUnion.savingsInCents +=
         ConvertToCents.f.applyAsInt(deposit);  // j1
        System.out.print(creditUnion.savingsInCents);
    }
}

public class BankBadReturnTypeWithDoubleToIntFunction {

}