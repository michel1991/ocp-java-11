package operations.errors;

/**
* Which statements about the following class are correct? (Choose all that apply.)
*   A. The class compiles and prints Distance Traveled: 5.
    B. The class compiles, but the output cannot be known ahead of time.
    C. Regardless of whether or not the class compiles, line 5 declares an infinite loop.
    D. Line 5 contains a compiler error.
    E. Line 6 contains a compiler error.
    F. Line 7 contains a compiler error.
    G. Line 9 contains a compiler error.
    H. None of the above

   The class contains two compiler errors, making options A and B incorrect.
   The first compiler error is on line 7, as three equals signs (===) is not an operator in Java.
   The second compiler error is on line 9, as pos is only in scope for the for loop and not accessible outside the loop.
    For these reasons, options F and G are correct.
    Option C is incorrect as the for loop either will exit when pos reaches 5 or will break early due to the tired variable.
    The rest of the lines do not contain any compiler errors.
 */
class Race { // 1:
    public void run() { //  2:
        final int marathon = 5; //  3:
        boolean tired = false; //   4:
        for(double pos = 0; pos<marathon; pos += 0.1) { //    5:
            tired = Math.random()>0.9 ? true : false; //  6:
            if(tired === true) break; //   7:
        } //  8:
        System.out.println("Distance Traveled: "+pos); } } //   9:
public class BadSignOfEquals {

}