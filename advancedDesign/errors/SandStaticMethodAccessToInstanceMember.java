package advancedDesign.errors;

/**
 *  Which are true of the following? (Choose two.)
    A. The code compiles.
    B. One line doesn’t compile.
    C. Two lines don’t compile.
    D. If any constructors and/or methods that do not compile are removed, the remaining code prints a.
    E. If the code compiles or if any constructors/methods that do not compile are removed, the remaining code prints ab.
    F. If the code compiles or if any constructors/methods that do not compile are removed, the remaining code prints aab.

   A static method can access static variables, but not instance variables.
   The getNumRakes() method does not compile, so option B is correct.
   The main() method calls the constructor, which outputs a.
   Then the main method calls the run() method.
   The run() method calls the constructor again, which outputs a again.
   Then the run() method calls the Sand() method,
   which happens to have the same name as the constructor.
   This outputs b. Therefore, option F is correct.
 */
class Sand {
    private static int numShovels;
    private int numRakes;

    public static int getNumShovels() {
        return numShovels;
    }
    public static int getNumRakes() {
        return numRakes;
    }
    public Sand() {
        System.out.print("a");
    }
    public void Sand() {
        System.out.print("b");
    }
    public void run() {
        new Sand();
        Sand();
    }
    public static void main(String... args) {
        new Sand().run();
    }
}

public class SandStaticMethodAccessToInstanceMember {
  
}