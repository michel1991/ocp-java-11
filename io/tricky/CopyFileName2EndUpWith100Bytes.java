package io.tricky;
import java.io.*;
import io.PathUtility;
import static io.PathUtility.*;
import java.nio.file.*;

/**
   Given the following method:
   
       public static void copy(String fileName1, String fileName2) throws Exception{
        try (
                InputStream is = new FileInputStream(fileName1);
                OutputStream os = new FileOutputStream(fileName2);  ) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        }
    }    
    
    What will happen fileName1 contains only 100 bytes and fileName2 contains 200 bytes?
    
    A. An exception will be thrown while reading from the file.
    B. An exception will be thrown while writing to the file.
    C.  fileName2 will end up with 300 bytes.
    D. fileName2 will end up with 200 bytes.
    E. fileName2 will end up with 100 bytes.
    
    --------------------------------------------------------------
    1. InputStream.read() fills the buffer with the bytes actually read. So even if the buffer is larger than the available number
    of bytes, it is not a cause for any exception.
    2. When you create a FileOutputStream without specifying the append mode (which can be true or false), it overwrites the existing fil
    Correct(E)

 */
public class CopyFileName2EndUpWith100Bytes {
    public static void copy(String fileName1, String fileName2) throws Exception{
        try (
            InputStream is = new FileInputStream(fileName1);
            OutputStream os = new FileOutputStream(fileName2);  ) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        }
    }
    
    public static void main(String... args) throws Exception{
        Path fileName1 = Path.of(getResourcePath().toString(), "fileName1100Bytes.txt");
        Path fileName2 = Path.of(getResourcePath().toString(), "fileName2100Bytes.txt");
        copy(fileName1.toString(), fileName2.toString());
    }
}