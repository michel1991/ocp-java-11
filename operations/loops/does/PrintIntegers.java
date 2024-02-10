package operations.loops.does;
public class PrintIntegers {
    /**
    * What is the result of the following code?
        A. -2 -1 0 1 2 3 4 5
        B. -2 -1 0 1 2 3 4
        C. -1 0 1 2 3 4 5 6
        D. -1 0 1 2 3 4 5
        E. The code will not compile because of line 5.
        F. The code contains an infinite loop and does not terminate.

      Since the pre-increment operator was used, the first value that will be displayed is -1, so options A and B are incorrect.
      On the second-to-last iteration of the loop, y will be incremented to 5, and the loop will output 5.
      The loop will continue since 5 <= 5 is true, and on the last iteration, 6 will be output.
      At the end of this last iteration, the boolean expression 6 <= 5 will evaluate to false, and the loop will terminate.
      Since 6 was the last value output by the loop, the answer is option C.

     */
    static void printIntegers(){
        int y = -2;
        do System.out.print(++y + " "); //  4:
        while(y <= 5); //  5:
    }
    
    public static void main(String... args){
        printIntegers();
    }
}