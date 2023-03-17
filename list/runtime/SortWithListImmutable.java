package list.runtime;
import java.util.*;

public class SortWithListImmutable {
    /**
     *  Fill in the blank so the code prints beta.
     *  A. (s, t) -> s.compareTo(t)
        B. (s, t) -> t.compareTo(s)
        C. Comparator.comparing(String::length)
        D. Comparator.comparing(String::length).reversed()
        E. None of the above

        List.of() makes an immutable list. Attempting to sort throws an exception so option E is the answer.
        * If we were calling, Arrays.asList() instead,
        option C would be the answer because it is the only option to sort ascendingly by length.
     */
  static void sort(){
      var list = List.of("alpha", "beta", "gamma");
      Collections.sort(list,  (s, t) -> s.compareTo(t)); // ________________ I put the implementation(lambda)
      System.out.println(list.get(0));
  }

    public static void main(String ... args){

    }
}