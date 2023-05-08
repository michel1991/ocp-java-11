package autoboxingUnboxing.errors;
/**
 * Which of the following are true? (Choose two.)
    A. One line needs to be changed for this code to compile.
    B. Two lines need to be changed for this code to compile.
    C. Three lines need to be changed for this code to compile.
    D. If the code is fixed to compile, none of the cells in the 2D array have a value of 0.
    E. If the code is fixed to compile, half of the cells in the 2D array have a value of 0.
    F. If the code is fixed to compile, all of the cells in the 2D array have a value of 0.
    
    Line 24 does not compile because arrays use length.
    It is ArrayList that uses size(). All of the other lines compile,
    making option A correct. It is permitted to split up the brackets,
    [], in the 2D array declaration on line 20.
     The code is also allowed to use crossword.length as the loop condition on line 22,
     although this is not a good idea for a nested array.
     Instead, the inner loop should reference crossword[i].length.
     The array starts out with all two hundred of the cells initialized
     to the default value for an int of 0.
      Both loops iterate starting at 0 and stopping before 10,
      which causes only half of the array to be set to 'x'.
      The other half still has the initial default value of 0, making option E correct.
 */
public class CrossWordCharToInt {
    public static void main(String... args){
        int[] crossword [] = new int[10][20]; // 20:
        for (int i = 0; i < crossword.length; i++) //   21:
            for (int j = 0; j < crossword.length; j++) //   22: 
                crossword[i][j] = 'x';	 //    23:
        System.out.println(crossword.size()); //   24: 
    }
}