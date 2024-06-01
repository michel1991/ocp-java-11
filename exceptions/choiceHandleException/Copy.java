package exceptions.choiceHandleException;
import java.io.*;

/**
   Consider the following method code:
   
   What can be inserted at //LINE 100 to make the method compile?
   
   A.
    Exception|IOException
        IOException is a subclass of Exception. You cannot include classes that are related by inheritance in the same multi-catch block.
        
   B. FileNotFoundException|SecurityException|IllegalArgumentException
      ----
        Note that most commonly used methods in Java API that deal with reading or writing files have java.io.IOException
        in their throws clause. So you must handle this exception.
        At run time, more specific exceptions such as FileNotFoundException are actually thrown depending on the actual cause of the problem.
        
   C. FileNotFoundException|IOException
        FileNotFoundException is a subclass of IOException. You cannot include classes that are related by inheritance in the same multi-catch block.


   D. IOException|RuntimeException

   E. IOException|NoSuchFileException
        Remember that java.io.IOException is a superclass of all exceptions under java.nio.file package.
        This combination, therefore, is invalid.
   Correct(D
 */
public class Copy {
    public static void copy(String records1, String records2) {
        try (
                InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);  ) {  

            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        }
        catch ( IOException|RuntimeException e ) { //LINE 100 *INSERT CODE HERE*  e 
        }
        
    }
}