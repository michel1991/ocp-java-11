package generics;
import java.io.*;
import java.util.*;

/**
 * Which of the following fills in the blank so this code compiles?
    A. ?
    B. ? extends RuntimeException
    C. ? super RuntimeException
    D. None of the above

    Since the method does not have any declared exceptions,
    it can only throw unchecked exceptions.
    Option B is the only one that requires
    the elements of coll to be RuntimeException or any subclasses.
 */
public class ThrowOneMaxLimitException {
    public static void throwOne(Collection<? extends RuntimeException> coll) { // Collection<__________> coll
        var iter = coll.iterator();
        if (iter.hasNext())
            throw iter.next();
    }
    
    public static void main(String... args){
        throwOne(new ArrayList<RuntimeException>(List.of(new RuntimeException())));
    }
}