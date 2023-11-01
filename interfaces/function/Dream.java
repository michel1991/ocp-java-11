package interfaces.function;
import java.util.function.*;

/**
 * Which functional interface, when filled into the blank, allows the class to compile?
    A. Consumer<Sheep>
    B. Function<Sheep,void>
    C. Supplier<Sheep>
    D. UnaryOperator<Sheep>
    E. None of the above
    
    The method reference System.out::println
    takes a single input and does not return any data.
    Consumer<Sheep> is compatible with this behavior, making option A the correct answer.
    Note that option B does not even compile because void cannot be used as a generic argument.
    Similarly, option C does not take a parameter. Option D is also incorrect,
    since System.out::println() does not return any data, and UnaryOperator requires a return value.

 */

class Sheep {}
public class Dream {
    int MAX_SHEEP = 10;
    int sheepCount;
    public void countSheep(Consumer<Sheep> backToSleep) { // _____________ 
        while(sheepCount<MAX_SHEEP) {
            // TODO: Apply lambda
            sheepCount++;
        }
    }
    public static void main(String[] dark) {
        new Dream().countSheep(System.out::println);
    }
}