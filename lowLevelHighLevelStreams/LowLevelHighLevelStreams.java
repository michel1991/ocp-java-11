package lowLevelHighLevelStreams;
import java.io.*;

class LowLevelHighLevelStreams{
   static void wrappingLowLevelStreamToHighLevelStream() throws IOException{
         try( var br = new BufferedReader(new FileReader("zoo-data_text")) ){
           System.out.println(br.readLine());
        }
   }
}
