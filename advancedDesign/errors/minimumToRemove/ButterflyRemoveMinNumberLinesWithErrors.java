package advancedDesign.errors.minimumToRemove;

/**
 * What is the minimum number of lines you need to remove in order to make this file compile?
    A. Zero
    B. One
    C. Two
    D. Three
    E. Four

    Line 7 needs to be removed because a package statement may not appear after any import statements.
    Two of the three import statements are redundant, but they do compile. Therefore, option B is correct.
 *
 */
 import java.util.*; // 1:
 import java.util.List; // 2:
 import java.util.ArrayList; // 3:
// 4:
 package bugs; // 5:
// 6:
class Butterfly { // 7:
    String wings; //  8:
    public void fly(List<Integer> age) {} //    9:
} //    10:

public class ButterflyRemoveMinNumberLinesWithErrors {

}