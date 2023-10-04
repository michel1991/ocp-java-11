package arrays;
import java.util.*;


public class ArrayWithDifferentSize {
    
    /**
       Which of these four pairs of declarations can point to an array that is different from the others?

        A. int[][][][] nums1a, nums1b;
        B. int[][][] nums2a[], nums2b;
        C. int[][] nums3a[][], nums3b[][];
        D. int[] nums4a[][][], numbs4b[][][];

       All of the variables except nums2b point to a 4D array.
       Don’t create a 4D array in practice; it’s confusing.
       The options show that the brackets, [], can be before or after the variable in any combination.
       Option B is the answer because nums2b points to a 3D array.
       It has only three pairs of brackets before the variable and none after.
       By comparison, nums2a has three pairs of brackets
       before the variable and the fourth pair of brackets after.
     */
    static void findArrayThatAreDifferentSize(){
      
    }
}