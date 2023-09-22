
package advancedDesign.errors.localInitialization;
/**
 *  What is the result of executing the following method?
    A. The declaration of name does not compile.
    B. The declaration of _number does not compile.
    C. The declaration of profit$$$ does not compile.
    D. The println() statement does not compile.
    E. The code compiles and runs successfully.
    F. The code compiles and throws an exception at runtime.
    
    Variables are allowed to start with an underscore and are allowed to contain a $.
    Therefore, all the variable declarations compile,
    making options A, B, and C incorrect.
    However, the println() refers to the uninitialized local boolean.
    Since local variables are not automatically initialized,
    the code does not compile, and option D is correct.
 */
public class Profit$$$ {
    public static void main(String... args) {
        String name = "Desiree";
        int _number = 694;
        boolean profit$$$;
        System.out.println(name + " won. "
                           + _number + " profit? " + profit$$$);
    }
}