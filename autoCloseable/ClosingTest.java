package autoCloseable;
import java.io.*;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Consider the following program:
   Identify the correct statements.
   
    A. The FileWriter object will always be closed before the FileReader object.
     Resources are closed automatically at the end of the try block in reverse order of their creation.
     
    B. The order of the closure of the FileWriter and FileReader objects is platform dependent and should not be relied upon.
        The order is defined. They are always closed in the reverse order.
        
    C. The FileWriter object will not be closed if an exception is thrown while closing the FileReader object.
        The close method is called on all the resources one by one even if any resource throws an exception in its close method.
        
    D. This is not a fail safe approach to managing resources because in certain situations one or both of the resources may be left open after the end of the try block.
        This is the right approach.
        The close method will be called automatically on all the resources that were opened even if any exception is thrown any where.
       
     Correct(A)
 */
public class ClosingTest {
    public static void main(String[] args) throws Exception {
        try(FileReader fr = new FileReader("c:\\temp\\license.txt");
            FileWriter fw = new FileWriter("c:\\temp\\license2.txt") )
        {
            int x = -1;
            while( (x = fr.read()) != -1){
                fw.write(x);
            }
        }
    }
}
