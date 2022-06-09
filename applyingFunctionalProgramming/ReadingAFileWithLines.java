package applyingFunctionalProgramming;
import java.nio.file.*;
import java.io.*;

class ReadingAFileWithLines{
   static void read() throws IOException{
       Path path = Paths.get("/fish/sharks.log");
       try( var s = Files.lines(path) ){
             s.forEach(System.out::println);
        }
   }
}
