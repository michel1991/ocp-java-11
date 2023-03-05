package exceptions.errors;

/**
 *  How many of the following are valid exception declarations?
    A. Zero
    B. One
    C. Two
    D. Three
    E. Four
    F. Five

    Error is a terrible name for an exception since it is a built-in class.
    However, it is legal.
    Next, _X is also a bad choice, but it is valid exception as Java identifiers can begin with underscores.
    By contrast, 2BeOrNot2Be does not compile because identifiers are not allowed to begin with a number.
    NumberException is not a valid exception, because it uses generics, and the parent class does not.
    Finally, Worry is not an exception, because it is an interface.
    Since only two are valid exceptions, option C is the answer.
 */
class Error extends Exception {}
class _X extends IllegalArgumentException {}
class 2BeOrNot2Be extends RuntimeException {}
class NumberException<Integer> extends NumberFormatException {}
interface Worry implements NumberFormatException {}
public class FindValidExceptions {

}