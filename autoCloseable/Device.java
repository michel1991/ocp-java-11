package autoCloseable; //  package trywithresources; original
import java.io.IOException;

/**
  What will be printed when the following code is compiled and run?
  A.
    Device Opened
    Device closed
    Got Exception
    ----------------------
    Catch and finally blocks are executed after the resource opened in try-with-resources is closed.
    Therefore, Device Closed will be printed before Got Exception.
    
  B.
    Device Opened
    Got Exception
    Device closed
    
  C.
    Device Opened
    Got Exception
    
  D.
    The code will not compile.
     There is no issue with the code
  
  ----------------------------------
  Note that the try-with-resource was enhanced in Java 9 and it now allows you to use a
  variable declared before the try statement in the try-with-resource block. For example, the following is valid since Java 9:

    Device d = new Device();
    try(d){
        ...
    }
    
    However, try(d = new Device();) is still invalid.
  Correct(A)
 */
public class Device implements AutoCloseable{
    String header = null;
    public void open(){
        header = "OPENED";
        System.out.println("Device Opened");
    }
    public String read() throws IOException{
        throw new IOException("Unknown");
    }
    
    public void writeHeader(String str) throws IOException{
        System.out.println("Writing : "+str);
        header = str;
    }
    public void close(){
        header = null;
        System.out.println("Device closed");
    }
    
    public static void testDevice(){
        Device d = new Device();
        try(d){
            d.open();
            d.read();
            d.writeHeader("TEST");
            d.close();
        }catch(IOException e){
            System.out.println("Got Exception");
        }
    }
    public static void main(String[] args) {
        Device.testDevice();
    }
    
}