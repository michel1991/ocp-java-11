package annotations;
import java.util.*;

/**
    In how many of the marked places (m1, m2, m3) will adding the line @SuppressWarnings()
    independently allow the class to compile without any warnings?

    A. None, the class does not compile as is.
    B. None, the class already compiles without warnings.
    C. One.
    D. Two.
    E. Three.
    F. None of the above.

    The class compiles as is but generates warnings for unchecked/unsafe
    operations with the planets.add(5) operation, so options A and B are incorrect.
    Inserting @SuppressWarnings(), though, will cause a compiler error as it requires at least one value.
    For this reason, option F is correct. If @SuppressWarnings("unchecked") was used instead,
    then inserting it on lines m1 and m2 would allow the code to compile without any warnings.
 */

// m1
 class Space {
    // m2
   final void frontier() {
       List<Object> stars = List.of(1,2,3);
       stars.add(4);

       // m3
        List planets = new ArrayList<>();
        planets.add(5);
   }
}

public class SpaceSuppressWarnings {

}