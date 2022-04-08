package printingAnException;
import java.io.*;

class SwallowingExceptions{

    private static String readInFile() throws IOException{
      throw new IOException();
   }

   public static void main(String ...p){
       String textInFile = null;

       try{
          textInFile = readInFile();
       }catch(IOException e){
         // ignore exception
         System.out.println("ignore exception in catch");
       }

       //imagine many lines of code here
       System.out.println(textInFile.replace(" ", ""));
    }
}
