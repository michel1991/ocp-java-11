package interfaces.errors.exceptions;

/**
  What is the output of the following application?
    A. Meow
    B. Roar!
    C. Roar!!!
    D. MeowRoar!
    E. A stack trace is printed at runtime.
    F. None of the above.

    The application does not compile because
    the roar() method in the BigCat class uses throw instead of throws,
    making option F correct.
    Note that if the correct keyword was used, then the code would compile and print Meow at runtime.
 */
class BigCat {
    void roar(int level) throw RuntimeException {
        if(level < 3 ) throw new IllegalArgumentException();
        System.out.print("Roar!");
    }
}
class Lion extends BigCat {
    public void roar() {
        System.out.print("Roar!!!");
    }
    void roar(int sound) {
        System.out.print("Meow");
    }

    public static void main(String[] cubs) {
        final BigCat kitty = new Lion();
        kitty.roar(2);
    }
}

public class LionUseBadKeyWordToThrowsException {

}