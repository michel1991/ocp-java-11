package collections.lists.remove;
import java.util.*;
import java.util.function.*;

public class WithAutoBoxing {
    /**
     *  What does the following output?
        A. [1, 2]
        B. [1, 4]
        C. [2, 4]
        D. [2, 3]
        E. [3, 4]
        F. The code does not compile.

        This one is tricky. Line 11 creates an ArrayList with a generic type Object rather than Integer.
        This is allowed since we aren’t trying to assign any of the values to an int or Integer after getting them from pennies.
        This gives us the list [1, 2, 3, 4].
        The next trick is that there are two remove() methods available on ArrayList.
        One removes an element by index and takes an int parameter.
        The other removes an element by value and takes an Object.
        On line 16, the int primitive is a better match,
        and the element with index 2 is removed,
        which is the value of 3. At this point, we have [1, 2, 4].
        Then on line 17, the other remove() method is called because
        we are explicitly using the wrapper object.
        This deletes the object that is equal to 1, and now we have [2, 4].
        This brings us to option C as the answer.

     */
    static void removeWithAutoBoxingBeforeAutoBoxingJavaCheckMuchBetterSignature(){
        System.out.println(" begin  removeWithAutoBoxingBeforeAutoBoxingJavaCheckMuchBetterSignature");
        var pennies = new ArrayList<>(); // 11:
        pennies.add(1); //   12:
        pennies.add(2); //   13:
        pennies.add(Integer.valueOf(3)); //  14:
        pennies.add(Integer.valueOf(4)); //  15:
        pennies.remove(2); //  16:
        pennies.remove(Integer.valueOf(1)); //  17:
        System.out.println(pennies); //  18:
        System.out.println(" end removeWithAutoBoxingBeforeAutoBoxingJavaCheckMuchBetterSignature");

    }
    
    public static void main(String... args){
        removeWithAutoBoxingBeforeAutoBoxingJavaCheckMuchBetterSignature();
    }
}