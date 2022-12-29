package io;
import java.io.*;

/**
  What does the following class output?

    A. LOKI
    B. OKLI
    C. OLKI
    D. OKIL
    E. The output cannot be determined until runtime.
    F. Nothing; the code does not compile.
    G. None of the above

    The code compiles and runs without issue, so options E and F are incorrect.
    Since Sidekick correctly implements AutoCloseable, it can be used in a try-with-resources statement.
    The first value printed is O on line 9. For this question, you need to remember
    that a try-with-resources statement executes the resource’s close() method before a programmer-defined finally block.
    For this reason, L is printed on line 5. Next, the finally block is expected, and K is printed.
    The requiresAssistance() method ends, and the main() method prints I on line 16.
    The combined output is OLKI, making option C the correct answer.
 */
class MoreHelp { // 1:
    class Sidekick implements AutoCloseable { //  2:
        protected String n; //  3:
    public Sidekick(String n) { this.n = n; } //  4:
    public void close() { System.out.print("L"); } //    5:
    } //  6:
    public void requiresAssistance() { //  7:
        try (Sidekick is = new Sidekick("Adeline")) { //  8:
            System.out.print("O"); //  9:
        } finally { //   10:
            System.out.print("K"); //  11:
        } //  12:
    } //  13:
    public static void main(String... league) { //  14:
        new MoreHelp().requiresAssistance(); //  15:
        System.out.print("I"); //  16:
    } } //    17:


public class MoreHelpAutomaticClose {
    public static void main(String... league) {
        MoreHelp.main(league);
    }
}