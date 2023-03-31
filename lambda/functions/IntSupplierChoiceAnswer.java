package lambda.functions;
import java.util.function.*;
import java.util.*;

public class IntSupplierChoiceAnswer {
    /**
     * Which expression is compatible with the IntSupplier functional interface?
        A. () -> 1˂10 ? "3" : 4
        B. () -> {return 1/0;}
        C. () -> return 4
        D. System.out::print
        E. None of the above
        
        Option A is incorrect because "3" is a String, which is not compatible
        with the return type int required for IntSupplier.
        Option B is the correct answer. Although this will result
        in a divide-by-zero issue at runtime, the lambda is valid and compatible with IntSupplier.
        Option C is incorrect because the lambda expression is invalid.
        The return statement is allowed only inside a set of braces ({}).
        Finally, option D is incorrect. The method reference is used for Consumer,
         not Supplier, since it takes a value and does not return anything.
     */
  static void choice(){
        IntSupplier  intSupplier = () -> {return 1/0;};
  }
}