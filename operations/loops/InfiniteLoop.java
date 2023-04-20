package operations.loops;
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

    /**
    *  What is the output of the following code snippet?
        A. ABC
        B. ABCABC
        C. ABCABCABC
        D. Line 15 contains a compilation error.
        E. Line 18 contains a compilation error.
        F. The code compiles but never terminates at runtime.
        G. The code compiles but throws a NullPointerException at runtime.

       The code snippet does not contain any compilation errors, so options D and E are incorrect.
       There is a problem with this code snippet, though.
       While it may seem complicated, the key is to notice is that the variable r is updated outside of the do/while loop.
       This is allowed from a compilation standpoint, since it is defined before the loop, but it means the innermost loop never breaks the termination condition r <= 1.
       At runtime, this will produce an infinite loop the first time the innermost loop is entered, making option F the correct answer.

     */
    static void second(){
        int w = 0, r = 1; //  9:
        String name = ""; // 10:
        while(w < 2) { // 11:
            name += "A";  // 12:
            do { //   13:
                name += "B"; //   14:
                if(name.length()>0) name += "C"; //    15:
                else break; //  16:
            } while (r <=1); //   17:
            r++; w++; } //    18:
        System.out.println(name); //   19:
    }
}