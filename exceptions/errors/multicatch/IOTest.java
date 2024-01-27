package exceptions.errors.multicatch;

/**
 * Given that the user account under which the following code is
  run does not have the permission to access a.java, what will the the following code print when run?
 
   A. It will run without any exception and without any output.
   B. It will print a stack trace for AccessDeniedException.
   C. It will print a stack trace for IOException.
   D. It will print a stack trace for NoSuchFileException.
   
   E. It will not compile because the catch clause is invalid.
    NoSuchFileException and AccessDeniedException are subclasses of IOException.
    You cannot include classes that are related by inheritance in the same multi-catch block.
    Remember that BufferedReader.close
    (which is called automatically at the end of the try-with-resources block)
    and BufferedReader.readLine methods throw java.io.IOException.
    
    F. It will not compile because AccessDeniedException is not a valid exception class in java.nio.file package.
    It is a valid class.
    
    (Correct is E)
    
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;

public class IOTest {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(
                new FileReader("c:\\works\\a.java"))){
            String line = null;
            while( (line = bfr.readLine()) != null){
                System.out.println(line);
            }
        }catch(
                NoSuchFileException|IOException|AccessDeniedException e){
            e.printStackTrace();
        }
    }
}