package advancedDesign.vars;
import java.util.*;

/**
  Given:
  Identify correct statements.
  
  A.  The type of k is Object.
    k is of type String.
    
  B.    The type of al is List<String>.
    al is of type ArrayList<String>.
    
  C.   The type of al is List<Character>.
    al is of type ArrayList<String>.
    
  E.  The code will not compile.
  F.   The code will compile but will throw an exception at run time.
    
    Correct(F)
 */
public class DisplayListContent {
    public static void main(String... args){
        var al = new ArrayList<String>();
            al.forEach( k -> {
                    System.out.print(k.length());    
                });
    }
}