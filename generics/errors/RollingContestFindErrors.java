package generics.errors;
import java.util.*;
import java.io.*;

/**
 * How many lines fail to compile?
    A. One
    B. Two
    C. Three
    D. Four
    E. Five
    F. Six
    
    The Roller class uses a formal type parameter named E with a constraint.
    The key to this question is knowing that with generics,
    the extends keyword means any subclass
    or the class can be used as the type parameter.
    This means both Wheel and CartWheel are allowed.
    The wheel1 declaration is fine because
    the same type is used on both sides of the declaration.
    The wheel2 declaration does not compile because
    generics require the exact same type when not using wildcards.
    The wheel3 and wheel4 declarations are both fine because
    this time there is an upper bound
    to specify that the type can be a subclass.
    By contrast, the super keyword means it has
    to be that class or a superclass.
    The wheel6 declaration is OK, but the wheel5 one
    is a problem because it uses a subclass.
    Since wheel2 and wheel5 don’t compile, the answer is option B.
 */
class Roller<E extends Wheel> {
    public void roll(E e) { }
}
class Wheel extends WheelT  { }
class CartWheel extends Wheel { }


class RollingContest {
    Roller<CartWheel> wheel1 = new Roller<CartWheel>();
    Roller<Wheel> wheel2 = new Roller<CartWheel>();
    Roller<? extends Wheel> wheel3 = new Roller<CartWheel>();
    Roller<? extends Wheel> wheel4 = new Roller<Wheel>();
    Roller<? super Wheel> wheel5 = new Roller<CartWheel>(); // CartWheel
    Roller<? super Wheel> wheel6 = new Roller<Wheel>();
    
    
}

public class RollingContestFindErrors {
    
}