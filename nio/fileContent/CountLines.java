package nio.fileContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import nio.NioUtilities;
import java.nio.charset.Charset;
import java.util.*;

public class CountLines {
    
    /**
       What can be inserted in the following code at //1 so that it will print the number of lines present in the given file?
       
       A. 
       Stream<String> ref = new BufferedReader(new FileReader("c:\\temp\\test.txt"))
           .lines();
           ----
           The lines() method has been added to java.io.BufferedReader in Java 1.8. It returns Stream<String>.
           
        B.
            Stream<String> ref = new BufferedReader(
         new FileReader(Paths.get("c:\\temp\\test.txt"))).lines();
            ---
                FileReader does not have a constructor that takes a Path object. It has the following three constructors:
                FileReader(File file)
                Creates a new FileReader, given the File to read from.
                FileReader(FileDescriptor fd)
                Creates a new FileReader, given the FileDescriptor to read from.
                FileReader(String fileName)
                Creates a new FileReader, given the name of the file to read from.
                
         C.
             Stream<String> ref = new BufferedReader(new FileReader("c:\\temp\\test.txt"))
                .readLines();
                ------
            There is no readLines method in BufferedReader. There is a readLine method but it returns only one line.

        D.  Stream<String> ref = Files.lines("c:\\temp\\test.txt");
               ----
                Files.lines(Path path) method expects a Path object as an argument (not a String). The following would have been valid:
                Stream<String> ref = Files.lines(Paths.get("c:\\temp\\test.txt"));
                
           Correct(A)
     */
    public void countLines(String filePath) throws Exception{
        //1
        
        var resourcePath = Path.of(
                NioUtilities.getResourcePath().toString(),
                "fileContent",
                "countLines",
                "c",
                "temp",
                "test.txt"
        ).toString();
        
        // Stream<String> ref = new BufferedReader(new FileReader("c:\\temp\\test.txt")) // orifinal
        Stream<String> ref = new BufferedReader(new FileReader("c:\\temp\\test.txt"))
           .lines();
       System.out.println(ref.count());
    }
    
    public static void main(String... args) throws Exception{
        
    }
}