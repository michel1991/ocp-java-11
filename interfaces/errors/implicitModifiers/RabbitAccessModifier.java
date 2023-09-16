package interfaces.errors.implicitModifiers;

/**
* What is the output of the following code?
    A. Hop
    B. No output
    C. The code will not compile because of line 4.
    D. The code will not compile because of line 7.
    E. The code will not compile because of line 8.
    F. The code compiles but throws an exception at runtime.

  Recall that interfaces can extend other interfaces.
  In this example, Rabbit, as the first concrete subclass,
  inherits two abstract methods: getLegLength() and hop().
  Although the implementation of hop() is correct, the implementation of getLegLength() is incorrect.
  The access modifier for all abstract interface methods is assumed to be public,
  whereas the Rabbit subclass uses the default access modifier,
  resulting in a subclass implementing a method with a less accessible modifier.
  Therefore, the code will fail to compile because of line 8, and option E is correct.

*
 */
interface HasHindLegs { // 1:
    int getLegLength(); //  2:
} //  3:
interface CanHop extends HasHindLegs { // 4:
    public void hop(); //  5:
} //   6:
class Rabbit implements CanHop { // 7:
    int getLegLength() { return 5; } //  8:
    public void hop() { System.out.println("Hop"); } //   9:
    public static void main(String[] args) { //  10:
        new Rabbit().hop(); //  11:
    } //   12:
} //  13:

public class RabbitAccessModifier {

}