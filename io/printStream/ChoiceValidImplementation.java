package io.printStream;
import java.io.*;
import java.nio.file.*;
import io.PathUtility;

/**
   Which of the following are valid method implementations?
   
   A.
     public void outputText(PrintWriter pw, String text){
        try{
            pw.write(text);
        }catch(IOException e){
            System.out.println("exception in writing");
        }
     }
     
     --
       This will not compile because the code in the try block does not throw any exception and therefore the catch block is unreachable.
   B.
      public void outputText(PrintWriter pw, String text){
        pw.write(text);
        if(pw.checkError()) System.out.println("exception in writing");
      }
      ---
       Note that none of the PrintWriter's methods throw any I/O exceptions because they supress the errors in writing
       and set an internal flag for error status instead.
        The checkError method returns true if there has been a problem in writing.
        
   C.
     public void outputText(PrintWriter pw, String text){
        boolean flag = pw.write(text);
        if(!flag) System.out.println("exception in writing");
    }
      --
     All the write and print methods of PrintWriter return void. Therefore, this code will not compile.
    
   D.
       public void outputText(PrintWriter pw, String text){
        pw.printf(text).print("success");
    }
        PrintWriter has printf(Locale l, String format, Object... args) and printf(String format, Object... args)
        methods that allow you to format the input before printing. These methods return the same
        PrintWriter object so that you can chain multiple calls as shown in this option.
    
   E.
      public void outputText(PrintWriter pw, String text){
        pw.println(text).println("success");
    }
        Although PrintWriter does have a println(String ) method, it returns void. Thus, you cannot chain anything to it.
        
        Note that the println methods of PrintWriter cause the data written in the stream to be flushed if automatic flushing is enabled.
        
        You can set the autoflush behaviour by using PrintWriter(OutputStream out, boolean autoFlush) constructor while creating a PrintWriter.
       
   
   Correct(B, D)
 */
public class ChoiceValidImplementation {
    public void outputTextResponseB(PrintWriter pw, String text){
        pw.write(text);
        if(pw.checkError()) System.out.println("exception in writing");
    }
    
    public void outputTextResponseD(PrintWriter pw, String text){
        pw.printf(text).print("success");
    }
    
    public static void main(String... args){
        
    }
}