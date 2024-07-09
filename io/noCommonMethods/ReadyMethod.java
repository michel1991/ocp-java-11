package io.noCommonMethods;
import java.io.*;
import java.nio.file.*;
import io.PathUtility;


/**
  Given that the file test.txt contains :
    12345678
    What will the following code print when compiled and run
    
    A. It will not compile.
        There is no problem with the code.
        
    B. It will throw an exeception when run.
    C. It will print just 2
    D. It will run without any exception but will not print anything.
    E. It will print 2468
        The ready method just checks if there are more bytes available to read.
        The skip method skips the given number of characters i.e. it basically moves the file pointer one character ahead.
        The read method reads one character.
        
        Overall, the code simply skips one character after reading each character. Therefore, it prints 2468.
        
    Correct(E)
 */
public class ReadyMethod {
    public static void main(String[] args) throws Exception{
        var builder = PathUtility.getResourcePathIO();
        
        var resourcePath = Path.of(
                builder.toString(),
                "noCommonMethods",
                "readyMethod",
                "c",
                "temp",
                "test.txt"
        ).toString();
        
        try(
            // var fis = new FileInputStream("c:\\temp\\test.txt"); // original
            var fis = new FileInputStream(resourcePath);
            var isr = new InputStreamReader(fis)){
            while(isr.ready()){
                isr.skip(1);
                int i = isr.read();
                char c = (char) i;
                System.out.print(c);
            }
        }
    }
}