package operations.shortCircuiting;

/**
   What will the following class print when executed?
    A. true, false, true
    B. true, true, false
    C. true, false, false
    D. true, true, true
    
    ----------------------------------------
    Java parses the expression from left to right. Once it realizes that the left operand of a conditional "or" operator has evaluated to true,
    it does not even try to evaluate the right side expression.
    Correct(C)

 */
class Test{
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main (String[] args){
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
    }
}
public class PrintTrueFalseFalse {
    public static void main (String[] args){
        Test.main(args);
    }
}