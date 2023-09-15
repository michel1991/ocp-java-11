package exceptions.errors.badSynthax;

/**
 * What is the output of the following application?
    A. 0
    B. Caught!
    C. The code does not compile because LostBallException is not handled or declared in the main() method.
    D. The code does not compile because ArrayIndexOutOfBoundsException is not handled or declared in the toss() method.
    E. The code does not compile for a different reason.
    F. None of the above.
    
    The code does not compile because the throw keyword
    is incorrectly used in the toss() method declaration.
    The keyword throws should have been used instead. For this reason,
    option E is the correct answer. If the correct keyword was used,
    then the code would compile and Caught! at runtime.
 */
class LostBallException extends Exception {}
public class Ball {
    public void toss() throw LostBallException {
        var windUp = new int[0];
        System.out.println(windUp[0]);
    }
    public static void main(String[] bouncy) {
        try {
            new Ball().toss();
        } catch (Throwable e) {
            System.out.print("Caught!");
        }
    }
}
