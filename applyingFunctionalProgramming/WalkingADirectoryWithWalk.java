package applyingFunctionalProgramming;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;

class WalkingADirectoryWithWalk{
  private long getSize(Path p) {
     try{
     return Files.size(p);
     } catch(IOException e){
          // Hanlde exception
       }

     return 0L;
  }

    public long getPathSize(Path source ) throws IOException{
        try (var s = Files.walk(source) ){
             return s.parallel()
                     .filter( p -> !Files.isDirectory(p) )
                     .mapToLong(this::getSize)
                     .sum()
                  ;
        }
    }

    public long getPathSize(Path source, int depth ) throws IOException{
        try (var s = Files.walk(source, depth) ){
             return s.parallel()
                     .filter( p -> !Files.isDirectory(p) )
                     .mapToLong(this::getSize)
                     .sum()
                  ;
        }
    }

   void sampleOfCall() throws IOException{
       var myObject = new WalkingADirectoryWithWalk();
       var size = myObject.getPathSize(Path.of("/fox/data"));
       System.out.format("Total Size: %.2f megabytes", (size/1000000.0) );
   }

}
