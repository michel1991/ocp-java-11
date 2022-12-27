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

    The class compiles and runs without issue, so option H is incorrect.
    The program creates two Bear objects, one on line 9 and one on line 10.
    The first Bear object is accessible until line 13 via the brownBear reference variable.
    The second Bear object is passed to the first object’s roar() method on line 11,
    meaning it is accessible via both the polarBear reference and the brownBear.pandaBear reference.
    After line 12, the object is still accessible via brownBear.pandaBear.
    After line 13, though, it is no longer accessible since brownBear is no longer accessible.
    In other words, both objects become eligible for garbage collection after line 13, making options A and D correct.
    Finally, garbage collection is never guaranteed to run or not run,
    since the JVM decides this for you. For this reason,
    option F is correct, and options E and G are incorrect.
    The class contains a finalize() method, although this does not contribute to the answer.
    For the exam, you may see finalize() in a question,
    but since it’s deprecated as of Java 9, you will not be tested on it.
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