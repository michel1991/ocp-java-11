package list.errors;
import java.util.*;



/**
 * The key to this question is keeping track of the types. Line 48 is a Map<Integer, Integer>.
 * Line 49 builds a List out of a Set of Entry objects, giving us List<Entry<Integer, Integer>>.
 * This causes a compile error on line 56 since we can’t multiply an Entry object by two.
 * Lines 51 through 54 are all of type List<Integer>. The first three are immutable, and the one on line 54 is mutable.
 * This means line 57 throws an UnsupportedOperationException since we attempt to modify the list.
 * Line 58 would work if we could get to it. Since there is one compiler error and one runtime error, options A and E are correct.
 */
public class FollowTypeReturnType {
  public static void main(String... args){
      var map = Map.of(1,2, 3, 6);
      var list = List.copyOf(map.entrySet());

      List<Integer> one = List.of(8, 16, 2);
      var copy = List.copyOf(one);
      var copyOfCopy = List.copyOf(copy);
       var thirdCopy = new ArrayList<>(copyOfCopy);

      list.replaceAll(x -> x * 2);
      one.replaceAll(x -> x * 2);
      thirdCopy.replaceAll(x -> x * 2);

      System.out.println(thirdCopy);
  }
}