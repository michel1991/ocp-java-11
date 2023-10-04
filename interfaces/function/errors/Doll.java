package interfaces.function.errors;
import java.util.function.*;

/**
 * What is the output of the following application?
    A. XXXXX
    B. The code does not compile because of the lambda expression.
    C. The code does not compile for a different reason.
    D. The code compiles, but produces an infinite loop at runtime.
    E. The code compiles, but throws an exception at runtime.
    
    The code does not compile, so option A, D, and E are incorrect.
    The lambda expression compiles without issue, making option B incorrect.
    The task variable is of type UnaryOperator˂Doll˃, with the abstract method apply().
    There is no accept() method defined on that interface, therefore the code does not compile,
    and option C is the correct answer. If the code was corrected to use the apply() method,
    the rest of it would compile without issue. At runtime, it would then produce an infinite loop.
    On each iteration of the loop, a new Doll instance would be created with 5, since the post-decrement (--)
    operator returns the original value of the variable, and that would be option D.
 */
public class Doll {
    private int layer;
    public Doll(int layer) {
        super();
        this.layer = layer;
    }

    public static void open(
            UnaryOperator<Doll> task, Doll doll) {

        while((doll = task.accept(doll)) != null) {
            System.out.print("X");
        }
    }

    public static void main(String[] wood) {
        open(s -> {
            if(s.layer <=0) return null;
            else return new Doll(s.layer--);
            }, new Doll(5));
    }
}