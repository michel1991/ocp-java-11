package exceptions.errors.manyRule;
public class TryAgainFindErrors {
    /**
       What does the following method print?
        A. XAO
        B. XOA
        C. One line of this method contains a compiler error.
        D. Two lines of this method contain compiler errors.
        E. Three lines of this method contain compiler errors.
        F. The code compiles, but a NullPointerException is thrown at runtime.
        G. None of the above

        The code does not compile, so options A, B, and F are incorrect.
        The first compiler error is on line 12.
        
        Each resource in a try-with-resources statement must have its
        own data type and be separated by a semicolon (;).
        
        The fact that one of the references is declared null does not prevent compilation.
        Line 15 does not compile because the variable s is already declared in the method.
        Line 17 also does not compile.
        
        The FileNotFoundException, which inherits from IOException and Exception,
        is a checked exception, so it must be handled in a try/catch block or declared by the method.
        
        Because these three lines of code do not compile,option E is the correct answer.
        Line 14 does compile; since it is an unchecked exception,
        
        it does not need to be caught, although in this case it is caught by the catch block on line 15.
     */
    public void tryAgain(String s) { //   11:
        try(FileReader r = null, p = new FileReader("")) { //  12:
            System.out.print("X"); //     13:
            throw new IllegalArgumentException(); //   14:
        } catch (Exception s) { //  15:
            System.out.print("A"); //   16:
            throw new FileNotFoundException(); //   17:
        } finally { // 18:
            System.out.print("O"); //  19:
        } //   20:
    } //  21:
}