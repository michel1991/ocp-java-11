package stream.matchMethods;
import java.util.function.*;
import java.util.stream.*;

/**
   Which can fill in the blank so this code outputs true?
    A. Only anyMatch
    B. Only allMatch
    C. Both anyMatch and allMatch
    D. Only noneMatch
    E. The code does not compile with any of these options.
    
    The filter() method passes two of the three elements of the stream through
    to the terminal operation. This is redundant, since the terminal operation
    checks the same Predicate. There are two matches with the same value,
    so both anyMatch() and allMatch() return true, and option C is correct.
 */
public class HideAndSeek {
    public static void main(String[] args) {
        var hide = Stream.of(true, false, true);
        Predicate<Boolean> pred = b -> b;
        var found = hide.filter(pred).allMatch(pred); // here ________(
        System.out.println(found);
    }
}