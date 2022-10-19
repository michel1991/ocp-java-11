package list;
import java.util.*;

/*
* The primary reason to make any public method private is to improve encapsulation, making option B the correct answer.
* Option A is a close second choice, as it is one of the reasons to use private interface methods, but that applies only
* when adding a new method. If the method already exists, making it private does not reduce code duplication.
* The rest of the options do not apply to private interface methods.
*/
public class ErrorFollowTypeReturnType {
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