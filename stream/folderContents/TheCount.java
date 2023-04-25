package stream.folderContents;

/**
 * What is the output of the following application? Assume /all-data exists and is accessible within the file system.
    A. The code does not compile.
    B. The number of lines in all files in a directory tree.
    C. The number of lines in all files in a single directory.
    D. The code hangs indefinitely at runtime.
    E. An exception is printed at runtime.
    F. None of the above.
    
    The program compiles and runs without issue, making options A, D, and E incorrect.
    The program uses Files.list() to iterate over all files within a single directory.
    For each file, it then iterates over the lines of the file and sums them.
    For this reason, option C is the correct answer.
    If the count() method had used Files.walk() instead of Files.lines(),
    then the class would still compile and run, and option B would be the correct answer.
    Note that we had to wrap Files.lines() in a try/catch block,
    because using this method directly within a lambda expression without
    one leads to a compilation error.
 */
import java.nio.file.*; // 2: 
import java.util.stream.*; // 3: 
 public class TheCount { // 4: 
     public static Stream<String> readLines(Path p) { //  5:  
         try { return Files.lines(p); } catch (Exception e) { //  6:  
             throw new RuntimeException(e); //  7: 
         } //  8: 
     } //  9:  
    public static long count(Path p) throws Exception { //  10: 
         return Files.list(p) //   11: 
               .filter(w -> Files.isRegularFile(w)) //  12: 
               .flatMap(s -> readLines(s)) //   13:
             .count(); //   14:  
     } //    15:
    public static void main(String[] d) throws Exception { //    16: 
         System.out.print(count(Paths.get("/all-data"))); //  17:  
     } } // 18: 