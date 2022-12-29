package advancedDesign;

/**
   What lines are printed by the following program? (Choose all that apply.)
   A. Line 8 generates a compiler error.
    B. Line 9 generates a compiler error.
    C. Empty =
    D. Empty = false
    E. Brand =
    F. Brand = null
    G. Code = 0.0
    H. Code = 0f

    The code compiles and runs without issue, so options A and B are incorrect.
    A boolean field initializes to false, making option D correct with Empty = false being printed.
    Object references initialize to null, not the empty String,
    so option F is correct with Brand = null being printed.
    Finally, the default value of floating-point numbers is 0.0.
    Although float values can be declared with an f suffix, they are not printed with an f suffix.
    For these reasons, option G is correct and Code = 0.0 is printed.

 */
class WaterBottle { // 1:
    private String brand; // 2:
    private boolean empty; //  3:
    public static float code; // 4:
    public static void main() { //  5:
        WaterBottle wb = new WaterBottle(); //  6:
        System.out.println("Empty = " + wb.empty); //  7:
        System.out.println("Brand = " + wb.brand); //   8:
        System.out.println("Code = " + code); //   9:
    } } //    10:
public class WaterBottleDefaultInstanceValue {
    public static void main(String[] args) {
        WaterBottle.main();
    }
}