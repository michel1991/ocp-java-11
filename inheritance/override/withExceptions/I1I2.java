package inheritance.override;
import java.io.*;

/**
      interface I1
    {
        void m1() throws java.io.IOException;
    }
    interface I2
    {
        void m1() throws java.io.FileNotFoundException;
    }
    
    Which of the following are valid method declarations for a class that says it implements I1 and I2 ?
    
    A. Both, public void m1() throws FileNotFoundException; and public void m1() throws IOException;
    B. public void m1() throws FileNotFoundException
         FileNotFoundException is a subclass of IOException, so this option satisfies both the interfaces.
    C.The class cannot implement both the interfaces as they have conflicting methods.
    D. public void m1() throws Exception;
    E. None of the above.
    
    -----------------------------------------
    When interfaces are involved, more than one method declaration may be overridden by a single overriding declaration.
    In this case, the overriding declaration must have a throws clause that is compatible with ALL the overridden declarations.
     correct (B)

 */

interface I1
    {
        void m1() throws java.io.IOException;
    }
    interface I2
    {
        void m1() throws java.io.FileNotFoundException;
    }
public class I1I2 implements I1, I2{
    public void m1() throws FileNotFoundException{
        
    }
}