package operations.controlFlow.errors;

/**
   Consider the following method which is called with an argument of 7, d, where d is some double value:
   What will it print?
   
    A. It will print 1 and 2
    B. It will print 1 to N where N depends on the value passed as an argument to the parameter d.
    
    C. It will not compile.
    Remember that a labeled break or continue statement must always exist inside the
    loop where the label is declared. Here, if(j == 4) break POINT1; is a labelled break
    that is occurring in the second loop while the label POINT1 is declared for the first loop.
    
    D.It will throw an exception at runtime
    
    Correct (C)
 */
public class BreakRefertNotParentScope {
    public void method1(int i, double d){
        int j = (i*30 - 2)/100;

        POINT1 : for(;j<10; j++){
            var flag  = false;
            while(!flag){
                if(d > 0.5) break POINT1;
            }
        }
        while(j>0){
            System.out.println(j--);
            if(j == 4) break POINT1;
        }
    }
    public static void main(String... args){
        
    }
}