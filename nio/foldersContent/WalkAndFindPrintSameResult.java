
package nio.foldersContent;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class WalkAndFindPrintSameResult {
    /**
      Assuming the absolute path referenced in the code exists
      and its contents are accessible, which statement about the following code snippet is correct?
      
        A. The first stream statement does not compile.
        B. The second stream statement does not compile.
        C. Neither statement compiles.
        D. Both statements compile and produce the same result at runtime.
        E. None of the above.
        
        Both stream statements compile without issue, making options A, B, and C incorrect.
        The two statements are equivalent to one another and print
        the same values at runtime.
        For this reason, option D is correct.
        There are some subtle differences between the two methods calls.
        The walk() call does not include a depth limit,
        but since Integer.MAX_VALUE is the default value, the two calls are equivalent.
        Furthermore, the walk() statement prints a stream of absolute
        paths stored as String values, while the find()
        statement prints a stream of Path values.
        If the input p was a relative path, then these two calls would have very different results,
        but since we are told p is an absolute path,
        the application of toAbsolutePath() does not change the results.
     */
   static void printSameResult() throws IOException{
       Path p = Paths.get("/glasses/lens");

       Files.walk(p)
           .map(z -> z.toAbsolutePath().toString())
           .filter(s -> s.endsWith(".java"))
           .collect(Collectors.toList()).forEach(System.out::println);
        
               Files.find(p,Integer.MAX_VALUE,
                          (w,a) -> w.toAbsolutePath().toString().endsWith(".java"))
               .collect(Collectors.toList()).forEach(System.out::println);
   }
    
    public static void main(String... args) throws IOException{
        printSameResult();
    }
}