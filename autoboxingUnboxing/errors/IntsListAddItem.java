package autoboxingUnboxing;
import java.util.*;

public class IntsListAddItem {
    /**
     *  What is true of this code? (Choose two.)
        A. The code compiles as is.
        B. One line needs to be removed for the code to compile.
        C. Two lines need to be removed for the code to compile.
        D. One line of code uses autoboxing.
        E. Two lines of code use autoboxing.
        F. Three lines of code use autoboxing.
        
        Option B is one answer because line 26 does not compile.
        The ? wildcard cannot be used when instantiating
        a type on the right side of the assignment operator.
        The other lines do compile. Additionally,
        option E is correct because lines 28 and 29 use autoboxing.
        They convert a primitive to a wrapper object, in this case Double and Integer,
        respectively. Line 30 is correct and does not use autoboxing.
         It places a null reference as the Integer object.
     */
   static void add(){
       List<String> strings = new ArrayList<?>(); // 26:
       var ints = new HashSet<Integer>(); //   27:
       Double dbl = 5.0; //  28: 
       ints.add(2); //   29:
       ints.add(null); //30:
   }
}