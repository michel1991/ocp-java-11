import java.util.function.*;

/**
 *  What is the output of the following application?
    A. 50
    B. 51
    C. The code does not compile because of the lambda expression.
    D. The code does not compile for a different reason.
    E. The code compiles but prints an exception at runtime.

    The code does not compile, so options A, B, and E are incorrect.
    The IntUnaryOperator functional interface is not generic,
    so the argument IntUnaryOperator˂Integer˃ in the takeTicket() does not compile,
    making option D the correct answer.
    The lambda expression compiles without issue, making option C incorrect.
    If the generic argument ˂Integer˃ was dropped from the argument declaration,
    the class would compile without issue and output 51 at runtime, making option B the correct answer.
 */
class TicketTaker {
    private static int AT_CAPACITY = 100;
    public int takeTicket(int currentCount,
                          IntUnaryOperator<Integer> counter) {

        return counter.applyAsInt(currentCount);
    }
    public static void main(String...theater) {
        final TicketTaker bob = new TicketTaker();
        final int oldCount = 50;
        final int newCount = bob.takeTicket(oldCount,t -> {
            if(t>AT_CAPACITY) {
                throw new RuntimeException(
                        "Sorry, max has been reached");
            }
            return t+1;
        });
        System.out.print(newCount);
    }
}

public class TicketTakerIntUnaryIsnotGenerics {

}