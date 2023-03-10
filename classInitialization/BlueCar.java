package classInitialization;

/**
 *  What is the output of the BlueCar program?
    A. 23451
    B. 12345
    C. 14523
    D. 13245
    E. The code does not compile.
    F. None of the above.

    The class is loaded first, with the static initialization block called and 1 is printed.
    When the BlueCar is created in the main() method,
    the superclass initialization happens first.
    The instance initialization blocks are executed before the constructor,
    so 32 is outputted next.
    Finally, the object is created with the instance initialization
    blocks again being called before the constructor, outputting 45.
    The result is that 13245 is printed, making option D the correct answer.
 */
abstract class Car {
    static { System.out.print("1"); }
    public Car(String name) {
        super();
        System.out.print("2");
    }
    { System.out.print("3"); }
}
public class BlueCar extends Car {
    { System.out.print("4"); }
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
    public static void main(String[] gears) {
        new BlueCar();
    }
}
