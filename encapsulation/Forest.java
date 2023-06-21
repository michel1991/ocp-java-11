package encapsulation;

import java.util.*;

/**
 * Which statement best describes this class?
    A. It can be serialized.
    B. It is well encapsulated.
    C. It is immutable.
    D. It is both well encapsulated and immutable.
    E. None of the above as the code does not compile.

    This classdoes not implement Serializable, so option A is incorrect.
    This code is well encapsulated because the instance variablesareprivate.
     While the instance variable references do not change after the object is created,
     the contentsfauna can be modified, so it is not immutable. For these reasons, option B is correct.

 */
public final class Forest {
    private final int flora;
    private final List<String> fauna;

    public Forest() {
        this.flora = 5;
        this.fauna = new ArrayList<>();
    }

    public int getFlora() {
        return flora;
    }
    public List<String>getFauna() {
        return fauna;
    }
}
