package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;
import java.util.function.*;

public class CatchExceptionExample{
  public void uglyCatchAndTransformToUncheckedException(){
     Supplier<List<String>> s = () -> {
          try{
              return ExceptionCaseStudy.create();
           } catch(IOException e){
                throw new RuntimeException(e);
            }
     }; 
       
  }


}
