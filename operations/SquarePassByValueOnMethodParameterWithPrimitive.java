package operations;

/**
* What is the result of the following program?
    A. -1
    B. 9
    C. 81
    D. Compiler error on line 9
    E. Compiler error on a different line

    Since Java is pass-by-value and the variable on line 8 never gets reassigned, it stays as 9.
    In the method square, x starts as 9. The y value becomes 81, and then x gets set to –1. Line 9 does set result to 81.
    However, we are printing out value and that is still 9.
 */
class Squares { // 1:
    public static long square(int x) { //  2:
        var y = x * (long) x; //  3:
        x = -1; //   4:
        return y; //   5:
    } // 6:
    public static void main() { //  7:
        var value = 9; //  8:
        var result = square(value); // 9:
        System.out.println(value); //   10:
    } } //  11:


public class SquarePassByValueOnMethodParameterWithPrimitive {
    public static void main(String[] args) {
        Squares.main();
    }
}