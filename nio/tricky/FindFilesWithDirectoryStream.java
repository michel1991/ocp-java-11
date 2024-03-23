package nio.tricky;
import java.nio.file.*;
import java.io.*;

/**
 * Consider the following code:
 
   What should be inserted in the above code so that it will print all the files with extension gif and jpeg?
    A. try{ DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "*.[gif,jpeg]");
    B. try{ DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "*.{gif,jpeg}");
    C. try{ DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "*.gif,*.jpeg");
    D. try{ DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "gif,jpeg");
    
    
    
    Correct (B)
    
 */
public class FindFilesWithDirectoryStream {
    public static void findFiles() throws Exception{
        Path dir = Paths.get("c:\\temp");
    
            try{ DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "*.{gif,jpeg}"); //INSERT CODE HERE
            for(Path p : ds){
                System.out.println(p);
            }
        }
        catch(Exception e){
            e.printStackTrace();
       }
    }
    
    public static void main(String... args) throws Exception {
        findFiles();
    }
}