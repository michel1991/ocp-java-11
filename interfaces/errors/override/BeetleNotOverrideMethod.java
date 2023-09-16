package interfaces.errors.override;

/**
   Which statements about the following program are correct? (Choose all that apply.)
    A. It compiles without issue.
    B. The code will produce a ClassCastException if called at runtime.
    C. The code will not compile because of line 2.
    D. The code will not compile because of line 5.
    E. The code will not compile because of line 8.
    F. The code will not compile because of line 10.

  First, the declarations of HasExoskeleton and Insect are correct
  and do not contain any errors, making options C and D incorrect.
  The concrete class Beetle extends Insert and inherits two abstract methods,
  getNumberOfSections() and getNumberOfLegs().
  The Beetle class includes an overloaded version of getNumberOfSections() that takes an int value.
  The method declaration is valid, making option F incorrect,
  although it does not satisfy the abstract method requirement.
   For this reason, only one of the two abstract methods is properly overridden.
   The Beetle class therefore does not compile, and option E is correct.
   Since the code fails to compile, options A and B are incorrect.
 */
interface HasExoskeleton { // 1:
    double size = 2.0f; // 2:
    abstract int getNumberOfSections(); // 3:
} // 4:
abstract class Insect implements HasExoskeleton { // 5:
    abstract int getNumberOfLegs(); //   6:
} // 7:
class Beetle extends Insect { // 8:
    int getNumberOfLegs() { return 6; } //  9:
    int getNumberOfSections(int count) { return 1; } //  10:
} //  11:

public class BeetleNotOverrideMethod {
  public static void main(String... args){

  }
}