package trap;
/**
* What does the following code output when run as java Duck Duck Goose?
*   A. Duck Goose
    B. Duck ArrayIndexOutOfBoundsException
    C. Goose
    D. Goose ArrayIndexOutOfBoundsException
    E. None of the above

  The main() method isn’t static. It is a method that happens to be named main(), but it’s not an application entry point.
  When the program is run, it gives the error.
  If the method were static, the answer would be option D.
  Arrays are zero based, so the loop ignores the first element and throws an exception when accessing the element after the last one.
 */
public class DuckWithoutCorrectMain {
    public void main(String[] args) {
        for (int i = 1; i <= args.length; i++)
            System.out.println(args[i]);
    }
}