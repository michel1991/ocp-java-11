package operations.orXorAnd;
public class PrintVariableValueWXZ {
    /**
        *  What is the output of the following code snippet?
            A. true-2-true
            B. false-2-false
            C. true-2-false
            D. true-3-false
            E. true-3-true
            F. false-3-false
    
            In the first expression, height ˃ 1 is true.
            Since it uses the logical operator (|), which evaluates both sides,
            the right side is still executed, resulting in length being assigned a value of 2 and w assigned a value of true.
            In the second expression, only the right-hand side of the expression is evaluated, so x is assigned a value of 2, and length is unchanged.
            The last expression evaluates to 2 % 2, which is 0, so z is assigned a value of 0.
        */
        static void thirdExample(){
            int height = 2, length = 3;
            boolean w = height > 1 | --length < 4;
            var x = height!=2 ? length++ : height;
            boolean z = height % length == 0;
            System.out.println(w + "-" + x + "-" + z);
    
        }
    
        public static void main(String... args){
           thirdExample();
        }
}