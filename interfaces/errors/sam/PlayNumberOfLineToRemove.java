package interfaces.errors.sam;
import java.lang.annotation.*;
/**
   What does the following print? What is the minimum number of lines that need to be removed to make this code compile?
    A. 1
    B. 2
    C. 3
    D. 4
    E. The code compiles as is.

    This code is not a functional interface because it has three abstract methods:
    fun(), game(), and toy(). Removing two of these three methods would cause
    the code to compile. However, there is no requirement that the code be a functional interface.
    Since it only needs to compile, removing the @FunctionalInterface
    annotation would also cause the code to compile.
    Option A is correct since only the annotation needs to be removed.
 */

@FunctionalInterface
interface Play {
    public static void baseball() {}
    private static void soccer() {}
    default void play() {}
    void fun();
    void game();
    void toy();
}


public class PlayNumberOfLineToRemove {

}