package nio.foldersContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
/**
* Assume that the current directory is /mammals and the directories and files referenced by the code snippet exist. What is the expected result of executing the following code snippet?
*   A. The number of unique files in a directory is printed.
    B. The number of unique files in the directory tree is printed.
    C. The size of the directory is printed.
    D. A NullPointerException is thrown.
    E. A different exception is thrown.
    F. None of the above, as the code does not compile.

    The code compiles, so option F is incorrect.
    The first path simplifies bear/polar with the path symbols removed, which means Files.list() is executed on /mammals/bear/polar.
    The stream operation iterates over the files in the directory, rather than the directory tree.
    For this reason, option A is correct.
    Note that calling toFile() on a Path instance returns a java.io.File object, while toPath() reverses that operation.
    None of these map() operations, along with the call to normalize(), impacts the result.
 */
public class NumberUniqueFilesInADirectory {
   public static void numberUniqueFileInDirectoryPrinted() throws IOException{
       var rootPath = System.getProperty("user.dir");
       // var s = Path.of("bear/polar/./environment") .normalize().getParent();
       Path path = Path.of(rootPath, "nio", "resources", "bear/polar/./environment");
       // System.out.println(path);
       var s = path.normalize().getParent();
       // System.out.println(s);
       System.out.println(Files.list(s)
       .filter(p -> !Files.isDirectory(p))
       .map(x -> x.toFile())
       .map(w -> w.toPath())
       .map(k -> k.normalize())
       .collect(Collectors.toSet())
       .size());

   }

    public static void main(String... args) throws IOException{
       numberUniqueFileInDirectoryPrinted();
   }
}