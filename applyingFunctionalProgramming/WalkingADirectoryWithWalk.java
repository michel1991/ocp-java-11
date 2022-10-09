package applyingFunctionalProgramming;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;

class WalkingADirectoryWithWalk{
  private long getSize(Path p) {
     try{
      System.out.println(" path to get size " + p);	     
     return Files.size(p);
     } catch(IOException e){
          // Hanlde exception
	  e.printStackTrace();
       }

     return 0L;
  }

    public long getPathSize(Path source ) throws IOException{
        try (var s = Files.walk(source, FileVisitOption.FOLLOW_LINKS) ){
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
                     .mapToLong(this::getSize) // use this method to handle exception with Lambda
                     .sum()
                  ;
        }
    }

   static void sampleOfCall() throws IOException{
       var myObject = new WalkingADirectoryWithWalk();

       String mainDirectory = "folderWalkingADirectoryWithWalk";      
       String fullPathSource = System.getProperty("user.dir") + "/applyingFunctionalProgramming" + "/" + mainDirectory;
       var path = Paths.get(fullPathSource, "home");

       var size = myObject.getPathSize(path);
       System.out.format("Total Size: %.2f megabytes,  file source %s", (size/1000000.0), path.toString() );
   }

   public static void main(String... args) throws IOException{
     sampleOfCall();
   }

}
