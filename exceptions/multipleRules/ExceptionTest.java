package exceptions.multipleRules;
/**
     Given:
    class NewException extends Exception {}
    
    class AnotherException extends Exception {}
    
    public class ExceptionTest{
        public static void main(String[] args)  {
            try{
                if(args.length == 0) m2(); else m3();
            }
            
            *INSERT CODE HERE*
        }
    
        public static void m2() throws NewException { throw new NewException(); }
    
        public static void m3() throws AnotherException{ throw new AnotherException(); }
    
    }
    
    Which of the following options can be inserted in the above code to make it compile?
    
    A. catch(NewException|Exception ne){ }
    
    B.
       catch(Exception|AnotherException ne){ }
        --
        Exceptions mentioned in a multi-catch block must not have any ancestor/successor relationship.

    C.
        catch(NewException|AnotherException ne){ }
        ---
        Order of the exception classes listed in a multi-catch block is not important.
        The only requirement is that they must not have a ancestor/successor relationship.

    D. catch(NewException ne){ }
        catch(AnotherException ne){ }

    E. catch(AnotherException ne){ }
        catch(NewException ne){ }
          --
            If the exceptions are unrelated then the order of the catch blocks doesn't matter.
            Otherwise, catch block for more specific exception (i.e. subclass) must appear before less specific exception (i.e. super class).

  ------------------------------------
  Java 7 onwards, if you have multiple catch blocks for unrelated exceptions
  (i.e. they do not have an ancestor/successor relationship), you can collapse them into a single block. For example,

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
            //i.e. most specific, common super class of all the exceptions in the catch block.
            //In this case, it will be java.lang.Exception
            //because that is the most specific class
            //that is a super class for all the three exceptions.
            e.printStackTrace();
        }
        
        Order of the exception classes listed in a multi-catch block is not important.
        The only requirement is that they must not have a ancestor/successor relationship.
    Correct(C, D, E)
 */
class NewException extends Exception {}

class AnotherException extends Exception {}

public class ExceptionTest{
    public static void main(String[] args)  {
        try{
            if(args.length == 0) m2(); else m3();
        }catch(NewException|AnotherException ne){ }
        
        // *INSERT CODE HERE*
    }

    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }

}