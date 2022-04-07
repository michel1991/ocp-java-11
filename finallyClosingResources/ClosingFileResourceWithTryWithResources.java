package finallyClosingResources;
import java.io.*;

class ClosingFileResourceWithTryWithResources{
   public void readFile(String file){
 
      try(  FileInputStream is = new FileInputStream("myfile.txt")){
         // read file data
      }catch(IOException e){
         e.printStackTrace();
      }  
   }

   public static void main(String[] args){
       var sample = new ClosingFileResource();
      sample.readFile("myfile.txt");

    }
}

