package lambda.errors;
import java.util.function.*;
import java.util.*;

/**
   Which of these statements is true about the following code?
    A. The code does not compile because of at least one of the variables named x.
    B. The code does not compile because at least of one of the variables named y.
    C. The code does not compile for another reason.
    D. The code compiles, and the var in each lambda refers to the same type.
    E. The code compiles, and the var in each lambda refers to different type.

    A lambda parameter is not allowed to use the same name as a local variable or method parameter.
    Since the variable named x is already taken as a method parameter, the two lambdas do not compile,
    and option A is correct.
 */
public class DuplicateVariableXInScope {
    public void method(int x) {
        x((var x) -> {;}, (var x, var y) -> 0);
    }
    public void x(Consumer<String> x, Comparator<Boolean> y) {
    }

}