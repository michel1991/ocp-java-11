package list.sets;
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

    /**
     * What is the result of the following?
        A. 2 3
        B. 2 56
        C. 3 3
        D. 3 56
        E. None of the above

        First the code creates an ArrayList of three elements.
        Then the list is transformed into a TreeSet.
        Since sets are not allowed to have duplicates,
        the set only has two elements. Remember that a TreeSet is sorted,
        which means that the first element in the TreeSet is 3.
        Therefore, option A is correct.
     */
    public static void addToSet(){
        System.out.println(" Begin Add To Set " );
        var list = new ArrayList<Integer>();
        list.add(56);
        list.add(56);
        list.add(3);

        var set = new TreeSet<Integer>(list);
        System.out.print(set.size());
        System.out.print(" " );
        System.out.print(set.iterator().next());
        System.out.println();
        System.out.println(" End Add To Set " );
    }

    public static void main(String... args){
        addToHashSet();
        addToSet();
    }
}