package operations;
public class Loop {
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

    /**
        Assuming weather is a well-formed nonempty array, which code snippet, when inserted independently into the blank in the following code,
        prints all of the elements of weather? (Choose all that apply.)

        A. int i=weather.length; i>0; i--
        B. int i=0; i<=weather.length-1; ++i
        C. var w : weather
        D. int i=weather.length-1; i>=0; i--
        E. int i=0, int j=3; i<weather.length; ++i
        F. int i=0; ++i<10 && i<weather.length;
        G. None of the above

       Option A is incorrect because on the first iteration it attempts to access weather[weather.length] of the nonempty array,
       which causes an ArrayIndexOutOfBoundsException to be thrown.
       Option B is correct and will print the elements in order.
       It is only a slight modification of a common for loop, with i<weather.length replaced with an equivalent i<=weather.length-1.
       Option C is incorrect because the snippet creates a compilation problem in the body of the for loop, as i is undefined in weather[i].
       For this to work, the body of the for-each loop would have to be updated as well.
       Option D is also correct and is a common way to print the elements of an array in reverse order.
       Option E does not compile and is therefore incorrect. You can declare multiple elements in a for loop,
        but the data type must be listed only once, such as in for(int i=0, j=3; ...).
        Finally, option F is incorrect because the first element of the array is skipped.
        The loop update operation is optional, so that part compiles, but the increment is applied as part of the conditional check for the loop.
      Since the conditional expression is checked before the loop is executed the first time, the first value of i used inside the body of the loop will be 1.
     */
    private void printAllElementNotConsideringOrder(int[] weather) {
        System.out.println(" Begin  printAllElementNotConsideringOrder ");
        for(int i=weather.length-1; i>=0; i-- ) { // __________________
            System.out.println(weather[i]);
        }
        System.out.println(" End  printAllElementNotConsideringOrder ");
    }

    /**
    * Which statement(s) about the following code snippet are correct? (Choose all that apply.)
        A. The code prints five As.
        B. The code prints six As.
        C. The code prints two Bs.
        D. The code prints three Bs.
        E. The code prints four Bs.
        F. The code prints no Cs.
        G. The code prints one C.
        H. The code does not compile.

        The code compiles and runs without issue, making option H incorrect.
        The first loop is equivalent to incrementing a twice per loop, so it runs exactly five times, making option A correct.
        The second loop is equivalent to incrementing b by 3 per loop, and since it starts at 1,
        the loop is executed exactly three times, making option D correct.
        Finally, the last loop is executed exactly once, as c<5 is false after the first execution.
        For this reason, option G is correct.
    *
     */
    static void printABCAccordingToLoopDefinition(){
        System.out.println(" Begin  printABCAccordingToLoopDefinition");
        for(var a = 0; a<10; ++a) {
            a++;
            System.out.print("A");
        }
        for(var b = 1; b<10; b++) {
            System.out.print("B");
            b += 2;
        }
        for(var c = 4; c<5; c+=10) {
            System.out.print("C");
        }
        System.out.println(" End  printABCAccordingToLoopDefinition");
    }

    public static void main(String... args){
        incrementDecrement();
        System.out.println();  
        hideAssignment();
    }
}