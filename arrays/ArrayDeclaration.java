package arrays;
import java.util.*;
public class ArrayDeclaration {
    /**
    *   Which of these array declarations is not legal? (Choose all that apply.)
        A. int[][] scores = new int[5][];
        B. Object[][][] cubbies = new Object[3][0][5];
        C. String beans[] = new beans[6];
        D. java.util.Date[] dates[] = new java.util.Date[2][];
        E. int[][] types = new int[];
        F. int[][] java = new int[][];

       Option C uses the variable name as if it were a type, which is clearly illegal.
       Options E and F don’t specify any size.
       Although it is legal to leave out the size
       for later dimensions of a multidimensional array, the first one is required.
       Option A declares a legal 2D array. Option B declares a legal 3D array.
       Option D declares a legal 2D array.
       Remember that it is normal to see on the exam types you might not have learned.
       You aren’t expected to know anything about them.


     */
   static void firstExample(){
        System.out.println("start first exemple");
        int[][] scores = new int[5][];
        System.out.println(Arrays.toString(scores[0])); // size of second table are null
        Object[][][] cubbies = new Object[3][0][5];
        java.util.Date[] dates[] = new java.util.Date[2][];
        System.out.println("end start first exemple");
        System.out.println();
   }

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
    static void differentArray(){
        int[][] nums = new int[2][1];
        int[] nums2[] = new int[2][1];
        int[] nums3[] = new int[][] { { 0 }, { 0 } };
        int[] nums4[] = new int[][] { { 0, 0 } };
    }

    public static void main(String... zrgs){
        firstExample();
    }
}