package list;
import java.util.*;
import java.util.function.*;

public class SetOperations {
    /**
       What is a possible result of this code?
        A. [3]
        B. [16]
        C. [16, 3]
        D. [16, 3, 3]
        E. None of the above

      Line 18 puts 3 in nums since it is the smaller value.
      Since a Set must have unique elements, line 19 does not add another value to nums.
      Line 20 adds the final value of 16. The set has a total of two elements, 3 and 16.
      A HashSet does not commit to an output order, making option C correct.
     */
  static void addToHashSet(){
      var nums = new HashSet<Long>(); // 17:
      nums.add((long) Math.min(5, 3)); //  18:
      nums.add(Math.round(3.14)); //    19:
      nums.add((long) Math.pow(4,2)); //  20:
      System.out.println(nums); //  21:

  }

    public static void main(String... args){
        addToHashSet();
    }
}