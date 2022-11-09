package nio;
import java.nio.file.*;
import java.io.*;

/**
* The code compiles without issue, so options D and E are incorrect.
* The method Files.isSameFile() first checks to see whether the Path values are the same in terms of equals().
* Since the first path is relative and the second path is absolute, this comparison will return false, forcing isSameFile()
*  to check for the existence of both paths in the file system. Since we know /zoo/turkey does not exist, a NoSuchFileException is thrown,
* and option F is the correct answer. Options A, B, and C are incorrect since an exception is thrown at runtime.
 */
public class ErrorIsSameCheckFileInFileSystem {
  public static void main(String... args) throws IOException{
      Path path = Paths.get("turkey");
      if(Files.isSameFile(path,Paths.get("/zoo/turkey"))) // z1
          Files.createDirectories(path.resolve("info"));
  }
}