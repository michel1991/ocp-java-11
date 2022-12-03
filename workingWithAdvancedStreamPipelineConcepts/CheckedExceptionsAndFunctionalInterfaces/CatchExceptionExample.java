package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;
import java.util.function.*;

public class CatchExceptionExample{

    /**
     * A way to handle checked exception into FI with lambda
     * The First way is to catch exception and transform it into unchecked exception
      * Just allow compilation
      * La première consiste à attraper l'exception et à la transformer en une exception non vérifiée (unchecked exception).
     */
    public static void uglyCatchAndTransformToUncheckedException() throws RuntimeException{
     Supplier<List<String>> s = () -> {
          try{
              System.out.println("call exception in supplier ");
              return ExceptionCaseStudy.create();
           } catch(IOException e){
              System.out.println("exception throws in supplier ");
              throw new RuntimeException(e);
            }
     };

  }

    public static void main(String... args) throws Exception{
        System.out.println("main ");
        try{
            uglyCatchAndTransformToUncheckedException();
        }catch(Exception e){
            System.out.println("print exception in main");
           e.printStackTrace();
        }

    }
}
