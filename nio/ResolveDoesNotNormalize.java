package nio;
import java.nio.file.*;


public class ResolveDoesNotNormalize {

    /**
        The code compiles and runs without issue, so option E is incorrect. For this question, you have to remember two things.
        First, the resolve() method does not normalize any path symbols, so options A and B are not correct. Second,
         calling resolve() with an absolute path as a parameter returns the absolute path, so option C is correct, and option D is incorrect.
     */
    static void firstExample(){
        var path1 = Path.of("/pets/../cat.txt");
        var path2 = Paths.get("./dog.txt");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
    }

    /**
     *  What is the output of the following code snippet? Assume that the current directory is the root path.
        A. /lost/blue.txt and /lost/blue.txt/keys
        B. /found/../keys/./lost/blue.txt and /lost/blue.txt/keys
        C. /found/../keys/./lost/blue.txt and keys
        D. /lost/blue.txt and /lost/blue.txt/./found/../keys
        E. The code does not compile.
        F. None of the above.

        First, p2 is an absolute path, which means that p1.resolve(p2) just returns p2.
        For this reason, options B and C are incorrect.
        Since p1 is a relative path, it is appended onto p2, making option D correct and option A incorrect.
        Option A would be correct if normalize() was applied.
     */
    static void secondExample(){
        Path p1 = Path.of("./found/../keys");
        Path p2 = Paths.get("/lost/blue.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }

   public static void main(String... args){
        firstExample();
   }
}