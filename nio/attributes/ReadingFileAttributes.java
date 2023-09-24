package nio.attributes;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
import static nio.NioUtilities.*;
public class ReadingFileAttributes {
   /**

     Assuming that the file baboon.txt exists and is not a symbolic link,
     what are possible results of executing the following code? (Choose all that apply.)
     
       A. It prints true.
       B. It prints false.
       C. It prints a file size.
       D. It changes the last modified date of a file.
       E. An exception is thrown at runtime.
       F. None of the above, as the code does not compile.

       The code compiles, so option F is incorrect.
       Since the file is given to exist and is not a symbolic link,
       calling isDirectory() on it will print false,
       making option B correct and option A incorrect.
       
       Option C is also correct, as the behavior of the size()
       method on a regular file (as opposed to a directory) is well defined.
        Options D and E are incorrect.
       The result of passing null values to setTimes() is that the file times will not be modified.
    */
  public static void readFileAttributes() throws IOException{
       var rootPath = System.getProperty("user.dir");
       var fileLocation = getResourcePath().toString();
       //var path = Path.of(rootPath, "nio", "baboon.txt");
      var path = Path.of(fileLocation, "baboon.txt");
      
      var view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
      var r = view.readAttributes();
      System.out.println(r.isDirectory());
      System.out.println(r.size());
      view.setTimes(null,null,null);
  }

    public static void main(String... args) throws IOException{
       System.out.println(System.getProperty("user.dir"));
      readFileAttributes();
    }
}