package nio.cleanPathAndNotCleanPath;
import java.nio.file.*;

public class NormalizeRelativePath {

    /**
     Assuming the current directory is /seals/harp/food, what is the result of executing the following code?
        A. 0
        B. 1
        C. 2
        D. 3
        E. 4
        F. The code compiles but throws an exception at runtime.

      The normalize() method does not convert a relative path into an absolute path; therefore,
      the path value after the first line is just the current directory symbol.
      The for() loop iterates the name values, but since there is only one entry,
     the loop terminates after a single iteration. Therefore, option B is correct.
     */
   public static void countNumberOfPath(){
       final Path path = Paths.get(".").normalize();
       int count = 0;
       for(int i=0; i<path.getNameCount(); ++i) {
           count++;
       }
       System.out.println(count);
   }


    public static void main(String... args){
       countNumberOfPath();
   }
}