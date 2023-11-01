package interfaces.implicitModifiers;

/**
 *  How many of the following members of Telephone interface are public?
    A. Zero.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. The code does not compile.

    All four members of the Telephone interface
    are implicitly public,
    making option E correct.
    Only private and private static interface methods
    are not public, and they must be explicitly marked private.

 */
public interface Telephone {
    static int call() { return 1; }
    default void dial() {}
    long answer();
    String home = "555-555-5555";
}
