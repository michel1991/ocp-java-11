package exceptions.errors.manyRule;
import java.io.*; // 1:
/**
*  What is the output of the following program?
    A. AFCDB
    B. AC
    C. ACB
    D. AD followed by a stack trace
    E. One line of this program does not compile.
    F. Two lines of this program do not compile.
    G. Three lines of this program do not compile.

   Line 3 contains a compiler error, as throw is used instead of throws in the method declaration.
   Line 14 also contains a compiler error.
   FileNotFoundException is a subclass of IOException,
   so it cannot be used together in the same multi-catch block since it is redundant.
   Since the code contains two compiler errors, option F is correct.
   Note that if the lines were corrected, with the proper keyword being used and the redundant exception removed,
   then the code would compile and print AFCDB at runtime, making option
 */

public class Music { // 2:
    public static void play() throw ArithmeticException { // 3:
        try { // 4:
            try {  // 5:
                System.out.print("A"); //   6:
                throw new IOException(); //     7:
            } catch (IOException e) { //    8:
                System.out.print("F"); //   9:
                throw e; //   10:
            } finally { //    11:
                System.out.print("C"); //  12:
            } //  13:
        } catch (IOException | FileNotFoundException note) { //   14:
            System.out.print("D"); // 15:
        } //  16:
    } //  17:
    public static void main() { //  18:
        play(); //   19:
        System.out.print("B"); //    20:
    } // 21:
} // 22:
