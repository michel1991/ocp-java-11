package io.noCommonClass;
import java.io.*;
import java.nio.file.*;
import io.PathUtility;

/**
   Given:
   
   Which of the following combinations of the lines of code and their outcome when inserted above, are correct?
   
   A.
     DataOutputStream dos = new DataOutputStream(os);
    dos.write(1);
    A file of size 4 bytes will be created. (with choice)
    
    ------
    Note that the write(int b) method of various binary stream based classes such as this
    one take an int parameter but write only the low 8 bits (i.e. 1 byte) of that integer.
    DataOutputStream provides methods such as writeInt, writeChar, and writeDouble,
    for writing complete value of the primitives to a file.
    So if you want to write an integer to the file, you should use writeInt(1) in which case a file of size 4 bytes will be created.
    You can read back the stored primitives using methods such as DataInputStream.readInt().
   
   B.
      os.write(1);
     A file of size 1 byte will be created. (with choice)

   C.
     BufferedOutputStream bos = new BufferedOutputStream(os);
    DataOutputStream dos = new DataOutputStream(bos);
    dos.write(1);
    A file of size 1 byte will be created. (with choice)
    
        -----
        Creation of a BufferedOutputStream is not really required here but it is not invalid.

   D.
       os.writeInt(1);
        A file of size 4 bytes will be created. (with choice)
        
        -------
        OutputStream does not provide methods such as writeInt, writeShort, writeDouble for writing primitives.
        So, this statement will not compile.
        You can only write bytes using OutputStream. It does have write(int ), but it writes only the byte part of the int and not the given int value.
    
    ----------------------------------------------------------------    
    OutputStream has the following methods for writing :
    void write(byte[] b)
    Writes b.length bytes from the specified byte array to this output stream.
    
    void write(byte[] b, int off, int len)
    Writes len bytes from the specified byte array starting at offset off to this output stream.
    
    abstract void write(int b)
    Writes the specified byte to this output stream.
    
    Correct(B, C)
   
 */
public class CreateFile {
    public static void createFile(String name) throws Exception{
        try (
                OutputStream os = new FileOutputStream(name);  ) {
    
            //INSERT CODE HERE
             os.write(1);
             
             BufferedOutputStream bos = new BufferedOutputStream(os);
             DataOutputStream dos = new DataOutputStream(bos);
             dos.write(1);
    
            //flush and close the streams that are open
        }
        
    }
    
    public static void main(String... args) throws Exception{
        var builder = PathUtility.getResourcePathIO();
        
        var resourcePath = Path.of(
                builder.toString(),
                "noCommonClass",
                "createFile",
                "test.txt"
        ).toString();
    }
}