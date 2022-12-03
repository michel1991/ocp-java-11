package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;

public class GoodMethodExceptionCaseStudy {
    /**
    *  Rien de nouveau ici. La méthode create() lève une exception vérifiée (Checked Exceptions).
    * La méthode appelante le gère ou le déclare. Qu'en est-il de celui-ci ?
     */
    public static void good() throws IOException{
        CreateMethodExceptionCaseStudy.create().stream().count();
    }

    public static void main(String... args) throws IOException{
        good();
    }

}