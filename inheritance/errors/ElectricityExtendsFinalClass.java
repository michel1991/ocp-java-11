package inheritance.errors;

/**
 Given the following program, what is the first line to fail to compile?
    A. Line 2
    B. Line 4
    C. Line 5
    D. Line 6
    E. Line 7
    F. All of the lines compile

    The Super class is marked final,
    which mean its cannot be used as the supertype of an anonymous class.
    For this reason, line 6 does not compile,
    and option D is correct.
    Line 7 also does not compile as a local class
    can only contain static variables that are marked final.

 */
 class Electricity { /// 1:
    interface Power {} //  2:
    public static void main(String[] light) { //  3:
        class Source implements Power {}; //  4:
        final class Super extends Source {}; //    5:
        var start = new Super() {}; //     6:
        var end = new Source() { static boolean t = true; }; //  7:
    } //  8:
} // 9:

public class ElectricityExtendsFinalClass {

}