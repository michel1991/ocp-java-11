package advancedDesign;
import java.io.*;
import java.util.*;


/**
 * Which are true about this class? (Choose three.)
    A. It is able to be serialized.
    B. It is not able to be serialized.
    C. It is well encapsulated.
    D. It is not well encapsulated.
    E. It is immutable.
    F. It is not immutable.

   This class implements Serializable and contains serializable
   instance variables making option A correct.
   This code is not well encapsulated because the instance variables are public,
   which matches option D. While a defensive copy of fauna is made in the getter,
    the instance variable is public,
    and elements can be added or removed directly.
    Therefore, the object is not immutable, and option F is correct.
 */
final class Forest implements Serializable {
    public final int flora;
    public final List<String> fauna;

    public Forest() {
        this.flora = 5;
        this.fauna = new ArrayList<>();
    }

    public int getFlora() {
        return flora;
    }
    public List<String>getFauna() {
        return new ArrayList<>(fauna);
    }
}


public class ForestChoiceConcepts {
  
}