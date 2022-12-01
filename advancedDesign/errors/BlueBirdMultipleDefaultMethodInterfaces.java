package advancedDesign.errors;
/**
* Given the following program, what can be inserted into the blank line that would allow it to print Sing! at runtime?
*   A. super.chirp();
    B. Sing.chirp();
    C. super.Sing.chirp();
    D. Sing.super.chirp();
    E. The code does not compile regardless of what is inserted into the blank.
    F. The code compiles, but due to polymorphism, it is not possible to produce the requested output without creating a new object.

    If a class or interface inherits two interfaces containing default methods with the same signature, then it must override the method with its own implementation.
    The chirp() method in BlueBird is an overload, not an override, since it contains an extra parameter.
    Since the BlueBird class fails to override the method, the code does not compile regardless of what is entered in the blank.
    If the extra parameter was removed from the version of chirp() in BlueBird, then the code would compile and Sing.super.chirp() would be the proper way to print Sing! at runtime.
 */

interface Play {
    default void chirp() { System.out.print("Play!"); }
}

interface Sing {
    default void chirp() { System.out.print("Sing!"); }
}

class BlueBird implements Play, Sing {
    public void chirp(int p) { System.out.print("Party!"); }
    private void relax() {
       // ____________________
    }
    public static void main(String[] eggs) {
        new BlueBird().relax();
    }
}

public class BlueBirdMultipleDefaultMethodInterfaces {

}