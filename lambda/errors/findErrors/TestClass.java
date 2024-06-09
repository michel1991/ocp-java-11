package lambda.functions.errors.findErrors;
import java.util.function.*;

/**
    What will the following code print when compiled and run?
    A. 1 1
    B. 2 1
    C. 2 2
    D. Compilation error at //1
    E. Compilation error at //2
    
    ---
    Remember that local variables referenced from a lambda expression must be final or effectively final.
    In the given code, the value variable is not defined as final and its value is being changed at //1 and //2, therefore,
    it is not effectively final either.

    Hence, you cannot use this variable inside a lambda expression.
    Correct(D)

 */
public class TestClass{
    public static void main(String[] args) {
        int value = 0;
        Supplier<Integer> valueS = ()->value++; //1
        value++;//2
        System.out.println(value+" "+valueS.get()); //3
    }
}