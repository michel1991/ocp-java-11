package nio.errors;
import java.nio.file.*;
import java.io.*;

/**
 *  What is the expected output of the following application? Assume
   the directories referenced in the class do not exist prior
   to the execution and that the file system is available and able to be written
   
    A. One line of this application does not compile.
    B. Two lines of this application do not compile.
    C. The code compiles, but line k1 triggers an exception at runtime.
    D. The code compiles, but line k2 triggers an exception at runtime.
    E. The code compiles and runs without printing an exception.
    F. None of the above.
    
    The code does not compile. There are no createDirectory(), createDirectories(),
    and delete() methods defined on the Path interface. Instead,
    the NIO.2 Files class should be used. Since four lines of code do not compile,
    option F is the correct answer. If the lines were corrected to use the Files class,
    then the application would print an exception at line k1, as the directory already exists.
 */
public class Resume {
    public void writeResume() throws Exception {
        var f1 = Path.of("/templates/proofs");
        f1.createDirectories();
        var f2 = Path.of("/templates");
        f2.createDirectory(); // k1
        try(var w = Files.newBufferedWriter(
                Path.of(f2.toString(), "draft.txt"))) {
            w.append("My dream job");
            w.flush();
        }
        f1.delete(f1);
        f2.delete(f2);        // k2
    }

    public static void main(String... leads) {
        try {
            new Resume().writeResume();
        } catch (Exception e) {
            e.printStackTrace();
        } } }