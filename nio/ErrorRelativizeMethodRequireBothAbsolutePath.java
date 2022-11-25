package nio;
import java.nio.file.*;
import java.io.*;

/**
* Assuming that the current directory is /zoo, what is the output of the following code?
*  A. ..
   B. ../zoo
   C. The code will not compile because of line 5.
   D. The code will not compile because of line 6.
   E. The code will not compile because of line 7.
   F. The code compiles but throws an exception at runtime.

   The code compiles without issue, so options C, D, and E are incorrect.
   The code throws an exception at runtime on line 7, making option F correct.
   Remember, when using relativize(), both paths must be absolute or both relative—the two types cannot be mixed.
   For this reason, option F is correct.
   Note that if the last line were changed to use the absolute path /zoo, the answer would be option A since the path from /zoo/elephant to /zoo is the .. path symbol.
 */
public class ErrorRelativizeMethodRequireBothAbsolutePath {
   public static void relativizeMixPath() throws IOException{
       var rootPath = System.getProperty("user.dir");
       Path elephanPath = Path.of(rootPath, "nio", "resources", "zoo", "elephant.txt");
       System.out.println(elephanPath );
       // var uri = new File("elephant.txt").toURI();
       var uri = new File(elephanPath.toString()).toURI();
       var path = Paths.get(uri).toAbsolutePath();
       System.out.println(path.relativize(Paths.get("zoo")));
   }

    public static void main(String... args) throws IOException{
       relativizeMixPath();
   }
}