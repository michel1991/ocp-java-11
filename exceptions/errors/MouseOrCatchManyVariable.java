package exceptions.errors;



/**
 * What is printed by the following? (Choose all that apply.)
    A. 1
    B. 2
    C. 3
    D. 4
    E. 5
    F. The stack trace for a NullPointerException
    G. None of the above

    When using a multi-catch block, only one variable can be declared.
    For this reason, line 9 does not compile and option G correct.
 *
 */
 class Mouse { // 1:
    public String name; //  2:
    public void findCheese() { //    3:
        System.out.print("1"); //   4:
        try { //     5:
            System.out.print("2"); //   6:
            name.toString(); //    7:
            System.out.print("3"); //  8:
        } catch (NullPointerException e | ClassCastException e) { //   9:
            System.out.print("4"); //   10:
            throw e; //   11:
        } //  12:
        System.out.print("5"); // 13:
    } //  14:
    public static void main(String... tom) { //    15:
        Mouse jerry = new Mouse(); //   16:
        jerry.findCheese(); //   17:
    } } //   18:
public class MouseOrCatchManyVariable {

}