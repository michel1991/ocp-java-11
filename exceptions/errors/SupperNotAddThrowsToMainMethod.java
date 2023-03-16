package exceptions.errors;
import java.io.*;
/**
*  What is the output of the following program?
*   A. 234
    B. 1234
    C. 12 and a stack trace for IOException
    D. 123 and a stack trace for IOException
    E. 1234 and a stack trace for IOException
    F. The code does not compile.

  Line 14 attempts to invoke the eat() method, which declares the checked exception IOException.
  Because main() neither handles nor declares the IOException, line 14 generates a compiler error.
  For this reason, option F is the correct answer.
 */
public class SupperNotAddThrowsToMainMethod {
    public static void eat() throws IOException { // 2:
        try { //  3:
            System.out.print("1"); //    4:
            throw new IOException(); //    5:
        } catch (IOException | ArithmeticException e) { //   6:
            System.out.println("2"); //   7:
            throw e; //  8:
        } finally {  //    9:
            System.out.println("3"); //   10:
        }  //    11:
    }  //  12:
    public static void main(String[] args) {  //    13:
        eat();  //   14:
        System.out.println("4");  //  15:
    }  // 16:
}