package interfaces.errors.breakMultipleRule;

/**
* Which statements are true about the following code? (Choose all that apply.)
*   A. It compiles without issue.
    B. The code will not compile because of line 5.
    C. The code will not compile because of line 6.
    D. The code will not compile because of line 7.
    E. The code will not compile because of line 9.
    F. The code will not compile because of line 10.
    G. The code will not compile because of line 13.

   The implicitly abstract interface method on line 6
   does not compile because it is missing a semicolon (;), making option C correct.
    Line 7 compiles, as it provides an overloaded version of the fly() method.
    Lines 5, 9, and 10 do not contain any compilation errors, making options A, E, and F incorrect.
    Line 13 does not compile because the two inherited fly() methods, declared on line 6 and 10, conflict with each other.
    The compiler recognizes that it is impossible to create a class that overrides fly() to return both String and int,
    since they are not covariant return types, and therefore blocks the Falcon class from compiling.
    For this reason, option G is correct.

 */
public interface CanFly { // 5:
    int fly() //  6:
    String flyx(int distance); //   7:
} //8:

interface HasWings { // 9:
    abstract String fly(); // 10:
    public abstract Object getWingSpan(); //  11:
} //  12:

abstract class Falcon implements CanFly, HasWings {} // 13:
public class FalconNotCovariantReturnTypeAndMissingSemiColon {

}