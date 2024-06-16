package exceptions.finallys;

/**
    What will be the output of the following program?
      A. try finally
      B. try finally out
      C. try out
      D. catch finally out
      E. It will not compile because amethod() does not throw any exception.
      
      
      Correct(B)
     Since the method amethod() does not throw any exception, try is printed and the control goes to finally which prints finally.
     After that out is printed.
 */
class TestClass{
    public static void main(String[] args) throws Exception{
       try{
          amethod();
          System.out.println("try ");
       }
       catch(Exception e){
          System.out.print("catch ");
       }
       finally   {
          System.out.print("finally ");
       }
       System.out.print("out ");
    }
    public static void amethod(){ }
 }

public class PrintTryFinallyOut {
   public static void main(String[] args) throws Exception{
      TestClass.main(args);
   }
}