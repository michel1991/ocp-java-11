package finallyClosingResources;
import java.io.*;

class ClosingFileResourceWithTryWithResourcesWithoutCatch{
   public void readFile(String file) throws IOException {
 
      try(  FileInputStream is = new FileInputStream("myfile.txt")){
         // read file data
      }
   }

   public static void main(String[] args){
       var sample = new ClosingFileResource();
      sample.readFile("myfile.txt");

    }
}

