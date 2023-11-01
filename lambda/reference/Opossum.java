package lambda.reference;
import java.util.function.*;

/**
   Which method reference can replace
   the lambda in the first line of the main() method to produce the same output?

    A. System:out:println
    B. System::out:println
    C. System::out::println
    D. System.out::println
    E. None of the above

    The only one of these references to compile is option D.
     However, the original code prints Carrying 1.
     The version with a method reference would just print 1.
     Option E is the answer because this is not the same output.
 */
interface Marsupial {
    void carryInPouch(int size);
}
 public class Opossum {
    public static void main(String[] args) {
        Marsupial mar = x -> System.out.println("Carrying " + x);

        mar.carryInPouch(1);
    }
}
