package nio;
import java.nio.file.*;

public class RetrievePath {
    /**
       If the current working directory is /user/home, then what is the output of the following code?
        A. bear
        B. animals
        C. /user/home/bear
        D. /user/home/animals
        E. /user/home/food.txt
        F. The code does not compile.
        G. The code compiles but throws an exception at runtime.

       First, the code compiles and runs without issue, so options F and G are incorrect.
       Let’s take this one step at a time. First, the subpath() method is applied to the absolute path, which returns the relative path animals/bear.
        Next, the getName() method is applied to the relative path, and since this is indexed from zero, it returns the relative path bear.
        Finally, the toAbsolutePath() method is applied to the relative path bear, resulting in the current directory /user/home being incorporated into the path.
        The final output is the absolute path /user/home/bear, making option C correct.

     */
   public static void printUserHomeBear(){
        System.out.println(" begin print  /user/home/bear which  is expected response of question ");
       var p = Paths.get("/zoo/animals/bear/koala/food.txt");
       System.out.println("\t" + p.subpath(1,3).getName(1).toAbsolutePath());
       System.out.println(" end print  /user/home/bear which  is expected response of question ");
   }

    public static void main(String... args){
        printUserHomeBear();
   }
}