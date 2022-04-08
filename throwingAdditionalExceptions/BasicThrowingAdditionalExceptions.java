package throwingAdditionalExceptions;
import java.io.*;

class BasicThrowingAdditionalExceptions{
  private static FileReader read() throws IOException{
        // code here
       throw new  IOException();
   }

  public static void main(String[] a){
      FileReader reader = null;
      try{
        reader = read();
     }catch(IOException e){
         try{
             if(reader != null)
                 reader.close();
              
          }catch(IOException inner){

         }
     }
  }
}
