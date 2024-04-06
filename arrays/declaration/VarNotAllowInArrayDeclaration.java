package arrays.declaration;
import java.util.*;


public class VarNotAllowInArrayDeclaration {
    /**
     Which of these array declarations and instantiations are legal?
        A. int[ ] a[ ] = new int [5][4] ;
            This will create an array of length 5. Each element of this array will be an array of 4 ints.
        
       B. int a[ ][ ] = new int [5][4] ;
          This will create an array of length 5. Each element of this array will be an array of 4 ints.
        
       C.  int a[ ][ ] = new int [ ][4] ;
            The statement int[ ][4] will not compile, because the dimensions must be created from left to right.
        
       D. int[ ] a[ ] = new int[4][ ] ;
         This will create an array of length 4. Each element of this array will be null.
         But you can assign an array of ints of any length to any of the elements. For example:
            a[0] = new int[10];//valid
            a[1] = new int[4];//valid
            a[2] = new int[]; //invalid because you must specify the length
            a[3] = new Object[] //invalid because a[3] can only refer to an array of ints.
        
        This shows that while creating a one dimensional array, the length must be specified but while creating multidimensional arrays,
        the length of the last dimension can be left unspecified.
        
        Further, the length of multiple higher dimensions after the first one can also be left unspecified
        if none of the dimensions are specified after it. So, for example, the type of the variable a and the array object
        that it points to are the same in both a[][][][] = new int[4][3][3][5]; and a[][][][] = new int[4][][][];
        (Note that the first dimension must be specified.)
        In both the cases, a refers to an array of array of array of array of ints.
        The difference is in the way the two arrays are initialized.
        In case of new int [4] [] [] [], only the elements of the first dimension are iniliazed (to null),
        while in case of new int[4] [3] [3] [5]; all elements of all dimensions are initialized
        (to non-null arrays or 0, in the last dimension).
        
        This allows multidimensional arrays to not be symmetrical.
        
      E. int[ ][ ] a = new int[5][4] ;
      This will create an array of length 5. Each element of this array will be an array of 4 ints.
      F. var[ ] a[ ] = new int [5][4] ;
      G. var[ ][ ] a = new int [5][4] ;
        You can't apply [ ] to var or the variable being declared using the var declaration.

      The [] notation can be placed both before and after the variable name in an array declaration.
        int[] ia, ba; //here ia and ba both are int arrays.
           int ia[], ba; //here only ia is int array and ba is an int.
        
        Multidimensional arrays are created by creating arrays that can contain references to other arrays .
        
        You need to remember two things with var declaration of arrays:
        
        1. var is not allowed as an element type of an array. Therefore, you can never apply square brackets on var.
         For example, var i[] implies that the type of the elements of the array is var, which is not allowed.
         Therefore, it should just be var i instead of var i[][] or var i[].
        
        2. An array initializer needs an explicit target-type. Without it,
        the compiler is not able to deduce the type of the array unambiguously.
        Therefore, for example, { 1, 2 } must written as new int[] { 1, 2 } if the variable is declared using var declaration.
        
        Correct(A, B, D, E)

     */
    public static void main(String... args){
        int[ ] a1[ ] = new int [5][4] ;
        int a2[ ][ ] = new int [5][4] ;
        int[ ] a3[ ] = new int[4][ ] ;
        
        a3[0] = new int[10];//valid
        a3[1] = new int[4];//valid
        a3[2] = new int[3]; //invalid because you must specify the length
        
        int[ ][ ] a4 = new int[5][4] ;
     
    }
}