package exceptions.runtime;

public class ComplexUncheckedException {
    /**
      What does the output of the following method contain? (Choose all that apply.)

        A. abce
        B. abde
        C. An exception with the message set to "1"
        D. An exception with the message set to "2"
        E. An exception with the message set to "3"
        F. Nothing; the code does not compile.

        The code begins normally and prints a on line 13, followed by b on line 15.
        On line 16, it throws an exception that’s caught on line 17.
        Remember, only the most specific matching catch is run.
        Line 18 prints c, and then line 19 throws another exception.
        Regardless, the finally block runs, printing e.
        Since the finally block also throws an exception, that’s the one printed.
     */
    public static void main(String[] args) { //   12:
        System.out.print("a"); //   13:
        try { //  14:
            System.out.print("b"); //  15:
            throw new IllegalArgumentException(); //  16:
        } catch (IllegalArgumentException e) { //   17:
            System.out.print("c"); //   18:
            throw new RuntimeException("1"); //  19:
        } catch (RuntimeException e) { //   20:
            System.out.print("d"); //      21:
            throw new RuntimeException("2"); //   22:
        } finally { //  23:
            System.out.print("e"); //   24:
            System.out.println();
            throw new RuntimeException("3"); //  25:
        } //   26:
    } //   27:
}