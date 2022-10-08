package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;

class CopyingFiles{
   public static void simpleCopy(String theSource, String theDestination) throws IOException{
     String mainDirectory = "folderCopy";	   
     String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory + "/source";
     Path source = Path.of(fullPathSource, theSource);

     String fullPathDest = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/"+ mainDirectory + "/destination";
     Path dest = Paths.get(fullPathDest, theDestination);

     if( !Files.exists(dest) ){
        Path result = Files.copy(source, dest);
	System.out.println("basic copy, file copy  done " + result);
     }else{
      System.out.println("basic copy, file already copy " + dest);
     }
   }


   public static void copyReplace(String theSource, String theDestination) throws IOException{
     String mainDirectory = "folderCopy";          
     String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory + "/source";
     Path source = Path.of(fullPathSource, theSource);

     String fullPathDest = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/"+ mainDirectory + "/destination";
     Path dest = Paths.get(fullPathDest, theDestination);

     Path result = Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
     System.out.println("copy replace , file copy  done " + result);

   }

   public static void copyWithInpuStream() throws IOException{
         String mainDirectory = "folderCopy";          
     String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory + "/source";
     Path source = Path.of(fullPathSource, "source-data.txt");
      String fullPathDest = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/"+ mainDirectory + "/destination";

      Path dest = Paths.get(fullPathDest, "mammals", "wolf.txt");
      try( var in = new FileInputStream( source.toString()) ){ 
        long result = Files.copy(in, dest, StandardCopyOption.REPLACE_EXISTING);
	 System.out.println("copy with inputstream , file copy  done, with number of length/byte " + result +  ", source "+ source + " dest" + dest);
      }
   
   }


   public static void copyWithOutPutStream() throws IOException{
         String mainDirectory = "folderCopy";          
     String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory + "/source";
     Path source = Path.of(fullPathSource, "fish", "clown.txt");
      String fullPathDest = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/"+ mainDirectory + "/destination";

      Path dest = Paths.get(fullPathDest, "mammals", "wolf.txt");
       System.out.println("copy with outputStream , below write to console " +   "source "+ source + ", dest is console");
       long result = Files.copy(source, System.out); 
   }

  public static void main(String... args) throws IOException{
      simpleCopy("bamboo.txt", "bamboo.txt");
      System.out.println();
      simpleCopy("turtle", "turtleCopy");
      System.out.println();
      copyReplace("book.txt", "movie.txt");
      System.out.println();
      copyWithInpuStream();
      System.out.println();
      copyWithOutPutStream() ;
      System.out.println();
      System.out.println("correctly copy file to directory below, food.txt to enclosure directory");
      copyReplace("food.txt", "enclosure/food.txt");
  }


}
