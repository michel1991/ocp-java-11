package autoboxingUnboxing;
import java.util.*;

/**
 * How many of these lines have a compiler error?
    A. 0
    B. 1
    C. 2
    D. 3
    E. 4
    F. 5

    Line 20 creates a List˂Character˃. Line 21 does not compile because it is the wrong type.
    Char should be Character. Line 22 uses unboxing to get a primitive.
    Line 23 also compiles because Character can be unboxed and widened to int automatically.
    However, line 24 does not compile as Integer and Character are not in the same class hierarchy.
    The Character value cannot be unboxed, widened to int, and then autoboxed as Integer.
    Finally, line 25 is correct as Character is a subclass of Object.
    Since two lines of code fail to compile, option C is the answer.
 */
public class CharacterWithIntegersFindErrors {
   static void findErrors(){
       var list = List.of('a', 'c', 'e'); //  20:
       Char letter1 = list.get(0); //   21:
       char letter2 = list.get(0); //     22:
       int letter3 = list.get(0); //  23:
       Integer letter4 = list.get(0); //  24:
       Object letter5 = list.get(0); // 25:
   }
}