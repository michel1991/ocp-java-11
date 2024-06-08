package exceptions.finallys;

/**
    Which digits and in what order will be printed when the following program is run?
    A. The program will print 5.
    B. The program will print 1 and 4, in that order.
    C. The program will print 1, 2 and 4, in that order.
    D. The program will print 1, 4 and 5, in that order.
    E. The program will print 1,2, 4 and 5, in that order.
    
    --------------------
    
      Division by 0 throws a java.lang.ArithmeticException, which is a RuntimeException.
      This is caught by the first catch clause because it is the first block that can handle ArithmeticException.
      This prints 1. Now, as the exception is already handled, control goes to finally which prints 4 and then the try/catch/finally
      ends and 5 is printed.
      Remember : finally is always executed even if try or catch return; (Except when there is a call to System.exit method in try or catch.)
        Correct(D)

 */
class TestClass{ // public 
    public static void main(String args[]){
        int k = 0;
        try{
            int i = 5/k;
        }
        catch (ArithmeticException e){
            System.out.println("1");
        }
        catch (RuntimeException e){
            System.out.println("2");
            return ;
        }
        catch (Exception e){
            System.out.println("3");
        }
        finally{
            System.out.println("4");
        }
        System.out.println("5");
    }
}
public class Print145 {
    public static void main(String args[]){
        TestClass.main(args);
    }
}