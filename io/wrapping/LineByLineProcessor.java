package io.wrapping;
import java.io.*;
import static io.PathUtility.*;

/**
 * A programmer is writing a small component that processes a file line by line. The following is the code :
    Which of the given options will declare and initialize handle appropriately?
    
    A.
      Reader handle = new FileReader(fullFilePath);
        Reader does not have high level methods such as readLine().

    B.
       BufferedReader handle = new BufferedReader(fullFilePath);
        A BufferedReader can only be created using a Reader such as FileReader. It cannot directly operate on a file.
        
    C.
      BufferedReader handle = new BufferedReader(new File(fullFilePath));
        A BufferedReader can only be created using a Reader such as FileReader. It cannot directly operate on a file
    D.
      BufferedReader handle = new BufferedReader(new FileReader(fullFilePath));
        This is a correct way to create a BufferedReader.

    E. BufferedReader handle = new BufferedReader(new FileReader( new File(fullFilePath)));
        FileReader(String) and FileReader(File), both are valid ways to create a FileReader.
        
      -----------------------------
      A Reader such as a FileReader provides only low level operations such as reading a single character or array of characters.
      It does not understand the notion of "lines".
    BufferedReader "decorates" Reader to provide higher level method readLine() by buffering characters.
    It is an efficient way of reading characters, character arrays, and lines.

The same relationship exists between FileWriter and BufferedWriter but for writing.
        correct(D, E)
 */
public class LineByLineProcessor {
    
    public void processLines(String fullFilePath) throws Exception
    {
        // declare and initialize "handle" here
        BufferedReader handle = new BufferedReader(new FileReader(fullFilePath));
        BufferedReader handleResponseE = new BufferedReader(new FileReader( new File(fullFilePath)));
        
        String str = null;
        while( (str = handle.readLine()) != null)
        {
            System.out.println("Processing line : "+str);
        }
        handle.close();
    }
}