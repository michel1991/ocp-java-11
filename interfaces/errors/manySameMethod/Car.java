package interfaces.errors.manySameMethod;

/**
 *  What is the output of the following application?
    A. 5
    B. 10
    C. 15
    D. The code does not compile.
    E. The answer cannot be determined with the information given.
    
    Both the Drive and Hover interfaces define a default method getSpeed()
    with the same signature. The class Car implements both interfaces,
    which means it inherits both default methods.
    Since the compiler does not know which one to choose,
    the Car class must override the default method.
    Since it does not, the code does not compile, and option D is correct.
    Note that the RaceCar class does properly override the default method, the problem is with the Car class.

 */
interface Drive {
    int SPEED = 5;
    default int getSpeed() { return SPEED; }
}
interface Hover {
    int MAX_SPEED = 10;
    default int getSpeed() { return MAX_SPEED; }
}
 public class Car implements Drive, Hover {
    public static void main(String[] gears) {
        class RaceCar extends Car {
            @Override public int getSpeed() { return 15; }
        };
        System.out.print(new RaceCar().getSpeed());
    } }