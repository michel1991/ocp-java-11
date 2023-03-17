package nio.errors;
import java.nio.file.*;
import java.io.*;

/**
 * What is the expected result of calling deleteTree() on a directory? Assume the directory exists and is able to be modified.
    A. It will delete the directory itself only.
    B. It will delete the directory and its file contents only.
    C. It will delete the entire directory tree.
    D. The code does not compile.
    E. The code compiles but produces an exception at runtime.
    F. None of the above.

    The Files.delete() and Files.list() declare a checked IOException
    that must be handled or declared.
    For this reason, the code does not compile, and option D is correct.
 */
class Exterminate {
    public void deleteTree(Path q) {
        if (!Files.isDirectory(q))
            Files.delete(q);
        else {
            Files.list(q).forEach(this::deleteTree);
            Files.delete(q);
        } } }


public class ExterminateDeleteMethodThrowsCheckedException {

}