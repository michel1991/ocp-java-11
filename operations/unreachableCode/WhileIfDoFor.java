package operations.unreachableCode;
public class WhileIfDoFor {
    /**
     Which of the following code snippets will compile without any errors?
      (Assume that the statement int x = 0; exists prior to the statements below.)
      
       A. while (false) { x=3; }
       B.  if (false) { x=3; }
       C. do{ x = 3; } while(false);
          In a do- while, the block is ALWAYS executed at least once because the condition check is done after the block is executed.
          Unlike a while loop, where the condition is checked before the execution of the block.
          
       D. for( var i = 0; i< 0; i++) x = 3;
       
       ------------------------------
       while (false) { x=3; } is a compile-time error because the statement x=3; is not reachable;
        Similarly, for( int i = 0; false; i++) x = 3; is also a compile time error because x= 3 is unreachable.
        
        The compiler can only look for compile time constant values to determine whether a piece of code is reachable or not.
        Therefore, the following is valid:
        boolean b = false;
        for (int i = 0; b; i++) {x = 3;};//Compiles fine
        
        It is fine because b is a variable and not a compile time constant.
        If you make b final, it will become a compile time constant and then the above for statement will not compile.
        
        
        
        In if(false){ x=3; }, although the body of the condition is unreachable,
        this is not an error because the JLS explicitly defines this as an exception to the rule.
        It allows this construct to support optimizations through the conditional compilation. For example,
        
        if(DEBUG){ System.out.println("beginning task 1"); }
        
        Here, the DEBUG variable can be set to false in the code while generating the production version of the class file,
        which will allow the compiler to optimize the code by removing the whole if statement entirely from the class file.
        
       Correct(B,C,D)

     */
    
    static void failedResponseA(){
        int x = 0;
        while (false) { x=3; }
    }
    
    public static void main(String... args){
        

    }
}