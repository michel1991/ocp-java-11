package finallyClosingResources;
import java.io.*;

class ClosingFileResource{
   public void readFile(String file){
      FileInputStream is = null;
      try{
         is = new FileInputStream("myfile.txt");  // read file data
      }catch(IOException e){
         e.printStackTrace();
      } finally{
          try{
            if(is != null){
               is.close();
            }
       
         } catch(IOException e2){
              e2.printStackTrace();
           }

       }
   }

   public static void main(String[] args){
       var sample = new ClosingFileResource();
      sample.readFile("myfile.txt");

    }
}

