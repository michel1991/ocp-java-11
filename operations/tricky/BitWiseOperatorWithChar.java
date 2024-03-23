package operations.tricky;

public class BitWiseOperatorWithChar {
    /**
     * What will be the output?
            A.Compilation failure
            B. i = 5
            C. i = 6
            D.  i = 7
            
           'c'|'d' produces a char value that is the result of the bitwise OR operation on 'c' and 'd'.
           It does not mean that the case will be executed when the value of c is 'c' or 'd'.
           This case will be executed when the value of c matches the value of the bitwise OR of 'c' and 'd',
           which is actually same as the char value 'g'. The following is how 'c'|'d' is computed:
           
            'c' = 99  = 1100011
            'd' = 100 = 1100100
            'c'|'d'    =  1100111  <== 103, same as 'g'.
            
            Given the above information, it is easy to see that i will be incremented
            three times when c is 'a' (because there is no break statement in the case blocks),
            two times when c is 'b' (because there is no break statement in the case block)
            and zero times when c is 'c' and 'd'. Therefore, the final value of i will be 5.
            
            Note that there is no difference between ++i and i++ in the given situation.
            Add/Edit Note

           Correct(B)

     */
    public static void main(String[] args){
        var ca = new char[]{'a', 'b', 'c', 'd'};
        var i = 0;
        for(var c : ca){
            switch(c){
                case 'a' : i++;
                case 'b' : ++i;
                case 'c'|'d' : i++;
            }
        }
        System.out.println("i = "+i);
        
    }
}