package interfaces.errors.functional;
import java.util.*;
import java.util.function.*;

/**
    Which functional interface, when entered into the following blank, allows the class to compile?

    A. Consumer
    B. Consumer<Integer>
    C. DoubleConsumer
    D. Supplier<Double>
    E. None of the above

    First, the forEach() method requires a Consumer instance.
    Option D can be immediately discarded because Supplier<Double> does not inherit Consumer.
     For this same reason, option C is also incorrect.
    DoubleConsumer does not inherit from Consumer. In this manner,
    primitive functional interfaces cannot be used in the forEach() method.
    Option A seems correct, since forEach() does take a Consumer instance,
    but it is missing a generic argument. Without the generic argument,
    the lambda expression does not compile because the expression p<5 cannot be applied to an Object.
    Option B is also close, however, a Double cannot be passed to an Integer.
    The correct functional interface is Consumer<Double>,
    and since that is not available, option E is the correct answer.

 */
class Market {
    private static void checkPrices(List<Double> prices,
                                    DoubleConsumer scanner) { // ____________ (I make this the wrong response to hold code)
        prices.forEach(scanner);
    }
    public static void main(String[] right) {
        List<Double> prices = List.of(1.2, 6.5, 3.0);
        checkPrices(prices,
                    p -> {
            String result = p < 5 ? "Correct" : "Too high";
            System.out.println(result);
        });
    }
}


public class MarketDoubleConsumerNotInstanceOfConsumer {

}