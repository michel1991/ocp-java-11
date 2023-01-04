package interfaces.errors;

/**
 * Which lines of the following interface do not compile? (Choose all that apply.)
    A. Line 2
    B. Line 3
    C. Line 4
    D. Line 5
    E. Line 6
    F. Line 7
    G. None of the above

  Like classes, interfaces allow instance methods to access static members,
  but not vice versa.
  Non-static private, abstract, and default methods are considered instance methods in interfaces.
  Line 3 does not compile because the static method hunt()
  cannot access an abstract instance method getName().
  Line 6 does not compile because the private static method sneak()
  cannot access the private instance method roar().
  The rest of the lines compile without issue.
 */
interface BigCat { // 1:
    abstract String getName(); //    2:
    static int hunt() { getName(); return 5; } // 3:
    default void climb() { rest(); } //  4:
    private void roar() { getName();  climb(); hunt(); } //  5:
    private static boolean sneak() { roar(); return true; } //    6:
    private int rest() { return 2; }; //  7:
} //   8:

public class BigCatFindErrors {

}