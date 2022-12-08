package exceptions;

/**
* What is the output of the following program?
*   A. 1234
    B. 1235
    C. 124
    D. 1245
    E. The code does not compile.
    F. An uncaught exception is thrown.
    G. None of the above

  The runAway() method is invoked within main() on a new Dog object. Line 4 prints 1.
  The try block executes, and 2 is printed. Line 7 throws a NumberFormatException, so line 8 doesn’t execute.
  The exception is caught on line 9, and line 10 prints 4. Because the exception is handled, execution resumes normally.
  The runAway() method runs to completion, and line 17 executes, printing 5.
  That’s the end of the program, so the output is 1245, and option D is correct.
 */
class Dog { // 1:
    public String name; //   2:
    public void runAway() { //  3:
        System.out.print("1"); // 4:
        try { //  5:
            System.out.print("2"); // 6:
            int x = Integer.parseInt(name); //  7:
            System.out.print("3"); //  8:
        } catch (NumberFormatException e) { // 9:
            System.out.print("4"); //  10:
        } //   11:
    } //  12:
    public static void main() { //  13:
        Dog webby = new Dog(); // 14:
        webby.name = "Webby"; //   15:
        webby.runAway(); //  16:
        System.out.print("5"); // 17:
    } } //  18:


public class DogNumberFormatException {
    public static void main(String... args) { //  13:
    }
}