package applyingFunctionalProgramming;
import java.nio.file.*;
import java.io.*;

class SearchingADirectoryWithFind{
   static void make() throws IOException{
     Path path = Paths.get("/bigcats");
     long minSize = 1_000;
     try(
           var s = Files.find(
                        path,
                        10,
                       (p, a) -> a.isRegularFile() && p.toString().endsWith(".java") && a.size() > minSize

               )
       ){
           s.forEach(System.out::println);
       }

   }
  
}
