package lambda;
import java.util.*;
public class RemoveToListEffectiveFinal {
    /**
     * Which is one of the lines output by this code?
        A. []
        B. [8, 10]
        C. [8, 9, 10]
        D. [10, 8]
        E. The code does not compile.

       The code starts by creating a list of three elements.
       On line 16, it removes two elements and then removes the final one on line 19.
       This prints an empty list, making option A the correct answer.
       Note that num is effectively final, so can be used in a lambda.
     */
  static void remove(){
      var list = new ArrayList<Integer>(); // 10:
      list.add(10); //  11:
      list.add(9); //  12:
      list.add(8); //   13:
      // 14:
      var num = 9; //    15:
      list.removeIf(x -> {int keep = num; return x != keep;}); // 16:
      System.out.println(list); // 17:
     // 18:
      list.removeIf(x -> {int keep = num; return x == keep;}); //  19:
      System.out.println(list); // 20:
  }

    public static void main(String... args){
      remove();
  }
}