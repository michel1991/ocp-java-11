package interfaces.errors;

/**
* What is the result of the following code?
*   A. The code compiles without issue.
    B. The code will not compile because of line 6.
    C. The code will not compile because of line 8.
    D. The code will not compile because of line 10.
    E. The code will not compile because of line 12.
    F. None of the above

   In this example, CanWalk and CanRun both implement a default walk() method.
   The definition of CanSprint extends these two interfaces and therefore won’t compile unless the interface overrides both inherited methods.
   The version of walk() on line 12 is an overload, not an override, since it takes an int value.
   Since the interface doesn’t override the methods, the compiler can’t decide which default method to use, leading to a compiler error and making option D the correct answer.
 */
 interface CanWalk { //1:
    default void walk() { System.out.print("Walking"); } //   2:
    private void testWalk() {} //  3:
} // 4:
 interface CanRun { // 5:
     abstract public void run(); //  6:
    private void testWalk() {} //  7:
    default void walk() { System.out.print("Running"); } //  8:
 } //  9:
interface CanSprint extends CanWalk, CanRun { // 10:
     void sprint(); // 11:
    default void walk(int speed) { //  12:
        System.out.print("Sprinting"); //  13:
    } // 14:
    private void testWalk() {} //   15:
 } //   16:


public class CanSprintNotOverrideMethod {

}