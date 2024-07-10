package operations.loops.whiles;
/**
  Given:
  
  What is the result?
  
    A. It will not compile.
        There is no problem with the code. The variable j declared in the for loop shadows the instance member j inside the for loop.
        
    B. It will print 1 2 3 4 5 five times.
    C. It will print 1 3 5 five times.
    D. It will print 1 2 3 4 5 once.
    E. It will print 1 2 3 4 5 six times.
    
    The point to note here is that the j in for loop is different from the instance member j.
    Therefore, j++ occuring in the for loop doesn't affect the while loop. The for loop prints 1 2 3 4 5.
    The while loop runs for the values 0 to 5 i.e. 6 iterations. Thus, 1 2 3 4 5 is printed 6 times.
    Note that after the end of the while loop the value of j is 6.
    
    Correct(E)

 */
//package loops;
public class JustLooping {
    private int j;
    void showJ(){
        while(j<=5){
            for(int j=1; j <= 5;){
                System.out.print(j+" ");
                j++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        new JustLooping().showJ();
    }
}