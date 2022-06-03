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

  void copyFileWithBuffer(File src, File dest) throws IOException{
      try (
             var in = new BufferedInputStream (
                  new FileInputStream (src)
             );

             var out = new BufferedOutputStream(
                     new FileOutputStream(dest)
                 )
         ) {
            var buffer = new byte[1024];
            int lengthRead;
            
            while( (lengthRead = in.read(buffer)) >0 ) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }

        }
  }

}
