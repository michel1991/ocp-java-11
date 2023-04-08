package nio.changeLocation.runtime;
import java.nio.file.*;
import java.io.*;

public class AwayBaseballCopyNewLocationExist {
    /**
     * Assuming /away/baseball.txt exists and is accessible,
     * what is the expected result of executing the following code snippet?
        A. A new file /home/baseball.txt is created.
        B. A new file /home/away/baseball.txt is created.
        C. The code does not compile.
        D. The code compiles, but an exception is printed at runtime.
        E. The output cannot be determined until runtime.
        F. None of the above.
        
     After calling createDirectories(), the directory /home is guaranteed to exist if it does not already.
     The second argument of the copy() command should be the location of the new file,
     not the folder the new file is placed in.
     Therefore, the program attempts to write the file to the path /home.
     Since there is already a directory at that location, a FileAlreadyExistsException is thrown at runtime, making option D correct.
     */
  static void makeCopy() throws IOException{
      var p1 = Path.of("baseball.txt");
      var p2 = Path.of("/home");
      var p3 = Path.of("/away");
      Files.createDirectories(p2);
      Files.copy(p3.resolve(p1),p2);
      
  }
}