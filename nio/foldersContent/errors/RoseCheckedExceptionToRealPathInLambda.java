package nio.foldersContent.errors;
import java.nio.file.*;

/**
  The Rose application is run with an input argument of /flower.
   The /flower directory contains five subdirectories,
   each of which contains five files. What is the result of executing the following program?
   
    A. The program completes without outputting anything.
    B. One Path value is printed.
    C. Six Path values are printed.
    D. Twenty-five Path values are printed.
    E. Twenty-six Path values are printed.
    F. None of the above.
    
    Trick question! The code does not compile; therefore, option F is correct.
    The toRealPath() interacts with the file system, and therefore throws a checked IOException.
    Since this checked exception is not handled inside the lambda expression,
    the class does not compile. If the lambda expression was fixed to handle the IOException,
     then the expected number of Path values printed would be six,
     and option C would be the correct answer.
     A maxDepth value of 1 causes the walk() method to visit two total levels, the original /flower, and the files it contains.
 */
class Rose {
    public void tendGarden(Path p) throws Exception {
        Files.walk(p,1)
         .map(q -> q.toRealPath())
         .forEach(System.out::println);
    }
    public static void main(String... thorns) throws Exception {
        new Rose().tendGarden(Paths.get(thorns[0]));
    }
}

public class RoseCheckedExceptionToRealPathInLambda {
  
}