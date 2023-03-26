package autoCloseable.errors;

import java.io.Closeable;

/**
   What is the output of the following application?
    A. This just in!
    B. The code does not compile because of line r1.
    C. The code does not compile because of line r2.
    D. The code does not compile because of line r3.
    E. The code does not compile for a different reason.
    F. None of the above.

    The class does not compile because in line r2, curly braces,{},
    are used instead of parentheses,(), in the try-with-resources statement,
    making option C the correct answer. If this line was fixed to use parentheses,(),
    then the rest of the class would compile without issue and print This just in! at runtime.
 */
class PrintCompany {
    class Printer implements Closeable {     // r1
        public void print() {
            System.out.println("This just in!");
        }
    public void close() {}
    }
    public void printHeadlines() {
        try {Printer p = new Printer()} {     // r2
            p.print();
        }
    }
    public static void main(String[] headlines) {
        new PrintCompany().printHeadlines();  // r3
    }
}
public class PrinterCompanyNoUsingParenthsesisInTry {

}