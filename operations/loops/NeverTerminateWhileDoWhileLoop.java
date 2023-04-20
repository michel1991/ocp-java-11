package operations.loops;
public class NeverTerminateWhileDoWhileLoop {
    /**
    *  What is the output of the following code snippet?
    *   A. ABC
        B. ABCABC
        C. ABCABCABC
        D. Line 15 contains a compilation error.
        E. Line 18 contains a compilation error.
        F. The code compiles but never terminates at runtime.
        G. The code compiles but throws a NullPointerException at runtime.

       The code snippet does not contain any compilation errors, so options D and E are incorrect.
       There is a problem with this code snippet, though. While it may seem complicated, the key is to notice is that the variable r is updated outside of the do/while loop.
       This is allowed from a compilation standpoint, since it is defined before the loop, but it means the innermost loop never breaks the termination condition r <= 1.
       At runtime, this will produce an infinite loop the first time the innermost loop is entered, making option F the correct answer.

     */
  public static void infinteLoop(){
      int w = 0, r = 1;  // 9:
      String name = ""; //  10:
      while(w < 2) { //   11:
          name += "A"; //  12:
          do { //  13:
              name += "B"; //    14:
              if(name.length()>0) name += "C"; //   15:
              else break; //  16:
          } while (r <=1); // 17:
          r++; w++; } //   18:
      System.out.println(name); //   19:
  }

    public static void main(String... args ){

  }
}