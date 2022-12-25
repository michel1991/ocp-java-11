package nio.errors;
import java.io.*;
import java.util.stream.*;
import java.util.*;

public class ListFileMethodBadUsesInStream {
    /**
       What is the expected output of calling the following method on the directory /user that exists within
       the file system, is accessible, and does not contain any symbolic links?

        A. It will print all the files in /user.
        B. It will print all the files and directories in /user.
        C. It will print all the files in the directory tree of /user.
        D. If will print all the files and directories in the directory tree of /user.
        E. The output cannot be determined until runtime.
        F. None of the above.

        Line 35 does not compile as listFiles() returns an instance of File[], not String[].
        For this reason, option F is correct. If the type of variable s on line 35 were changed to File,
        then the code would compile and print the files and directories, not the entire directory tree,
        and option B would be correct.

     */
    static void printDirectory(String name) { // 31:
        var f = new File(name); // 32:
        List.of(f.listFiles()) //  33:
             .stream()  //   34:
             .map((String s) -> s.toString()) //  35:
             .forEach(System.out::println); //  36:
    } //   37:
}