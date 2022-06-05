package introducingNIO2;
import java.io.*;
import java.nio.file.*;


class ObtainingPathFromOldApi{
  void obtaining(){
       File file = new File("husky.txt");
       Path path = file.toPath();
      File backToFile = path.toFile();
   }
}
