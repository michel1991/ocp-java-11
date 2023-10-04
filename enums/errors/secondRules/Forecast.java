
package enums.errors.secondRules;


/**
  What is the output of the following application?
    A. 0 FLURRY
    B. 1 FLURRY
    C. 0 Sunny
    D. 1 Sunny
    E. The code does not compile.
    F. None of the above.

    If an enum contains anything other than a list of values, then a semicolon (;)
     must follow the list of values. The Snow enum includes a method,
     so there must be a semicolon after the last value, FLURRY.

     For this reason, the code does not compile, and option E is correct.
     If the semicolon was added,
     then the code would compile and print 0 Sunny at runtime,
     with the overridden toString() replacing the default value of FLURRY.
 */
public class Forecast {
    public enum Snow {
        BLIZZARD, SQUALL, FLURRY
    @Override public String toString() { return "Sunny"; }
    }

    public static void main(String[] modelData) {
        System.out.print(Snow.BLIZZARD.ordinal() + " ");
        System.out.print(Snow.valueOf("flurry".toUpperCase()));
    }
}