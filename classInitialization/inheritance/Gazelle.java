package classInitialization.inheritance;

/**
   What is printed by the following program?
    A. 182640
    B. 182943
    C. 182493
    D. 421389
    E. The code does not compile.
    F. The output cannot be determined until runtime.

   The code compiles and runs without issue, making options E and F incorrect.
   First, the class is initialized, starting with the superclass Antelope and then the subclass Gazelle.
   This involves invoking the static variable declarations and static initializers.
   The program first prints 1, followed by 8.
   Then, we follow the constructor pathway from the object created on line 14 upward,
   initializing each class instance using a top-down approach. Within each class, the instance initializers are run,
   followed by the referenced constructors. The Antelope instance is initialized, printing 24,
   followed by the Gazelle instance, printing 93. The final output is 182493, making option C the correct answer.
 */
class Antelope { // 1:
    public Antelope(int p) { // 2:
        System.out.print("4"); //   3:
    } //   4:
    { System.out.print("2"); } //   5:
    static { System.out.print("1"); } //  6:
} //   7:
public class Gazelle extends Antelope { // 8:
    public Gazelle(int p) { //  9:
        super(6); //   10:
        System.out.print("3"); //   11:
    } // 12:
    public static void main(String hopping[]) { //     13:
        new Gazelle(0); //    14:
    } // 15:
    static { System.out.print("8"); } //   16:
    { System.out.print("9"); } //    17:
} //     18:
