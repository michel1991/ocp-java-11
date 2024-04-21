package operations.orXorAnd;
public class PrintVariableValueClearSafeTasty {
    /**
        * What is the output of the following code snippet?
            A. true-true-true
            B. true-true-false
            C. true-false-true
            D. true-false-false
            E. false-true-true
            F. false-true-false
            G. false-false-true
            H. false-false-false

            In the first boolean expression, vis is 2 and ph is 7, so this expression evaluates to true & (true || false), which reduces to true.
            The second boolean expression uses the short-circuit operator, and since (vis > 2) is false, the right side is not evaluated, leaving ph at 7.
            In the last assignment, ph is 7, and the pre-decrement operator is applied first, reducing the expression to 7 <= 6 and resulting in an assignment of false.
            For these reasons, option D is the correct answer.
    */
        static void addOperator(){
                int ph = 7, vis = 2;
                boolean clear = vis > 1 & (vis < 9 || ph < 2);
                boolean safe = (vis > 2) && (ph++ > 1);
                boolean tasty = 7 <= --ph;
                System.out.println(" begin addOperator ");
                System.out.println(clear+"-"+safe+"-"+tasty);
                System.out.println(" end  addOperator ");
        }
    
    public static void main(String[] args) {
        addOperator();
    }
}