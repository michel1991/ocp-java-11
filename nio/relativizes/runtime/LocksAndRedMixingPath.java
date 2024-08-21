package nio.relativizes.runtime;
import java.nio.file.*;
import java.io.*;

public class LocksAndRedMixingPath {
    /**
       What is the output of the following code snippet? Assume that the current directory is the root path /.
        A. ../found/red.zip and ../../locks
        B. /found/red.zip and /found/red.zip/./locks
        C. locks/../found/red.zip and ../found/locks
        D. ../../locks and ../found/red.zip
        E. /found/red.zip and /found/red.zip/locks
        F. The code compiles but throws an exception at runtime.

        The relativize() method requires that both path values be absolute or relative.
        Based on the details provided, p1 is a relative path, while p2 is an absolute path.
        For this reason, the code snippet produces an exception at runtime, making option F the correct answer.
        If the first path was modified to be absolute by dropping the leading dot (.) in the path expression,
        then the output would match the values in option A.
     */
    public static void main(String... args){
        Path p1 = Paths.get("./locks");
        Path p2 = Paths.get("/found/red.zip");
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));
    }
}