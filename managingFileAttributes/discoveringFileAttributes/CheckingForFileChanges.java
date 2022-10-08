package managingFileAttributes.discoveringFileAttributes;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

class CheckingForFileChanges{
   public static void main(String... args) throws IOException{
   // anagingFileAttributes/discoveringFileAttributes/CheckingForFileChanges.java
     String mainDirectory = "folderCheckingFileChanges";
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "rabbit", "food.txt");         
     FileTime result = Files.getLastModifiedTime(source);  
     System.out.println("last modified time, resul = " + result.toMillis() + ", source " + source);
   }
}
