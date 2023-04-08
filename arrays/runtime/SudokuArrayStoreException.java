package arrays.runtime;

/**
 *  What is the result of running the following program?
    A. 6
    B. X
    C. The code does not compile.
    D. The code compiles but throws a NullPointerException at runtime.
    E. The code compiles but throws a different exception at runtime.
    
    Line 6 assigns an int to a cell in a 2D array. This is fine.
    Line 7 casts to a general Object[]. This is dangerous, but legal.
    Why is it dangerous, you ask? That brings us to line 8.
    The compiler can’t protect us from assigning a String to the int[] because the reference is more generic.
    Therefore, line 8 throws an ArrayStoreException because the type is incorrect, and option E is correct.
    You couldn’t have assigned an int on line 8 either because obj[3] is really an int[]
    behind the scenes and not an int.
 */
class Sudoku { // 2: 
    static int[][] game = new int[6][6]; //  3: 
   // 4:
    public static void main(String[] args) { // 5: 
        game[3][3] = 6; //    6:  
       Object[] obj = game; //  7: 
       obj[3] = "X"; //   8:  
       System.out.println(game[3][3]); //    9: 
    } //   10:
} //   11:


public class SudokuArrayStoreException {
  
}