package interfaces.errors.functional;
import java.util.*;
import java.util.function.*;

/**
   What is the output of the following application?
    A. 5 bent!
    B. 5.0 bent!
    C. The code does not compile because Bend is not a functional interface.
    D. The code does not compile because of the apply() method declaration.
    E. None of the above.

    A functional interface must contain exactly one abstract method.
    The Bend interface contains two abstract methods, pump() and bend(),
    since it extends Pump and inherits pump().
    For this reason, the Bend interface is not a valid functional interface
    and therefore cannot be used as a lambda expression, making option C the correct answer.
    The rest of the code compiles without issue.
    Note that the usage of an instance variable to call a static method,
    r.apply() in the main() method, is permitted but discouraged.
 */
interface Pump {
  void pump(double psi);
}
interface Bend extends Pump {
  void bend(double tensileStrength);
}
class Robot {
  public static final void apply(
          Bend instruction, double input) {
    instruction.bend(input);
  }
  public static void main(String... future) {
    final Robot r = new Robot();
    r.apply(x -> System.out.print(x+" bent!"), 5);
  }
}

public class RobotFIRequireOneAbstractInterface {

}