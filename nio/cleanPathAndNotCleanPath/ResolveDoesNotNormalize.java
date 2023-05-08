package nio.cleanPathAndNotCleanPath;
import java.nio.file.*;


public class ResolveDoesNotNormalize {

    /**
        The code compiles and runs without issue, so option E is incorrect.
        For this question, you have to remember two things.
        First, the resolve() method does not normalize any path symbols,
        so options A and B are not correct.
        Second, calling resolve() with an absolute path
        as a parameter returns the absolute path,
        so option C is correct, and option D is incorrect.
     */
    static void firstExample(){
        System.out.println("begin Example 1");
        var path1 = Path.of("/pets/../cat.txt");
        var path2 = Paths.get("./dog.txt");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
        System.out.println("End Example 1");
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
        Since p1 is a relative path, it is appended onto p2,
        making option D correct and option A incorrect.
        Option A would be correct if normalize() was applied.
     */
    static void secondExample(){
        Path p1 = Path.of("./found/../keys");
        Path p2 = Paths.get("/lost/blue.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }
    
    /**
     * What is the output of the following code snippet?
        A.
            /./song/../note/dance/move.txt
            /dance/move.txt
        B.
            /dance/move.txt
            /dance/move.txt/note
        C.
            /dance/move.txt
            /dance/move.txt/./song/../note
        
        D.
        /note/dance/move.txt
        ../dance/move.txt/song
        
        E. The code does not compile.
        F. The code compiles but an exception is thrown at runtime.
       
       Line 13 does not modify the value of x because
       Path is immutable and x is not reassigned to the new value.
       On line 14, the resolve() method is called using y as the input argument.
       If the parameter passed to the resolve() method is absolute,
       then that value is returned, leading the first println() method call to output /dance/move.txt.
       On line 15, the absolute path is concatenated with the relative path,
       printing /dance/move.txt/./song/../note at runtime. For these reasons, option C is correct.

     */
    static void  example3(){
        System.out.println("begin Example 3");
        Path x = Paths.get(".","song","..","/note"); // 11:
        Path y = Paths.get("/dance/move.txt"); //  12: 
        x.normalize(); //   13:
        System.out.println(x.resolve(y)); // 14:
        System.out.println(y.resolve(x));  // 15:
        System.out.println("End Example 3");
    }

   public static void main(String... args){
        firstExample();
        System.out.println();
        example3();
   }
}