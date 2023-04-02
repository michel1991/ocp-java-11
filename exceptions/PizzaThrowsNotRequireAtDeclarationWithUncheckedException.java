package exceptions;
/**
 *  What is the result of compiling and running the following application?
    A. java.lang.IllegalArgumentException is printed.
    B. The code does not compile because of line h1.
    C. The code does not compile because of line h2.
    D. The code does not compile because of line h3.
    E. The code does not compile because of line h4.
    F. The code compiles, but a stack trace is printed at runtime.
    
    While this code looks a bit strange, it does compile.
    An exception can be passed to a method or set as the return type of a method.
    In this case, the exception passed to the order() method
    is thrown and caught on line h4. The output is just the name of the class, making option A correct.
 */
class Pizza {   
    Exception order(RuntimeException e) {          // h1
        throw e;                                    // h2
    }   
    public static void main(String... u) {
        var p = new Pizza();
        try {
            p.order(new IllegalArgumentException()); // h3
        } catch(RuntimeException e) {               // h4
            System.out.print(e);
        }
    }
}
public class PizzaThrowsNotRequireAtDeclarationWithUncheckedException {
    public static void main(String... u) {
        Pizza.main(u);
    }
}