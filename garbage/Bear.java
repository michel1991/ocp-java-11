package garbage;

/**
   Which statements about the following program are correct? (Choose all that apply.)
    A. The object created on line 9 is eligible for garbage collection after line 13.
    B. The object created on line 9 is eligible for garbage collection after line 14.
    C. The object created on line 10 is eligible for garbage collection after line 12.
    D. The object created on line 10 is eligible for garbage collection after line 13.
    E. Garbage collection is guaranteed to run.
    F. Garbage collection might or might not run.
    G. Garbage collection is guaranteed not to run.
    H. The code does not compile.
 */
public class Bear { // 1:
    private Bear pandaBear; //    2:
    protected void finalize() {} //   3:
    private void roar(Bear b) { //    4:
        System.out.println("Roar!"); //   5:
        pandaBear = b; //   6:
    } //  7:
    public static void main(String[] args) { //  8:
        Bear brownBear = new Bear(); //    9:
        Bear polarBear = new Bear(); //   10:
        brownBear.roar(polarBear); //     11:
        polarBear = null; //      12:
        brownBear = null; //   13:
        System.gc(); } } //    14: