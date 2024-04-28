package exceptions.finallys;

/**
 * What will be the result of compiling and running the following program ?
    A. It will compile but will throw AnotherException when run.
    B. It will compile but will throw NewException when run.
    C. It will compile and run without throwing any exceptions.
    D. It will not compile.
    E. None of the above.
    
    Correct(A)
    m2() throws NewException, which is not caught anywhere. But before exiting out of the main method,
    finally must be executed. Since finally throw AnotherException (due to a call to m3() ),
    the NewException thrown in the try block ( due to call to m2() ) is ignored and AnotherException is thrown from the main method.

 */
class NewException extends Exception {}
class AnotherException extends Exception {}
class ExceptionTest{ // public 
    public static void main(String [] args) throws Exception{
        try{
            m2();
        }
        finally{ m3(); }
    }
    public static void m2() throws NewException{  
                throw new NewException();  }
    public static void m3() throws AnotherException{  
                throw new AnotherException();  }
}

public class ThrowAnotherException {
    public static void main(String [] args) throws Exception{
        ExceptionTest.main(args);
    }
}