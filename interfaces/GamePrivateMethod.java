package interfaces;

/**
 * Fill in the blank with the line of code that allows the program to compile and print 15 at runtime.
   A. Sport.play()
    B. Sport.super.play()
    C. Sport.Tennis.play()
    D. Tennis.Sport.super.play()
    E. The code does not compile regardless of what is inserted into the blank.
    F. None of the above.

    The code compiles, even if the blank is replaced with a constant int value,
    making option E incorrect.
    The private method play() declared in the Sport interface is not accessible in the Game class.
     For this reason, option F is correct.
 */
interface Sport {
    private int play() { return 15; }
}
interface Tennis extends Sport {
    private int play() { return 30; }
}
 class Game implements Tennis {
    public int play() { return 0 ; } // ______________ (zero is my custom response)
        public static void main(String... ace) {
            System.out.println(new Game().play());
        } }

public class GamePrivateMethod {

}