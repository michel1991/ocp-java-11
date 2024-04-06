package classInitialization.initializerError;

/**
  What will happen when the following code is compiled and run?
 
    A. It will throw NullPointerException at runtime.
    B. It will throw ArrayIndexOutOfBoundsException at runtime.
    C. It will throw ExceptionInInitializerError at runtime.
        The following is the output when the program is run:
        java.lang.ExceptionInInitializerError
        Caused by: java.lang.ArrayIndexOutOfBoundsException: 0
                at AX.<clinit>(SM.java:6)
        Exception in thread "main"
        Java Result: 1
        
        Note that the program ends with ExceptionInInitializerError because any exception thrown
        in a static block is wrapped into ExceptionInInitializerError and then that ExceptionInInitializerError is thrown.
        Remember that a static or instance initializer can only throw a RuntimeException.
        
        If you try to throw a checked exception from a static block to the outside, the code will not compile.
        
        An instance block is allowed to throw a checked exception but only if that exception is declared
        in the throws clause of all the constructors of the class.
        
    D. It will not compile.
    
    Even though the line x[0] = 10; will throw java.lang.ArrayIndexOutOfBoundsException,
    JVM will wrap it and rethrow java.lang.ExceptionInInitializerError.
    (Correct C)

 */
class AX{
    static int[] x = new int[0];
    static{
        x[0] = 10;
    }
    public static void main(String[] args){
        var ax = new AX();
    }
}
