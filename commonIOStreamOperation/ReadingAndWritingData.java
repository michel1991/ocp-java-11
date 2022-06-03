package commonIOStreamOperation;
import java.io.*;

class ReadingAndWritingData{
  void copyStream(InputStream in, OutputStream out) throws IOException{
     int b;
     while( (b = in.read()) != -1 ){
         out.write(b);
      }
  }  


  void copyStream(Reader in, Writer out) throws IOException{
     int b;
     while( (b = in.read()) != -1 ){ 
         out.write(b);
      }
  }

}
