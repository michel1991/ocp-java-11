package applyingFunctionalProgramming;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;
import java.time.*;

class ListingDirectoryContents{

  static Path getSourcePath(){
       String mainDirectory = "folderListingDirectoryContents";      
       String fullPathSource = System.getProperty("user.dir") + "/applyingFunctionalProgramming" + "/" + mainDirectory;
       var path = Paths.get(fullPathSource, "home");

       return path;
  
  }


    static Path getDestinationPath(){ 
       String mainDirectory = "folderListingDirectoryContents";    
       String fullPathSource = System.getProperty("user.dir") + "/applyingFunctionalProgramming" + "/" + mainDirectory;
       LocalTime time = LocalTime.now();
       StringBuilder builder = new StringBuilder();
       builder.append("result-copy").append("-").append(time.getHour()).append("-").append(time.getMinute()).append("-").append(time.getSecond());
       var path = Paths.get(fullPathSource, "destination", builder.toString() );
       
       return path;
  }

  static void listing() throws IOException{
       var path = getSourcePath();
       System.out.println("list content of directory " + path);
     try( Stream<Path> s = Files.list( path ) ) {
         s.forEach(System.out::println);
      }
  }

   public static void copyPath(Path source, Path target){
       try{
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            if(Files.isDirectory(source))
               try(Stream<Path> s = Files.list(source) ){
                   s.forEach( p -> 
				   copyPath(p, target.resolve(p.getFileName()) ) 
                            );
                }
       }catch(IOException e){
             // Handle
	     e.printStackTrace();
       }
   }

   public static void main(String... args) throws IOException{
      System.out.println(" listing all directory content below ");
      listing();

       var sourcePath = getSourcePath();
       var destinationPath = getDestinationPath();
       
       System.out.println();
       System.out.println(" deep copy below, source=" + sourcePath + ", destination=" + destinationPath);
       copyPath(sourcePath, destinationPath);
   }
}
