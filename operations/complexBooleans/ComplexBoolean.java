package operations.complexBooleans;
public class ComplexBoolean {
    /**
        * What is the output of the following code snippet?
            A. true-false-false
            B. false-true-false
            C. true-true-true
            D. false-true-true
            E. false-false-false
            F. true-true-false
            G. None of the above
            
        The first expression is evaluated from left to right since the operator precedence of & and ^ is the same,
        letting us reduce it to false ^ sunday, which is true, because sunday is true. In the second expression,
        we apply the negation operator, !, first, reducing the expression to sunday && true, which evaluates to true.
        The last expression returns true if both of the previous values are false. Since neither is false,
        the output is false. For these reasons, option F is the correct answer.
        */
        static void complexBoolean(){
            System.out.println("begin complexBoolean");
            boolean sunny = true, raining = false, sunday = true;
            boolean goingToTheStore = sunny & raining ^ sunday;
            boolean goingToTheZoo = sunday && !raining;
            boolean stayingHome = !(goingToTheStore && goingToTheZoo);
            System.out.println("\t" + goingToTheStore + "-" + goingToTheZoo + "-" +stayingHome);
            System.out.println("end complexBoolean");
        }
    
    public static void main(String[] args) {
        complexBoolean();
    }
}