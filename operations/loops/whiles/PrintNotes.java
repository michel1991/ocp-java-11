package operations.loops.whiles;
public class PrintNotes {
    /**
    * What is the result of the following code snippet?
        A. 11
        B. 13
        C. 23
        D. 33
        E. 50
        F. The code will not compile because of line 7.

       Prior to the first iteration, sing = 8, squawk = 2, and notes = 0.
       After the iteration of the first loop, sing is updated to 7, squawk to 4, and sing to the sum of the new values for sing + squawk, 0 + 11 = 11.
       After the iteration of the second loop, sing is updated to 6, squawk to 6, and notes to the sum of the new values for sing + squawk, 11 + 12 = 23.
       On the third iteration of the loop, sing > squawk evaluates to false, as 6 > 6 is false.
       The loop ends and the most recent value of sing, 23, is output, so the correct answer is option C.
     */
  static void incrementDecrement(){
        int sing = 8, squawk = 2, notes = 0; // 3:
        while(sing > squawk) { //  4:
            sing--; //   5:
            squawk += 2; // 6:
            notes += sing + squawk; //    7:
        } //  8:
        System.out.println(notes); //   9:
    }
    
    public static void main(String... args){
        incrementDecrement();
    }
}