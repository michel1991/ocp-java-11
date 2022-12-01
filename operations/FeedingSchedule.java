package operations;

/**
* What is the result of compiling and executing the following program?
    A. 10
    B. 11
    C. 12
    D. 17
    E. The code will not compile because of line 5.
    F. The code will not compile because of line 6.
    
    The code compiles and runs without issue; therefore, options E and F are incorrect. This type of problem is best examined one loop iteration at a time:
    On the first iteration of the outer loop i is 0, so the loop continues.
    On the first iteration of the inner loop, i is updated to 1 and x to 6. The if statement branch is not executed, and x is increased to 10 and j to 1.
    On the second iteration of the inner loop (since j = 1 and 1 <= 2), i is updated to 2 and x to 11. At this point, the if branch will evaluate to true for the remainder of the program run, which causes the flow to break out of the inner loop each time it is reached.
    On the second iteration of the outer loop (since i = 2), i is updated to 3 and x to 12. As before, the inner loop is broken since x is still greater than 10.
    On the third iteration of the outer loop, the outer loop is broken, as i is already not less than 3. The most recent value of x, 12, is output, so the answer is option B.

 */
public class FeedingSchedule {
    public static void main(String[] args) { //  2:
        var x = 5; // 3:
        var j = 0; //   4:
        OUTER: for (var i = 0; i < 3;) //  5:
            INNER: do {  // 6:
            i++;  //   7:
                x++; //  8:
                if (x > 10) break INNER; //  9:
                x += 4; // 10:
                j++; //   11:
        } while (j <= 2); //   12:
        System.out.println(x);  //   13:
    } //  14:
}