package operations.loops;
public class LoopDoWhile {
    /**
      What is the output of the following code snippet?
     
        A. done
        B. inflate-done
        C. The code does not compile.
        D. This is an infinite loop.
        E. None of the above.
        
        On the first iteration of the loop, the if statement executes and prints inflate-.
        Then the loop condition is checked.
        The variable balloonInflated is true, so the loop condition is false, and the loop completes and done is printed.
     */
   static void ballonInflated(){
       boolean balloonInflated = false;
       do {
           if (!balloonInflated) {
               balloonInflated = true;
               System.out.print("inflate-");
           }
       } while (! balloonInflated);
       System.out.println("done");
       
   }
}