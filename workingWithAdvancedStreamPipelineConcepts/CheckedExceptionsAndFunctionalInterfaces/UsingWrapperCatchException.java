package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.util.*;
import java.util.function.*;

class UsingWrapperCatchException{
   public void wrapped(){
      Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
   }

}
