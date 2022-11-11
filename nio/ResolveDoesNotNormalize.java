package nio;
import java.nio.file.*;

/**
* The code compiles and runs without issue, so option E is incorrect. For this question, you have to remember two things.
*  First, the resolve() method does not normalize any path symbols, so options A and B are not correct. Second,
* calling resolve() with an absolute path as a parameter returns the absolute path, so option C is correct, and option D is incorrect.
 */
public class ResolveDoesNotNormalize {
   public static void main(String... args){
       var path1 = Path.of("/pets/../cat.txt");
       var path2 = Paths.get("./dog.txt");
       System.out.println(path1.resolve(path2));
       System.out.println(path2.resolve(path1));
   }
}