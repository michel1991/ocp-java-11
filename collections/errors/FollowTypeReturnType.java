package list.errors;
import java.util.*;



/**
  What is the result of the following code? (Choose all that apply.)
    A. One line fails to compile.
    B. Two lines fail to compile.
    C. Three lines fail to compile.
    D. The code compiles but throws an exception at runtime.
    E. If any lines with compiler errors are removed, the code throws an exception at runtime.
    F. If any lines with compiler errors are removed, the code prints [16, 32, 4].
    G. The code compiles and prints [16, 32, 4] without any changes.

     The key to this question is keeping track of the types.
     Line 48 is a Map<Integer, Integer>.
     Line 49 builds a List out of a Set of Entry objects,
     giving us List<Entry<Integer, Integer>>.
     This causes a compile error on line 56 since we can’t multiply an Entry object by two.
     Lines 51 through 54 are all of type List<Integer>.
     The first three are immutable, and the one on line 54 is mutable.
     This means line 57 throws an UnsupportedOperationException
     since we attempt to modify the list.
     Line 58 would work if we could get to it.
     Since there is one compiler error and one runtime error,
     options A and E are correct.
 */
public class FollowTypeReturnType {
  public static void main(String... args){
      var map = Map.of(1,2, 3, 6); // line 48
      var list = List.copyOf(map.entrySet());// 49
      //50
      List<Integer> one = List.of(8, 16, 2); //51
      var copy = List.copyOf(one); //52
      var copyOfCopy = List.copyOf(copy); //53
       var thirdCopy = new ArrayList<>(copyOfCopy); //54
       //55
      list.replaceAll(x -> x * 2); //56
      one.replaceAll(x -> x * 2);// 57
      thirdCopy.replaceAll(x -> x * 2); //58

      System.out.println(thirdCopy);
  }
}