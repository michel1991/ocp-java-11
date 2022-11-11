package nio;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
public class ReadingFileAttributes {
   /**
   * The code compiles, so option F is incorrect.
   * Since the file is given to exist and is not a symbolic link, calling isDirectory() on it will print false,
   * making option B correct and option A incorrect.
   * Option C is also correct, as the behavior of the size() method on a regular file (as opposed to a directory) is well defined.
   * Options D and E are incorrect. The result of passing null values to setTimes() is that the file times will not be modified.
    */
  public static void readFileAttributes() throws IOException{
       var rootPath = System.getProperty("user.dir");
       var path = Path.of(rootPath, "nio", "baboon.txt");
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