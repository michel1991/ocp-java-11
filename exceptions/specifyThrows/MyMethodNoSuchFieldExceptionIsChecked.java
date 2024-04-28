package exceptions.specifyThrows;
public class MyMethodNoSuchFieldExceptionIsChecked {
    /**
     * Consider the following code fragment:
       Which of the following is a valid throws clause for the above method?
       
        A. No throws clause is necessary.
        B. throws ClassNotFoundException, NoSuchFieldException
        C. throws ClassNotFoundException
        D. throws NoSuchFieldException
        E. throws Exception
        
        __________________
        ClassNotFoundException and NoSuchFieldException are checked exceptions (they extend from java.lang.ReflectiveOperationException,
        which extends from java.lang.Exception) and are thrown when you use Java reflection mechanism to load a class and access its fields.
        Both extend from
        For example:
        
        Class c = Class.forName("test.MyClass"); //may throw ClassNotFoundException
        java.lang.reflect.Field f = c.getField("someField"); //may throw NoSuchFieldException
        
        If it is possible for the code inside a method to cause an uncaught checked exception to be thrown,
        then the method signature must include those exceptions (or their common super class) in its throws clause.
        In this case, ClassNotFoundException and NoSuchFieldException are siblings and so,
        throws ClassNotFoundException, NoSuchFieldException or throws ReflectiveOperationException would be valid throws clauses for the given method.
        
        Note that the catch(RuntimeException e) block will not be able to catch either
        of the exceptions because RuntimeException is not a superclass of either of them (catch(Exception e) or catch(Throwable t),
        on the other hand, would be able to catch both of them.) Thus, if the code inside the try block throws either of these two exceptions,
        it will propagate outside the method.
        
        Correct(B, E)
        
     */
    public static void myMethod(int x)  throws ClassNotFoundException, NoSuchFieldException //Specify throws clause here
        {
            try{
                if(x == 0){
                    throw new ClassNotFoundException();
                }
                else throw new NoSuchFieldException();
            }catch(RuntimeException e){
                throw e;
            }
        }
}