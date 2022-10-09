package  improvingAttributeAccess;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

class ModifyingAttributesWithGetFileAttributeView{
   static void modify() throws IOException{
       // read file attributes
     String mainDirectory = "folderModifyingAttributes";
     String fullPathSource = System.getProperty("user.dir") + "/improvingAttributeAccess"  + "/" + mainDirectory ;
      var path = Paths.get(fullPathSource, "turtles", "sea.txt");
      BasicFileAttributeView  view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        BasicFileAttributes attributes = view.readAttributes();
        
       // modify file last modified time
       FileTime lastModifiedTime = FileTime.fromMillis(
          attributes.lastModifiedTime().toMillis() + 10_000
       );

        view.setTimes(lastModifiedTime, null, null);
	System.out.println("set modified last time of the file whose source is, " + path ); 
   }

   public static void main(String... args) throws IOException{
      modify();
   }
}
