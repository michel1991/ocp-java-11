package io.choiceExceptionThrows;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.nio.charset.*;

/**
   Given the following code (assume appropriate imports):
   
   What will be printed when this code is run if test.txt doesn't exist?
   
    A. java.io.FileNotFoundException: test.txt
    B. java.nio.file.FileNotFoundException: test.txt
    
    C. java.nio.file.NoSuchFileException: test.txt
        This exception will be thrown when the program tries to create a BufferedReader to read the file specified by the Path object.
        
    D. java.nio.file.InvalidPathException : test.txt
        This exception is thrown when the argument passed while creating Path object is invalid.
        For example, "c:c:test.txt". In the given code, the path string is valid, so this exception will not be thrown.
        
        The existence of the file is not checked at the time of creation of Path object.
        
    ----------------------------------------------------------------- 
    Note that java.io.FileNotFoundException may be thrown by FileInputStream, FileOutputStream, and RandomAccessFile constructors
    if the file by the given name does not exist.
    
    Correct(C)
 */
public class IOTest {
    public static void main(String[] args) {
        var myfile = Paths.get("test.txt");
        try(var bfr = Files.newBufferedReader(myfile, Charset.forName("US-ASCII") )){
            String line = null;
            while( (line = bfr.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}