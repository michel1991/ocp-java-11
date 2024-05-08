package operations.loops.whiles;
/**
 *  Given:
    What is the result?
    A. 6 4 5
    B. 6 5 5
    C. 6 5 6
    D. 6 4 6
    D. 5 5 5
    
    
    In such type of questions, you will need to work out the values of the loop variables for every iteration
    (unless you can recognize the pattern) on your worksheet.
    
    Beginning i=0, j=10, count = 0
    Iteration 1: i<j is true, i becomes 1, j becomes 9, count becomes 1
    Iteration 2: i<j is true, i becomes 2, j becomes 8, count becomes 2
    Iteration 3: i<j is true, i becomes 3, j becomes 7, count becomes 3
    Iteration 4: i<j is true, i becomes 4, j becomes 6, count becomes 4
    Iteration 5: i<j is true, i becomes 5, j becomes 5, count becomes 5
    Iteration 6: i<j is false so the while loop is not entered.
    Print 5 5 5.
    Correct(D)
    
 */
public class SimpleLoop {
    public static void main(String[] args) {
        int i=0, j=10;
        var count = 0;
        while (i<j) {            
            i++;
            j--;
            count++;
        }
        System.out.println(i+" "+j+" "+count);
    }
}