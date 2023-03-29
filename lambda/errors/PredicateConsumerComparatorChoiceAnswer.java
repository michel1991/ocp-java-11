package lambda.errors;
import java.util.function.*;
import java.util.*;

/**
    What is true about the following code? (Choose two.)
    A. The code compiles successfully.
    B. One line does not compile.
    C. Two lines do not compile.
    D. Three lines do not compile.
    E. If any lines that do not compile are fixed, the output includes pink.
    F. If any lines that do not compile are fixed, the output does not include pink.

    While it is common for a Predicate to have a generic type, it is not required.
    However, it is treated like a Predicate of type Object if the generic type is missing.
    Since startsWith() does not exist on Object, line 28 does not compile.
    Line 34 would be a correct lambda declaration in isolation.
    However, it uses the variable s, which is already taken from the main() method parameter.
    This causes a compiler error on line 34. These are the only two compiler errors, making option C correct.
     If Predicate were changed to Predicate˂String˃ and lambda variable were changed to x,
     the Consumer would in fact print pink, making option E the other answer.

 */
public class PredicateConsumerComparatorChoiceAnswer {
    public static void main(String[] s) { // 27:
        Predicate dash = c -> c.startsWith("-"); //    28:
        System.out.println(dash.test("-")); //  29:
        //30:
        Consumer clear = x -> System.out.println(x); //    31:
        clear.accept("pink"); //  32:
       // 33:
        Comparator<String> c = (String s, String t) -> 0; //   34:
        System.out.println(c.compare("s", "t")); // 35:
    } //    36:
}