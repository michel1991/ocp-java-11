package autoCloseable;
import java.io.IOException;

/**
 * What exception will be thrown out of the main method when the following program is run?
   A. java.lang.Exception
   B. java.lang.RuntimeException
   C. java.io.IOException
   D.  The given code will not compile.
   (Correct A)
   
   If an exception is thrown within the try-with-resources block,
   then that is the exception that the caller gets. But before the try block returns,
   the resource's close() method is called and if the close() method throws an exception as well,
   then this exception is added to the original exception as a supressed exception.
   The following output obtained by running the given program explains how this works:

Closing device
Exception in thread "main" java.lang.Exception: test
    at trywithresources.Device.main(Device.java:28)
    Suppressed: java.lang.RuntimeException: rte
        at trywithresources.Device.close(Device.java:23)
        at trywithresources.Device.main(Device.java:29)

 */
public class Device implements AutoCloseable{
    String header = null;
    public void open() throws IOException{
        header = "OPENED";
        System.out.println("Device Opened");
        throw new IOException("Unknown");
    }

    public String read() throws IOException{
        return "";
    }

    public void close(){
        System.out.println("Closing device");
        header = null;
        throw new RuntimeException("rte");
    }

    public static void main(String[] args) throws Exception {
        try(Device d = new Device()){
            throw new Exception("test");
        }
    }

}