package inheritance.hide.errors;

/**
 * What is the output of the Square program?
    A. 0
    B. 2
    C. 4
    D. The code does not compile due to line x1.
    E. The code does not compile due to line x2.
    F. The code does not compile due to line x3.

    The override of getEqualSides() in Square is invalid.
    A static method cannot override a non-static method and vice versa.
    For this reason, option E is the correct answer.
    The rest of the lines compile without issue.
    If the static modifier were added to the method declaration on line x2,
    then the code would print 4 at runtime.

 */
abstract class Trapezoid {
    private int getEqualSides() {return 0;}
}
abstract class Rectangle extends Trapezoid {
    public static int getEqualSides() {return 2;}  // x1
}
final class Square extends Rectangle {
    public int getEqualSides() {return 4;}         // x2
    public static void main(String[] corners) {
        final Square myFigure = new Square();       // x3
        System.out.print(myFigure.getEqualSides());
    }
}
public class SquareBadOverride {

}