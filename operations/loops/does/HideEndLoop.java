package operations.loops.does;
public class HideEndLoop {
    /**
    * What is the result of the following code snippet?
        A. 8
        B. 0
        C. 7
        D. 3
        E. 6
        F. The code will not compile because of line 8.
        G. The code contains an infinite loop and does not terminate.

      The code compiles and runs without issue, so options F and G are incorrect.
      This looks a little complicated, until you realize that the loop is only ever executed once.
      The assignment operator = was used instead of the equality operator in the boolean expression of the do-while statement;
      therefore, x is assigned a value of true the first time it runs. Since the complement of true is false, the loop will execute once and then terminate.
      On the single iteration of the loop, the value z is not greater than 5, so it is updated from 0 to 3.
      The output after the loop is 3, so the answer is option D.
      If the loop had used the equality operator instead of the assignment operator, it would have executed and stopped after three iterations, outputting 7,
      so option C would have been correct.

     */
    static void hideAssignment(){
        var x = false; // 3:
        var z = 0;  //  4:
        do {  // 5:
            if(z>5) {z++; x = true;}  //  6:
            else z += 3; //   7:
        } while (!(x = true)); //  8:
        System.out.println(" Begin hideAssignment ");
        System.out.println("\t" + z);  //   9:
        System.out.println(" End hideAssignment ");
    }
    
    public static void main(String... args){
        hideAssignment();
    }
}