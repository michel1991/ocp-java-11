package exceptions.errors.badSynthax;
import java.io.*;

/**
  What will be the result of compiling and running the following program ?

    class NewException extends Exception {}
    
    class AnotherException extends Exception {}
    
    public class ExceptionTest{
        public static void main(String[] args) throws Exception{
            try{
                m2();
            }
            finally{
                m3();
            }
            catch (NewException e){}
        }
    
        public static void m2() throws NewException { throw new NewException(); }
    
        public static void m3() throws AnotherException{ throw new AnotherException(); }
    
    }
    
    A. It will compile but will throw AnotherException when run.
    B. It will compile but will throw NewException when run.
    C. It will compile and run without throwing any exceptions.
    D. It will not compile.
        Because a catch block cannot follow a finally block!
    E. None of the above.
    
    ----------------------------------------------------------
    Syntax of try/catch/finally is:
        
        try{
        }
        catch(Exception1 e) {... }
        catch(Exception2 e) {... }
        ...
        catch(ExceptionN e) {... }
        finally { ...  }
        
        With a try, either a catch and or finally or both can occur.
        A try MUST be followed by at least one catch or finally. (Unless it is a try with resources statement).
        
        In Java 7, if you have multiple catch blocks for unrelated exceptions (i.e. they do not have an ancestor/successor relationship),
        you can collapse them into a single block. For example,
        
        try {     
            ...
        }
        catch (SQLException se) {     }
        catch (IOException ie) {     }
        catch (RuntimeException e) {     }
        
        can be replaced with:
        
        try {     
            ...
        }
        catch (SQLException | IOException | RuntimeException e) {     
            //In this block, the class of the actual exception object will be
            //whatever exception is thrown at runtime.
            //But the class of the reference e will be the closest,
            // i.e. most specific, common super class of all the exceptions in the catch block.
            //In this case, it will be java.lang.Exception
            //because that is the most specific class
            //that is a super class for all the three exceptions.
            e.printStackTrace();
        }
        
        Order of the exception classes listed in a multi-catch block is not important.
        The only requirement is that they must not have a ancestor/successor relationship.
     correct(D)

 */
class NewException extends Exception {}

class AnotherException extends Exception {}

public class ExceptionTest{
    public static void main(String[] args) throws Exception{
        try{
            m2();
        }
        finally{
            m3();
        }
        catch (NewException e){}
    }

    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }

}