package interfaces.errors;

/**
 * Which lines of the following interface declaration do not compile? (Choose all that apply.)

    A. All of the lines compile without issue.
    B. Line 2
    C. Line 3
    D. Line 4
    E. Line 5
    F. Line 6
    G. Line 7
    H. Line 8

    For this question, it helps to remember which implicit modifiers the compiler
    will insert and which it will not. Lines 2 and 3 compile with interface
    variables assumed to be public, static, and final.
    Line 4 also compiles, as static methods are assumed to be
    public if not otherwise marked. Line 5 does not compile.
    Non-static methods within an interface must be explicitly marked private or default.
    Line 6 compiles, with the public modifier being added by the compiler.
    Line 7 does not compile, as interfaces do not have protected members.
    Finally, line 8 compiles, with no modifiers being added by the compiler.
 */
interface Herbivore { // 1:
    int amount = 10; //  2:
    static boolean gather = true; //    3:
    static void eatGrass() {} //   4:
    int findMore() { return 2; } //   5:
    default float rest() { return 2; } //  6:
    protected int chew() { return 13; } //  7:
    private static void eatLeaves() {} //  8:
} //  9:
public class HerbivoreFindErrors {

}