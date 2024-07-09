package io.printStream;
import java.io.*;
import java.nio.file.*;
import io.PathUtility;

public class CreateFile {
    /**
      Given:
      
      Which of the following combinations of the lines of code and their outcome when inserted above, are correct?
      
      A. 
      var pw = new PrintWriter(os);
        pw.write(1);
        Size of the file depends on default character encoding.
        
        --------
        PrintWriter's write method writes a single character to the file. The size in bytes of a character depends
        on the default character encoding of the underlying platform.
        For example, if the encoding is UTF-8, only 1 byte will be written and the size of the file will be 1 byte.
        
      B.  os.write(99);
            A file of size 1 byte will be created.
            
            ---------
            Note that the write(int b) method of various streams based classes such as FileOutputStream
            take an int parameter but write only the low 8 bits (i.e. 1 byte) of that integer.
            
            DataOutputStream provides methods such as writeInt, writeChar, and writeDouble, for writing complete value of the primitives to a file.
            So if you want to write an integer to the file, you should use writeInt(1) in which case a file of size 4 bytes will be created.
            You can read back the stored primitives using methods such as DataInputSream.readInt().
            
            (Note: DataInput/DataOutputStream is not mentioned explicitly in the exam objectives.)
            
        C.
            var bos = new BufferedOutputStream(os);
            var pw = new PrintWriter(bos);
            pw.print(99);
            A file of size 1 byte will be created.
            
            -------
            PrintWriter's print(int) method actually writes the string produced by String.valueOf(int).
            This string is translated into bytes according to the platform's default character encoding,
            and these bytes are written in using the write(int) method.
            
            Therefore, in this case, if the default character encoding is UTF-8, 2 bytes will be written.
            
        D.
           os.writeInt(99);
            A file of size 4 bytes will be created.
            
            --------
            OutputStream does not provide methods for writing primitives. It writes bytes only.
            Therefore, this will not compile.
            
        E.
           var pw = new PrintWriter(os);
            pw.writeInt(1);
            A file of size 4 bytes will be created.
            
            -----------------
            PrintWriter does not provide explicit methods for writing primitives
            (i.e. writeInt, writeBoolean, etc.).
            It has overloaded print methods that take various primitives (i.e. print(int), print(boolean), print(long), and print(char) as arguments).
            Therefore, this will not compile.
           
          Correct(A, B)
     */
    public static void createFile(String name) throws Exception{
        try (
                OutputStream os = new FileOutputStream(name);  ) {
    
            //INSERT CODE HERE
            var pw = new PrintWriter(os);
            pw.write(1);
            
            os.write(99);
    
            //flush and close the streams that are open
        }
        
    }
}