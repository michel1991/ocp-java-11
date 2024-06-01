package exceptions.specifyThrows;

/**
    Assume that a method named 'method1' contains code which may raise a non-runtime (checked) Exception.
    What is/are the possible way(s) to declare this method so that it indicates that it expects the caller to handle that exception?
    
    A. public void method1() throws Throwable
    
    B. public void method1() throw Exception
        Note that it should be 'throws' and not 'throw'
        
    C. public void method1() throw new Exception
         This is not the right syntax.
         
    D. public void method1() throws Exception
    E. public void method1()
        Non runtime exception must be declared in the throws clause.
        
     --------------
     *Correct(A, D)

 */
public class RaisedCheckedException {
    public void method1() throws Throwable{
        
    }
}