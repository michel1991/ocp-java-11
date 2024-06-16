package operations.switchs.errors;

public class TwoCaseWithSameValue {
    /**
     Identify correct statement(s) about the following code:

        var value = 1,000,000; //1
        switch(value){
            case 1_000_000 : System.out.println("A million 1"); //2
                break;
            case 1000000 : System.out.println("A million 2"); //3
                break;
        }
        
        A. It will print A million 1 when compiled and run.
        B. It will print A million 2 when compiled and run.
        C. Compilation fails only at line //1
        D. Compilation fails only at line //2
        E. Compilation fails only at line //3
        F. Compilation fails at line //1 and //3
        
       -------
        1. You may use underscores (but not commas) to format a number for better code readability. So //1 is invalid.
        2. Adding underscores doesn't actually change the number. The compiler ignores the underscores.
        So 1_000_000 and 1000000 are actually same and you cannot have two case blocks with the same value.
        Therefore, the second case at //3 is invalid.
        
        You may use underscore for all kinds of numbers including long, double, float, binary, as well as hex.
        For example, the following are all valid numbers -
        int hex = 0xCAFE_BABE;
        float f = 9898_7878.333_333f;
        int bin = 0b1111_0000_1100_1100;
       
        Correct(F)
     */
    public static void main(String... args){
        var value = 1000000; //1
        switch(value){
            case 1_000_000 : System.out.println("A million 1"); //2
                break;
            case 1000000 : System.out.println("A million 2"); //3
                break;
        }
    }
}