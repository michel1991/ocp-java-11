package nestedClass.manyRules;
/**
 How many lines of the following program do not compile?
 
    A. Zero
    B. One
    C. Two
    D. Three
    E. More than three
    
    The code does not contain any compilation errors.
    While an abstract class cannot be marked final,
    a concrete class extending it can be.

    Likewise, a concrete method overriding an abstract one can also be marked final.
    In the ParkVisit class, the getValue() method accesses
    the effectively final variables width and fun.

    Finally, a class can override a method that it inherits
    from both an interface and an abstract class,
    provided the method signatures are compatible.

 */
interface Tool {
    void use(int fun);
}
abstract class Childcare {
    abstract void use(int fun);
}
public final  class Stroller extends Childcare implements Tool {
    final public void use(int fun) {
        int width = 5;
        class ParkVisit {
            int getValue() { return width + fun; }
        }
        System.out.print(new ParkVisit().getValue());
    }
}