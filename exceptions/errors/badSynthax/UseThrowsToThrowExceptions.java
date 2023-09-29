package exceptions.errors;

/**
 * What is printed when running the following snippet?
    A. 1
    B. 3
    C. 5
    D. 7
    E. The code does not compile.
    F. An exception is thrown.

    Method e() is incorrect.
    It should say throw new IllegalArgumentException() to compile.
    If this change were made, option C would be correct.
 */
public class UseThrowsToThrowExceptions {
    public static void main(String[] args) {
        int i = 0;
        try {
            i += 1;
            e();
            i += 2;
        } catch (Exception e) {
            i += 4;
        }
      System.out.print(i);
    }

    private static void e() {
        throws new IllegalArgumentException();
    }
}