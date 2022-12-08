package interfaces.errors;

/**
* Which lines of the following interface do not compile? (Choose all that apply.)
    A. Line 1.
    B. Line 3.
    C. Line 4.
    D. Line 5.
    E. Line 6.
    F. Line 7.
    G. Line 8.

   Line 1 compiles, as this is a functional interface and contains exactly one abstract method: startGame().
   Note that equals(Object) on line 8 does not contribute to the abstract method count, as it is always provided by java.lang.Object.
   Line 3 compiles, although if executed, it would generate an infinite recursive call at runtime.
   Line 4 compiles since private interface methods can call static interface methods.
   Line 6 does not compile because the default interface methods must include a body.
   Line 7 also does not compile, as static interface methods are not permitted to call default, abstract, or non-static private interface methods.
   For these reasons, options E and F are correct. For more information, see Chapter 1.
 */

@FunctionalInterface // 1:
public interface PlayDnD {  // 2:
    public static void roll() { roll(); }  //   3:
    private int takeBreak() { roll(); return 1; } //  4:
    void startGame(); //  5:
    default void win(); //  6:
    static void end() { win(); } //     7:
    boolean equals(Object o); //  8:
} // 9:
public class PlayDnDBadFI {

}