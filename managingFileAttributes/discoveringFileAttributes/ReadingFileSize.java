package  managingFileAttributes.discoveringFileAttributes;
import java.nio.file.*;
import java.io.*;

class  ReadingFileSize{
   public static void main(String... args) throws IOException{
     //  managingFileAttributes/discoveringFileAttributes/ReadingFileSize
     String mainDirectory = "folderReadingFileSize";
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "zoo", "animals.txt");         
     long result = Files.size(source);  
     System.out.println("test file size file, resul = " + result + ", source " + source);
   }
}
