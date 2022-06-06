package operatingOnFilesAndDirectories;
import java.io.*;
import java.nio.file.*;
import java.util.*;

class ReadingAndWritingDataWithNewBufferedReader{
  static void make() throws IOException{
    var path = Path.of("/animals/gopher.txt");
     try( var reader = Files.newBufferedReader(path)){
           String currentLine = null;
           while ( (currentLine = reader.readLine()) != null )
            System.out.println(currentLine);
       }
  }

   static void writeToFile() throws IOException{
     var list = new ArrayList<String>();
     list.add("Smokey");
     list.add("Yogi");

      var path = Path.of("/animal/bear.txt");
      try( var writer = Files.newBufferedWriter(path) ){
         for ( var line : list ){
              writer.write(line);
              writer.newLine();
         }
     }
  } // end method


}
