package encapsulation;


import java.util.*;

/**
 * What change is needed to make Secret well encapsulated?
    A. Change number to use a protected access modifier.
    B. Change number to use a public access modifier.
    C. Declare a private constructor.
    D. Declare a public constructor.
    E. Remove the guess method.
    F. None. It is already well encapsulated.

    This class is a good example of encapsulation. It has a private instance variable and is accessed by a public method.
    No changes are needed to encapsulate it, and option F is correct.
 */
class Secret {

    private int number = new Random().nextInt(10);
    public boolean guess(int candidate) {
        return number == candidate;
    }
}

public class SecretWellEncapsulated {

}