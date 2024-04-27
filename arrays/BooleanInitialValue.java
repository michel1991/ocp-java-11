package arrays;
import java.util.*;
public class BooleanInitialValue {
    /**
     *  Consider the following code snippet ...
        What will it print ?
        
        A. It will not compile.
        B. It will throw ArrayIndexOutOfBoundsError at Runtime.
        C. false, true
        D. true, false
        E. It will print false, false.
       
        Note that whenever you create an array all of its elements are automatically given defaults values.
        Numeric types are initialized to 0, objects are initialized to null, and booleans to false.
        
        So if you have, float[ ] f = new float[3]; f[0], f[1] and f[2] will all be 0.0.
        if you have Object[ ] o = new String[3]; o[0], o[1] and o[2] will all be null.
        In this case, b1[0] and b1[1] are false.
        whereas b2[0] and b2[1] are true and false.
        So the answer is false and true.
        Correct(C)
     */
     public static void main(String...args){
        
        
        boolean[] b1 = new boolean[2];
        boolean[] b2 = {true , false};
        System.out.println( "" + (b1[0] == b2[0]) + ", "+ (b1[1] == b2[1])  );
        
        
     }
}