package commonIOStreamOperation;
import java.io.*;

class ClosingTheStream{
  
   public void printData(InputStream is) throws IOException{
       int b;
      while ( (b = is.read()) != -1 ) {
         System.out.print(b);
      }
   }

  public void readFile(String fileName) throws IOException{
       try ( var fis = new FileInputStream(fileName)  ) {
         printData(fis);
       } 
   }

}
