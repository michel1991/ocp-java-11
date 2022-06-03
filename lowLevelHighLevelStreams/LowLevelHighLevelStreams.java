package lowLevelHighLevelStreams;
import java.io.*;

class LowLevelHighLevelStreams{
   static void wrappingLowLevelStreamToHighLevelStream() throws IOException{
         try( var br = new BufferedReader(new FileReader("zoo-data.txt")) ){
           System.out.println(br.readLine());
        }
   }

    static void wrappingHighLevelStreamToHighLevelStream() throws IOException,  ClassNotFoundException{
         try( var ois = new ObjectInputStream( new BufferedInputStream (
                                                   new FileInputStream("zoo-data.txt")
                                                   )
                                              ) 
          ){
             System.out.println(ois.readObject());
        }
   }


}
