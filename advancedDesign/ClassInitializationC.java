package advancedDesign;

/**
* What is the result of this code?
*    A. ceygz
    B. cgeyz
    C. cgyez
    D. cgzey
    E. cgzye
    F. cyegz
    G. The code does not compile.

   Line 13 kicks off initialization.
   First comes the instance variable declaration on line 2.
    Next are any instance initializers in the order they appear.
    At this point, seq is cgz. Next is the constructor.
    The constructor on line 4 calls the one on line 8, which adds e to seq.
    Finally, the no-argument constructor completes and adds y to seq.
 */

class C { // 1:
    String seq = "c"; //  2:
    { seq += "g"; } //   3:
    public C() { // 4:
        this("abc"); //  5:
        seq += "y"; //  6:
    } // 7:
    public C(String s) { //   8:
        seq += "e" ; //  9:
    } // 10:
    { seq += "z"; } //    11:
 } //   15:
public class ClassInitializationC {
    public static void main(String[] args) { //   12:
        C c = new C(); //  13:
        System.out.println(c.seq); //  14:
    } // 15
}