package applyingFunctionalProgramming;
import java.nio.file.*;
import java.io.*;

class ReadingAFileWithLines{

   public static Path getSourcePath(){
       String mainDirectory = "folderReadingAFileWithLines";    
       String fullPathSource = System.getProperty("user.dir") + "/applyingFunctionalProgramming" + "/" + mainDirectory;    
       
       Path path = Paths.get( fullPathSource, "fish", "sharks.txt");

       return path;
   }

   static void read() throws IOException{
       Path path = getSourcePath();
       try( var s = Files.lines(path) ){
             s.forEach(System.out::println);
        }
   }

   static void readWithFilter() throws IOException{
       Path path = getSourcePath();
       try( var s = Files.lines(path) ){
             s.filter( f -> f.startsWith("WARN:") )
              .map( f -> f.substring(5) )
              .forEach(System.out::println)

            ;
        }
   }
   

   public static void main(String... args) throws IOException{
     System.out.println( " source path is " + getSourcePath());	   
     System.out.println("read all lines in lazy way");
     read();
     System.out.println();

     System.out.println(" find line that start with WARN" );
     readWithFilter();
   }
}
