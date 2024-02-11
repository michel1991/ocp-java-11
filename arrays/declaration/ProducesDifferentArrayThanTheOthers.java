package arrays.declaration;
import java.util.*;

public class ProducesDifferentArrayThanTheOthers {
    /**
     * Which of these four array declarations produces a different array than the others?
        A. int[][] nums = new int[2][1];
        B. int[] nums[] = new int[2][1];
        C. int[] nums[] = new int[][] { { 0 }, { 0 } };
        D. int[] nums[] = new int[][] { { 0, 0 } };

       Options A and B show that the brackets, [], can be before or after
       the variable name and produce the same array.
       Option C specifies the same array the long way with two arrays of length 1.
       Option D is the answer because it is different than the others.
       It instead specifies an array of length 1 where that element is of length 2.
     */
    static void findTwoDimensions(){
        int[][] nums = new int[2][1];
        int[] nums2[] = new int[2][1];
        int[] nums3[] = new int[][] { { 0 }, { 0 } };
        int[] nums4[] = new int[][] { { 0, 0 } };
    }
    
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
    static void findFourDimensions(){
        int[][][][] nums1a, nums1b;
        int[][][] nums2a[], nums2b;
        int[][] nums3a[][], nums3b[][];
        int[] nums4a[][][], numbs4b[][][];
    }

    public static void main(String... zrgs){
        findTwoDimensions();
        findFourDimensions();
    }
}