package interfaces;

/**
 * Which of the following interface declarations will still compile if @FunctionalInterface is applied to each? (Choose two.)
    A. Dog
    B. KC
    C. Georgette
    D. Webby
    E. Astra

    To correctly apply the @FunctionalInterface annotation,
    the interface must pass the single abstract method test.
    Also, note that none of the default or static methods contributes to the abstract method count.

    Dog contains a single abstract method play(), so it will compile, making option A correct.
    Webby extends Dog with the same abstract method as Dog.
    It also declares toString(), but since this is inherited from java.lang.Object,
    it does not count as an abstract method.
    Therefore, Webby passes the single abstract method test for functional interfaces,
    making option D correct.Astra is incorrect because it contains two abstract methods, play() and fetch().
    KC is incorrect because it does not extend Dog and does not contain any abstract methods.
    Finally, Georgette is incorrect because it contains two abstract methods, play() and jump().
 */


@FunctionalInterface
interface Dog {
    default void drink() {}
    void play();
}

interface Astra extends Dog {
    private static int eat() { return 1; }
    void fetch();
}

@FunctionalInterface
interface Webby extends Dog {
    abstract void play();
    default void rest() {}
    abstract String toString();
}
interface KC {}
interface Georgette extends Dog {
    int intelligence = 5;
    void jump();
}
public class DogWebbyChoiceCorrectFI {

}