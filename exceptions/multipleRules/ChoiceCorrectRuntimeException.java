package exceptions.multipleRules;
/**
   Which lines can fill in the blank to make the following code compile? (Choose all that apply.)

    A. IOException a
    B. Error b
    C. NullPointerException c
    D. RuntimeException d
    E. NumberFormatException e
    F. ClassCastException f
    G. None of the above. The code contains a compiler error regardless of what is inserted into the blank.

    The try block is not capable of throwing an IOException.
    For this reason, declaring it in the catch block
    is considered unreachable code, making option A incorrect.
    Options B and F are correct, as both are unchecked exceptions
    that do not extend or inherit from IllegalArgumentException.
    Remember, it is not a good idea to catch Error in practice,
    although because it is possible, it may come up on the exam.
    Option C is incorrect, but not because of the data type.
    The variable c is declared already in the method declaration,
    so it cannot be used again as a local variable in the catch block.
    If the variable name was changed, option C would be correct.
    Option D is incorrect because the IllegalArgumentException inherits from RuntimeException,
    making the first declaration unnecessary. Similarly, option E is incorrect
    because NumberFormatException inherits from IllegalArgumentException,
     making the second declaration unnecessary.
     Since options B and F are correct, option G is incorrect.
 */
public class ChoiceCorrectRuntimeException {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | Error b ) { // __________________
        }
    }
}