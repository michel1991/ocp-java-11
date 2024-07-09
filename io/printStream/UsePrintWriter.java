package io.printStream;
import java.io.*;
import java.nio.file.*;
import io.PathUtility;

/**
   Which of the following method implementations will write a boolean value to the underlying stream?
   
   A.
      public void usePrintWriter(PrintWriter pw){
            boolean bval = true;
            pw.writeBoolean(bval);
        }
        --------
        PrintWriter does not have write<Primitive> methods such as writeInt, writeBoolean, WriteLong.
        It has overloaded print methods for writing various primitives
        
   B.
       public void usePrintWriter(PrintWriter pw) throws IOException{
            boolean bval = true;
            pw.write(bval);
        }
        ----------------
        PrintWriter does not have write(boolean ) method.
        It does have write(String), write(int ), write(char[] ) methods.
        It also has write(char[] buf, int off, int len) and write(String buf, int off, int len) methods that let you write a portion of the input buf.
        
   C.
      public void usePrintWriter(PrintWriter pw) throws IOException{
        boolean bval = true;
        pw.print(bval);
    }
     ------
    Although the throws IOException clause is not required here, it is not invalid.
    
   D.
      public void usePrintWriter(PrintWriter pw) {
        boolean bval = true;
        pw.print(bval);
    }
    
   E.
      public void usePrintWriter(PrintWriter pw) {
            boolean bval = true;
            pw.println(bval);
        }
        
       ---------
       
       Remember that none of PrintWriter's print or write methods throw I/O exceptions (although some of its constructors may).
       This is unlike other streams, where you need to include exception handling (i.e. a try/catch or throws clause) when you use the stream.
       Correct(C, D, E)
 */
public class UsePrintWriter {
    public void usePrintWriterResponseC(PrintWriter pw) throws IOException{
        boolean bval = true;
        pw.print(bval);
    }
    
    public void usePrintWriterResponseD(PrintWriter pw) {
        boolean bval = true;
        pw.print(bval);
    }
    
    public void usePrintWriterE(PrintWriter pw) {
        boolean bval = true;
        pw.println(bval);
    }
}