package nio.foldersContent;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

/**
* The code compiles, so option F is incorrect. The first path simplifies bear/polar with the path symbols removed,
* which means Files.list() is executed on /mammals/bear/polar. The stream operation iterates over the files in the directory,
* rather than the directory tree. For this reason, option A is correct. Note that calling toFile() on a Path instance returns
* a java.io.File object, while toPath() reverses that operation. None of these map() operations, along with the call to normalize(),
* impacts the result.
 */
public class IterateListOfDirectory {
  public static void iterate() throws IOException{
      var s = Path.of("bear/polar/./environment") .normalize().getParent();
      System.out.println(Files.list(s)
        .filter(p -> !Files.isDirectory(p))
        .map(x -> x.toFile())
        .map(w -> w.toPath())
        .map(k -> k.normalize())
        .collect(Collectors.toSet())
        .size());
  }

    public static void main(String... args) throws IOException{
         iterate();
    }
}