package advancedDesign.errors;
import java.util.*;
/**
*  What is the fewest number of lines that you need to comment out in order to make this method compile?
    A. 0
    B. 1
    C. 2
    D. 3
    E. 4
    F. 5

    A variable name may not be used as a method parameter and a local variable.
    This means line 18 must be commented out.
    A method parameter also may not be used as a lambda requiring line 20 to be commented out.
    Finally, a local variable may not be used as a lambda variable in the same scope requiring one of line 19 or 21 to be commented out.
    Since three lines must be commented out, option D is correct.
 */
public class MinimumCodeToRemoveSwim {
    public static void swim(String color, //  15:
                            Comparator<String> comp) {  //  16:
        //17:
        String color = "blue"; // 18:
        String otherColor = "gray"; // 19:
        comp = (color, color2) -> color.compareTo(color2); // 20:
        comp = (otherColor, color2) -> color.compareTo(color2); // 21:
    } // 22:
}