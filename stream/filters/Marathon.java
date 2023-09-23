package stream.filters;
import java.util.*;
import java.util.stream.*;

/**
   Which of the following can fill in the blank
    to print out just the number 161?
    
    A.
        .map(Runner::getNumberMinutes)
        .filter(m -˃ match.get().equals(m))
        .peek(System.out::println)
        .count()
        
    B.
        .map(Runner::getNumberMinutes)
        .filter(m -˃ match.get().equals(m))
        .peek(System.out::println)
        .max()
        
    C.
        .map(Runner::getNumberMinutes)
        .peek(System.out::println)
        .filter(m -˃ match.get().equals(m))
        .count()
    
    D.
        .map(Runner::getNumberMinutes)
        .peek(System.out::println)
        .filter(m -˃ match.get().equals(m))
        .max()
        
    E. The code does not compile due to line z.
    F. None of the above.
    
    Option E is incorrect since the ofNullable() method creates an Optional
    whether or not the parameter is null. Options B and D
    are incorrect because max() takes a parameter to specify
    the logic for determining the order. Both options A and C compile.
    The order of the pipeline methods matter here.
    Option C prints all three numbers since the filter()
    operation happens after the peek().
    Option A is correct as the methods are in the correct order.
 */

class Runner {
    private int numberMinutes;
    public Runner(int n) {
        numberMinutes = n;
    }
    public int getNumberMinutes() {
        return numberMinutes;
    } }
public class Marathon {
    public static void main(String[] args) {
        var match = Optional.ofNullable(161);    // line z
        var runners = Stream.of(new Runner(183),
                                new Runner(161), new Runner(201));
        var opt = runners   // ___________________________ here
                    .map(Runner::getNumberMinutes)
                    .filter(m -> match.get().equals(m))
                    .peek(System.out::println)
                    .count()
                ;
    }}