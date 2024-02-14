package collections.lists.remove;
import java.util.*;
import java.util.function.*;
public class ComparisonWithDoubleValueMethod {
    /**
    *  What is true of the following code?
    *   A. It outputs [2.718, 2.718].
        B. It outputs [3.14, 3.14, 2.718, 2.718].
        C. It outputs [12.0].
        D. The code does not compile due to the Predicate.
        E. The code does not compile due to the removeIf() line.
        F. The code does not compile for another reason.

     The Predicate correctly takes a Double value and returns a boolean.
     It is a complicated Predicate, but it does compile, ruling out option D.
     First the Predicate rounds the number to the nearest int.
     On the right side of the ==, the Predicate converts the Double object to a double primitive.
     Then it casts to an int, dropping any numbers after the decimal point.
     Don’t worry if you haven’t seen doubleValue() before.
     Remember that the exam may use APIs you haven’t learned
     as long as the APIs do what they sound like.
      The removeIf() method removes all values that round down
      since the Predicate returns true for any values that have
      a rounded number equivalent to the number without the decimal value.
      Therefore, option A is correct.
     */
    static void removeUsingComparisonWithDoubleValueMethod(){
        System.out.println(" begin  removeUsingComparisonWithDoubleValueMethod");
        List<Double> numbers = new ArrayList<>();
        numbers.add(12.0);
        numbers.add(3.14);
        numbers.add(3.14);
        numbers.add(2.718);
        numbers.add(2.718);

        Predicate<Double> pred = n -> Math.round(n) == (int) n.doubleValue();
        numbers.removeIf(pred);
        System.out.println(numbers);
        System.out.println(" end  removeUsingComparisonWithDoubleValueMethod");
    }
    
    public static void main(String... args){
        removeUsingComparisonWithDoubleValueMethod();
    }
}