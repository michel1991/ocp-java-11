package generics;
import java.io.*;

/**
  Which of these statements can fill in the blank so that the Helper
   class compiles successfully? (Choose all that apply.)

    A. printException(new FileNotFoundException("A"))
    B. printException(new Exception("B"))
    C. <Throwable>printException(new Exception("C"))
    D. <NullPointerException>printException(new NullPointerException ("D"))
    E. printException(new Throwable("E"))

    The generic type must be Exception or a subclass of Exception since this is an upper bound.
    Options C and E are wrong because Throwable is a superclass of Exception.
    Option D uses an odd syntax by explicitly listing the type,
    but you should be able to recognize it as acceptable.
 *
 */
public class Helper { // 2:
    public static <U extends Exception> // 3:
         void printException(U u) { //   4:
        //5:
        System.out.println(u.getMessage()); //  6:
    } //   7:
    public static void main(String[] args) { //     8:
        // Helper.__________________________________; //    9:
        Helper.printException(new FileNotFoundException("A")); //    9:
        Helper.printException(new Exception("B")); //    9:
        Helper.<NullPointerException>printException(new NullPointerException ("D")); //    9:
    } } //  10:
