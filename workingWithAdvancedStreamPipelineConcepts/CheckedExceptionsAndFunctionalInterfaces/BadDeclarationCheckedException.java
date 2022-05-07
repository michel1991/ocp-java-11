package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;
import java.util.function.*;

class BadDeclarationCheckedException{
  
  public void bad() throws IOException{
       Supplier<List<String>> s = ExceptionCaseStudy::create; // does not compile
  }
}
