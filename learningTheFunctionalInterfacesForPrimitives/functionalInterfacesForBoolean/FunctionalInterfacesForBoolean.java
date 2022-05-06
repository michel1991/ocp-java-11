package learningTheFunctionalInterfacesForPrimitives.functionalInterfacesForBoolean;
import java.util.stream.*;
import java.util.function.*;

class FunctionalInterfacesForBoolean{
 
   static void sampleBasic(){
     BooleanSupplier b1 = () -> true;
     BooleanSupplier b2 = () -> Math.random() > .5;
     System.out.println(b1.getAsBoolean());
     System.out.println(b2.getAsBoolean());
   }

  public static void main(String[] args){
      sampleBasic();
   }

}
