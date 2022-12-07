package accessibility.other.errors;
import accessibility.animal.*;
/**
* Which lines in Tadpole give a compiler error? (Choose all that apply.)
    A. 5
    B. 6
    C. 7
    D. 8
    E. 9
    F. 10

    The jump() method has default (package-private) access, which means it can be accessed only from the same package.
    Tadpole is not in the same package as Frog, causing lines 7 and 10 to give a compiler error, making options C and F correct.
    The ribbit() method has protected access, which means it can only be accessed from a subclass reference or in the same package.
    Line 6 is fine because Tadpole is a subclass. Line 9 does not compile because the variable reference is to a Frog, making option E correct.
    This is the trickiest question you can get on this topic on the exam. For more information, see Chapter 7.
 */
class Tadpole extends Frog { // 3:
    public static void main(String[] args) { //  4:
        Tadpole t = new Tadpole(); //  5:
        t.ribbit(); //    6:
        t.jump(); //   7:
        Frog f = new Tadpole(); //  8:
        f.ribbit(); //   9:
        f.jump(); //  10:
    } } //  11:

public class TadpoleMixedAccessModifier{
    
}