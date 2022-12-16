package exceptions.runtime;

/**
*  What is the output of the following program?
*   A. ABCD
    B. ABD
    C. A and a stack trace for ArithmeticException
    D. AC and a stack trace for ArithmeticException
    E. ACD and a stack trace for ArithmeticExceptionAnswer
    F. None of the above

  The pickColor() method is invoked on line 16. A is output on line 4, and then fail() is invoked on line 5.
  An ArithmeticException is thrown and not caught within pickColor(), so the finally block executes and prints C.
  Then the exception is thrown to main().
  Because main() does not catch it either, the method returns to the caller, and a stack trace is printed for the ArithmeticException.
  The final output is AC along with a stack trace, making option D correct.
 */
class ColorPicker { // 1:
    public void pickColor() { // 2:
        try { //  3:
            System.out.print("A");  // 4:
            fail();  //  5:
        } catch (NullPointerException | Error x) { //  6:
            System.out.print("B"); // 7:
        } finally { // 8:
            System.out.print("C"); //  9:
        } // 10:
    } //  11:
    public void fail() { //  12:
        throw new ArithmeticException(); // 13:
    } //  14:
    public static void main() { //  15:
        new ColorPicker().pickColor(); //    16:
        System.out.print("D"); //  17:
    } // 18:
} //  19:

public class ColorPickerFindErrors {
    public static void main(String[] args) {

    }
}