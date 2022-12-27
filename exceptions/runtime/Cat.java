package exceptions.runtime;

/**
 * What is the output of the following program?

    A. The output is 12, followed by a stack trace for a NumberFormatException.
    B. The output is 124, followed by a stack trace for a NumberFormatException.
    C. The output is 12456.
    D. The output is 1256, followed by a stack trace for a NumberFormatException.
    E. The code does not compile.
    F. An uncaught exception is thrown.
    G. None of the above

    he knockStuffOver() method is invoked on a new Cat object.
    Line 4 prints 1. The try block is entered, and line 6 prints 2.
    Line 7 throws a NumberFormatException. It isn’t caught, so knockStuffOver() ends.
    The main() method doesn’t catch the exception either,
    so the program terminates, and the stack trace for the NumberFormatException is printed.
    For these reasons, option A is correct.
 */
public class Cat { // 1:
    public String name; //    2:
    public void knockStuffOver() { //  3:
        System.out.print("1"); //  4:
        try { //    5:
            System.out.print("2"); //  6:
            int x = Integer.parseInt(name); //  7:
            System.out.print("3"); //   8:
        } catch (NullPointerException e) { //  9:
            System.out.print("4"); //   10:
        } //  11:
        System.out.print("5"); // 12:
    } //   13:
    public static void main(String args[]) { //  14:
        Cat loki = new Cat(); //  15:
        loki.name = "Loki"; //   16:
        loki.knockStuffOver(); //   17:
        System.out.print("6"); //  18:
    } } // 19: 