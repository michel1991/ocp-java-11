package nio;
import java.nio.file.*;
import java.io.*;

public class DuplicateFile {

    /**
    * Assuming the path referenced by m exists as a file, which statements about the following method are correct? (Choose all that apply.)
        A. If the path referenced by x does not exist, then it correctly copies the file.
        B. If the path referenced by x does not exist, then a new file will be created.
        C. If the path referenced x does not exist, then an exception will be thrown at runtime.
        D. If the path referenced x exists, then an exception will be thrown at runtime.
        E. The method contains a resource leak.
        F. The method does not compile.

       Option F is incorrect, as the code does compile.
       The method copies the contents of a file, but it removes all the line breaks.
       The while() loop would need to include a call to w.newLine() to correctly copy the file.
       For this reason, option A is incorrect. Option B is correct, and options C and D are incorrect.
       The APPEND option creates the file if it does not exist; otherwise, it starts writing from the end of the file.
       Option E is correct because the resources created in the method are not closed or declared inside a try-with-resources statement.
     */
    void duplicateFile(Path m, Path x) throws Exception {
        var r = Files.newBufferedReader(m);
        var w = Files.newBufferedWriter(x,
                                        StandardOpenOption.APPEND);
        String currentLine = null;
        while ((currentLine = r.readLine()) != null)
            w.write(currentLine);
    }

    public static void main(String... args){

    }

}