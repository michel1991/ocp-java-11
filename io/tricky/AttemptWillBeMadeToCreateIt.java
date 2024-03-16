package io.tricky;
import java.io.*;
import io.PathUtility;

public class AttemptWillBeMadeToCreateIt {
    /**
     *  Given the following code:
     *
         Which of the following statements are correct?
        (Assume that the code has appropriate security permissions.)
        
        A. If the file test.txt does not exist, an attempt will be made to create it.
        B. If the file test.txt does not exist, an exception will be thrown.
        C. If the file test.txt exists, an exception will be thrown.
        D. If the file test.txt exists, it will be overwritten and all the existing data will be lost.
          Only the initial 5 characters (i.e. 10 bytes) of the file will be overwritten.
          Any existing data beyond the first 10 bytes will be left untouched.
       F. If the file test.txt exists, the given characters will be appended to the end of the existing data.
         When you open the file, the file pointer is at the first position. So the given characters will be written at the beginning of the file.
         
        The permitted values for the access mode and their meanings are:

        "r": Open for reading only. Invoking any of the write methods of the resulting object will cause an IOException to be thrown.
        "rw": Open for reading and writing. If the file does not already exist then an attempt will be made to create it.
        
        "rws": Open for reading and writing, as with "rw", and also require that every update to the file's
        content or metadata be written synchronously to the underlying storage device.
        
        "rwd": Open for reading and writing, as with "rw", and also require that every update to the file's content
         be written synchronously to the underlying storage device.
        
        You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/8f928l8dJ6Q
        (Correct  A)
     */
    
    public static void main(String... args) throws IOException{
        var raf = new RandomAccessFile("c:\\temp\\test.txt", "rwd");
        raf.writeChars("hello");
        raf.close();
    }
}