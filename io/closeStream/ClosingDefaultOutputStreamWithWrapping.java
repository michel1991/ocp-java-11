package io.closeStream;
import java.io.*;
import io.PathUtility;

/**
    Assume in is a valid stream whose next bytes are LYNX. What is the result of calling the following method on the stream?
    A. It prints L.
    B. It prints LN.
    C. It prints LX.
    D. It does not print anything.
    E. An exception is thrown.
    F. The answer cannot be determined until runtime.
    G. None of the above, as the method does not compile.

    The variable w refers to System.out,
    which is closed at the end of the try-with-resources statement,
    but before println() is called.
    Since PrintStream instances do not throw exceptions when closed,
    nothing is printed at runtime, and option D is correct.
    If the stream were open, then it would print LX.
 */
public class ClosingDefaultOutputStreamWithWrapping {
    public static void printData(InputStream in) throws IOException {
        var w = new StringBuilder();
        try(in;  var o = new BufferedOutputStream(System.out);) {
            w.append((char) in.read());
            in.skip(1);
            in.read();
            in.skip(0);
            w.append((char)in.read());
            o.flush();
        }
        System.out.println(w);
    }

    public static void main(String... arg) throws IOException{
       String rootPath =  PathUtility.getResourcePath().toString();
       File file = new File(rootPath, "lynx.txt");
       System.out.println(file.exists());
       FileInputStream fi = new FileInputStream(file);
       printData(fi);
       System.out.println("end load data"); // the stream already close in previous methods
    }
}