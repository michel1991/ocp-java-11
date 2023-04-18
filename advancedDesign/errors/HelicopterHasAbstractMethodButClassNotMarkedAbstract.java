package advancedDesign.errors;

/**
 * What is the output of the Helicopter program?
    A. 5
    B. 10
    C. The code does not compile.
    D. The code compiles but produces a ClassCastException at runtime.
    E. None of the above.
    
    The Rotorcraft class includes an abstract method, but the class itself is not marked abstract.
    Only interfaces and abstract classes can include abstract methods.
    Since the code does not compile, option C is the correct answer.
 */
class Rotorcraft {
    protected final int height = 5;
    abstract int fly();
}
interface CanFly {}
 class Helicopter extends Rotorcraft implements CanFly {
    private int height = 10;
    protected int fly() {
        return super.height;
    }
    public static void main(String[] unused) {
        Helicopter h = (Helicopter)new Rotorcraft();
        System.out.print(h.fly());
    }
}

public class HelicopterHasAbstractMethodButClassNotMarkedAbstract {
  
}