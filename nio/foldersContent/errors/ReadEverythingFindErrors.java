package nio.foldersContent.errors;

/**
  Bill wants to create a program that reads all of the lines of all of his books using NIO.2.
   Unfortunately, Bill may have made a few mistakes writing his program.
    How many lines of the following class contain compilation errors?
    
    A. None. Bill’s implementation is correct.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. Five.
    
    The code does contain compilation errors, so option A is incorrect.
    The first is on line 8. The readAllLines() method returns a List<String>, not a Stream˂String˃.
    While parallelStream() is allowed on a Collection, parallel() is not.
    Next, line 14 does not compile because of an invalid method call.
    The correct NIO.2 method call is Files.isRegularFile(), not File.isRegularFile(),
    since the legacy File class does not have such a method.
    Line 18 contains a similar error. Path is an interface, not a class,
    with the correct call being Paths.get().
    Lastly, line 19 does not compile because the read() method throws Exception,
    which is not caught or handled by the main() method.
    For these four reasons, option E is the correct answer.
 */
//1:  package bookworm;
 import java.io.*; // 2: 
 import java.nio.file.*; // 3: 
class ReadEverything { // 4:  
    public void readFile(Path p) {  //     5: 
        try { //     6:  
            Files.readAllLines(p) //   7:  
        .parallel() //    8:    
         .forEach(System.out::println); //     9:  
        } catch (Exception e) {} //   10:  
    } //   11: 
    public void read(Path directory) throws Exception { //    12:
        Files.walk(directory) //   13:   
      .filter(p -> File.isRegularFile(p)) //     14:    
       .forEach(x -> readFile(x)); //    15:    
    } //   16: 
    public static void main(String[] b) throws IOException { //  17:
        Path p = Path.get("collection"); //    18: 
        new ReadEverything().read(p); //     19: 
    } //   20: 
} //     21:

public class ReadEverythingFindErrors {
    
}