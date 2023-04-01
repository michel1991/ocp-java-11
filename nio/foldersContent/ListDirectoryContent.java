package nio.foldersContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
public class ListDirectoryContent {

  /**
  * What are some possible results of executing the following code? (Choose all that apply.)
      A. It prints some files in the root directory.
      B. It prints all files in the root directory.
      C. FileSystemLoopException is thrown at runtime.
      D. Another exception is thrown at runtime.
      E. The code will not compile because of line u1.
      F. The code will not compile because of line u2.

      The code compiles without issue, so options E and F are incorrect.
      The toRealPath() method will simplify the path to /animals and throw an exception if it does not exist, making option D correct.
      If the path does exist, calling getParent() on it returns the root directory.
      Walking the root directory with the filter expression will print all .java files in the root directory (along with all .java files in the directory tree),
      making option A correct. Option B is incorrect because it will skip files and directories that do not end in the .java extension.
      Option C is also incorrect as Files.walk() does not follow symbolic links by default.
      Only if the FOLLOW_LINKS option is provided and a cycle is encountered will the exception be thrown.
   */
  public static void printContent() throws IOException{
      var rootPath = System.getProperty("user.dir");
      //var x = Path.of( rootPath, "nio",  "/animals/fluffy/..");
      var x = Path.of( rootPath, "nio",  "animals/fluffy/..");
      //var x = Path.of( rootPath, "nio",  "animals", "fluffy", "..");
      //System.out.println(" here "+ rootPath+"/nio/animals/fluffy/..");
      //var x = Path.of(rootPath+"/nio/animals/fluffy/..");
     // System.out.println(" parent " + x.toRealPath()+ " parent " + x.toRealPath().getParent());
      //System.out.println(" parent " + x.toRealPath().getParent() + " " + x);
      Files.walk(x.toRealPath().getParent()) // u1
            .map(p -> p.toAbsolutePath().toString()) // u2
            .filter(s -> s.endsWith(".txt")) // u3 or java
            .collect(Collectors.toList())
            .forEach(System.out::println);
  }

    public static void main(String... args) throws IOException{
      printContent();
   }
}