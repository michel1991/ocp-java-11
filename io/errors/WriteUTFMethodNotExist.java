package io.errors;
import java.io.*;
import java.util.*;

public class WriteUTFMethodNotExist {
    /**
     Identify the correct statements about the following code fragment:

        var fw = new FileWriter("c:\\temp\\test.txt");
        var bfw = new BufferedWriter(fw);
        bfw.writeUTF("hello");  //1
        bfw.newLine();  //2
        bfw.write("world");  //3
        
        A. Compilation error at //1.
        B. Compilation error at //2.
        C. Compilation error at //3.
        D. It will compile but will throw an exception at runtime.
        E. It will write "hello" in UTF encoding, followed by a new line, and then "world" in default encoding to test.txt.
        
       -------------------
      B ufferedWriter does not have writeUTF method but it does have newLine and write(String) methods. So the code will fail to compile at //1.
        You should remember that following points:
        1.BufferedWriter only adds the functionality of buffering on top of a Writer.
    It doesn't directly deal with encoding. Encoding is handled by the underlying Writer object.
        2.FileWriter is a concrete subclass of java.io.Writer that writes data to the underlying file in default encoding.
    If you want to write text in a different encoding, you will need to create an OutputStreamWriter with that encoding. For example,
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf8.txt"),
            Charset.forName("UTF-8").newEncoder()  );
        You can then create a BufferedWriter over this OutputStreamWriter.
        
        
        correct(A)

     */
    public static void main(String... args) throws IOException{
        var fw = new FileWriter("c:\\temp\\test.txt");
        var bfw = new BufferedWriter(fw);
        bfw.writeUTF("hello");  //1
        bfw.newLine();  //2
        bfw.write("world");  //3
    }
}