package exceptions;

/**
 * Which methods will compile if inserted into Joey? (Choose all that apply.)
    A. public void hop() {}
    B. public void hop() throws Exception {}
    C. public void hop() throws CanNotHopException {}
    D. public void hop() throws RuntimeException {}
    E. None of these

    Kangaroo’s method declares one checked exception.
    Joey’s method is allowed to declare that same exception or any more specific exceptions.
    It is also allowed to declare runtime exceptions.
 *
 */
class CanNotHopException extends Exception {}
class Kangaroo {
    public void hop() throws CanNotHopException { }
}

class Joey extends Kangaroo {
    // INSERT CODE HERE
}
public class JoeyOverrideWithException {

}