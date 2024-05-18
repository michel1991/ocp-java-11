package compare.tricky;
import java.util.*;

public class OneTwoPrintFalse {
    /**
     * The following code snippet will print true.
        A. True
        B. False
        
       ------------------------------------------
       First the value of 'str1' is evaluated (i.e. one).
       Now, before the method is called, the operands are evaluated, so str1 becomes "two". so "one".equals("two") is false.
       Correct(B)
     */
    public static void main(String... args){
        String str1 = "one";
        String str2 = "two";
        System.out.println( str1.equals(str1=str2) );
    }
}