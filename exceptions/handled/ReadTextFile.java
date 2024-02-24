package exceptions.handled;
import java.io.*;

public class ReadTextFile {
    /**
     * Given:
          public static void main(String[] args){
           FileInputStream tempFis = null;
            try(FileInputStream fis = new FileInputStream("c:\\temp\\test.text")){
                System.out.println(fis);            
                tempFis = fis;
            }
            //line 1
            
            Which of the following options can be inserted at //1 independent of each other to make the above code compile?
            
            A. finally{  tempFis.close(); }
                The IOException thrown from the try clause is not being caught and is not declared in the throws clause either.
                Further, since the close() method also throws IOException, that exception
                also remains unhandled. Therefore, this code won't compile.
                
            B. catch(IOException|NullPointerException e){ }
            
            C. catch(IOException ioe){ }
              Note that if an IOException is actually thrown by the code inside the try block,
              the catch block will be executed after the resource is closed i.e. after fis.close() is invoked.
              If there is an exception while opening the resource within the try-with-resource argument,
              then that exception will be caught by the appropriate catch close if it is present.
              No attempt to close that resource will be made
            
        
            
            D. catch(IOException|FileNotFoundException e){ }
                The exceptions listed in a multi-catch clause must not be in a subclass relationship with each other.
                Since FileNotFoundException is a subclass of IOException, this code won't compile.
                
            catch(IOException e){ }
                finally{  tempFis.close(); }
                The close() method on FileInputStream declares that it may throw IOException.
                So, the exception from the call to tempFis.close(); remains unhandled
                
          Remember that methods that deal with the file system, such as opening, reading,
          and closing a file, declare that they throw java.io.IOException.
          IOException is a checked exception. It has several subclasses. Two of the commonly
          used subclasses are FileNotFoundException and EOFException.
          
              Correct(B, C)
                
     */
    
    static void responseB(){
        FileInputStream tempFis = null;
        try(FileInputStream fis = new FileInputStream("c:\\temp\\test.text")){
            System.out.println(fis);            
            tempFis = fis;
        }catch(IOException|NullPointerException e){
            
        }
        
    }
    
    static void responseC(){
        FileInputStream tempFis = null;
        try(FileInputStream fis = new FileInputStream("c:\\temp\\test.text")){
            System.out.println(fis);            
            tempFis = fis;
        }catch(IOException ioe){ }
    }
    public static void main(String... args){
        
    }
}