package io.randomAccessFile;
import java.io.*;
import io.PathUtility;

public class PrintHello {
    /**
      Given the following code fragment:
     
      Which of the following options can be inserted in the above code so that it will print hello world?
     
        A. raf.writeString("hello world");
            There is no writeString method in RandomAccessFile.
            
       B. raf.writeChars("hello world");
        Although writeChars(String ) is a valid method in RandomAccessFile,
        it is not suitable here because you want to read the contents in UTF format later.
        writeChars will write the String is default encoding and if you try to read it as UTF, it will throw an exception while reading.
        
       C. raf.writeUTF("hello world");
        Remember that RandomAccessFile implements DataInput as well as DataOutput interfaces.
        Therefore, in this case, you can use raf as an instance of DataOutput and call its writeUTF(String) method.
        
       D. raf.writeData("hello world");
        There is no writeData method in RandomAccessFile.
        
        Correct(C)

     */
    public static void main(String... args) throws IOException{
        var raf = new RandomAccessFile("c:\\temp\\test.txt", "rwd");

        //INSERT CODE HERE
        raf.writeUTF("hello world"); // code

        raf.close();

        var dis = new DataInputStream(new FileInputStream("c:\\temp\\test.txt"));
        String value = dis.readUTF();
        System.out.print(value);
        dis.close();
    }
}