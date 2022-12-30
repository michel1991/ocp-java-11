package advancedDesign;

/**
   What is the result of the following code?
    A. Oh-Bird
    B. Oh-Pelican
    C. Wow-Oh-Bird
    D. Wow-Oh-Pelican
    E. The code contains a compilation error.
    F. None of the above

    The code compiles without issue. The question is making sure you know that superclass constructors
    are called in the same manner in abstract classes as they are in nonabstract classes.
    Line 9 calls the constructor on line 6.
    The compiler automatically inserts super() as the first line of the constructor defined on line 6.
    The program then calls the constructor on line 3 and prints Wow-. Control then returns to line 6,
    and Oh- is printed.
    Finally, the method call on line 10 uses the version of fly() in the Pelican class,
    since it is marked private and the reference type of var is resolved as Pelican.
    The final output is Wow-Oh-Pelican, making option D the correct answer.
    Remember that private methods cannot be overridden.
    If the reference type of chirp was Bird, then the code would not compile as it would not be accessible outside the class.
 */
abstract class Bird { // 1:
    private final void fly() { System.out.println("Bird"); } //   2:
    protected Bird() { System.out.print("Wow-"); } //  3:
} //   4:
 class Pelican extends Bird { // 5:
    public Pelican() { System.out.print("Oh-"); } //   6:
    protected void fly() { System.out.println("Pelican"); } //7:
    public static void main(String[] args) { //  8:
        var chirp = new Pelican(); // 9:
        chirp.fly(); //    10:
    } } //   11:


public class PelicanClassInitialization {
    public static void main(String[] args) {
        Pelican.main(args);
    }
}