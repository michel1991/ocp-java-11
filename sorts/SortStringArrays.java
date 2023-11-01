package sorts;
import java.util.*;
public class SortStringArrays {
  static void sorts(){
      String[] nums = new String[] { "1", "9", "10" };
      Arrays.sort(nums);
      System.out.println(Arrays.toString(nums));
  }

    /**
      What does this code output?
        A. [1, 9, 10]
        B. [1, 10, 9]
        C. [9, 1, 10]
        D. [9, 10, 1]
        E. [10, 1, 9]
        F. [10, 9, 1]

       The elements of the array are of type String rather than int.
       Therefore, we use alphabetical order when sorting.
       The character 1 sorts before the character 9, alphabetically making option A incorrect.
       Shorter strings sort before longer strings when all
       the other characters are the same, making option B the answer.
     */
    public static void main(String... args){
      sorts();
  }
}