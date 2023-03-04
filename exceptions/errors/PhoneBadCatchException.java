
package exceptions.errors;

/**
 * Which statement about the following program is true?
    A. An exception is printed at runtime with Call in the message.
    B. An exception is printed at runtime with Voicemail in the message.
    C. An exception is printed at runtime with Text in the message.
    D. The code does not compile.
    E. None of the above.

    The MissedCallException is a checked exception since it extends Exception and does not inherit RuntimeException.
     For this reason, the first catch block fails to compile,
     since the compiler detects that it is not possible to throw this checked exception inside the try block,
     making option D the correct answer.
     Note that if MissedCallException was changed to extend the unchecked RuntimeException class,
     then the code would compile and the RuntimeException
     from the finally block would replace the ArrayIndexOutOfBoundsException
     from the try block and Text would be in the message to the caller.
 */
class MissedCallException extends Exception {}
class Phone {
    static void makeCall() throws RuntimeException {
        throw new ArrayIndexOutOfBoundsException("Call");
    }
    public static void main(String[] messages) {
        try {
            makeCall();
        } catch (MissedCallException e) {
            throw new RuntimeException("Voicemail");
        } finally {
            throw new RuntimeException("Text");
        }
    }
}

public class PhoneBadCatchException {

}