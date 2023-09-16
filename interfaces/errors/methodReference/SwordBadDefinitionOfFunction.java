package interfaces.errors.methodReference;
import java.util.function.*;

/**
 * Which lines fail to compile?
    A. Only line x
    B. Only line y
    C. Both lines x and y
    D. The code compiles.

   The method reference on line x is supposed to define a Function.
   The Shield interface does define a single abstract method.
   However, that method has a void return type, which is not compatible with Function.
   Line y does compile since addDragon() has both a parameter and return type.
   Option A is the answer, since only line x fails to compile.
 */
interface Shield {
    void protect();
}
class Dragon {
    int addDragon(Integer count) {
        return ++count;
    }
}

 class Sword {
    public static void main(String[] knight) {
        var dragon = new Dragon();
        Function<Shield, Sword> func = Shield::protect; // line x
        UnaryOperator<Integer> op = dragon::addDragon;  // line y
    }
}

public class SwordBadDefinitionOfFunction {
    
}