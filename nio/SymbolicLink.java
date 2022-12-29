package nio;
import java.nio.file.*;
import java.io.*;
public class SymbolicLink {
    /**
        Assume /kang exists as a symbolic link to the directory /mammal/kangaroo within the file system.
        Which of the following statements are correct about this code snippet? (Choose all that apply.)

        A. A new directory will always be created.
        B. A new directory may be created.
        C. If the code creates a directory, it will be reachable at /kang/joey.
        D. If the code creates a directory, it will be reachable at /mammal/joey.
        E. The code does not compile.
        F. The code will compile but always throws an exception at runtime.

        The code snippet will attempt to create a directory if the target of the symbolic link exists and is a directory.
        If the directory already exists, though, it will throw an exception.
        For this reason, option A is incorrect, and option B is correct.
        It will be created in /mammal/kangaroo/joey, and also reachable at /kang/joey because of the symbolic link,
        making option C correct.
     */
  static void createDirectoryWithSymbolicLink() throws IOException{
        var path = Paths.get("/kang");
        if(Files.isDirectory(path) && Files.isSymbolicLink(path))
            Files.createDirectory(path.resolve("joey"));
  }
}