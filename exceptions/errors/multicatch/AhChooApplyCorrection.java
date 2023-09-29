package exceptions.errors.multicatch;

/**
 Which changes, when made independently, allow the following program to compile? (Choose all that apply.)
    A. Add throws SneezeException to the declaration on line 4.
    B. Add throws Throwable to the declaration on line 4.
    C. Change line 7 to } catch (SneezeException e) {.
    D. Change line 7 to } catch (SniffleException e) {.
    E. Remove line 7.
    F. The code compiles correctly as is.
    G. None of the above

  The code does not compile because the multi-catch on line 7 cannot catch both a superclass and a related subclass.
  Options A and B do not address this problem, so they are incorrect.
  Since the try body throws SneezeException, it can be caught in a catch block, making option C correct.
  Option D allows the catch block to compile but causes a compiler error on line 6.
  Both of the custom exceptions are checked and must be handled or declared in the main() method.
  A SneezeException is not a SniffleException, so the exception is not handled.
  Likewise, option E leads to an unhandled exception compiler error on line 6.
 */
class AhChoo { // 1:
    static class SneezeException extends Exception {} //   2:
    static class SniffleException extends SneezeException {} //   3:
    public static void main(String[] args) { //   4:
        try { //  5:
            throw new SneezeException(); // 6:
        } catch (SneezeException | SniffleException e) { //    7:
        } finally {}  //   8:
    } } //   9:

public class AhChooApplyCorrection {

}