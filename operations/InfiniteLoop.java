package operations;
public class InfiniteLoop {
    /**
    * What is the result of the following code snippet?
    *   A. 42 31 20 12 x
        B. 6 4 2 3 x
        C. 8 3 0 2 x
        D. The code will not compile because of line 6.
        E. The code will not compile because of line 7.
        F. The code contains an infinite loop and does not terminate.

       The thing to notice about this example is that as soon as x reaches 1, the inner loop will run infinitely.
        Notice that x and y are both modified by the inner loop if x is not less than 2.
        Therefore, it takes only four iterations of the inner loop for x to reach 1.
        When the program executes, the inner loop will run exactly three times, as y goes from 3 to 0 and x from 5 to 2.
        The control will then be returned to the outer loop, and the inner loop will attempt to run three more times, as the value of y has been reset.
        During the new first iteration of the inner loop, though, x will be set to 1.
        The inner loop will then be called again, and the if statement and continue will activate.
        The value of y and the value of x are no longer modified, so the inner loop will run infinitely, and the answer is option F.
        Even if the inner loop did terminate, nothing is modifying x in the outer loop boolean expression, so that loop will run infinitely as well.
        Before reaching the infinite state, the code will output 8 3 0 2.
     */
  void first(){
      var x = 5; // 3:
      while(x >= 0) { //  4:
          var y = 3; //  5:
          while (y > 0) { //  6:
              if(x<2) continue; //  7:
              x--; y--; //  8:
              System.out.print(x*y+" "); //  9:
          } // 10:
      } // 11:
      System.out.print("x"); // 12:

  }
}