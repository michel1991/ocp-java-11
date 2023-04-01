package compare.errors;

/**
 *  What is true of the code when run as java Copier.java? (Choose two.)
 
    A. One line contains a compiler error.
    B. Two lines contain a compiler error.
    C. Three lines contain a compiler error.
    D. Four lines contain a compiler error.
    E. If the compiler errors were fixed, the code would throw an exception.
    F. If the compiler errors were fixed, the code would run successfully.
    
    Three dots in a row is a varargs parameter.
    While varargs is used like an array from within the method,
    it can only be used as a method parameter. This syntax is not allowed for a variable,
     causing a compiler error on line 5. Line 6 does not compile because linearSort() should be sort().
     On line 7, the method name is also incorrect.
      The search() should be binarySearch(). Finally,
      line 9 uses size() instead of length. Since there are four errors, option D is correct.
      If all these errors were corrected, original[0] would
      cause an exception because the array is empty. Therefore, option E is also correct.
 */
  import java.util.Arrays; // 1:
//2:
 class Copier { // 3: 
     public static void main(String... original) { //   4: 
         String... copy = original; //    5:   
         Arrays.linearSort(original); //    6:  
         Arrays.search(original, ""); //   7: 
         System.out.println(original.size()  //   8: 
                            + " " + original[0]); // 9:  
     } //   10: 
 } //   11:

public class CopierLinearSortShouldBySortAndFindErrors {
  
}