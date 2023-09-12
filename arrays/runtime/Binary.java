package arrays.runtime;
 import java.util.*; // 1:

/**
 * What is the result of the following when called as java Binary.java? (Choose two.)
    A. null
    B. []
    C. Binary
    D. The code throws an ArrayIndexOutOfBoundsException.
    E. The code throws a NullPointerException.
    F. The code does not compile.
    
    Since no arguments are passed from the command line, this creates an empty array.
    Sorting an empty array is valid and results in an empty array printed on line 6.
    Then line 7 attempts to access an element of the empty array and throws an ArrayIndexOutOfBoundsException.
    Therefore, options B and D are correct.
 */
public class Binary { // 2: 
   // 3: 
   public static void main(String... args) { // 4: 
       Arrays.sort(args); //   5:  
       System.out.println(Arrays.toString(args)); //  6:  
       System.out.println(args[0]); //    7: 
   } } //  8: 