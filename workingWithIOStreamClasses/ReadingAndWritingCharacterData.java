package workingWithIOStreamClasses;
import java.io.*;

class ReadingAndWritingCharacterData{
  void copyTextFile(File src, File dest) throws IOException{
     try (
         var reader = new FileReader(src);
         var writer = new FileWriter(dest)
      ){
          int b;
          while( (b = reader.read()) != -1 ){
              writer.write(b);
           }
      }
  }


  void copyTextFileWithBuffer(File src, File dest) throws IOException{
     try (
         var reader = new BufferedReader(new  FileReader(src) );
         var writer = new BufferedWriter (new FileWriter(dest))
      ){
          String s;
          while( (s = reader.readLine()) != null ){
              writer.write(s);
              writer.newLine();
           }
      }
  }
    

}
