package applyingFunctionalProgramming;
import java.nio.file.*;
import java.io.*;

class SearchingADirectoryWithFind{
   static void make() throws IOException{
     //Path path = Paths.get("/bigcats");

      String fullPathSource = System.getProperty("user.dir") + "/applyingFunctionalProgramming";
       var path = Paths.get(fullPathSource);
     long minSize = 1_000;
     try(
           var s = Files.find(
                        path,
                        10,
                       (p, a) -> { 
			     System.out.println("file visited " + p);  
			     return  a.isRegularFile() && p.toString().endsWith(".java") && a.size() > minSize;
			}

               )
       ){
           s.forEach(System.out::println);
       }

   }

   public static void main(String... args) throws IOException{
      make();
   }
  
}
