package interfaces.errors.reduceVisibility;

/**
* Which of the following statements about this program is correct?
    A. It compiles and prints 14.
    B. It compiles and prints 15.
    C. The code will not compile because of line 4.
    D. The code will not compile because of line 5.
    E. The code will not compile because of line 6.
    F. None of the above

  The inherited interface method getNumOfGills(int) is implicitly public;
  therefore, it must be declared public in any concrete class that implements the interface.
  Since the method uses the default (package-private) modifier in the ClownFish class,
  line 6 does not compile, making option E the correct answer.
  If the method declaration was corrected to include public on line 6,
  then the program would compile and print 15 at runtime, and option B would be the correct answer.

 */
interface Aquatic { // 1:
    int getNumOfGills(int p); //  2:
} //    3:
 class ClownFish implements Aquatic { // 4:
    String getNumOfGills() { return "14"; } //  5:
    int getNumOfGills(int input) { return 15; } //   6:
    public static void main() { // 7:
        System.out.println(new ClownFish().getNumOfGills(-1)); //  8:
    } } // 9:
public class ClownFishModifierAccess {
    public static void main(String[] args) {
        ClownFish.main();
    }
}