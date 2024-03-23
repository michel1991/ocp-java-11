package operations.controlFlow.loops.fors;

class Test{
    public static void main(String args[]){
        int c = 0;
        A: for(var i = 0; i < 2; i++){
            B: for(var j = 0; j < 2; j++){
            C: for(var k = 0; k < 3; k++){
                c++;
                if(k>j) break;
            }
        }
        }
        System.out.println(c);
    }
}

/**
 * What will the following code print when compiled and run?
    A. 7
    B. 8
    C. 9
    D. 10
    E. 11
    
    The point to note here is that a break without any label breaks the innermost outer loop. So in this case, whenever k>j, the C loop breaks.
    You should run the program and follow it step by step to understand how it progresses.
    
    You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/nXQImwlZj6w

 */
public class Print10 {
    public static void main(String args[]){
        Test.main(args);
    }
}