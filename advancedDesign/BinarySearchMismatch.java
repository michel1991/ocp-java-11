package advancedDesign;
import java.util.*;

public class BinarySearchMismatch {
    /**
     * What does the following output?
        A. -1 0 -1
        B. -1 -1 0
        C. 0 -1 0
        D. 0 0 -1
        E. The output is not defined.
        F. The code does not compile.

        Java requires having a sorted array before calling the binarySearch() method.
        You do not have to call Arrays.sort to perform the sort, though.
        This array happens to already be sorted, so it meets the precondition.
        The target string of "Linux" is the first element in the array.
        Since Java uses zero-based indexing, search is 0. The Arrays.mismatch() method returns -1 if
        the arrays are the same and returns the index of the first difference if they are not.
         In our cases, mismatch1 is 0 because the first element differs,
         and mismatch2 is -1 because the arrays are the same. This makes option D the correct answer.

     */
  static void binarySearchMismatch(){
      var linux = new String[] { "Linux", "Mac", "Windows" };
      var mac = new String[] { "Mac", "Linux", "Windows" };

      var search = Arrays.binarySearch(linux, "Linux");
      var mismatch1 = Arrays.mismatch(linux, mac);
      var mismatch2 = Arrays.mismatch(mac, mac);

      System.out.println(search + " " + mismatch1 + " " + mismatch2);
  }

    public static void main(String... args){
        binarySearchMismatch();
    }
}