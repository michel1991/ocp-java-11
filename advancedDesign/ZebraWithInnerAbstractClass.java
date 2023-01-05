package advancedDesign;

/**
 * What does the following program print?
    A. x is 0
    B. x is 24
    C. Line 6 generates a compiler error.
    D. Line 8 generates a compiler error.
    E. Line 11 generates a compiler error.
    F. None of the above

    Zebra.this.x is the correct way to refer to x in the Zebra class.
    Line 5 defines an abstract local class within a method,
    while line 11 defines a concrete anonymous class that extends the Stripes class.
    The code compiles without issue and prints x is 24 at runtime,
    making option B the correct answer.
 */
class Zebra { // 1:
    private int x = 24; //  2:
    public int hunt() { //   3:
        String message = "x is "; // 4:
        abstract class Stripes { //    5:
            private int x = 0; //  6:
            public void print() { //    7:
                System.out.print(message + Zebra.this.x); //    8:
            } //   9:
        } //  10:
        var s = new Stripes() {}; // 11:
        s.print(); // 12:
        return x; //  13:
    } // 14:
    public static void main(String[] args) { //  15:
        new Zebra().hunt(); //  16:
    } } //  17:
public class ZebraWithInnerAbstractClass {
    public static void main(String[] args) {
        Zebra.main(args);
    }
}