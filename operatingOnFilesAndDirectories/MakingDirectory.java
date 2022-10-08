package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;

class MakingDirectory{

    public static void createDirectoryWithTranverse() throws IOException{
             String fullPath = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/folderCreateDirectory";
	      Path path = Path.of(fullPath, "bison", "field", "pasture", "green");
	     Files.createDirectories(path);
	     System.out.println("create directory with tranverse path: " + path + ", aboslute path is " + path.toAbsolutePath());
    } 

    public static void createDirectoryWithoutTranverse() throws IOException{
             String fullPath = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/folderCreateDirectory";
              Path path = Path.of(fullPath, "field");

	      if ( !Files.exists(path) ){
                 Files.createDirectories(path);
                 System.out.println("create directory without tranverse: " + path + ", aboslute path is " + path.toAbsolutePath());
	       } else{
                  System.out.println("directory already create without tranverse: " + path + ", aboslute path is " + path.toAbsolutePath());
	       }
             
             
    }

   public static void main(String... args) throws IOException{ 
    String fullPath = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/folderCreateDirectory";
    createDirectoryWithTranverse();
    System.out.println();
    createDirectoryWithoutTranverse();
   }
}
