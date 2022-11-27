package advancedDesign.errors;

/**
* What is the result of this code? (Choose all that apply.)
*
   A. Compiler error on line 2
   B. Compiler error on line 4
   C. Compiler error on line 9
   D. Compiler error on line 10
   E. 500

  The species variable is final and static, which means it must be set exactly once.
  It must be set in the line it is declared on or in a static initializer.
  Since it is in an instance initializer, line 4 gives a compiler error.
  Instance initializers are run each time the object is constructed.
  However, a static constant can be set only once.
  Line 2 also gives a compiler error because the final variable is not set at all.
 */
class Dino { // 1:
    static final String species; // 2:
    double weight; // 3:
    { species = "Raptor"; } //  4:
    public Dino(double weight) { // 5:
        this.weight = weight; //  6:
    } // 7:
} // 11:


public class DenoInitializeMember {
    public static void main(String[] args) { //  8:
        Dino dino = new Dino(500); // 9:
        System.out.println(dino.weight); // 10:
    }
}