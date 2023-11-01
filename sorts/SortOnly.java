package sorts;
import java.util.*;

public class SortOnly {
    
    /**
     *  What is the output of the following?
     *  A. [3, three, THREE]
        B. [3, THREE, three]
        C. [three, THREE, 3]
        D. [THREE, three, 3]
        E. None of the above

     Unfortunately, you do have to memorize two facts about sort order.
     First, numbers sort before letters.
     Second, uppercase sorts before lowercase.
     Since, the first value is 3 and the last is three, option B is correct.
     */
  static void ordersIsNumberUpperCaseLowerCase(){
      var threes = Arrays.asList("3", "three", "THREE");
      Collections.sort(threes);
      System.out.println(threes);
  }
    
    public static void main(String[] args) {
        ordersIsNumberUpperCaseLowerCase();
    }
}