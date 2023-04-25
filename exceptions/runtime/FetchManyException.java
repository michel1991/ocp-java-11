package exceptions.runtime;

/**
  Which statement about the following program is correct?
    A. One exception is thrown to the caller at runtime.
    B. Two exceptions are thrown to the caller at runtime.
    C. More than two exceptions are thrown to the caller at runtime.
    D. The class does not compile because of the play() method.
    E. The class does not compile because of the main() method.
    F. None of the above.
    
    The program compiles, making options D and E incorrect. At runtime,
    line 12 is executed, calling the play() method.
    Line 5 then throws an exception that is immediately caught on line 6.
    Line 7 throws a new unchecked exception that is not caught by the program,
    with this exception being thrown to the caller, and making option A correct.
    In this case, line 13 is never executed.
    Even though the stack trace for the exception
    may include information about the cause,
    only one exception is actually thrown to the caller.
 */
   class Fetch { // 2:
    public int play(String name) throws RuntimeException { //  3:
        try { //  4:   
            throw new RuntimeException(name); //   5: 
        } catch (Throwable e) { //   6:
            throw new RuntimeException(e); //  7: 
        } //  8:  
    } //   9: 
    public static final void main(String[] ball)  //  10: 
         throws RuntimeException { // 11: 
        new Fetch().play("Webby"); //   12:  
        new Fetch().play("Georgette"); //   13: 
    } //   14:  
} //   15:

public class FetchManyException {
    public static final void main(String[] ball)  //  10: 
         throws RuntimeException {
        Fetch.main(ball);
    }
        
}