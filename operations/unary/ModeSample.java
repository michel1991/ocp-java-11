package operations;

/**
* What is the result of the following code?
*   A. 4
    B. 0
    C. 7
    D. 5
    E. The answer cannot be determined until runtime.
    F. The code will not compile because of line 4.

    The code compiles and runs without issue, so options E and F are incorrect.
     In the order of operations, the first operator applied is the pre-increment operator, resulting in y being assigned a value of 5,
     and the value returned from the operator assigned the new value of 5.
     Next, we apply the division operator since division has a higher order of precedence than subtraction, resulting in an expression of x = 10 - 5 /5 = 10 - 1 = 9.
     Finally, we perform modular arithmetic using the new values of x and y—9 and 5, respectively.
     If we divide these two values, we get 0; therefore, the remainder of 9 % 5 is 4, so option A is the correct answer.
 */
public class ModeSample {
    public static void main(String[] args) { //  2:
        var y = 4;  //   3:
        int x = 10 - ++y / 5;  //  4:
        System.out.println(x % y);  //   5:
    }  //    6: 
}