package io;
import java.io.*;

public class MarkMethod {
    /**
     Assume in and out are valid streams and the next characters of in are MONKEYS.
      What are possible results of executing the following method? (Choose all that apply.)

        A. MONK is written to out.
        B. MMON is written to out.
        C. Some other value is written to out.
        D. An exception is thrown because the size of buffer is not a power of 2.
        E. A NullPointerException is thrown.
        F. An IOException is thrown.
        G. None of the above, as the method does not compile.

      The method compiles although it does not call markSupported() before making use of the mark() and reset() methods.
      If mark() is not supported by the Reader, then it will throw an IOException, and option F is correct.
      Even if mark() is supported, the method contains a bug on line 16.
      Line 13 prints M to the stream.
      Line 15 then resets it, so it looks like line 16 should print MON to the stream, but it does not.
      The return value of in.read(buffer) is the number of characters read, resulting in the value of 3 written to the stream.
      For this reason, option C is correct. Option D is incorrect as buffer sizes are recommended, but not required, to be powers of 2.
      * 
     */
    void magic(Reader in, Writer out) throws IOException { // 10:
        final char[] buffer = new char[3]; //  11:
        in.mark(100); //  12:
        out.write(in.read()); //  13:
        in.skip(1); // 14:
        in.reset(); //   15:
        out.write(in.read(buffer)); // 16:
        out.flush(); //  17:
    } //  18:


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

    }
}