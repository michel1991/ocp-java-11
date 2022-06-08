package  improvingAttributeAccess;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

class ModifyingAttributesWithGetFileAttributeView{
   static void modify() throws IOException{
       // read file attributes
      var path = Paths.get("/turtles/sea.txt");
      BasicFileAttributeView  view = Files.getFileAttributeView(
        path, BasicFileAttributeView.class
        );

        BasicFileAttributes attributes = view.readAttributes();
        
       // modify file last modified time
       FileTime lastModifiedTime = FileTime.fromMillis(
          attributes.lastModifiedTime().toMillis() + 10_000
       );

        view.setTimes(lastModifiedTime, null, null);
   }
}
