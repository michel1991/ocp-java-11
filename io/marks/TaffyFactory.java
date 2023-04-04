package io.marks;
import java.io.*;

/**
 *  What is the output of the following application?
    A. -2
    B. 2
    C. 3
    D. 5
    E. 7
    F. An exception is thrown at runtime.
    
   The code compiles and runs without issue.
   The first two values of the ByteArrayInputStream are read.
   Next, the markSupported() value is tested. Since -1 is not one of the possible options,
   we assume that ByteArrayInputStream does support marks.
   Two values are read and three are skipped, but then reset() is called,
   putting the stream back in the state before mark() was called.
   In other words, everything between mark() and reset() can be ignored.
   The last value read is 3, making option C the correct answer.

 */
public class TaffyFactory {
    public int getPrize(byte[] luck) throws Exception {
        try (InputStream is = new ByteArrayInputStream(luck)) {
            is.read(new byte[2]);
            if (!is.markSupported()) return -1;
            is.mark(5);
            is.read(); is.read();
            is.skip(3);
            is.reset();
            return is.read();
        }
    }
    public static void main(String[] x) throws Exception {
        final TaffyFactory p = new TaffyFactory();
        final var luck = new byte[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print(p.getPrize(luck));
    } }