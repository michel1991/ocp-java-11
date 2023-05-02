package operations.controlFlow;

public class ContinueWithLoopWhileDoesNotComplete {
    /**
     * What is output by the following?
        A. 3 10
        B. 3 12
        C. 5 10
        D. 5 12
        E. The code does not compile.
        F. None of the above.
        
      When getting this type of question, the best approach is to write down the values of the variables.
      Both start out as 0 on line 10. On the first iteration of the loop,
      n becomes 1, while m remains 0, so the clause in the if statement doesn’t run.
      In the switch statement, the value of m remains 0, so it matches the first case.
      Since there is no break, the default block is also executed,
      and n is incremented twice and is now 3. Finally, m is incremented to 1.
      On the second iteration of the loop, m goes from 1 to 2, and n goes from 3 to 6.
      On the third iteration, m goes from 2 to 3, and n goes from 6 to 8.
      On the fourth iteration m is 3, and the continue is executed with only n increasing in value by 1.
      This pattern continues with the loop never terminating,
      while n continues to increase by 1.
      Since the execution does not complete,
      option F is the correct answer.
     */
  static void increment(){
        int m = 0, n = 0; //  10:
        while (m < 5) { //  11: 
            n++; // 12: 
            if (m == 3)  // 13: 
                continue; //   14: 
            //15:   
            switch (m) { //   16:  
                case 0: // 17:
                case 1: //  18:  
                n++; //  19:  
                default: //   20:  
                n++; //  21: 
            } //  22: 
            m++; //  23:
        } //   24:
        System.out.println(m + " " + n); //  25: 
  }
}