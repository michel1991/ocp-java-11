package nio;
import java.nio.file.*;
import java.io.*;

public class MovePaths {
    /**
    *  Which statements must be true prior to execution of the following method for it to complete without throwing an exception? (Choose all that apply.)
    *   A. p1 refers to a file or directory that exists within the file system.
        B. p1 refers to a file and not a directory that exists within the file system.
        C. p2 refers to a file or directory that does not exist within the file system.
        D. If p2 refers to a directory that exists within the file system, then it must be empty.
        E. p1 refers to a symbolic link.
        F. The file system is available, and path objects are not hidden by the file system.

        First, the file system must be accessible and readily available or the code will throw an exception at runtime, so option F is correct.
        The move() method may be applied to a file or a directory, making option A correct and option B incorrect.
        Next, without the REPLACE_EXISTING option, the method will throw an exception if the target exists, so option C is correct.
        Option D would be correct if the REPLACE_EXISTING option had been used and the p1 referred to a directory.
        Finally, option E is incorrect, as the move() method does not require a symbolic link.
     */
    static void movePaths(Path p1, Path p2) throws Exception {
        Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);
    }

    public static void main(String... args){

    }
}