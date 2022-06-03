package workingWithIOStreamClasses;
import java.io.*;

class ReadingAndWritingBinaryData{
  static void copyFile (File src, File dest ) throws IOException{
       try (
              var in = new FileInputStream(src);
              var out = new FileOutputStream(dest)
       ){
             int b ;
            while ( (b = in.read()) != -1 ) {
                 out.write(b);
             }
       }
  }

}
