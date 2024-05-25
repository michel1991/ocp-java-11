package exceptions.handled;

/**
  What will be the output of the following class.
  
    A. It will print j = 1;
    B. It will print j = 2;
    C. The value of j cannot be determined.
    D. It will not compile.
    E. None of the above.
    
    -------------------------------------------------
    If evaluation of the left-hand operand of a binary operator completes abruptly, no part of the right-hand operand appears to have been evaluated.
    So, as doIt() throws exception, j = 2 never gets executed.
    Correct(A)

 */
public class TestPrintJEqualToOne {
    public static void main(String[] args){
      int j = 1;
      try{
         int i = doIt() / (j = 2);
      } catch (Exception e){
         System.out.println(" j = " + j);
      }
   }
   public static int doIt() throws Exception {  throw new Exception("FORGET IT");  }
}