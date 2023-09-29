package exceptions.errors.notHandle;

/**
   What is the output of the following application?
    A. Awake!
    B. Awake! followed by a stack trace
    C. Does not compile because of line x1
    D. Does not compile because of line x2
    E. Does not compile because of line x3
    F. None of the above

    The finally block of the snore() method throws a new checked exception on line x1,
    but there is no try-catch block around it to handle it,
    nor does the snore() method declare any checked exceptions.

    For these reasons, line x1 does not compile, and option C is the correct answer.
    The rest of the lines of code compile without issue.

    Note that the code inside the try block, if it ran,
    would produce an ArrayIndexOutOfBoundsException,
    which would be caught by the RuntimeException catch block, printing Awake!.
 */
 public class Sleep {
    public static void snore() {
        try {
            String sheep[] = new String[3];
            System.out.print(sheep[3]);
        } catch (RuntimeException | Error e) {
            System.out.print("Awake!");
        } finally {
            throw new Exception();                // x1
        }
    }
    public static void main(String... sheep) {  // x2
        new Sleep().snore();                     // x3
    }
}