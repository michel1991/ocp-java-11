package exceptions.errors.orders;

/**
    What is the output of the following snippet, assuming a and b are both 0?
    A. -1
    B. 0
    C. done-1
    D. done0
    E. The code does not compile.
    F. An uncaught exception is thrown.
    G. None of the above
    
    The order of catch blocks is important because they’re checked in the order they appear after the try block.
    Because ArithmeticException is a child class of RuntimeException, the catch block on line 7
    is unreachable (if an ArithmeticException is thrown in try block, it will be caught on line 5).
    Line 7 generates a compiler error because it is unreachable code, making option E correct.
 */
public class MixedRuntimeAndArithmeticException {
   static void mixed(){
       try { // 3:
           System.out.print(a / b); //  4:
       } catch (RuntimeException e) { //  5:
           System.out.print(-1); //  6:
       } catch (ArithmeticException e) { //  7:
           System.out.print(0); //   8:
       } finally { //   9:
           System.out.print("done"); //  10:
       } //  11:
   }
}