package exceptions.errors;
import java.io.*;

/**
* Which statement about the following method is true? (Choose all that apply.)
*   A. It compiles and prints abc.
    B. It compiles and prints abd.
    C. It compiles and prints abcd.
    D. One line contains a compiler error.
    E. Two lines contain a compiler error.
    F. Three lines contain a compiler error.
    G. It compiles but prints an exception at runtime.

    Line 5 does not compile as the FileNotFoundException thrown on line 12 is not handled or declared by the method.
    Line 7 does not compile because StringBuilder does not implement AutoCloseable and is therefore not compatible with a try-with-resource statement.
    Finally, line 10 does not compile as RuntimeException is a subclass of Exception in the multi-catch block, making it redundant.
    Since this method contains three compiler errors, option F is the correct answer. For more information, see Chapter 10.

 */
public class FindManyErrorsIntoMain {
    public static void main(String... unused) { //  5:
        System.out.print("a");  //   6:
        try (StringBuilder reader = new StringBuilder()) { //  7:
            System.out.print("b"); //   8:
            throw new IllegalArgumentException(); //  9:
        } catch (Exception e || RuntimeException e) { //   10:
            System.out.print("c"); //  11:
            throw new FileNotFoundException(); //  12:
        } finally { //  13:
            System.out.print("d"); //  14:
        } } //   15:
}