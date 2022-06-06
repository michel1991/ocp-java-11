package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;

class CopyingFilesIntoADirectory{
  static void copyThatCouldCopyTheContentOfDataToParentIfParentNotExist() throws IOException{
     var file = Paths.get("food.txt");
     var directory = Paths.get("/enclosure");
     Files.copy(file, directory);
  }

   static void goodCopy() throws IOException{ 
     var file = Paths.get("food.txt");
     var directory = Paths.get("/enclosure/food.txt");
     Files.copy(file, directory);
  }

    static void goodCopyWithOutDuplicationOfTheNameOfFile() throws IOException{
     var file = Paths.get("food.txt");
     var directory = Paths.get("/enclosure").resolve(file.getFileName());
     Files.copy(file, directory);
  }

}
