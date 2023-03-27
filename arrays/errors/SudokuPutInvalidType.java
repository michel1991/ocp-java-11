package arrays.errors;

/**
 * What is the result of running the following program?
    A. X
    B. The code does not compile.
    C. The code compiles but throws a NullPointerException at runtime.
    D. The code compiles but throws a different exception at runtime.

   Line 8 attempts to store a String in an array meant for an int.
   Line 8 does not compile, and option B is correct.

 */
 class Sudoku { // 2:
    static int[][] game; // 3:
   // 4:
    public static void main(String[] args) { // 5:
        game[3][3] = 6; //  6:
       Object[] obj = game; //  7:
       game[3][3] = "X"; //   8:
       System.out.println(game[3][3]); //  9:
    } //  10:
} //   11:

public class SudokuPutInvalidType {

}