package list;
import java.util.*;
import java.util.function.*;

public class RemoveItems {
    /**
    *  What is true of the following code?
    *   A. It outputs [2.718, 2.718].
        B. It outputs [3.14, 3.14, 2.718, 2.718].
        C. It outputs [12.0].
        D. The code does not compile due to the Predicate.
        E. The code does not compile due to the removeIf() line.
        F. The code does not compile for another reason.

     The Predicate correctly takes a Double value and returns a boolean. It is a complicated Predicate, but it does compile, ruling out option D.
     First the Predicate rounds the number to the nearest int. On the right side of the ==, the Predicate converts the Double object to a double primitive.
     Then it casts to an int, dropping any numbers after the decimal point.
     Don’t worry if you haven’t seen doubleValue() before.
     Remember that the exam may use APIs you haven’t learned as long as the APIs do what they sound like.
      The removeIf() method removes all values that round down since the Predicate returns true for any values that have a rounded number equivalent to the number without the decimal value.
      Therefore, option A is correct.
     */
   static void removeUsingComparisonWithDoubleValueMethod(){
       List<Double> numbers = new ArrayList<>();
       numbers.add(12.0);
       numbers.add(3.14);
       numbers.add(3.14);
       numbers.add(2.718);
       numbers.add(2.718);

       Predicate<Double> pred = n -> Math.round(n) == (int) n.doubleValue();
       numbers.removeIf(pred);
       System.out.println(numbers);
   }

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
    static void removeWithOverloadMethod(){
        var pennies = new ArrayList<>(); // 11:
         pennies.add(1); //   12:
        pennies.add(2); //   13:
        pennies.add(Integer.valueOf(3)); //  14:
        pennies.add(Integer.valueOf(4)); //  15:
        pennies.remove(2); //  16:
        pennies.remove(Integer.valueOf(1)); //  17:
        System.out.println(pennies); //  18:

    }
}