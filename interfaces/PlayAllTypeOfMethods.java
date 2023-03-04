package interfaces;

/**
 * What is the minimum number of lines that need to be removed to make this code compile?
    A. 1.
    B. 2.
    C. 3.
    D. 4.
    E. The code compiles as is.

    This code is already a functional interface and compiles without any changes.
    The Play interface has a single abstract method: fun().
    The other methods have a method body, which shows they are not abstract.
 */
@FunctionalInterface
interface Play {
    public static void baseball() {}
    private static void soccer() {}
    default void play() {}
    void fun();
}

public interface PlayAllTypeOfMethods {

}