package nio.fileContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import nio.NioUtilities;
import java.nio.charset.Charset;
/**
     Given that the file test.txt is accessible and contains multiple lines,
     which of the following code fragments will correctly print all the lines from the file?
     
  A.
     Stream<String> lines = Files.find(Paths.get("test.txt"));
       ---
        lines.forEach(System.out::println);
        Files.find method returns a stream of Path objects. The following is the correct signature for the find method.
        public static Stream<Path> find(Path start, int maxDepth,
           BiPredicate<Path,BasicFileAttributes> matcher,
           FileVisitOption... options) throws IOException
        Return a Stream that is lazily populated with Path by searching for files in a file tree rooted at a given starting file.
        
  B.
    BufferedReader bfr = new BufferedReader(new FileReader("test.txt"));
        System.out.println(bfr.readLines());
        ---
        There is no readLines method in BufferedReader. There is a readLine method but it returns only one line.
        Here are a couple of correct ways to print lines using a BufferedReader:
        
        while(bfr.ready()){
            System.out.println(bfr.readLine());
        }
        
        String line = null;
        while( (line = bfr.readLine()) != null){
            System.out.println(line);
        }
       
  C.
     Stream<String> lines = Files.list(Paths.get("test.txt"));
    lines.forEach(x->System.out.println(x));
    --
    The usage of Files.list method is correct but it returns a stream of Path objects for files contained in a directory.
    Unlike the Files.find method, the list method doesn't search for files. It just returns all the files in a given directory.
    
    If you change the code to Stream<Path> lines = Files.list(Paths.get("c:\\temp\\test.txt"));,
     it will compile but will throw java.nio.file.NotDirectoryException because test.txt is not a directory.
     
  D.
     Stream<String> lines = Files.lines(Paths.get("test.txt"));
    lines.forEach(System.out::println);
        
  E.
     Stream<String> lines = Files.lines(Paths.get("test.txt"), Charset.defaultCharset());
        lines.forEach(s -> System.out.println(s));

  -------------------
       Options 4 and 5 illustrate the use of two Files.lines methods.
      One takes just a Path and the second list method allows you the specify the charset of the source file as well.
    correct (D, E)

 
 */
public class PrintContentOfTestTxtFile {
    
    static void responseD(String ressourcePath) throws Exception{
        Stream<String> lines = Files.lines(Paths.get(ressourcePath,  "test.txt"));
        lines.forEach(System.out::println);
    }
    
    static void responseE(String ressourcePath) throws Exception{
        Stream<String> lines = Files.lines(Paths.get(ressourcePath, "test.txt"), Charset.defaultCharset());
        lines.forEach(s -> System.out.println(s));
    }
    public static void main(String... args) throws Exception{
        var resourcePath = Path.of(NioUtilities.getResourcePath().toString(), "fileContent", "printContentOfTestTxtFile").toString();
        responseD(resourcePath);
        responseE(resourcePath);
    }
}