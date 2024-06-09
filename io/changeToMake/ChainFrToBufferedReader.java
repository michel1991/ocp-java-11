package io.changeToMake;
import java.io.*;
/**
 Given:
    public static void reader(String fileName1) throws Exception{
        try (var fr = new FileReader(fileName1);) {
            int charRead = 0;
            while ((charRead = fr.read()) != -1) {
                System.out.println("Read char " + charRead);
            }
        }
    }
    
    What can be done to the above code to make it read Strings instead of chars?
    A.
      Chain fr to a StringReader and use its readString method.
        ------
        While StringReader is a valid class but it creates a Reader out of a String. It does not read Strings from a Reader. For example:
        StringReader sr = new StringReader("some long string");
        
    B.
       Use fr.readString instead of fr.read.
        -----
        FileReader doesn't provide higher level methods for reading Strings.

    C.
       Chain fr to a BufferedReader use its readLine method
       ----
        A Reader can be chained to a BufferedReader to read Strings. BufferedReader has readLine method that returns a String.
        
    D. Chain fr to a DataReader and use its readLine method.
       ----
        There is no such class as DataReader.
        There is a java.io.DataInputStream though,  which lets an application read primitive Java data types
        from an underlying input stream in a machine-independent way.
        An application uses a java.io.DataOutputStream to write data that can later be read by a java.io.DataInputStream.
        
     Correct(C)
 */
public class ChainFrToBufferedReader {
    public static void reader(String fileName1) throws Exception{
        try (var fr = new BufferedReader(new FileReader(fileName1));) {
            String charRead = null;
            while ((charRead = fr.readLine()) != null) {
                System.out.println("Read char " + charRead);
            }
        }
    }
}