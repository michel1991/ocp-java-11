package io.writers;
/**
  Consider the following code:
  Which of the following statements are correct?
  
    A. It will throw an exception if  text.txt does not exist.
    B. It will create text.txt file in the filesystem if it does not exist.
    C. It will not throw an exception if text.txt does not exist and it will not create a file either because nothing is being written to the file.
         It will create an empty file.
    D. It will throw an exception if //1 is uncommented and if text.txt does not exist.
     If the file does not exist, it will be created and data will be written to it.
    E. It will throw an exception if text.txt already exists.
        If the file already exists, it will be overwritten with a new file.
        To append to the existing file, the following constructor should be used.
         public FileWriter(String fileName,  boolean append)
         
        Correct(E)
 */
import java.io.*;
public class Test{
public static void main(String[] args)  throws Exception {
       var fw = new FileWriter("text.txt");
       // fw.write("hello"); //1
       fw.close();
   }
}