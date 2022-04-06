package multiCatchBlock;
import java.io.*;

class ErrorOrderDoesNotMatterIOExceptionFileNotFoundException{
  public static void main(String[] args){
      try{
          throw new IOException();          
      } catch(FileNotFoundException | IOException  e){
         
      }

   }
}
