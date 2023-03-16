package classInitialization.errors;

/**
 * What is the output of the following program?
 *      A. 12,-1
        B. 12,2
        C. 13,-1
        D. Exactly one line of this class does not compile.
        E. Exactly two lines of this class do not compile.
        F. None of the above.

        This class creates a final instance toy variable,
        but it is assigned a value twice.
        First, it is assigned a value in an instance initializer and then in a constructor.
        For this reason, the second line of the constructor does not compile,
        and option D is correct.
        The first line of the constructor, in which a static variable is referenced from an instance variable,
        is permitted but discouraged. Also, initializers may reference variables defined later in the class declaration.
 */
class Husky {
    { this.food = 10; }
    { this.toy = 2; }
    private final int toy;
    private static int food;
    public Husky(int friend) {
        this.food += friend++;
        this.toy -= friend--;
    }
    public static void main(String... unused) {
        var h = new Husky(2);
        System.out.println(h.food+","+h.toy);
    }
}
public class HuskyFindError {

}