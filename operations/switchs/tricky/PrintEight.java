package operations.switchs.tricky;

/**
    Consider the code shown below:
    
    What will it print when compiled and run?
    A. 5
    B. 6
    C. 7
    D. 8
    E. 9
    F. It will not compile.
    
    ------
     correct(D)
     
     The control in the case falls through till reaches the break statement.
    Here, switch(4) will take the control to case 4:.
    Since there is no break statement in the code, all the statements till the end will be executed.
    So, j will be incremented three times making it 4. finally 4 + 4 i.e. 8 will be returned.

 */
public class PrintEight{
    public static int switchTest(int k){
       var j = 1;
       switch(k){
          case 1: j++;
          case 2: j++;
          case 3: j++;
          case 4: j++;
          case 5: j++;
          default : j++;
       }
       return j + k;
    }
    public static void main(String[] args){
       System.out.println( switchTest(4) );
    }
  }
  