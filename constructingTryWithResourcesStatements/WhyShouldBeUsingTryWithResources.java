package constructingTryWithResourcesStatements;
import java.io.*;
import java.nio.file.*;

public class WhyShouldBeUsingTryWithResources{
  public void copyWithoutTryWithResources(Path path1, Path path2) throws Exception{
     BufferedReader in = null;
     BufferedWriter out = null;
      try{
             in = Files.newBufferedReader(path1);
             out = Files.newBufferedWriter(path2);
             out.write(in.readLine());
     }finally {
          if(out != null ){
             out.close();
          }

          if(in != null ){ 
             in.close();
          }
      }

  }

    public void copyWithTryWithResources(Path path1, Path path2) throws Exception{
        try( var in = Files.newBufferedReader(path1); 
             var out = Files.newBufferedWriter(path2);
          ){
           out.write(in.readLine());
       }
     
   }


}
