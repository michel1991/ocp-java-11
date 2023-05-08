
package operations.controlFlow;

public class ContinueWithDoWhile {
    
    /**
     * What is the output of the following?
        A. 5
        B. 6
        C. 7
        D. The code does not compile.
        E. The code compiles but throws an exception at runtime.
        F. The code compiles but enters an infinite loop at runtime.
        
       On line 10, result is first set to 8. On line 11, the loop is entered because 8 ˃= 7.
       On line 12, result is incremented to 9.
       Then the inner loop runs, decrementing result to 7.
       The inner loop is then broken by the continue monitor statement.
       The outer loop then evaluates the loop condition. Since 7 >= 7,
       it runs again ending with the inner loop setting result to 6.
       Since 6 ˃= 7 is false, the outer loop terminates after two executions and prints 6.
     */
    static void firstExample(){
        var result = 8; // 10:
        monitor: while (result >= 7) { //  11: 
            result++; //  12: 
            do { //   13:  
                result -= 2; //   14:  
                continue monitor; //   15:
            } while (result > 5); //    16: 
        } //   17: 
        System.out.println(result); // 18: 
    }
    
    /**
     * Which sets of lines can be removed without stopping the code from compiling and while printing the same output? (Choose three.)
        A. Lines 15 and 17
        B. Lines 16 and 23
        C. Lines 17, 18, and 22
        D. Line 17
        E. Line 22
        F. Line 23
        
        The unmodified code prints xxxxx, so you’re looking
        for options that also print this value.
        Option A is correct because the labels are not referenced.
        Option B is correct because the outer while is broader than the inner while.
        If race.length() ˂= 4 is true, then race.length() ˂ 4 must be true.
        The inner loop prints xxxxx, and the outer loop is not needed.
        Option C is incorrect because the outer loop only prints xxxx without the inner loop.
        Option D is also correct because a label is not used.
        Option E and F are incorrect because you cannot remove the while portion of a do/while loop
     */
    static void secondExample(){
        String race = ""; //  14:
        outer: // 15: 
      do { //   16: 
          inner: // 17:
          do //  18: 
             { //   19: 
                 race += "x"; //  20: 
             } //  21: 
             while (race.length() <= 4); //   22: 
      } while (race.length() < 4); //  23:
        System.out.println(race); //  24: 
        
    }
    
    public static void main(String... args){
        firstExample();
    }
}