package exceptions.suppressed;

/**
 * What will the following code print when run?
   A. It will print Exception from m1
   B. It will print Exception from finally
   C.  It will not print any thing.
   D. It will print a stack trace for a NullPointerException.
   
   Explanation:
   In the given code, method m2() throws an exception explicitly from the catch block as well as from the finally block.
   Since this is an explicit finally block (and not an implicit finally block that is created when you use a try-with-resources statement),
   the exception thrown by the finally block is the one that is thrown from the method. The exception thrown from the catch block is lost.
   It is not added to the suppressed exceptions list of the exception thrown from the finally block.

    Therefore, e.getSuppressed() returns an array with 0 elements and nothing is printed.

    Had the code for m2() been something like this:
    
        public static void m2() throws Exception{
            try( SomeResource r ... ){
                m1();
            }
        }
    Now, if m1() throws an exception and r.close() also throws an exception,
    the exception thrown by m1 would have been the one thrown by the method m2 and the exception thrown by r.close()
    would have been added to the list of suppressed exception of the exception thrown from the try block.


    Note that the try-with-resource was enhanced in Java 9 and it now allows you to use a variable declared
    before the try statement in the try-with-resource block. For example, the following is valid since Java 9:
    
    Statement stmt = c.createStatement();
    try(stmt){
    ...
    }
    However, try(stmt = c.createStatement();) is still invalid.
    Correct(C)

 */
class TestClass { // public 
    public static void m1() throws Exception{
        throw new Exception("Exception from m1");
    }
    public static void m2() throws Exception{
        try{
            m1();
        }catch(Exception e){
            //Can't do much about this exception so rethrow it
            throw e;
        }finally{
            throw new RuntimeException("Exception from finally");
        }
        
    }
    
    public static void main(String[] args) {
        try{
            m2();
        }catch(Exception e){
            Throwable[] ta = e.getSuppressed();
            for(Throwable t : ta) {
                System.out.println(t.getMessage());
            }
        }
    }   
}

public class TestClassPrintAnything {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}