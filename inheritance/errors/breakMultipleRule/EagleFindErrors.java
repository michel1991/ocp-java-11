package inheritance.errors.breakMultipleRule;

/**
 * How many compiler errors does the following code contain?
    A. None
    B. One
    C. Two
    D. Three
    E. Four
    
 The method fly() defined in CanFly defines an implementation, an empty {},
  meaning it cannot be assumed to be abstract; therefore, the code does not compile.
  Next, the implementation of fly(int speed) in the Bird class also does not compile,
  but not because of the signature. The method body fails to return an int value.
   Finally, the Eagle class does not compile because it extends the Bird class,
   which is marked final and, therefore, cannot be extended.
   For these three reasons, option D is the correct answer.
 */
interface CanFly {
    public void fly() {}
}
final class Bird {
    public int fly(int speed) {}
}
class Eagle extends Bird implements CanFly {
    public void fly() {}
}


public class EagleFindErrors {

}