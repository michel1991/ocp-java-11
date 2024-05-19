package io.reader;
import java.io.*;
import io.PathUtility;

/**
   Given:
   Assuming that the fle named aaa.a does not exist, what will be the outcome?
   
   A. An exception will be thrown at line marked //1.
    --------------------------
     A java.io.FileNotFoundException will be thrown upon doing new FileReader("aaa.a");
    
    Note that making the reader variable final is not important here. The code will compile with as well as without it.
    
    B. An exception will be thrown at line marked //2.
    C. An exception will be thrown at line marked //3.
    D. An exception will be thrown at line marked //4.
    E. It will fail to compile.
    
    ------------
     Correct (A)

 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        final Reader reader = new FileReader("aaa.a");  //1
        try(reader){
            reader.read(); //2
        }finally{
            reader.read(); //3
        }
        reader.read(); //4
    }
}