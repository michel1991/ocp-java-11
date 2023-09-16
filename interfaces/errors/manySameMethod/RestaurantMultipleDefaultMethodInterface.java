package interfaces.errors.manySameMethod;

/**
   Which is the first line to not compile?
   A. Line m1
    B. Line m2
    C. Line m3
    D. Line m4
    E. None of the above

    The interface declarations compile without issue.
    When inheriting two default methods with the same signature,
    the Tower class is required to override both methods
    even if the class is marked abstract. For this reason,
    line m3 is the first line that does not compile, and option C is correct.
    Note that there is no possible overridden method
    that can fulfill both inherited default methods since the return types are not covariant.
 */
interface Building {
    default Double getHeight() { return 1.0; }         // m1
}
interface Office {
    public default String getHeight() { return null; } // m2
}
abstract class Tower implements Building, Office {}   // m3
class Restaurant extends Tower {}              // m4

public class RestaurantMultipleDefaultMethodInterface {

}