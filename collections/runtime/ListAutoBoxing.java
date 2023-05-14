package list.runtime;

import java.util.*;

public class ListAutoBoxing {
    /**
     * Which of the following are true statements about the following code? (Choose all that apply.)
        A. The code compiles.
        B. The code throws a runtime exception.
        C. Exactly one of the add statements uses autoboxing.
        D. Exactly two of the add statements use autoboxing.
        E. Exactly three of the add statements use autoboxing.

        Lines 5 and 7 use autoboxing to convert an int to an Integer.
        Line 6 does not because valueOf() returns an Integer.
        Line 8 does not because null is not an int.
        The code does compile. However, when the for loop tries to unbox null into an int,
        it fails and throws a NullPointerException.
     */
  static void addItems(){
      List<Integer> ages = new ArrayList<>(); //  4:
      ages.add(Integer.parseInt("5")); //  5:
      ages.add(Integer.valueOf("6")); //   6:
      ages.add(7); // 7:
      ages.add(null); // 8:
      for (int age : ages) System.out.print(age); //  9:
  }
}