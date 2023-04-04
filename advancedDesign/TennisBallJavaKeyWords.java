package advancedDesign;

/**
 *  Given the following code, which lines when placed independently
 *  in the blank allow the code to compile and print bounce? (Choose two.)
 
 
    A. var new = TennisBall;
    B. TennisBall();
    C. var var = new TennisBall();
    D. new TennisBall;
    E. new TennisBall();
    
    To call a constructor, you must use the new keyword, making option E correct.
    It cannot be called as if it was a normal method.
    This rules out options A and B.
    Further, option D is incorrect because the parentheses are required.
    Option C is also correct, as var may be used as a variable name.
 */
class TennisBall {
    public TennisBall() {
        System.out.println("bounce");
    }
    public static void main(String[] slam) {
        // _________________________
        var var = new TennisBall();
        new TennisBall();
    }
}

public class TennisBallJavaKeyWords {
    public static void main(String[] slam) {
        TennisBall.main(slam);
    }
}