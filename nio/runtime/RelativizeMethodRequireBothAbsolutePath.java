package nio.runtime;
import java.nio.file.*;
import java.io.*;


public class RelativizeMethodRequireBothAbsolutePath {
    /**
    Assuming that the current directory is /zoo, what is the output of the following code?
     A. ..
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
   public static void relativizeMixPath() throws IOException{
       var rootPath = System.getProperty("user.dir");
       Path elephanPath = Path.of(rootPath, "nio", "resources", "zoo", "elephant.txt");
       System.out.println(elephanPath );
       // var uri = new File("elephant.txt").toURI();
       var uri = new File(elephanPath.toString()).toURI();
       var path = Paths.get(uri).toAbsolutePath();
       System.out.println(path.relativize(Paths.get("zoo")));
   }


    /**
       What is the output of the following code snippet? Assume that the current directory is the root path /.
        A. ../found/red.zip and ../../locks
        B. /found/red.zip and /found/red.zip/./locks
        C. locks/../found/red.zip and ../found/locks
        D. ../../locks and ../found/red.zip
        E. /found/red.zip and /found/red.zip/locks

        The relativize() method requires that both path values be absolute or relative.
        Based on the details provided, p1 is a relative path, while p2 is an absolute path.
        For this reason, the code snippet produces an exception at runtime, making option F the correct answer.
        If the first path was modified to be absolute by dropping the leading dot (.) in the path expression,
        then the output would match the values in option A.
     */
    static void secondExample(){
        Path p1 = Paths.get("./locks");
        Path p2 = Paths.get("/found/red.zip");
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));
    }

    public static void main(String... args) throws IOException{
       relativizeMixPath();
   }
}