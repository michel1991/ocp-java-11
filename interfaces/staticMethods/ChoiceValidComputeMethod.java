package interfaces.staticMethods;

/**
    A. void compute();
    --------------
     All interface methods have to be either public or private.
     No access control keyword in the method declaration also means public in an interface.
     (Note that the absence of access control keyword in the method declaration in a class means package protected.)
     
    B. public void compute();
    
    C. public final void compute();
    ------------------------
        final is not allowed.
        
    D. static void compute();
         An interface can have a static method but the method must have a body in that case.
         --------------------
         
    E. protected void compute();
        All interface methods have to be either public or private.
        
     Correct(A, B)

 */
public interface ChoiceValidComputeMethod {
    void compute();
}