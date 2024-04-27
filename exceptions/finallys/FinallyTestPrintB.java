package exceptions.finallys;
/**
 * What letters, and in what order, will be printed when the following program is compiled and run?
    A. It will print C and B, in that order.
    B. It will print A and B, in that order.
    C. It will print B and throw Exception.
    D. It will print A, B and C in that order.
    E. Compile time error.
  
    
    An exception is thrown in method m1() so println("A") will not be executed.
    As there is no catch block, the exception will not be handled and the main() method will throw the exception to the caller.
    Therefore, println("C"); will also not be executed.
    'finally' block is always executed (even if there is a return in try but not if there is a call to System.exit ) so println("B") is executed.
    
      Correct(C)
 */
class FinallyTest{ // public 
    public static void main(String args[]) throws Exception{
        try{
            m1();
            System.out.println("A");
        }
        finally{
            System.out.println("B");
        }
        System.out.println("C");
    }
    public static void m1() throws Exception { throw new Exception(); }
}
public class FinallyTestPrintB {
    public static void main(String args[]) throws Exception{
        FinallyTest.main(args);
    }
}