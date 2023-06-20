package classInitialization;

/**
* What is the result of the following?
*   A. tacb
    B. tacf
    C. tacbf
    D. tcafb
    E. taftacb
    F. The code does not compile.
    G. An exception is thrown.

    The code compiles and runs without issue, making options F and G incorrect.
    Line 16 initializes a PolarBear instance and assigns it to the bear reference.
    The variable declaration and instance initializers are run first, setting value to tac.
    The constructor declared on line 5 is called, resulting in value being set to tacb.
    Remember, a static main() method can access private constructors declared in the same class.
    Line 17 creates another PolarBear instance, replacing the bear reference declared on line 16.
    First, value is initialized to tac as before. Line 17 calls the constructor declared on line 8, since String is the narrowest match of a String literal.
    This constructor then calls the overloaded constructor declared on line 5, resulting in value being updated to tacb.
    Control returns to the previous constructor, with line 10 updating value to tacbf, and making option C the correct answer.
    Note that if the constructor declared on line 8 did not exist, then the constructor on 12 would match.
    Finally, the bear reference is properly cast to PolarBear on 18, making the value parameter accessible.
 */
public class PolarBear { // 1:
    StringBuilder value = new StringBuilder("t"); //  2:
    { value.append("a"); } // 3:
    { value.append("c"); } //  4:
    private PolarBear() { //   5:
        value.append("b"); //   6:
    } //   7:
    public PolarBear(String s) { // 8:
        this(); //  9:
        value.append(s); //   10:
    } //  11:
    public PolarBear(CharSequence p) { // 12:
        value.append(p); //  13:
    } //   14:
    public static void main() { //     15:
        Object bear = new PolarBear(); //   16:
        bear = new PolarBear("f"); //  17:
        System.out.println(((PolarBear)bear).value); //    18:
    }
    // just for test
    public static void main(String... args){
       main();
    }
    

} //   19:

