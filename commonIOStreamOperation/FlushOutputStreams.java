package commonIOStreamOperation;
import java.io.*;

class FlushOutputStreams{
  static void flushDataToDisk(String fileName) throws IOException {
       try ( var fos = new FileOutputStream(fileName) ) {
          for(int i = 0; i < 1000; i++){
                fos.write('a');
                if( i % 100 == 0){
                  fos.flush();
                }
           }
      }
  }
}
