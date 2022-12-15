package advancedDesign.errors;

/**
*  How many lines in the following code have compiler errors?
*   A. 0
    B. 1
    C. 2
    D. 3
    E. 4
    F. 5

  If a variable is static final, it must be set exactly once, and it must be in the declaration line or in a static initialization block.
  Line 4 doesn’t compile because bench is not set in either of these locations.
  Line 15 doesn’t compile because final variables are not allowed to be set after that point.
  Line 11 doesn’t compile because name is set twice: once in the declaration and again in the static block.
  Line 12 doesn’t compile because rightRope is set twice as well. Both are in static initialization blocks.
 */
class RopeSwing { // 1:
    private static final String leftRope; //   2:
    private static final String rightRope; //  3:
    private static final String bench; //   4:
    private static final String name = "name"; //    5:
    static { //  6:
            leftRope = "left"; //  7:
          rightRope = "right"; //   8:
    } //  9:
    static { //  10:
        name = "name"; //  11:
        rightRope = "right"; //   12:
    } //   13:
    public static void main(String[] args) { //  14:
        bench = "bench"; //   15:
    } //  16:
} // 17:


public class RopeSwingInitializationOfFinalMember {

}