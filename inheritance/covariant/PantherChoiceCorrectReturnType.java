package inheritance.covariant;
import java.util.*;

/**
   What types can be inserted in the blanks on the lines marked X and Z that
   allow the code to compile? (Choose all that apply.)

    A. Integer on the line marked X
    B. ArrayList on the line marked X
    C. List on the line marked Z
    D. ArrayList on the line marked Z
    E. None of the above, since the Run interface does not compile.
    F. The code does not compile for a different reason.

    The Run interface correctly overrides the inherited method move() from the Walk interface using a covariant return type.
    Options A and B are both correct.
    Notice that the Leopard class does not implement or inherit either interface,
    so the return type of move() can be any valid reference type that is compatible with the body returning null.
    Because the Panther class inherits both interfaces,
    it must override a version of move() that is covariant with both interfaces.
    Option C is incorrect, as List is not a subtype of ArrayList,
    and using it here conflicts with the Run interface declaration.
    Option D is correct, as ArrayList is compatible with both List and ArrayList return types.
    Since the code is capable of compiling, options E and F are incorrect.

 */
interface Walk { public List move(); }
interface Run extends Walk { public ArrayList move(); }
class Leopard {
    public ArrayList move() { // X _______
        return null;
    }
}
class Panther implements Run {
    public ArrayList  move() { // Z _______
        return null;
    }
}

public class PantherChoiceCorrectReturnType {

}