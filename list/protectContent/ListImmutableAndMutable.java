package list.protectContent;
import java.util.*;


public class ListImmutableAndMutable {
    /**
        Which statements are true about the following code? (Choose all that apply.)
        A. Adding an element to doubleList is allowed.
        B. Adding an element to intList is allowed.
        C. Changing the first element in doubleList changes the first element in doubles.
        D. Changing the first element in intList changes the first element in ints.
        E. doubleList is immutable.
        F. intList is immutable.

        The first line of code in the method creates a fixed size List backed by an array.
        This means option D is correct, making options B and F incorrect.
        The second line of code in the method creates an immutable list, which means no changes are allowed.
        Therefore, option E is correct, making options A and C incorrect.

    */
    public static  void run(Integer[] ints, Double[] doubles) {
        List<Integer> intList = Arrays.asList(ints);
        List<Double> doubleList = List.of(doubles);
        // more code
    }

    /**
    * Which of the following can fill in the blanks so two rows are printed? (Choose all that apply.)
        A. list.add("coats") and list
        B. list.add("rain") and list
        C. set.add("coats") and set
        D. set.add("rain") and set
        E. counts.put("rain", 1) and counts.keySet()
        F. counts.put("rain", 1) and counts.values()
        G. None of the above

       Option A and B are incorrect because List.of() is immutable. Trying to add a value causes an exception.
       Option C is incorrect because sets contain only unique values.
       The code will run without error, but the set will contain only one element.
       Options D and E are correct because the type is a String and is legal to cast to a String in the loop.
       Finally, option F is incorrect because an Integer cannot be cast to a String in the loop.
     */
    public static void choiceCorrectMethodAccordingToList(){
        List<String> list = List.of("coats");

        Set<String> set = new HashSet<>();
        set.add("coats");
        set.add("rain");

        Map<String, Integer> counts = new HashMap<>();
        counts.put("coats", 2);
        counts.put("rain", 1);  // __________________________

        for (var x : set) { // ____________
            String s = (String) x;
            System.out.println(s);
        }
    }

    public static void main(String... args){

    }
}