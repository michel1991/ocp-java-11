package exceptions;

public class FinalAlwaysCall {
    /**
     * What does the following code snippet return, assuming a and b are both 1?
     *  A. 1
        B. 10
        C. 20
        D. 30
        E. The code does not compile.
        F. An uncaught exception is thrown.
        G. None of the above

        The code compiles without issue since ClassCastException is a subclass of RuntimeException
        and it is properly listed first, so option E is incorrect.
        Line 14 executes dividing 1 by itself, resulting in a value of 1.
        Since no exception is thrown, options B and C are incorrect.
        The value returned is on track to be 1,
        but the finally block interrupts the flow,
        causing the method to return 30 instead and making option D correct.
        Remember, barring use of System.exit(),
        a finally block is always executed if the try statement is entered,
        even if no exception is thrown or a return statement is used.
     */
   static void divide(){
       try { // 13:
           return a / b; // 14:
       } catch (ClassCastException e) { // 15:
           return 10; //   16:
       } catch (RuntimeException e) { //  17:
           return 20; //   18:
       } finally { //    19:
           return 30; //  20:
       } //    21:

   }
}