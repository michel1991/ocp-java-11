package nio.errors;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class ReadAttributesWithBasicFileAttributes {
    /**
    * What is the result of executing the following code? (Choose all that apply.)
    *   A. It compiles and runs without issue.
        B. The code will not compile because of line 5.
        C. The code will not compile because of line 6.
        D. The code will not compile because of line 7.
        E. The code will not compile because of line 8.
        F. None of the above

        The method to create a directory in the Files class is createDirectory(), not mkdir().
        For this reason, line 6 does not compile, and option C is correct.
        In addition, the setTimes() method is available only on BasicFileAttributeView,
        not the read-only BasicFileAttributes, so line 8 will also not compile, making option E correct.
     */
   public static void readAttributes(){
       var p = Paths.get("sloth.schedule"); // 4:
       var a = Files.readAttributes(p, BasicFileAttributes.class); //    5:
       Files.mkdir(p.resolve(".backup")); //  6:
       if(a.size()>0 && a.isDirectory()) { //  7:
           a.setTimes(null,null,null); //    8:
       } //  9:
   }
}