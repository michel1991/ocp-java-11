package operatingOnFilesAndDirectories;
import java.io.*;
import java.nio.file.*;
import java.util.*;

class ReadingAndWritingDataWithNewBufferedReader{
  static void make() throws IOException{
       String mainDirectory = "folderReadingAndWritingDataNewBuffered";	   
    String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory ;

    var path = Path.of(fullPathSource, "animals", "gopher.txt");
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

    String mainDirectory = "folderReadingAndWritingDataNewBuffered"; 
    String fullPathSource = System.getProperty("user.dir") + "/operatingOnFilesAndDirectories" + "/" + mainDirectory ;
      var path = Path.of( fullPathSource, "animals", "bear.txt");
      try( var writer = Files.newBufferedWriter(path) ){
         for ( var line : list ){
              writer.write(line);
              writer.newLine();
         }
     }
  } // end method

 public static void main(String... args) throws IOException{
     make();
     writeToFile();
  } 

}
