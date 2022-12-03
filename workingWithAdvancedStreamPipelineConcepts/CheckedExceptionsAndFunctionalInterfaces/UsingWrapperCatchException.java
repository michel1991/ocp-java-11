package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.util.*;
import java.util.function.*;

class UsingWrapperCatchException{
   public static void wrapped(){
       Supplier<List<String>> s2 = CreateSafeMethodCatchException::createSafe;
   }

    public static void main(String... args){
       System.out.println("in main using wrapper catch exception ");
       wrapped();
   }

}
