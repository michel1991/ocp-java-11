package operations.tricky;

public class Print12 {
    /**
     * What will the following code print?
       A. 1 2
       B. 2 3
       C. 12 2
       D. 12 1
       E. It will not compile.
       
       Correct is A
       
       This question is based on 2 concepts:

        1. i++ == 0; is not the same as ++i == 0;
        In the case of ++i == 0;, i is first incremented and then its new value is compared with 0.
        While in the case of i++ == 0;, the current value of i is compared with 0 and then i is incremented.
        
        2. The | and & operators, when applied to boolean operands, ensure that both the sides are evaluated.
        This is opposed to || and && operators, which do not evaluate the Right Hand Side operand
        if the result can be known by just evaluating the Left Hand Side.
        
        Now, let us see the values of i and j at each step:
        
        int i = 0;
        int j = 1;
        if( (i++ == 0) & (j++ == 2) )    
        //compare i with 0 and increment i, this means, it returns true and i becomes 1.
        //Evaluate next condition:
        //   compare j with 2 and increment j, this means, it return false and j becomes 2.
        //   true & false returns false so i= 12 is not executed.
        {
           i = 12;
        }
        System.out.println(i+" "+j)); //print 1 and 2

     */
    public static void main(String... args){
        int i = 0;
        int j = 1;
        if( (i++ == 0) & (j++ == 2) ){
            i = 12;
        }
        System.out.println(i+" "+j);
    }
}