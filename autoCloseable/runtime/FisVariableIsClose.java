package autoCloseable.runtime;
import java.io.*;

/**
 * Given:
  
  What will be the output?
  
    A. Compilation failure.
    B. Exception at //1.
    
    C. Exception at //2.
        All the resources mentioned in the try-with-resources clause are closed (that is, their close() method
        is invoked by the JVM) at the end of the try block. Thus, when the control enters the finally block,
        the resources are already closed. Therefore, in the given code, a java.io.IOException with message Stream Closed will be thrown at //2.
    
    D. Exception at //3.
    E. Value of the first byte in the file will be printed.
    F. Value of the second byte in the file will be printed.
    
    (Correct C)

 */
class TestClass{
    public static void main(String[] args) throws IOException {

        final InputStream fis = new FileInputStream("c:\\temp\\test.txt");
        long l = 0;
        try(fis){
            l = fis.read();//1
        }finally{
            l = fis.read();//2
        }
        l = fis.read();//3
        System.out.println(l);//4
    }
}

public class FisVariableIsClose {
    public static void main(String[] args) throws IOException {
        TestClass.main(args);
    }
}