package advancedDesign.errors;

/**
 * What is the output of the following code?
   A. 39
    B. 49
    C. 410
    D. 511
    E. The code fails to compile.

    The local variable b is in scope only within the if statement (or else statement).
    By the time the return statement is reached, the compiler no longer knows about b.

 */
class HowMany {
    public static int count(int a) {
        if (a != 3) {
            var b = 1;
        } else {
            var b = 2;
        }
        return a++ + b;
    }
    public static void main() {
        System.out.print(count(3));
        System.out.print(count(9));
    }}

public class HowManyFindErrors {

}