package inheritance.errors;

/**
* What does the following program print?
    A. 3
    B. 7
    C. The code does not compile because exactly one line contains a compiler error.
    D. The code does not compile because exactly two lines contain compiler errors.
    E. The code compiles but produces an exception at runtime.
    F. None of the above.

   First, default methods are permitted only in interfaces, not classes.
    For this reason, line 3 does not compile.
    Even if this line was fixed, though, there is another problem.
    Since Rain is marked final, it cannot be extended, meaning line 4 does not compile.
    Since these are the only two compilation errors, option D is the correct answer.
*
 */
 class Rainbow { // 1:
     final static class Rain { //   2:
         int default view() { return 3; } } //  3:
    class Storm extends Rain { //  4:
         int view() { return 7; } //    5:
     } //   6:
    public final static void main(String[] unused) { //   7:
         System.out.println(new Rainbow().new Storm().view()); //   8:
     } } //  9:

public class RainbowFindErrors {

}