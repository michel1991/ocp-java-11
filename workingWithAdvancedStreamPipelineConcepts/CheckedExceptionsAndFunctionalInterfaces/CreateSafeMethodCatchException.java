package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;

public class CreateSafeMethodCatchException {

    /**
    * A way to handle checked exception into FI with lambda
    * The Second way is to create wrapper class that catch exception and transform it into unchecked exception
    * Just allow compilation
    * La seconde consiste à crrer un wrapper d'attraper l'exception et à la transformer en une exception non vérifiée (unchecked exception).
    */
    public static List<String> createSafe(){
        try{
            return CreateMethodExceptionCaseStudy.create();
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}