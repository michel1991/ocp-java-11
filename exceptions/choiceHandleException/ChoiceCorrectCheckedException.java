package exceptions.choiceHandleException;
import java.io.*;
import java.sql.*;


/**
  Which of the following exception classes must be handled
  or declared in the method in which they are thrown? (Choose three.)
  
    A. Happy
    B. Dopey
    C. Sleepy
    D. Sneezy
    E. Doc
    F. Grumpy

    Since IOException and SQLException are checked exceptions,
    Happy and Grumpy are checked exceptions, respectively,
    making options A and F correct.
    Since Dopey inherits Grumpy, option B is also a checked exception.
    Options C and D are unchecked exceptions because those classes inherit RuntimeException.
    Option E is also an unchecked exception because all Error classes are unchecked.
 */
class Happy extends IOException {}
class Dopey extends Grumpy {}
class Sleepy extends IllegalStateException {}
class Sneezy extends UnsupportedOperationException {}
class Doc extends AssertionError {}
class Grumpy extends SQLException {}

public class ChoiceCorrectCheckedException {

}