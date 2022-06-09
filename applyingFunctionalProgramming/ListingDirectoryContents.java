package applyingFunctionalProgramming;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

class ListingDirectoryContent{
  static void listing() throws IOException{
     try( Stream<Path> s = Files.list(Path.of("/home"))){
         s.forEach(System.out::println);
      }
  }

   public void copyPath(Path source, Path target){
       try{
            Files.copy(source, target);
            if(Files.isDirectory(source))
               try(Stream<Path> s = Files.list(source) ){
                   s.forEach( p -> copyPath(
                                       p, target.resolve(p.getFileName())
                                       ) 
                            );
                }
       }catch(IOException e){
             // Handle
       }
   }
}
