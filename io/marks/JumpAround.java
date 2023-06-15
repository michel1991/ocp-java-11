package io.marks;
import java.io.*;
import io.PathUtility;
public class JumpAround {
    
    /**
         What is the output of the following method applied to an InputStream
        that contains the first four prime numbers, stored as bytes: 2, 3, 5, 7?

        A. 5
        B. 7
        C. The code does not compile.
        D. The code compiles but throws an exception at runtime.
        E. The result cannot be determined until runtime.
        F. None of the above.

        The code compiles, so option C is incorrect.
        Not all InputStream classes support the mark() operation.
        If mark() is supported, then 7 is printed at runtime.
        Alternatively, if mark() is not supported, then an IOException will be printed at runtime.
        For this reason, option E is correct.
        Always remember to call markSupported() before using a mark() operation on an InputStream.
     */
    private static void jumpAround(InputStream is) throws IOException {
        try (is) {
            is.skip(1);
            is.read();
            is.skip(1);
            is.mark(4);
            is.skip(1);
            is.reset();
            System.out.print(is.read());
        }
    }
    
    public static void main(String... args){
        String path = PathUtility.getResourcePath()
                                .append(PathUtility.getFileSeparator())
                                .append("jumpAround.txt")
                                .toString()
        ;
        System.out.println(path );
        try(var in = new FileInputStream(path)){
            jumpAround(in);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}