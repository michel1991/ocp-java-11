package io;
import java.io.*;

/**
* The variable w refers to System.out, which is closed at the end of the try-with-resources statement, but before println() is called.
* Since PrintStream instances do not throw exceptions when closed, nothing is printed at runtime, and option D is correct.
* If the stream were open, then it would print LX.
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
       String rootPath = System.getProperty("user.dir");
       File file = new File(rootPath, "io/lynx.txt");
       System.out.println(file.exists());
       FileInputStream fi = new FileInputStream(file);
       printData(fi);
       System.out.println("end load data");
    }
}