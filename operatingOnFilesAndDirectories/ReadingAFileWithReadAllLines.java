package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;
import java.util.*;

class ReadingAFileWithReadAllLines{
  static void make() throws IOException{
    String mainDirectory = "folderReadAllLineOfFile";	   
    String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory ;

     var path = Path.of( fullPathSource, "animals", "gopher.txt");
     final List<String> lines = Files.readAllLines(path);
    lines.forEach(System.out::println);
  }

  public static void main(String... args) throws IOException{
       make();
   }
}
