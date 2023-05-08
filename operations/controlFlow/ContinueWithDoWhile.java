
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
    
    public static void main(String... args){
        firstExample();
    }
}