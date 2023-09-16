package lambda.errors.effectivelyFinal;
import java.util.*;
/**
 Which is one of the lines output by this code?
    A. []
    B. [8]
    C. [9]
    D. [10]
    E. The code does not compile.
   
   The num variable is not effectively final because the value changes.
   This means it cannot be used in a lambda and the code does not compile, which is option E.

 */
public class RemoveToListSetNumVariable {
    public static void main(String... args){
        var list = new ArrayList<Integer>(); // 10: 
        list.add(10); //  11:
        list.add(9); //  12:
        list.add(8); //  13: 
        //14:
        var num = 9; //   15: 
        list.removeIf(x -> {int keep = num; return x == keep;}); //  16: 
        System.out.println(list); // 17:
        //18:
        num = 8; //  19:
        list.removeIf(x -> {int keep = num; return x == keep;}); //  20:
        System.out.println(list); // 21:
        
    }
}