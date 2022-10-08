package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;

class Moving{
     public static void basicMove() throws IOException{ 

         String mainDirectory = "folderMove";	   
         String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory + "/source";
          Path source = Path.of(fullPathSource, "zoo.txt");

         String fullPathDest = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/"+ mainDirectory + "/destination";
         Path dest = Paths.get(fullPathDest, "zoo.txt");
	 var result =  Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
	 System.out.println("move file source "+ source + " destination " + result); 
      }


   public static void main(String... args) throws IOException{
      basicMove();
   }
}
