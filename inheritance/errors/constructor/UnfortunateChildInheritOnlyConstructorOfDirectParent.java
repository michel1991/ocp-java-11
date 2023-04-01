
package inheritance.errors.constructors;

/**
 *  What is the output of the following code?
    A. 123
    B. 123followed by an exception stack trace.
    C. 1234
    D. 1234followed by an exception stack trace.
    E. The code does not compile.
    F. None of the above.
    
    The ProblemException class compiles without error. However,
    the MajorProblemException class has, well, a major problem.
    The constructor attempts to call a superclass constructor with a String parameter,
    but the ProblemException class only has a constructor with an Exception parameter.
    This causes a compiler error, which is option E.
 */
class ProblemException extends Exception {
    ProblemException(Exception e) { super(e); }
}
class MajorProblemException extends ProblemException {
    MajorProblemException(String message) { super(message); }
}
class Unfortunate {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print(1);
            throw new MajorProblemException("Uh oh");
        } catch (ProblemException | RuntimeException e) {
            System.out.print(2);
            try {
                throw new MajorProblemException("yikes");
            } finally {
                System.out.print(3);	
            }
        } finally {
            System.out.print(4);
        }
    }
}



 class UnfortunateChildInheritOnlyConstructorOfDirectParent {
  
}