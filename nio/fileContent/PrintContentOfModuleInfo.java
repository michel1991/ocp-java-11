package nio.fileContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import nio.NioUtilities;
import java.nio.charset.Charset;
import java.util.*;

/**
    Given:
        String INPUT_FILE = "c:\\temp\\src\\foo.bar\\module-info.java";
        
        Assuming the file exists, which of the following options will print the contents of the file?
        
        A. Files.lines(INPUT_FILE).forEach(System.out::println);
        
        B.
           Stream<String> lines = Files.lines(Paths.get(INPUT_FILE));
            lines.forEach(System.out::println);
            
       C.
            Stream<String> lines = Files.readAllLines(Paths.get(INPUT_FILE));
            lines.forEach(System.out::println);
            ---
            Files.readAllLines returns List<String>
            
      D.
         List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE));
          lines.forEach(System.out::println);
          
      E.
        List<String> lines = Files.lines(Paths.get(INPUT_FILE));
        lines.forEach(System.out::println);
          ---
        Files.lines returns Stream<String>.

      F.
         String[] stra = Files.readLines(Paths.get(INPUT_FILE));
        for(String s: stra) System.out.println(s);
        -----
        There is a Files.readString(Path ) method that reads the whole file into a String. But there is no method that returns a String[].
        
       -----
       Correct(B, D)
 */
public class PrintContentOfModuleInfo {
    //static String INPUT_FILE = "c:\\temp\\src\\foo.bar\\module-info.java";
    static String INPUT_FILE = "c/temp/src/foo.bar/module-info.java";
    static void responseB(String resourcePath) throws Exception{
        Stream<String> lines = Files.lines(Paths.get(resourcePath, INPUT_FILE));
        lines.forEach(System.out::println);
    }
    
    static void responseD(String resourcePath) throws Exception{
        List<String> lines = Files.readAllLines(Paths.get(resourcePath, INPUT_FILE));
        lines.forEach(System.out::println);
    }
    public static void main(String... args) throws Exception{
        var resourcePath = Path.of(NioUtilities.getResourcePath().toString(), "fileContent", "printContentOfModuleInfo").toString();
        responseB(resourcePath);
        responseD(resourcePath);
    }
}