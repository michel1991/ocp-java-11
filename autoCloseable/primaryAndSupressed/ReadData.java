package autoCloseable.primaryAndSupressed;
import java.io.*;

/**
 * Consider the following code snippet :
 
 
   Given that the call to getConnection method in the above code throws a ClassNotFoundException
   and that an IOException is thrown while closing fr1,
  which exception will be received by the caller of readData() method?
  
    A. java.lang.Exception
    B. java.lang.ClassNotFoundException
    C. java.io.IOException
    D. java.lang.RuntimeException
    
    Correct(B)
    
    If an exception is thrown within the try-with-resources block, then that is the exception that the caller gets.
    But before the try block returns, the resource's close() method is called and if the close()
    method throws an exception as well, then this exception is added to the original exception as a supressed exception.

 */


public class ReadData {
    
    static class Connection{

    }
    
    static Connection getConnection() throws ClassNotFoundException{
        return null;
    }
    public void readData(String fileName) throws Exception {
        try(FileReader fr1 = new FileReader(fileName)){
            Connection c = getConnection();
            //...other valid code
        }
    }
}