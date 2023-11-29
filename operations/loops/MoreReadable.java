package operations.loops;

public class MoreReadable {
    
    static boolean isDone(){
        return true;
    }
    public static void main(String... args){
        /**
           Consider the following code written by a new developer:

        */
            while(true){
                //additional valid code
                if(isDone()) break;
            }
            
            /* What can be done to make this code more readable?
            
                A. Use a for loop
                    The following is how it can be done using a for loop:
            */
                    for(;!isDone();) {
                        //additional valid code
                    }
            /*    B. Use the enhanced for loop
                C. use do-while instead of while.
                    In the current state, the actual loop breaker condition
                    is coded far away from the while condition. This reduces readability because it isn't
                    immediately known when the loop breaks. Therefore, it should be changed to:
                    do{
                    } while( !isDone() );
                D. Use continue instead of break.
                    (Correct is C)
            
         */
    }
}