package interfaces.usesCase;

/**
    Consider the following interface definition:
    
    Several similar default methods need to be added to this interface and each method
    is supposed to log a message at the start of the method.
    As of now, the logging is done using just a println statement but it may change later.
    
    What changes can be done in the above interface to make it more maintainable without
    exposing any non-business functionality to the users of this interface?
    
    A.  Add a public void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
        Although it would work but it would expose the log method also.
        We do not want that as it has nothing to do with the business functionality of the interface.
    
    B. Add a protected void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
        Interfaces still do not allow protected methods.
        
    C. Add a private void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
    
    D.Add a static void log(String msg) method to write the log message and invoke it from other methods instead of using println statement.
        Although it would work but it would expose the log method also.
        Remember that, in an interface, lack of access modifier means the method or the field is public.
    
    Correct(C)
 */
interface Measurement{
    public default int getLength(){
        System.out.println("getting length");
        return 10;
    };
    public default int getBreadth(){
        System.out.println("getting length");
        return 20;
    };
}