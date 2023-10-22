package nestedClass.errors.instance;
/**
    What is the output of the following program?
        A. 0
        B. 10
        C. There is a compiler error on line 3.
        D. There is a compiler error on line 4.
        E. There is a compiler error on line 5.
        F. There is a compiler error on line 8.
        G. None of the above.

   Shade is an inner class. It may be accessed from an instance of Color.
   Since the constructor is called from a static method, line 8 does not compile.
   The rest of the lines do not contain any compiler errors.
   If the code was corrected to use an instance of Color, then it would print 10 at runtime.
 */
public class Color {
    private int hue = 10;  // 2
    private enum Range { HIGH, LOW; } //  3:
    public class Shade { // 4:
        public int hue = Color.this.hue;  //  5:
    }  // 6:
    public static void main(String[] args) { //  7:
        System.out.println(new Shade().hue); //  8:
        //System.out.println(new ColorBadCallMemberClass().new Shade().hue); //  8:
    } //  9:
}