package exceptions.choiceHandleException;
import java.io.*;

/**
 Given:
    import java.io.FileNotFoundException;
    import java.io.IOException;
    
    public class Scrap {
        public static void main(String[] args) {
            try{
                if(args.length == 0) m2(); else m3();
            }
            
            INSERT CODE HERE
    
        }
    
        public static void m2() throws IOException { throw new FileNotFoundException(); }
    
        public static void m3() throws IndexOutOfBoundsException{
              throw new IndexOutOfBoundsException(); }
    }
    
    Assuming that the above code is always invoked with at least one argument, what can be inserted in the above code to make it compile?
     A.
      catch(IOException e){ }
        IndexOutOfBoundsException extends RuntimeException and is therefore an unchecked exception.
        A catch block is not needed for unchecked exceptions.
        
     B.
       catch(FileNotFoundException fe){ }
       ---
        The compiler checks a method signture to determine what exceptions a method call might generate.
        Here, m2() says it might throw IOException and so, provision must be made for IOException.
        
       Even though, inside the code, we know that it throws FileNotFoundException, which is a subclass of IOException,
       the compiler doesn't know about that because the compiler doesn't execute the code.
       Also, the developer is free to change m2's code to throw IOException because he has already declared it in the throws clause.
       
     C. catch(IOException|IndexOutOfBoundsException e){ }

     D. catch(FileNotFoundException|IndexOutOfBoundsException e){ }

     E. catch(RuntimeException re){ }

  -------------------------------
    The number of arguments given while execution is immaterial for the compiler.
    Compiler checks the code based on the information available at compile time and not at run time.
    Therefore, it has to consider either of m2() or m3() getting invoked at run time.
    
    Correct(A, C)

 */
public class Scrap {
    public static void main(String[] args) {
        try{
            if(args.length == 0) m2(); else m3();
        }catch(IOException|IndexOutOfBoundsException e){ }

        
        //INSERT CODE HERE

    }

    public static void m2() throws IOException { throw new FileNotFoundException(); }

    public static void m3() throws IndexOutOfBoundsException{
          throw new IndexOutOfBoundsException(); }
}