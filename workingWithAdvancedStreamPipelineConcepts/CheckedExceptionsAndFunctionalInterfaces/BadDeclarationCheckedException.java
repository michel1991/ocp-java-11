package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;
import java.util.function.*;

class BadDeclarationCheckedException{
  
    /**
     * Supplier not allow checked exception more generally functional interface
     */
  public void bad() throws IOException{
      Supplier<List<String>> s =  CreateMethodExceptionCaseStudy::create; // does not compile
  }
}
