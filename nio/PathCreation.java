package nio;
import java.nio.file.*;
import java.net.*;

public class PathCreation {
    /**
    *  Which of the following correctly create NIO.2 Path instances? (Choose all that apply.)
    *   A. Files.getPath("tulip")
        B. Path.of(new URI("rose"))
        C. Paths.get(Path.of("sunflower"))
        D. new java.io.File("orchid").get()
        E. Paths.get("daisy",new String[] {"pink"})
        F. FileSystem.getDefault().getPath("lily")

      Option A is incorrect because the Files class does not contain a method to create a Path instance in this way.
      Option B is correct, as Path includes a static method that takes a URI object to create a Path.
      Option C is incorrect, as Paths.get()accepts only String or URI values, not another Path.
      Option D is incorrect because the method in java.io.File to convert to a Path object is toPath().
      Option E is correct and uses the factory method in the Paths class.
      Remember, the second argument in the version of Paths.get() that takes a String is a vararg, which can be passed as a String array.
      Finally, option F is incorrect because the factory class FileSystems should be used to get the default FileSystem.

     */
    static void firstExample() throws URISyntaxException{
        Path.of(new URI("rose"));
        Paths.get("daisy",new String[] {"pink"});
   }

    public static void main(String... args){

    }
}