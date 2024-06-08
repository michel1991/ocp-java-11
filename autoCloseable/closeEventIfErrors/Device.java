package autoCloseable.closeEventIfErrors;
import java.io.*;

/**
   What will the following code print when compiled and run?
   
   A.
     Device closed 3
    Device closed 2
    Got Exception Can't write!
    
  B.
    Device closed 2
    Device closed 3
    Got Exception Can't write!
    
  C.
    Device closed 1
    Device closed 2
    Device closed 3
    Got Exception Can't write!
    
  D.
    Device closed 1
    Device closed 3
    Device closed 2
    Got Exception Can't write!
    
   E.
    Device closed 3
    Device closed 2
    Device closed 1
    Got Exception Can't write!
    
   ----------------------------------------
       The whole point of a try-with-resource statement is that whatever resource is specified in
       the try with resources block should be closed as soon as the try block ends (i.e. before the control goes to the catch or the finally block)
       irrespective of what happens in the try block.
    
    Thus, close() method will be invoked on all resources specified in the try with resource
    block even through the call to d2.write() throws an exception.
    
    Resources in a try-with-resources statement are closed in the reverse of the order
    in which they are specified in the try() part. In this case, three resources have been specified - d1, d2, and d3 in that order
    (d1 is not instantiated in the try with resource block, but that is ok) and so,
    the close() method will be invoked on d3, d2, and d1 (observe that it is the reverse order)
    as soon as the control goes out of the try block, which happens upon a call to d2.write() because this call throws an exception.
    
    The d1.close() statement present in the try block is not executed because of the exception thrown by the previous statement.
    (If d1.close(); appeared before d2.write(), it would have been invoked
    and you would have seen an additional "Device closed 1" before the given output.)
    correct(E)

 */
public class Device implements AutoCloseable{
    boolean open = false;
    int index;
    public Device(int index){
        this.index = index;
        open = true;
    }
    
    public void write() throws IOException{
        throw new RuntimeException("Can't write!");
    }
    
    public void close(){
        open = false;
        System.out.println("Device closed "+index);
    }
    
    public static void main(String[] args) {
        Device d1 = new Device(1);
        try(d1;
            Device d2 = new Device(2);
            Device d3 = new Device(3)){
            d2.write();
            d1.close();
        }catch(Exception e){
            System.out.println("Got Exception "+e.getMessage());
        }
    }
}