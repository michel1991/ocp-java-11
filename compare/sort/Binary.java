package compare.sort;
import java.util.*;

/**
  What is the result of the following when called as java Binary.java?
    A. []
    B. [0, 01, 1, 10]
    C. [0, 01, 10, 1]
    D. [0, 1, 01, 10]
    E. The code does not compile.
    F. The code compiles but throws an exception at runtime.
 
  While no arguments are passed from the command line, this doesn’t matter because
  the main() method redefines the args array.
  Remember that String values sort alphabetically rather than by number.
  Therefore, 01 sorts before 1, and option B is correct.
 */
public class Binary {

    public static void main(String[] args) {
        args = new String[] {"0", "1", "01", "10" };

        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
    }
}