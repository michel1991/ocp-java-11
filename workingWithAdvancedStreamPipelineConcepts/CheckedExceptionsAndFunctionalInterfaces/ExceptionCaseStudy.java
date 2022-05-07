package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;

public class ExceptionCaseStudy{
  public static List<String> create() throws IOException{
      throw new IOException();
  }

   public static List<String> createX(){
     return new ArrayList<String>();
  }

  public void good() throws IOException{
       create().stream().count();
   }

  public static void main(String[] args) throws IOException{
    var sample = new ExceptionCaseStudy();
    sample.good();
  }

  public static List<String> createSafe(){
      try{
             return ExceptionCaseStudy.create();
     }catch(IOException e){
        throw new RuntimeException(e);
      }

  }

}
