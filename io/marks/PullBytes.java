package io.marks;
import java.io.*;
import io.PathUtility;

public class PullBytes {
    
    /**
     Assume that in is a valid stream whose next bytes are XYZABC.
       What is the result of calling the following method on the stream, using a count value of 3?

        A. It will return a String value of XYZ.
        B. It will return a String value of XYZA.
        C. It will return a String value of XYZX.
        D. It will return a String value of XYZY.
        E. The code does not compile.
        F. The code compiles but throws an exception at runtime.
        G. The result cannot be determined with the information given.

        Not all I/O streams support the mark() operation; therefore,
        without calling markSupported() on the stream, the result is unknown until runtime.
        If the stream does support the mark() operation, then the result would be XYZY,
        and option D would be correct.
        The reset() operation puts the stream back in the position before the mark() was called,
        and skip(1) will skip X. If the stream does not support the mark() operation,
        a runtime exception would likely be thrown, and option F would be correct.
        Since you don’t know if the input stream supports the mark() operation,
        option G is the only correct choice.

     */
    public static String pullBytes(InputStream in, int count)
      throws IOException {
        in.mark(count);
        var sb = new StringBuilder();
        for(int i=0; i<count; i++)
            sb.append((char)in.read());
        in.reset();
        in.skip(1);
        sb.append((char)in.read());
        return sb.toString();
    }
    
    public static void main(String... args){
        String path = PathUtility.getResourcePath()
                                .append(PathUtility.getFileSeparator())
                                .append("pullBytes.txt")
                                .toString()
        ;
        System.out.println(path );
        try(var in = new FileInputStream(path)){
            pullBytes(in, 3);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}