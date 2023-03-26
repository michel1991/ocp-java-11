package stream.mapping;
import java.util.*;
import java.util.function.*;

public class OptionalChoiceAnswer {

    //-------------------------------- same question longer   shorter--------------------------
    /**
     * Fill in the blanks so that both methods produce the same output for all inputs.
        A. isNotNull, isPresent
        B. ifPresent, isPresent
        C. isPresent, forEach
        D. isPresent, ifPresent
        E. None of the above

        The Optional class has an isPresent() method that doesn’t take any parameters.
        It returns a boolean and is commonly used in if statements.
        There is also an ifPresent() method that takes a Consumer parameter and runs it only if the Optional is nonempty.
        The methods isNotNull() and forEach() are not declared in Optional.
        Therefore, option D is correct.
     */
    private static void longer(Optional<Boolean> opt) {
        if (opt.isPresent())  // .___________(
            System.out.println("run: " + opt.get());
    }
    private static void shorter(Optional<Boolean> opt) {
        opt.map(x -> "run: " + x)
      .ifPresent(System.out::println); // _________
    }
    //-------------------------------- same question  longer   shorter --------------------------

    public static void main(String... args){

    }

}