package nestedClass.errors;

/**
   What is the output of the following application?
    A. 2
    B. 3
    C. 5
    D. 7
    E. The code does not compile.
    F. None of the above.

    The main() method attempts to define an anonymous class instance
    but fails to provide the class or interface name, or use the new keyword.
    The right-hand side of the assignment to the seaTurtle variable should start with new CanSwim().
    For this reason, option E is the correct answer.
    If the code was corrected with the proper declaration,
    then the program would output 7 at runtime.

 */
abstract interface CanSwim {
    public void swim(final int distance);
}
class Turtle {
    final int distance = 2;
    public static void main(String[] seaweed) {
        final int distance = 3;
        CanSwim seaTurtle = {
                final int distance = 5;
                @Override
         public void swim(final int distance) {
                    System.out.print(distance);
                }
        };
        seaTurtle.swim(7);
    }
}

public class TurtleBadDeclarationOfLocalClass {

}