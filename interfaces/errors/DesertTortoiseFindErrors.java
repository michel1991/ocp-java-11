package interfaces.errors;
import java.lang.annotation.*;

/**
  Which is the first declaration to not compile?

    A. The CanBurrow interface does not compile.
    B. The HasHardShell interface does not compile.
    C. The Tortoise interface does not compile.
    D. The DesertTortoise interface does not compile.
    E. All of the interfaces compile.

    First, both CanBurrow and HasHardShell compile as functional
    interfaces since they contain exactly one abstract method,
    although only the latter uses the optional @FunctionalInterface annotation.
    The declarations of these two interfaces, along with the abstract class Tortoise,
    compile without issue, making options A, B, and C incorrect.
    The class DesertTortoise inherits two abstract methods,
    one from the interface CanBurrow and the other from the abstract parent class Tortoise.
    Since the class implements only one of them and the class is concrete,
   the class declaration of DesertTortoise fails to compile, making option D the correct answer.
 */
interface CanBurrow {
    public abstract void burrow();
}

@FunctionalInterface interface HasHardShell
extends CanBurrow {}

abstract class Tortoise implements HasHardShell {
    public abstract int toughness();
}

class DesertTortoise extends Tortoise {
    public int toughness() { return 11; }
}

public class DesertTortoiseFindErrors {

}