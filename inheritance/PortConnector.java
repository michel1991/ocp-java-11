package inheritance;
import java.io.*;

//Consider the following class:
/**
  Consider the following class: (Below)
  
   You want to write another class CleanConnector that extends from PortConnector.
   Which of the following statements should hold true for CleanConnector class?
   
   A. It is not possible to define CleanConnector that does not throw IOException at instantiation.
        It is possible. You can also throw a superclass of IOException
        from the CleanConnector's constructor. For example, the following is valid:

        class CleanConnector extends PortConnector {
           public CleanConnector(int port) throws Exception {
                 super(port);
           }
        }
   B.  PortConnector class itself is not valid because you cannot throw any exception from a constructor.
    A constructor is free to throw any exception.
    
  C. CleanConnector's constructor cannot throw any exception other than IOException.
        It can throw any exception but it must also declare
        that it throws IOException (or its super class). So the following is valid:
        
        class CleanConnector extends PortConnector {
           public CleanConnector(int port) throws IOException, FileNotFoundException,
                     SomeOtherCheckedException {
                 super(port);
           }
        }
        
   D. CleanConnector's constructor cannot throw any exception other than subclass of IOException.
        As described above, it can throw any exception but it
        must declare that it throws IOException (or its superclass) as well.
   E. CleanConnector's constructor cannot throw any exception other than superclass of IOException.
        As described above, it can throw any exception but it must declare that
        it throws IOException (or its superclass) as well.
    
    F. None of these    
           Observe that the rule for overriding a method is opposite to the rule for constructors.
             An overriding method cannot throw a superclass exception, while a constructor
             of a subclass cannot throw subclass exception (Assuming that the
              same exception or its super class is not present in the subclass constructor's throws clause). For example:
        
                  class A{
                    public A() throws IOException{ }  
                    void m() throws IOException{ }
                  }
                
                  class B extends A{
                    //IOException is valid here, but FileNotFoundException is invalid
                    public B() throws IOException{ }
                
                    //FileNotFoundException is valid here, but Exception is invalid
                    void m() throws FileNotFoundException{ }
                }
            (Note: FileNotFoundException is a subclass of IOException, which is a subclass of Exception)
            If the subclass constructor's throws clause includes the same exception or its superclass, then it can throw any other exception as well.
    
As PortConnector has only one constructor, there is only one way to instantiate it.
Now, to instantiate any subclass of PortConnector, the subclass's constructor should call
super(int). But that throws IOException. And so this exception (or its super class) must be defined
in the throws clause of subclass's constructor. Note that you cannot do something like:

    public CleanConnector(){
    
       //This is WRONG : the call to super, if it exists,
       //must be the first statement in a constructor
       try{ super(); }catch(Exception e){}
    }

Remember: Constructor must declare all the checked exceptions declared
in the base constructor (or the super classes of the checked exceptions).
They may add other exceptions as well. This behavior is exactly opposite from that of methods.
The overriding method cannot throw any checked exception other than what the overridden method throws.
It may throw subclasses of those exceptions as well.

Correct(is F)
    
 */

public class PortConnector{
    public PortConnector(int port) throws IOException{
        //...lot of valid code.
    }
    //...other valid code.
}
