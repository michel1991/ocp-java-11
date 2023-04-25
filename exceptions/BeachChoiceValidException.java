package exceptions;
import java.io.*;

/**
 * Which expressions, when inserted into the blank in the following class, allow the code to compile? (Choose two.)
    A. Exception a | RuntimeException f
    B. IllegalStateException | TideException t
    C. TideException | IOException i
    D. TideException | Exception x
    E. Error e
    F. Exception z
    
    Option A does not compile because a multi-catch
    expression uses a single variable, not two variables.
    Since the TideException is handled and neither
    exception class is a subtype of the other, option B is correct.
    Option C does not compile because the compiler notices that
    it is not possible to throw a checked IOException in this try block.
    Option D does not compile because multi-catch blocks
    cannot contain two exceptions in which one is a subclass of the other.
    If it did, one of the two exceptions would be redundant.
    Option E does not compile because the checked TideException
    is not handled or declared by the surf() method.
    Remember, Error and Exception are not subclasses of each other,
    although they both inherit Throwable.
    Option F is correct because TideException is a subclass of Exception,
    so both are handled by Exception.
 */
 class Beach {
    class TideException extends Exception {}
    public void surf() throws RuntimeException {
        try {
            throw new TideException();
        } catch ( IllegalStateException | TideException t ) {} // __________________
    }
}

public class BeachChoiceValidException {
   public static void main(String... args){
       new Beach().surf();
   }
}