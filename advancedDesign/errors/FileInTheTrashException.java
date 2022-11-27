package  advancedDesign.errors;
import java.io.*;
/**
* How many lines of the following program contain compiler errors?
    A. One
    B. Two
    C. Three
    D. Four
    E. Zero, but produces a stack trace at runtime
    F. Zero, but does not produce a stack trace at runtime

   The program does not compile.
   For starters, the FileInTheTrashException does not implement AutoCloseable and cannot be used in a try-with-resources statement.
   For this reason, line 7 does not compile.
   Next, the FileInTheTrashException class does not define any constructors, so the compiler inserts the default no-argument constructor.
   This is not compatible with the constructor calls on lines 4 and 8, so they do not compile.
   Since the code contains three lines that do not compile, option C is the correct answer.
 */
public class FileInTheTrashException extends IOException { // 2
    public void close() throws FileInTheTrashException { //  3:
        throw new FileInTheTrashException("Unable to close"); //  4:
    } //  5:
    public static void main(String[] args) throws Exception { //   6:
        try (var f = new FileInTheTrashException()) { // 7:
            throw new FileInTheTrashException("Thrown away"); //  8:
        } } //  9:
}