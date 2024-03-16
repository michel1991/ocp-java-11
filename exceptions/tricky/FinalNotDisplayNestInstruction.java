package exceptions.tricky;
/**
 * What will be the output of the following program:
 *
    A. The program will print m1 Starts.
    B. The program will print m1 Starts, 1 and 4, in that order.
    C. The program will print m1 Starts, 1 and 2, in that order.
    D. The program will print m1 Starts, 1, 2 and 4 in that order.
    E. END will not be printed.
    
    Correct(A, B, E)
    
    The IndexOutOfBoundsException is handled by the first catch block. Inside this block, a new NullPointerException is thrown.
    As this exception is not thrown inside the try block, it will not be caught by any of the remaining catch blocks.
    It will actually be sent to the caller of the main() method after the finally block is executed. (Hence '4' in the output.)

    The code that prints END is never reached, since the NullPointerException remains uncaught after the execution of the finally block.
    
    At the end a stack trace for the NullPointerException will be printed.
    
 */

 class TestClass{
    public static void main(String args[]){
        try{
            m1();
        }catch(IndexOutOfBoundsException e){
            System.out.println("1");
            throw new NullPointerException();
        }catch(NullPointerException e){
            System.out.println("2");
            return;
        }catch (Exception e) {
            System.out.println("3");
        }finally{
            System.out.println("4");
        }
        System.out.println("END");
    }

    static void m1(){
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException( "Big Bang " );
    }
}

public class FinalNotDisplayNestInstruction{
    public static void main(String args[]){
        TestClass.main(args);
    }
}