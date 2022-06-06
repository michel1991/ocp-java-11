package operatingOnFilesAndDirectories;
import java.io.*;
import java.nio.file.*;

class ReadingAndWritingDataWithNewBufferedReader{
  static void make() throws IOException{
    var path = Path.of("/animals/gopher.txt");
     try( var reader = Files.newBufferedReader(path)){
           String currentLine = null;
           while ( (currentLine = reader.readLine()) != null )
            System.out.println(currentLine);
       }
  }
}
