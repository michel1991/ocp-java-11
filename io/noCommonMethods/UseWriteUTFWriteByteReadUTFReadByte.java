package io.noCommonMethods;
import java.io.*;

/**
    Consider the following code:

        var s = "hello";
        byte i = 100;
        var fos = new FileOutputStream("c:\\temp\\data.bin");
        var dos = new DataOutputStream(fos);
        //WRITE s to file
        //WRITE i to file
        dos.flush(); dos.close(); fos.close();
    
        var dis = new DataInputStream(new FileInputStream("c:\\temp\\data.bin"));
        //READ s from file
        //READ i from file
    
    
    Which methods should be used to write and read s and i to/from the data.bin file?
    
    A.
      writeString, writeByte and readString, readByte
      ---
        write/readString are not a valid methods in Data[Output|Input]Stream class.
        If you need to write and read Strings, you should use writeUTF and readUTF.
        
    B. writeString, writeInt and readString, readInt
    C. writeChars, writeByte and readChars, readByte
      -----
        There is a writeChars(String ) method in DataOutputStream but there is no readChars in DataInputStream
        
    D. writeUTF, writeByte and readUTF, readByte
    E. writeUTF, writeInt and readUTF, readInt
        While this will work (a byte can always be put in an int) but if you want to read/write a byte,
        you should used read/writeByte method. int will take more space in the file than a byte.
        
        Since the question says, "which methods should be used", this is an incorrect option.
        Had it asked "can" instead of "should", this option would have been correct.

     Correct(D)

 */
public class UseWriteUTFWriteByteReadUTFReadByte {
    public static void main(String... args) throws Exception{
        var s = "hello";
        byte i = 100;
        var fos = new FileOutputStream("c:\\temp\\data.bin");
        var dos = new DataOutputStream(fos);
        //WRITE s to file
        dos.writeUTF(s); 
        //WRITE i to file
        dos.writeByte(i);
        dos.flush(); dos.close(); fos.close();
    
        var dis = new DataInputStream(new FileInputStream("c:\\temp\\data.bin"));
        //READ s from file
        s = dis.readUTF();
        //READ i from file
        i = dis.readByte();
    }
}