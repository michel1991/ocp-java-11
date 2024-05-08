package exceptions.specifyThrows;

/**
  Consider the following code
   Which of the following statements are valid?
   
   A. Overriding method cannot throw IOException
        An overriding method can only throw either the checked exceptions (and their subclasses)
        listed in the throws clause of the overridden method or decide not to throw any exception at all.
        
        Note that unchecked exceptions (i.e. RuntimeExceptions and Errors) are not required to be listed in a throws clause.
        Thus, any method can declare any unchecked exception in its throws clause.
        The compiler does not check for their compatibility with the exceptions listed in the throws clause of the overridden method.
        
        Since IOException is a checked exception and is not a subclass of NullPointerException, the overriding method cannot throw this exception.
        
   B.  Overriding method can throw Throwable
   
   C. class A will not compile as it is.
        Since 128 does not fit into a byte, "return 128;" will fail to compile.

   D. Overriding method can throw any exception
   
   E. Overriding method may choose not to throw any exception
   
    Correct(A, C, E)

 */
class A
{
    byte getStatusCode(Object obj) throws NullPointerException
    {
        if(obj != null ) return 128;
        else return -1;
    }
}
class B extends A
{
    //override getStatusCode method.
}