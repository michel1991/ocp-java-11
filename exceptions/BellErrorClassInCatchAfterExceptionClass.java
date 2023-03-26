package exceptions;

import java.sql.*;

/**
    Which expression, when inserted into the blank in the following class, allows the code to compile?
        A. Error r
        B. IllegalStateException b
        C. RingException q
        D. SQLException p
        E. RuntimeException r
        F. The code does not compile regardless of the expression used.

      The try-catch block already catches Exception,
      so the correct answer would be the one that is not a subtype of Exception.
      In this case, Error extends Throwable and is the only choice that allows the code to compile, making option A correct.
 */
class Bells {
    class Player implements AutoCloseable {
        @Override public void close() throws RingException {}
    }
    class RingException extends Exception {
        public RingException(String message) {}
    }
    public static void main(String[] notes) throws Throwable {
        try (Player p = null) {
            throw new Exception();
        } catch (Exception e) {
        } catch (Error r) {  // catch (__________________)
        }
    }
}
public class BellErrorClassInCatchAfterExceptionClass{

}