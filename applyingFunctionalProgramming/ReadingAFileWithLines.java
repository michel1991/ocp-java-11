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

   static void readWithFilter() throws IOException{
       Path path = Paths.get("/fish/sharks.log");
       try( var s = Files.lines(path) ){
             s.filter( f -> f.startsWith("WARN:") )
              .map( f -> f.substring(5) )
              .forEach(System.out::println)

            ;
        }
   }

}
