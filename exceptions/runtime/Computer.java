package exceptions.runtime;

/**
 *  What is the output of the following application?
    A. zero
    B. one
    C. zero followed by a stack trace
    D. one followed by a stack trace
    E. Does not compile
    F. None of the above
    
    The code compiles without issue. Line 8 calls the compute() method,
    which throws a NullPointerException on line 4.
    This is caught in the main() method on line 9, since NullPointerException
    is a subclass of RuntimeException,
    printing zero followed by a stack trace to the caller and making option C correct.
 */
public class Computer { // 2: 
    public void compute() throws Exception { //  3: 
        throw new NullPointerException("Does not compute!"); //  4:   
    } //   5:
    public static void main(String[] b) throws Exception { //  6: 
        try { //   7:   
            new Computer().compute(); //   8: 
        } catch (RuntimeException e) { //  9: 
            System.out.print("zero"); //   10: 
            throw e; //   11: 
        } catch (Exception e) { //      12:   
            System.out.print("one"); //     13: 
            throw e; //   14:
        } //   15: 
    } //  16:
}