package overloadWhithoutInheritance.constructors;

/**
 Given a class named Test, which of these would be valid definitions for a constructor for the class?
    A. Test(Test b) { }
        The constructor can take the same type as a parameter.
        
    B. Test Test( ) { }
        A constructor cannot return anything.
        
    C. private final Test( ) { }
        A constructor cannot be final, static or abstract.
        
    D. void Test( ) { }
        A constructor cannot return anything. Not even void.
        
    E. public static void Test(String args[ ] ) { }
        A constructor cannot be final, static or abstract.
        
     Correct(A)
 */
public class Test {
    Test(Test b) {
        
    }
}