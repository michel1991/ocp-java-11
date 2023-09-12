package exceptions.errors;


/**
 * Which exception classes, when inserted into the blank in the Problems class, allow the code to compile?
    A. Exception
    B. RuntimeException
    C. MissingFoodException
    D. MissingMoneyException, MissingFoodException
    E. MissingMoneyException
    F. None of the above
    
    The classes MissingMoneyException and MissingFoodException do not extend any exception classes;
    therefore, they cannot be used in a method declaration.
    The code does not compile regardless of what is placed in the blank,
    making option F correct.
 */
class MissingMoneyException {}
class MissingFoodException {}
class Problems {
    public void doIHaveAProblem() 
         throws MissingMoneyException, MissingFoodException {
        System.out.println("No problems");
    }
    public static void main(String[] s) throws  MissingMoneyException { // just to failed compiled MissingMoneyException  ______________
        try {
            final Problems p = new Problems();
            p.doIHaveAProblem();
        } catch (Exception e) {
            throw e;
        } } }

public class ProblemsChoiceExceptionsToThrows {
    
}